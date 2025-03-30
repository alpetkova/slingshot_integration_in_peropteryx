package de.uka.ipd.sdq.dsexplore.analysis.slingshot;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.simulizar.SimuLizarPlatform;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;
import org.palladiosimulator.analyzer.slingshot.workflow.SimulationWorkflowConfiguration;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;

import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractSimulationJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import org.palladiosimulator.analyzer.slingshot.workflow.jobs.SimulationJob;
//import org.palladiosimulator.analyzer.slingshot.workflow.jobs.SimulationRootJob;

/**
 * Defines the job which runs SimuLizar on the current PCM Model of PerOpteryx
 *
 * @author Dominik Fuchss
 *
 */
public class SlingshotJob extends AbstractSimulationJob<SimuComWorkflowConfiguration> {
	/**
	 * Create the job.
	 *
	 * @param configuration
	 *            the configuration
	 * @param counter
	 *            the current count of runs (for id of temp location)
	 * @throws CoreException
	 *             throw from super class
	 */
	public SlingshotJob(final SimulationWorkflowConfiguration configuration, int counter) throws CoreException {
		super(SlingshotJob.updateConfig(configuration, counter), null, false);

	}

	/**
	 * Change temporary storage location.
	 *
	 * @param configuration
	 *            the configuration
	 * @param counter
	 *            the iteration
	 * @return the same configuration for chaning
	 */
	private static SimulationWorkflowConfiguration updateConfig(SimulationWorkflowConfiguration configuration, int counter) {
		configuration.setStoragePluginID(configuration.getStoragePluginID() + "_" + (counter));
		return configuration;
	}

	@Override
	protected void addSimulatorSpecificJobs(SimulationWorkflowConfiguration configuration) {
		//this.add(new PathChangerJob(configuration));
		//this.add(SimuLizarPlatform.getPlatformComponent()
		//		.analysisFactory()
		//		.create((SimulationWorkflowConfiguration) configuration)
		//		.rootJob());
		final SimulationJob job = new SimulationJob(configuration.getSimuComConfig());
		this.add(job);
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
		// Disable cleanup for issues with missing partitions..
	}
}
