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
//import de.uka.ipd.sdq.dsexplore.analysis.simucom.DSESimuComWorkflowLauncher;
//import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComAnalysisEDP2Result;
//import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComAnalysisResult;
//import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComAnalysisSensorFrameworkResult;
//import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComQualityAttributeDeclaration;
//import de.uka.ipd.sdq.dsexplore.analysis.simulizar.SimulizarAnalysis;
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
     * Calls SimuCom. Before doing so, it calls the {@link ConfigurationHelper}
     * to update the {@link ILaunchConfiguration} and stores the
     * {@link PCMInstance} to files, so that SimuCom can read it as usual. After
     * the SimuCom run, the analysis results are extracted from the
     * sensorFramework data sources and returned. The returned
     * {@link IAnalysisResult} is a {@link SimuComAnalysisResult} which does not
     * store the results directly, but provides access to the underlying
     * sensorFramework data sources.
     *
     * {@inheritDoc}
     * @throws UserCanceledException
     *
     * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysis#analyse(PCMPhenotype, de.uka.ipd.sdq.dsexplore.PCMInstance)
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
        	
        	IFolder tempStoreFolder = workspace.getRoot().getFolder(new Path(tempStorePath.toPlatformString(true)));
        	
        	if (!tempStoreFolder.exists()) {
        		tempStoreFolder.create(true, true, null);
        		System.out.println("Initial storage directory created.");
        	}
        }
        
        List<String> savedInits = new ArrayList<>();
        
//        java.net.URI javaURI = java.net.URI.create(firstModelFile.substring(0, firstModelFile.lastIndexOf("/"))+"/initStorage");
//        this.workflowConfig.getModelPaths().get(0);
//        IFileStore tempStore = EFS.getStore(javaURI);
//        
//        if (!tempStore.fetchInfo().exists()) {
//        	tempStore.mkdir(EFS.NONE, null);
//        	System.out.println("Initial storage directory created.");
//        }
        
//        Path tempPath = Paths.get(subdirStore);
//        
//        
//        
//        if (!Files.exists(tempPath)) {
//        	try {
//				Files.createDirectories(tempPath);
//				System.out.println("Directory created at: " + tempPath);
//			} catch (IOException e) {
//				System.err.println("Error creating directory: " + e.getMessage());
//			}
//        }
//        // old 17:14
//        // copy initial files to the initStorage path
//        for (int iModelFiles = 0; iModelFiles < modelFiles.size(); iModelFiles++) {
//        	String modelFile = modelFiles.get(iModelFiles);
//        	
//        	// only for the spd file for now
////        	if (modelFile.endsWith(".spd") && this.alreadyLaunched) {
//        	if (!this.alreadyLaunched && modelFile.length() > 0) {
//        		IFolder tempStoreFolder = workspace.getRoot().getFolder(new Path(tempStorePath.toPlatformString(true)));
//        		int lastSlashIndex = modelFile.lastIndexOf("/");
//        		URI orgURI = URI.createURI(modelFile);
//        		IFile orgFile = workspace.getRoot().getFile(new Path(orgURI.toPlatformString(true)));
//        		
//        		if (workspace.getRoot().exists(tempStoreFolder.getFullPath().append(orgFile.getName()))) {
//        			workspace.getRoot().getFile(tempStoreFolder.getFullPath().append(orgFile.getName())).delete(false, null);
////        			orgFile.copy(tempStoreFolder.getFullPath().append(orgFile.getName()), false, null);
//        		}
//        		orgFile.copy(tempStoreFolder.getFullPath().append(orgFile.getName()), false, null);
//        	}
//        }
        
        if (this.alreadyLaunched) {
        	// remove cand from URIs so that slingshot works
        	IFolder tempStoreFolder = workspace.getRoot().getFolder(new Path(tempStorePath.toPlatformString(true)));
            List<String> remCandMemory = new ArrayList<>();
            final ResourceSetPartition pcmPartition = this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
            for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
            	Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
            	if (currResource.getURI().toString().contains("cand")) {
            		remCandMemory.add(currResource.getURI().toString().split("cand")[0]);
            		currResource.setURI(URI.createURI(currResource.getURI().toString().split("cand")[0]));
            	}
            }
            
            // save changed files so that they are visible for Slingshot
            for (String changedFile : remCandMemory) {
            	for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
            		Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
            		if (changedFile.equals(currResource.getURI().toString())) {
            			// save initial version of the resource
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
       
            // comment start
//         // save SPD files, which are needed by Slingshot, to original directory, overwriting initial ones
//            for (int iModelFiles = 0; iModelFiles < modelFiles.size(); iModelFiles++) {
//            	String modelFile = modelFiles.get(iModelFiles);
//            	if (modelFile.contains("spd")) {
//            		URI orgURI = URI.createURI(modelFile);
//                    
//                	for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
//                		Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
//                		if (currResource.getURI() == orgURI) {
//                			// save initial version of the resource
//                			IFile initFile = workspace.getRoot().getFile(new Path(currResource.getURI().toPlatformString(true)));
//                			if (workspace.getRoot().exists(tempStoreFolder.getFullPath().append(initFile.getName()))) {
//                				workspace.getRoot().getFile(tempStoreFolder.getFullPath().append(initFile.getName())).delete(false, null);
//                			}
//                			initFile.copy(tempStoreFolder.getFullPath().append(initFile.getName()), false, null);
//                			if (!savedInits.contains(currResource.getURI().toString())) {
//                				savedInits.add(currResource.getURI().toString());
//                			}
//                			
//                			// save current setting from PerOpteryx to the resource file
//                    		try {
//                    			currResource.save(null);
//                    		} catch (IOException e) {
//                    			e.printStackTrace();
//                    		}
//                    		break;
//                    		
//                		}
//                	}
//            	}
//            	
////            	URI orgURI = URI.createURI(modelFile);
////            
////            	for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
////            		Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
////            		if (currResource.getURI() == orgURI) {
//////            			currResource.setURI(orgURI);
////                		
////                		try {
////                			currResource.save(null);
////                		} catch (IOException e) {
////                			e.printStackTrace();
////                		}
////                		break;
////                		
////            		}
//////            		currResource.setURI(orgURI);
//////            		
//////            		try {
//////            			currResource.save(null);
//////            		} catch (IOException e) {
//////            			e.printStackTrace();
//////            		}
////            	}
//            } // comment end
            
            // return .cand to URIs so that we don't run the danger of somehow breaking PerOpteryx
            for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
            	Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
            	if (remCandMemory.contains(currResource.getURI().toString())) {
            		String currURIstr = currResource.getURI().toString();
            		int lastDotIndex = currURIstr.lastIndexOf('.');
            		String currURIext = (lastDotIndex != -1) ? currURIstr.substring(lastDotIndex + 1) : "";
            		currResource.setURI(URI.createURI(currResource.getURI().toString() + "cand." + currURIext));
            		System.out.println("hold"); // stopped for 12.04.2025 (here I want to check if the .cand is returned correctly)
            	}
            }
        }
//        // remove cand from URIs so that slingshot works
//        List<String> remCandMemory = new ArrayList<>();
//        final ResourceSetPartition pcmPartition = this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
//        for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
//        	Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
//        	if (currResource.getURI().toString().contains("cand")) {
//        		remCandMemory.add(currResource.getURI().toString().split("cand")[1]);
//        		currResource.setURI(URI.createURI(currResource.getURI().toString().split("cand")[0]));
//        	}
//        }
        
//        // save files, which are needed by slingshot to original directory, overwriting initial ones
//        for (int iModelFiles = 0; iModelFiles < modelFiles.size(); iModelFiles++) {
//        	String modelFile = modelFiles.get(iModelFiles);
//        	
//        	URI orgURI = URI.createURI(modelFile);
//        
//        	for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
//        		Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
//        		currResource.setURI(orgURI);
//        		
//        		try {
//        			currResource.save(null);
//        		} catch (IOException e) {
//        			e.printStackTrace();
//        		}
//        	}
//        }
        
        
        		
//        		IFile orgFile = workspace.getRoot().getFile(new Path(orgURI.toPlatformString(true)));
        		
        		
//        		URI tmpURI = URI.createURI(modelFile.substring(0, lastSlashIndex) + "/slingshottmp" + modelFile.substring(lastSlashIndex + 1));
        		
//				modelFile = modelFile.substring(0, lastSlashIndex) + "/slingshottmp" + modelFile.substring(lastSlashIndex + 1);
				
//				URI modURI = URI.createURI(modelFile);
        
//				old state (11.04.2025)
//				final ResourceSetPartition pcmPartition = this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
				
//				System.out.println(pcmPartition);
//				for (int iResource = 0; iResource < pcmPartition.getResourceSet().getResources().size(); iResource++) {
//					Resource currResource = pcmPartition.getResourceSet().getResources().get(iResource);
//					if (currResource.getURI().toString().endsWith(".resourceenvironment")) {
//						currResource.setURI(URI.createURI(currResource.getURI().toString().replace(".resourceenvironmentcand", "")));
//					}
//					if (currResource.getURI().toString().endsWith(".spd")) {
//						currResource.setURI(orgURI);
////						for (EObject eObject : currResource.getContents()) {
////							SPDImpl spdObject = (SPDImpl) eObject;
////							for (TargetGroup tgGroup : spdObject.getTargetGroups()) {
////								for (TargetConstraint tgGroupConstr :  tgGroup.getTargetConstraints()) {
////									TargetGroupSizeConstraintImpl tgGCimpl = (TargetGroupSizeConstraintImpl) tgGroupConstr;
//////									System.out.println("tgGCimpl.ID = " + tgGCimpl.getId());
////								}
////							}
////						}
//						
//						try {
//							currResource.save(null);
//						} catch (IOException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//				}
//        	}
//        }

        //this.simuComWorkflowConfiguration.getSimulationConfiguration().setNameBase(experimentName);
        //((AbstractRecorderConfigurationFactory)this.simuComWorkflowConfiguration.getSimulationConfiguration().getRecorderConfigurationFactory()).setExperimentNameAndRunName(experimentName);

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
            		orgFile.delete(false, null);
            		initFile.copy(new Path(orgURI.toPlatformString(true)), false, null);
        		}
        	}
        }
        
        
//        for (int iModelFiles = 0; iModelFiles < modelFiles.size(); iModelFiles++) {
//        	String modelFile = modelFiles.get(iModelFiles);
//        	
//        	if (this.alreadyLaunched) {
//        		IFolder tempStoreFolder = workspace.getRoot().getFolder(new Path(tempStorePath.toPlatformString(true)));
//        		URI orgURI = URI.createURI(modelFile);
//        		IFile orgFile = workspace.getRoot().getFile(new Path(orgURI.toPlatformString(true)));
//        		IFile initFile = workspace.getRoot().getFile(tempStoreFolder.getFullPath().append(orgFile.getName()));
//        		orgFile.delete(false, null);
//        		initFile.copy(new Path(orgURI.toPlatformString(true)), false, null);
//        	}
//        	
//        }
        
        this.alreadyLaunched = true;

    }



    /**
     * Search in all open data sources whether there is already an experiment run with this name and check that it contains some results.
     * @param experimentSettingName
     * @return
     */
    private boolean isExperimentRunDoesNotExist(final String experimentName, final String experimentSettingName) throws CoreException {
    	
//        if (config.getAttribute("persistenceFramework", "").equals("SensorFramework"))
//        {
//        	return !SimuComAnalysisSensorFrameworkResult.isExperimentRunExisting(experimentName, this.simuComWorkflowConfiguration, this.datasourceReloadCount, config);
//        }
//        // In case the selected persistence framework is EDP2
//        else 
//        {
//        	return !SlingshotAnalysisEDP2Result.isExperimentRunExisting(experimentName, experimentSettingName, SimuComAnalysisEDP2Result.findSelectedEDP2Repository(config));
//        }
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
//                result = new SimuComAnalysisSensorFrameworkResult(entity,
//                        experimentName, pcmInstance, this.criterionToAspect, (SimuComQualityAttributeDeclaration)this.qualityAttribute, this.config);
            
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

        /*		LoadPCMModelsIntoBlackboardJob loadJob = new LoadPCMModelsIntoBlackboardJob(config);

		PCMInstance pcm = new PCMInstance((PCMResourceSetPartition)this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID));
		pcm.saveToXMIFile(pcm.getSystem(), this.config.getAttribute(ConstantsContainer.SYSTEM_FILE, ""));
		pcm.saveToXMIFile(pcm.getAllocation(), this.config.getAttribute(ConstantsContainer.ALLOCATION_FILE, ""));

		SimuComWorkflowLauncher simuCom = new SimuComWorkflowLauncher();

		AbstractPCMWorkflowRunConfiguration PCMConfig;*/

        // load feature config files into blackboard

//        final String featureConfigFile = this.workflowConfig.getFeatureConfigFile();
//        if (featureConfigFile != null && !"".equals(featureConfigFile)){
//            final ResourceSetPartition pcmPartition = this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
//            pcmPartition.loadModel(featureConfigFile);
//        }

//        workflowConfig.getPCMModelFiles().forEach(modelFile -> LoadModelIntoBlackboardJob.parseUriAndAddModelLoadJob(modelFile, this));
//        workflowConfig.getPCMModelFiles().forEach(modelFile -> this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID).loadModel(modelFile));
//        this.alreadyLaunched = true;
    	this.workflowConfig.setInteractive(false);
        final SimulationRootJob job = new SimulationRootJob(this.workflowConfig, this.alreadyLaunched);
//        job.addJob(new PreparePCMBlackboardPartitionJob());
//        this.workflowConfig.getPCMModelFiles().forEach(modelFile -> LoadModelIntoBlackboardJob.parseUriAndAddModelLoadJob(modelFile, job));
//        final SimulationJob job = new SimulationJob(this.workflowConfig.getSimuComConfig());
        job.setBlackboard(this.blackboard);

        // retry simulation if the cause was that an extension could not be loaded, because that seems to be a transient problem (it only happens sometimes)
        final int numberOfTries = 2;
        for (int i = 0; i < numberOfTries; i++){
            try {
                // start SimuCom
                job.execute(monitor);
                logger.debug("Finished SimuCom analysis");
//                this.alreadyLaunched = true;
                break;
            } catch (final JobFailedException e) {
                logger.error(e.getMessage());
                if (e.getCause() != null){
                	String causingErrorMessage = e.getCause().getMessage();
                	if (numberOfTries > 0 && causingErrorMessage != null && causingErrorMessage.contains("Couldn't find extension")){
                		logger.warn("Trying to start SimuCom again.");
                		continue;
                	}
                }
                // try to roll back and clean up (e.g. delete temporary folder). This is not tested yet and may cause problems. 
                try {
					job.cleanup(monitor);
				} catch (CleanupFailedException e1) {
					logger.error("Cleanup of failed simucoim run failed, probably you need to clean up manually (e.g. delete temorary plugin);");
					e1.printStackTrace();
				}
                throw new AnalysisFailedException(e);
            }
        }

    }


    //	/** Put all the old appends back in the logger. FIXME: does not work as expected :( but whatever.
    //	 * @throws CoreException */
    //	private void restoreLogger(ILaunchConfiguration config) throws CoreException {
    //		BasicConfigurator.resetConfiguration();
    //		LoggerHelper.initializeLogger(config);
    //	}


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
            throw ExceptionHelper.createNewCoreException("Error in initialisation: No Blackboard was set when initialising the SimuCom Analysis. Contact the developers.");
        }

        this.initialExperimentName = this.config.getAttribute(SimuComConfig.EXPERIMENT_RUN, "");

        //		this.objectives = new ArrayList<Objective>(scenarios.size());
        //		for (UsageScenario usageScenario : scenarios) {
        //			objectives.add(new UsageScenarioBasedObjective(this.getQualityAttribute(), Objective.Sign.MIN, usageScenario));
//        		}

        initialiseCriteria(configuration);
    }





    //MOVED to PCMDeclarationsReader
    //	public UsageScenarioBasedObjective translateEvalAspectToObjective(EvaluationAspectWithContext aspect, UsageScenario usageScenario){
    //		//Make sure, the aspect IS an objective
    //		try {
    //			if(aspect.getDimension().getType().getRelationSemantics().getRelSem() == EnumRelationSemantics.DECREASING) {
    //				return new UsageScenarioBasedObjective(this.getQualityAttribute(), Objective.Sign.MIN, usageScenario);
    //			} else {
    //				//INCREASING
    //				return new UsageScenarioBasedObjective(this.getQualityAttribute(), Objective.Sign.MAX, usageScenario);
    //			}
    //		} catch (CoreException e) {
    //			e.printStackTrace();
    //			throw new RuntimeException("Could not get response time quality attribute!");
    //		}
    //	}

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
    	 throw new CoreException(new Status(Status.ERROR, "de.uka.ipd.sdq.dsexplore.analysis.simucom", "Cannot handle Criterion of type "+criterion.getClass()+". Required is UsageScenarioBasedCriterion or EntryLevelSystemCallCriterion."));
    }



    @Override
    public QualityAttribute getQualityAttribute() throws CoreException {
        //return DSEConstantsContainer.MEAN_RESPONSE_TIME_QUALITY;
        return qualityAttribute.getQualityAttribute();
    }


    //TODO remove Criterion parameter again, not needed. 
    @Override
    public boolean hasStatisticResultsFor() throws CoreException {
    	// FIXME: need to properly map between criterion and the quality attribute dimension. Cannot fix this before PALLADIO-384 is fixed. 
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

class SimulationRootJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements ICompositeJob {

	public SimulationRootJob(final SimulationWorkflowConfiguration config, boolean alreadyLaunched) {
		super(SimulationRootJob.class.getName(), false);

		this.addJob(new PreparePCMBlackboardPartitionJob());
		
//		List<String> modelFiles = config.getPCMModelFiles();
//		
//		for (int iModelFiles = 0; iModelFiles < modelFiles.size(); iModelFiles++) {
//			String modelFile = modelFiles.get(iModelFiles);
//			if (modelFile.endsWith("spd") && alreadyLaunched) {
//				int lastSlashIndex = modelFile.lastIndexOf("/");
//				modelFile = modelFile.substring(0, lastSlashIndex) + "/slingshottmp" + modelFile.substring(lastSlashIndex + 1);
//				
////				// Create a resource set to hold the resources.
////				//
////				ResourceSet resourceSet = new ResourceSetImpl();
////
////				// Register the appropriate resource factory to handle all file extensions.
////				//
////				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
////						.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
////
////				// Register the package to ensure it is available during loading.
////				//
////				resourceSet.getPackageRegistry().put(SpdPackage.eNS_URI, SpdPackage.eINSTANCE);
////				
////				URI uri = URI.createURI(modelFile);
////				Resource testresource = resourceSet.getResource(uri, true);
////				
////				if (modelFile.endsWith(".spd")) {
////					for (EObject eObject : testresource.getContents()) {
////						SPDImpl spdObject = (SPDImpl) eObject;
////						for (TargetGroup tgGroup : spdObject.getTargetGroups()) {
////							for (TargetConstraint tgGroupConstr :  tgGroup.getTargetConstraints()) {
////								TargetGroupSizeConstraintImpl tgGCimpl = (TargetGroupSizeConstraintImpl) tgGroupConstr;
////								tgGCimpl.setMaxSize(6);
////								System.out.println("tgGCimpl.ID = " + tgGCimpl.getId());
////								// do this over pheno
////							}
////						}
////					}
////					
////					try {
////						testresource.save(null);
////					} catch (IOException e) {
////						// TODO Auto-generated catch block
////						e.printStackTrace();
////					}
////				}
//			}
//			
//			LoadModelIntoBlackboardJob.parseUriAndAddModelLoadJob(modelFile, this);
//		}
		
		config.getPCMModelFiles().forEach(modelFile -> LoadModelIntoBlackboardJob.parseUriAndAddModelLoadJob(modelFile, this));
		this.addJob(new SimulationJob(config.getSimuComConfig()));
	}

}