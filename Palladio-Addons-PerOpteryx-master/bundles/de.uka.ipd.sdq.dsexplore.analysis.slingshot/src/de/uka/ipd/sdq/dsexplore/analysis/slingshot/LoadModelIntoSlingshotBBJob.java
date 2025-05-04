package de.uka.ipd.sdq.dsexplore.analysis.slingshot;

import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;

import de.uka.ipd.sdq.workflow.jobs.AbstractBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.ICompositeJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

public class LoadModelIntoSlingshotBBJob extends AbstractBlackboardInteractingJob<MDSDBlackboard> {

//	private final URI modelURI;
    private final String partitionID;
    private final Resource resourceToLoad;
    
//    public static void parseUriAndAddModelLoadJob(String modelUri, ICompositeJob container) {
//        parseUriAndAddModelLoadJob(modelUri, LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID, container);
//    }
    
//    public static void getResourceAndAddModelCopyJob(ResourceSetPartition modelPartition, String modelUri, ICompositeJob container) {
//    	for (int iResource = 0; iResource < modelPartition.getResourceSet().getResources().size(); iResource++) {
//    		Resource currResource = modelPartition.getResourceSet().getResources().get(iResource);
//    		if (modelUri.equals(currResource.getURI().toString())) {
//    			container.addJob(new LoadModelIntoSlingshotBBJob(currResource, LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID));
//    		}
//    	}
//    }
    
    public static void getResourceAndAddModelCopyJob(ResourceSetPartition modelPartition, String modelUri, ICompositeJob container) {
    	for (int iResource = 0; iResource < modelPartition.getResourceSet().getResources().size(); iResource++) {
    		Resource currResource = modelPartition.getResourceSet().getResources().get(iResource);
    		if (modelUri.equals(currResource.getURI().toString())) {
    			container.addJob(new LoadModelIntoSlingshotBBJob(currResource, LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID));
    			break;
    		}
    	}
    }
    
//    public static void parseUriAndAddModelLoadJob(String modelUri, String partitionId, ICompositeJob container) {
//        if (modelUri == null || modelUri.isBlank()) return;
//        if (partitionId == null || partitionId.isBlank()) return;
//        
//        var uri = URI.createURI(modelUri);
//        container.addJob(new LoadModelIntoSlingshotBBJob(uri, partitionId));
//    }
    
    public LoadModelIntoSlingshotBBJob(Resource resourceToLoad, String partitionID) {
//        this.modelURI = Objects.requireNonNull(modelURI);
    	this.resourceToLoad = resourceToLoad;
        this.partitionID = Objects.requireNonNull(partitionID);
    }
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        var partition = Optional.ofNullable(myBlackboard.getPartition(partitionID))
            .orElseThrow(() -> new IllegalStateException(String.format("The blackboard does not contain the requested partition \"%s\"", partitionID)));

//        if (!partition.getResourceSet().getURIConverter().exists(modelURI, Collections.emptyMap())) {
//            throw new JobFailedException(String.format("Job %s failed: The model uri \"%s\" does not point to a valid file", getName(), modelURI));
//        }
//        
//        partition.loadModel(modelURI);     
        
        partition.getResourceSet().createResource(this.resourceToLoad.getURI());
        partition.setContents(resourceToLoad.getURI(), resourceToLoad.getContents());
    }

    @Override
    public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
        // Nothing to do here, blackboard partitions are not reused
    }

    @Override
    public String getName() {
        return String.format("LoadModelIntoBlackboardJob<%s->%s>", resourceToLoad.getURI().toString(), partitionID);
    }


}