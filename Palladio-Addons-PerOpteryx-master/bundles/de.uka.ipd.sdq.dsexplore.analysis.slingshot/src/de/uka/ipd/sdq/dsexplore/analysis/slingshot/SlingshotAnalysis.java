package de.uka.ipd.sdq.dsexplore.analysis.slingshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.configurations.PCMWorkflowConfigurationBuilder;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.simulizar.runconfig.SimuLizarLaunchConfigurationBasedConfigBuilder;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowLauncher;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.SimuComJob;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.helper.ConfigurationHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EntryLevelSystemCallCriterion;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedCriterion;
import de.uka.ipd.sdq.simulation.AbstractSimulationConfig;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

import org.palladiosimulator.analyzer.slingshot.core.Slingshot;
import org.palladiosimulator.analyzer.slingshot.core.api.SystemDriver;
import org.palladiosimulator.analyzer.slingshot.workflow.SimulationLauncher;
import org.palladiosimulator.analyzer.slingshot.workflow.SimulationWorkflowConfiguration;
import org.palladiosimulator.analyzer.slingshot.workflow.events.WorkflowLaunchConfigurationBuilderInitialized;
import org.palladiosimulator.analyzer.slingshot.workflow.jobs.SimulationJob;
//import org.palladiosimulator.analyzer.slingshot.workflow.jobs.SimulationRootJob;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import org.palladiosimulator.analyzer.workflow.jobs.LoadModelIntoBlackboardJob;
import org.palladiosimulator.analyzer.workflow.jobs.PreparePCMBlackboardPartitionJob;

import de.uka.ipd.sdq.workflow.jobs.ICompositeJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

import org.eclipse.emf.ecore.resource.Resource;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.spd.ScalingPolicy;
import org.palladiosimulator.spd.SpdFactory;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.constraints.target.TargetConstraint;
import org.palladiosimulator.spd.impl.SPDImpl;
import org.palladiosimulator.spd.targets.TargetGroup;
import org.palladiosimulator.spd.targets.impl.TargetGroupImpl;
import org.palladiosimulator.spd.constraints.target.impl.TargetGroupSizeConstraintImpl;

import java.nio.file.*;

import org.eclipse.core.filesystem.*;
import org.eclipse.core.runtime.*;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
/**
 * Starts a Slingshot Analysis for the design space exploration. Mainly adopted
 * from classes in de.uka.ipd.sdq.dsexplore.analysis.simucom
 */
public class SlingshotAnalysis extends AbstractAnalysis implements IAnalysis {

	public SlingshotAnalysis() {
        super(new SlingshotQualityAttributeDeclaration());
    }



    /** Logger for log4j. */
    private static Logger logger =
            Logger.getLogger("de.uka.ipd.sdq.dsexplore");

    /** Store the launch parameters so that we do not have to pass them all the time.*/
    private ILaunchConfiguration config;

    private String initialExperimentName;
    private final Map<Integer, String> previousExperimentNames = new HashMap<Integer, String>();

    private SimulationWorkflowConfiguration workflowConfig;

    private int datasourceReloadCount = 1;
    private boolean alreadyLaunched = false;
    

    /**
     * Conducts performance analysis via the Slingshot Simulator. 
     * Adapted from the Simucom implementation
     *
     *
     */
    @Override
    public void analyse(final PCMPhenotype pheno, final IProgressMonitor monitor) throws AnalysisFailedException, CoreException, UserCanceledException {

        final String experimentName = getExperimentName(pheno);
        final String experimentSettingName = getExperimentSettingName(pheno);
        this.previousExperimentNames.put(pheno.getGenotypeID().hashCode(), experimentSettingName);

        final ILaunchConfigurationWorkingCopy launchWorkingCopy = this.config.getWorkingCopy();
        
        launchWorkingCopy.setAttribute(AbstractSimulationConfig.EXPERIMENT_RUN, experimentName);
        launchWorkingCopy.setAttribute(AbstractSimulationConfig.VARIATION_ID, experimentSettingName);

        /* this method call already creates an empty run if EDP2 is used. */
        this.workflowConfig = new DSESimulationLauncher().deriveConfiguration(launchWorkingCopy);
        this.workflowConfig.setOverwriteWithoutAsking(true);
        
        List<String> modelFiles = this.workflowConfig.getPCMModelFiles();
        
        String firstModelFile = modelFiles.get(0);
        URI tempStorePath = URI.createURI(firstModelFile.substring(0, firstModelFile.lastIndexOf("/"))+"/initStorage");
        
        // to do also for file system
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        if (tempStorePath.isPlatform()) {
        	
        	// create folder where the initial model files are going to be stored
        	IFolder tempStoreFolder = workspace.getRoot().getFolder(new Path(tempStorePath.toPlatformString(true)));
        	if (!tempStoreFolder.exists()) {
        		tempStoreFolder.create(true, true, null);
        		System.out.println("Initial storage directory created.");
        	}
        }
        
        // initialize a list for keeping track of which initial model files are saved
        List<String> savedInits = new ArrayList<>();
        
        // if this is not the initial candidate
        if (this.alreadyLaunched) {
        	// remove cand from URIs so that slingshot works (due to spdsemantics)
        	IFolder tempStoreFolder = workspace.getRoot().getFolder(new Path(tempStorePath.toPlatformString(true)));
            List<String> remCandMemory = new ArrayList<>();
            final ResourceSetPartition pcmPartition = this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
            for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
            	Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
            	if (currResource.getURI().toString().contains("cand") && !currResource.getURI().toString().contains(".designdecision")) {
            		remCandMemory.add(currResource.getURI().toString().split("cand")[0]);
            		currResource.setURI(URI.createURI(currResource.getURI().toString().split("cand")[0]));
            	}
            }
            
            // save changed files so that they are visible for Slingshot
            for (String changedFile : remCandMemory) {
            	for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
            		Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
            		if (changedFile.equals(currResource.getURI().toString())) {
            			// save initial version of the resource to the previously created folder
            			IFile initFile = workspace.getRoot().getFile(new Path(currResource.getURI().toPlatformString(true)));
            			if (workspace.getRoot().exists(tempStoreFolder.getFullPath().append(initFile.getName()))) {
            				workspace.getRoot().getFile(tempStoreFolder.getFullPath().append(initFile.getName())).delete(false, null);
            			}
            			initFile.copy(tempStoreFolder.getFullPath().append(initFile.getName()), false, null);
            			if (!savedInits.contains(currResource.getURI().toString())) {
            				savedInits.add(currResource.getURI().toString());
            			}

            			// save current setting from PerOpteryx to the resource file
            			try {
                			currResource.save(null);
                		} catch (IOException e) {
                			e.printStackTrace();
                		}
            			break;
            		}
            	}
            }
            
            // return .cand to URIs so that we don't run the danger of somehow breaking PerOpteryx
            for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
            	Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
            	if (remCandMemory.contains(currResource.getURI().toString())) {
            		String currURIstr = currResource.getURI().toString();
            		int lastDotIndex = currURIstr.lastIndexOf('.');
            		String currURIext = (lastDotIndex != -1) ? currURIstr.substring(lastDotIndex + 1) : "";
            		currResource.setURI(URI.createURI(currResource.getURI().toString() + "cand." + currURIext));
            	}
            }
        }

        // run garbage collector and launch slingshot
        System.gc();
        if (isExperimentRunDoesNotExist(experimentName, experimentSettingName)){
            launchSlingshot( monitor);
        }

        // replace back with init files
        if (this.alreadyLaunched) {
        	for (int iSavedInits = 0; iSavedInits < savedInits.size(); iSavedInits++) {
        		String savedInit = savedInits.get(iSavedInits);
        		
        		if (savedInit.length() > 0) {
        			IFolder tempStoreFolder = workspace.getRoot().getFolder(new Path(tempStorePath.toPlatformString(true)));
            		URI orgURI = URI.createURI(savedInit);
            		IFile orgFile = workspace.getRoot().getFile(new Path(orgURI.toPlatformString(true)));
            		IFile initFile = workspace.getRoot().getFile(tempStoreFolder.getFullPath().append(orgFile.getName()));
            		
            		// sometimes there are problems with overwriting so try 3 times
            		final int numberOfTries = 3;
                    for (int iDel = 0; iDel < numberOfTries; iDel++){
                    	try {
                    		orgFile.delete(false, null);
                    		break;
                    	} catch (final CoreException e) {
                    		logger.warn(orgURI.toString() + " could't be deleted.");
                    	}
                    }
                    workspace.getRoot().refreshLocal(org.eclipse.core.resources.IResource.DEPTH_INFINITE, null);
            		for (int iCop = 0; iCop < numberOfTries; iCop++){
            			try {
            				initFile.copy(new Path(orgURI.toPlatformString(true)), false, null);
            				break;
            			} catch (final CoreException e) {
            				logger.warn(orgURI.toString() + " could't be copied, because it exists. Attempt: " + iCop);
            			}
            		}
        		}
        	}
        }
        
        // remember that this is already launched, therefore next time the candidate cannot be the initial candidate
        this.alreadyLaunched = true;

    }



    /**
     * Search in all open data sources whether there is already an experiment run with this name and check that it contains some results.
     * @param experimentSettingName
     * @return
     */
    private boolean isExperimentRunDoesNotExist(final String experimentName, final String experimentSettingName) throws CoreException {
    	
        return !SlingshotAnalysisEDP2Result.isExperimentRunExisting(experimentName, experimentSettingName, SlingshotAnalysisEDP2Result.findSelectedEDP2Repository(config));
        
    }



    private String getExperimentName(final PCMPhenotype pheno) throws CoreException {
        if (config.getAttribute("persistenceFramework", "").equals("SensorFramework"))
        {
        	return this.initialExperimentName + " " + pheno.getGenotypeID();
        }
        // In case the selected persistence framework is EDP2
        else 
        {
        	return this.initialExperimentName;
        }
        
    }
    
    private String getExperimentSettingName(final PCMPhenotype pheno) throws CoreException {

    	return pheno.getGenotypeID();
        
    }


    /**
     * FIXME: This method should not depend on the state of the blackboard anymore... but it does at this time.
     *
     * @param pheno
     * @param entity
     * @return
     * @throws CoreException
     * @throws AnalysisFailedException
     */
    private IStatisticAnalysisResult retrieveSlingshotResults(final PCMPhenotype pheno, final Entity entity)
            throws CoreException, AnalysisFailedException {

        final String experimentName = this.getExperimentName(pheno);
        final String experimentSettingName = this.getExperimentSettingName(pheno);
        final PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition)this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        final PCMInstance pcmInstance = new PCMInstance(pcmPartition);

        IStatisticAnalysisResult result = null;
        
        // Decide whether it's SensorFramework or EDP2
        if ("SensorFramework".equals(config.getAttribute("persistenceFramework", "")))
        {        	
            
            if (result == null)
            {
                final String errormessage = "There was no experiment run or no experiment for experiment named \""
                        +experimentName+"\" in the selected data source after analysing the PCM instance \""
                        +experimentName+"\" of candidate "+pheno.getNumericID()+" "+pheno.getGenotypeID();
                logger.error(errormessage);
                throw new AnalysisFailedException(errormessage);
            }


        }
        // In case the selected persistence framework is EDP2
        else 
        {

        	Repository selectedRepo = SlingshotAnalysisEDP2Result.findSelectedEDP2Repository(config);
        	
        	result = SlingshotAnalysisEDP2Result.findExperimentRunAndCreateResult(entity, experimentName,
					experimentSettingName, pcmInstance, selectedRepo, this.criterionToAspect, (SlingshotQualityAttributeDeclaration)this.qualityAttribute);
        	
            if (result == null)
            {
                final String errormessage = "There was no experiment named \""
                        +experimentName+"\" with an experiment setting \""+experimentSettingName+"\""
                        +" in the selected data source after analysing the PCM instance \""
                        +experimentName+"\" of candidate "+pheno.getNumericID()+" "+pheno.getGenotypeID();
                logger.error(errormessage);
                throw new AnalysisFailedException(errormessage);
            }
        	
        }
        


        return result;
    }



    private void launchSlingshot(final IProgressMonitor monitor)
            throws CoreException, AnalysisFailedException, UserCanceledException {
    	
    	// create a simulation root job that reads the model files from the disk to a separate Slingshot memory blackboard partition and launches the Slingshot Simulation
    	this.workflowConfig.setInteractive(false);
        final SimulationRootJob job = new SimulationRootJob(this.workflowConfig, this.alreadyLaunched);
        job.setBlackboard(this.blackboard);

        // execute the simulation (try two times - this is taken over from SimuCom)
        final int numberOfTries = 2;
        for (int i = 0; i < numberOfTries; i++){
            try {
                // load the model files and start the Slingshot Simulator
                job.execute(monitor);
                logger.debug("Finished Slingshot analysis");
                this.alreadyLaunched = true;
                break;
            } catch (final JobFailedException e) {
                logger.error(e.getMessage());
                if (e.getCause() != null){
                	String causingErrorMessage = e.getCause().getMessage();
                	if (numberOfTries > 0 && causingErrorMessage != null && causingErrorMessage.contains("Couldn't find extension")){
                		logger.warn("Trying to start Slingshot again.");
                		continue;
                	}
                }
                // try to roll back and clean up
                try {
					job.cleanup(monitor);
				} catch (CleanupFailedException e1) {
					logger.error("Cleanup of failed Slingshot run failed, probably you need to clean up manually (e.g. delete temorary plugin);");
					e1.printStackTrace();
				}
                throw new AnalysisFailedException(e);
            }
        }

    }


    /**
     * {@inheritDoc}
     * @throws CoreException
     * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysis#initialise(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public void initialise(final DSEWorkflowConfiguration configuration) throws CoreException {

        this.previousExperimentNames.clear();

        this.config = configuration.getRawConfiguration();
        if (blackboard == null){
            throw ExceptionHelper.createNewCoreException("Error in initialisation: No Blackboard was set when initialising the Slingshot Analysis. Contact the developers.");
        }

        this.initialExperimentName = this.config.getAttribute(SimuComConfig.EXPERIMENT_RUN, "");

        initialiseCriteria(configuration);
    }


    @Override
    public IStatisticAnalysisResult retrieveResultsFor(final PCMPhenotype pheno, final Criterion criterion) throws CoreException, AnalysisFailedException {

        Entity entity = getPCMEntityForCriterion(criterion);
        return this.retrieveSlingshotResults(pheno, entity);
        
    }
    
    private Entity getPCMEntityForCriterion(final Criterion criterion) throws CoreException{
    	 if(criterion instanceof UsageScenarioBasedCriterion){
             return ((UsageScenarioBasedCriterion)criterion).getUsageScenario();
         } else if (criterion instanceof EntryLevelSystemCallCriterion){
        	 return ((EntryLevelSystemCallCriterion)criterion).getEntryLevelSystemCall();
         }
    	 throw new CoreException(new Status(Status.ERROR, "de.uka.ipd.sdq.dsexplore.analysis.slingshot", "Cannot handle Criterion of type "+criterion.getClass()+". Required is UsageScenarioBasedCriterion or EntryLevelSystemCallCriterion."));
    }



    @Override
    public QualityAttribute getQualityAttribute() throws CoreException {
        
        return qualityAttribute.getQualityAttribute();
    }


    
    @Override
    public boolean hasStatisticResultsFor() throws CoreException {
    	
    	return true;
    }


    @Override
    public boolean hasObjectivePerUsageScenario() throws CoreException {
        return true;
    }



    @Override
    public void setBlackboard(final MDSDBlackboard blackboard) {
        this.blackboard = blackboard;

    }



}

class DSESimulationLauncher extends SimulationLauncher{

    public SimulationWorkflowConfiguration deriveConfiguration(final ILaunchConfiguration config) throws CoreException{
        return super.deriveConfiguration(config, ILaunchManager.RUN_MODE);

    }

}

// this class is adopted from the stand-alone Slingshot Simulator
class SimulationRootJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements ICompositeJob {

	public SimulationRootJob(final SimulationWorkflowConfiguration config, boolean alreadyLaunched) {
		super(SimulationRootJob.class.getName(), false);

		this.addJob(new PreparePCMBlackboardPartitionJob());
		
		config.getPCMModelFiles().forEach(modelFile -> LoadModelIntoBlackboardJob.parseUriAndAddModelLoadJob(modelFile, this));
		this.addJob(new SimulationJob(config.getSimuComConfig()));
	}

}