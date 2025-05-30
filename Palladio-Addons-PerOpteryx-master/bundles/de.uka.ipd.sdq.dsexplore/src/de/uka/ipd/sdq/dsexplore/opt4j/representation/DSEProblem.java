package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.pcm.resourcetype.SchedulingPolicy;
import org.palladiosimulator.solver.models.PCMInstance;

import org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint;
import org.palladiosimulator.spd.adjustments.StepAdjustment;
import org.palladiosimulator.spd.adjustments.AbsoluteAdjustment;
import org.palladiosimulator.spd.adjustments.RelativeAdjustment;
import org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTime;
import org.palladiosimulator.spd.triggers.expectations.ExpectedCount;
import org.palladiosimulator.spd.constraints.policy.CooldownConstraint;
import org.palladiosimulator.spd.constraints.policy.IntervalConstraint;
import org.palladiosimulator.spd.constraints.target.ThrashingConstraint;


import de.uka.ipd.sdq.dsexplore.Modules;
import de.uka.ipd.sdq.dsexplore.designdecisions.alternativecomponents.AlternativeComponent;
import de.uka.ipd.sdq.dsexplore.exception.ChoiceOutOfBoundsException;
import de.uka.ipd.sdq.dsexplore.facade.IModule;
import de.uka.ipd.sdq.dsexplore.facade.ModuleRegistry;
import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.helper.DegreeOfFreedomHelper;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.FixDesignDecisionReferenceSwitch;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.launch.MoveInitialPCMModelPartitionJob;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMaxConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMinConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StepAdjustmentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedCPUUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedMemoryUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedHDDUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNetworkUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedSimulationTimeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedOperationResponseTimeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNumberOfElementsDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedQueueLengthDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedTaskCountDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CooldownTimeConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CooldownMaxScalingOperationsConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AbsoluteAdjustmentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.RelativeAdjustmentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.IntervalDurationConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.IntervalOffsetConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ThrashingConstraintDegree;

import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;



/**
 * The {@link DSEProblem} defines the problem. Therefore, it reads in the
 * current PCM instances and identifies the available design options to define
 * the design space.
 *
 * @author Anne
 *
 */
public class DSEProblem {
	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");
	/**
	 * Is changed during the evaluation, as the decisions refer to it.
	 */
	private final PCMInstance initialInstance;

	private DecisionSpace pcmProblem;
	private final designdecisionFactory designDecisionFactory;
	private final specificFactory specificDesignDecisionFactory;

	private List<DesignDecisionGenotype> initialGenotypeList = null;

	private final DSEWorkflowConfiguration dseConfig;

	private DesignDecisionGenotype initialGenotype;

	private MDSDBlackboard blackboard;

	private ModuleRegistry registry = ModuleRegistry.getModuleRegistry();

	/**
	 * @param pcmInstance
	 * @throws CoreException
	 */
	public DSEProblem(final DSEWorkflowConfiguration dseConfig, MDSDBlackboard blackboard) throws CoreException {

		this.dseConfig = dseConfig;
		final boolean newProblem = dseConfig.isNewProblem();
		this.blackboard = blackboard;

		PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition) this.blackboard.getPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
		this.initialInstance = new PCMInstance(pcmPartition);
		// this.currentInstance = copyOf pcmInstance
		// EcoreUtil.Copier deep copy

		this.designDecisionFactory = designdecisionFactoryImpl.init();
		this.specificDesignDecisionFactory = specificFactoryImpl.init();

		// this.initTransformationRepository(pcmPartition);
		Modules.loadModules();

		if (newProblem) {
			this.initialiseProblem();
		} else {
			// Alternative Component has to be called to create the mapping for
			// all AssemblyContexts
			// and their roles,
			// in order to be able to exchange implementations later. The design
			// decisions
			// calculated here are not kept, only
			// the mapping inside AlternativeComponent.getInstance()
			AlternativeComponent.getInstance().generateDesignDecisions(this.initialInstance);
			final DecisionSpace problem = this.loadProblem();
			this.pcmProblem = problem;
			this.initialGenotypeList = this.determineInitialGenotype(problem);

		}

		// TODO: mapping of design decisions to bounds.
		/*
		 * Meta model design decisions?? Each design decision would know its
		 * bounds and the annotated element or more specific the annotated
		 * property of this element that is exactly the value range than the
		 * bound of the decision.
		 *
		 * But what about the genotype? With a ordered list of design decisions,
		 * I can map the genotype entry to a design decisions. Better group in
		 * integer and double, then. -> require CompositeGenotype
		 *
		 * Also meta-model the genotype as a choice within the range.
		 */
	}

	private DecisionSpace loadProblem() throws CoreException {
		final URI filename = this.dseConfig.getDesignDecisionFileName();
		return this.loadProblem(filename);
	}

	private DecisionSpace loadProblem(final URI filename) throws CoreException {
		final ResourceSet pcmResourceSet = this.initialInstance.getAllocation().eResource().getResourceSet();

		final EObject eproblem = EMFHelper.loadFromXMIFile(filename, pcmResourceSet, designdecisionPackage.eINSTANCE);
		if (!(eproblem instanceof DecisionSpace)) {
			throw new CoreException(new Status(IStatus.ERROR, "de.uka.ipd.sdq.dsexplore", 0, "Cannot read design decision file " + filename + ". Please create a new one.", null));
		}
		final DecisionSpace problem = (DecisionSpace) eproblem;
		// Adjust references with the right loaded model objects in memory?

		final FixDesignDecisionReferenceSwitch visitor = new FixDesignDecisionReferenceSwitch(this.initialInstance);
		visitor.doSwitch(problem);

		EcoreUtil.resolveAll(eproblem);

		return problem;
	}

	private List<DesignDecisionGenotype> determineInitialGenotype(final DecisionSpace problem) throws CoreException {
		final DesignDecisionGenotype genotype = new DesignDecisionGenotype();

		for (final DegreeOfFreedomInstance dd : problem.getDegreesOfFreedom()) {

			if (dd.getDof() != null) {
				final EStructuralFeature property = dd.getDof().getPrimaryChangeable().getChangeable();

				final Object value = GenomeToCandidateModelTransformation.getProperty(dd.getPrimaryChanged(), property);
				// FIXME SubSystem Degree -> changeable is a set of
				// AllocationContexts
				// EList<Object> acs = (EList<Object>) values;
				// for (Object value : acs) {

				final Choice choice;
				if (value instanceof EObject) {
					choice = this.designDecisionFactory.createClassChoice();
					((ClassChoice) choice).setChosenValue((EObject) value);
				} else if (value instanceof Double) {
					choice = this.designDecisionFactory.createContinousRangeChoice();
					((ContinousRangeChoice) choice).setChosenValue((Double) value);
				} else if (value instanceof Integer) {
					choice = this.designDecisionFactory.createDiscreteRangeChoice();
					((DiscreteRangeChoice) choice).setChosenValue((Integer) value);
				} else {
					throw new CoreException(new Status(IStatus.ERROR, "de.uka.ipd.sdq.dsexplore", 0,
							"Cannot cast " + value + " to an EObject, Integer, or Double. Please extend DSEProblem.determineInitialGenotype to handle your type of choice.", null));
				}

				choice.setDegreeOfFreedomInstance(dd);
				genotype.add(choice);
				// }
			} else if (dd instanceof ClassDegree) {

				final ClassChoice choice = this.designDecisionFactory.createClassChoice();
				choice.setDegreeOfFreedomInstance(dd);

				if (dd instanceof AssembledComponentDegree) {
					final AssembledComponentDegree acd = (AssembledComponentDegree) dd;
					final AssemblyContext ac = (AssemblyContext) acd.getPrimaryChanged();
					final RepositoryComponent rc = ac.getEncapsulatedComponent__AssemblyContext();
					choice.setChosenValue(rc);
				} else if (dd instanceof FeatureCompletionDegree) {
					final FeatureCompletionDegree concernDegree = (FeatureCompletionDegree) dd;
					choice.setChosenValue(concernDegree.getClassDesignOptions().get(0));
				} else if (dd instanceof AllocationDegree) {
					final AllocationDegree ad = (AllocationDegree) dd;
					final AllocationContext ac = (AllocationContext) ad.getPrimaryChanged();
					final ResourceContainer rc = ac.getResourceContainer_AllocationContext();
					choice.setChosenValue(rc);
				} else if (dd instanceof SchedulingPolicyDegree) {

					final ProcessingResourceType procType = ((SchedulingPolicyDegree) dd).getProcessingresourcetype();
					final ResourceContainer rc = (ResourceContainer) dd.getPrimaryChanged();

					SchedulingPolicy policy = null;

					for (final ProcessingResourceSpecification proc : rc.getActiveResourceSpecifications_ResourceContainer()) {
						if (EMFHelper.checkIdentity(proc.getActiveResourceType_ActiveResourceSpecification(), procType)) {
							policy = proc.getSchedulingPolicy();
							break;
						}
					}
					if (policy == null) {
						throw new RuntimeException("Invalid degree of freedom " + dd.toString() + ". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
					}
					choice.setChosenValue(policy);
					genotype.add(choice);

				} else {
					this.throwUnknownDegreeException(dd);
				}

				// check if entity is in the domain
				if (!EMFHelper.contains(((ClassDegree) dd).getClassDesignOptions(), choice.getChosenValue())) {
					throw new ChoiceOutOfBoundsException(choice, "Error when determining initial genotype");
				}

				genotype.add(choice);
			} else if (dd instanceof ContinuousRangeDegree) {
				/*
				 *
				 */
				final ContinousRangeChoice choice = this.designDecisionFactory.createContinousRangeChoice();
				choice.setDegreeOfFreedomInstance(dd);

				// Monitoring Degree added
				// added by Suman Jojiju
				if (dd instanceof MonitoringDegree) {
					// MonitoringDegree mnrt = (MonitoringDegree) dd;
					final ContinuousRangeDegree crdobj = (ContinuousRangeDegree) dd;
					// Intervall interval = (Intervall)
					// (MonitoringDegree)crdobj.getPrimaryChanged();
					// choice.setChosenValue(interval.getIntervall());
					choice.setChosenValue(crdobj.getFrom());

				} else if (dd instanceof ContinuousProcessingRateDegree) {
					final ContinuousProcessingRateDegree prd = (ContinuousProcessingRateDegree) dd;
					final ProcessingResourceSpecification rightPrs = this.getProcessingResourceSpec(prd);

					if (rightPrs != null) {
						final double rate = CostUtil.getInstance().getDoubleFromSpecification(rightPrs.getProcessingRate_ProcessingResourceSpecification().getSpecification());
						choice.setChosenValue(rate);
					} else {
						throw new RuntimeException("Invalid degree of freedom " + dd.toString() + ". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
					}
					
				} else if (dd instanceof ExpectedCPUUtilizationDegree) {
					final ExpectedPercentage expPerc = (ExpectedPercentage) dd.getPrimaryChanged();
					choice.setChosenValue(expPerc.getValue());
	
				} else if (dd instanceof ExpectedMemoryUtilizationDegree) {
					final ExpectedPercentage expPerc = (ExpectedPercentage) dd.getPrimaryChanged();
					choice.setChosenValue(expPerc.getValue());
	
				}else if (dd instanceof ExpectedHDDUtilizationDegree) {
					final ExpectedPercentage expPerc = (ExpectedPercentage) dd.getPrimaryChanged();
					choice.setChosenValue(expPerc.getValue());
	
				}else if (dd instanceof ExpectedNetworkUtilizationDegree) {
					final ExpectedPercentage expPerc = (ExpectedPercentage) dd.getPrimaryChanged();
					choice.setChosenValue(expPerc.getValue());
	
				}else if (dd instanceof ExpectedSimulationTimeDegree) {
					final ExpectedTime expTime = (ExpectedTime) dd.getPrimaryChanged();
					choice.setChosenValue(expTime.getValue());
	
				}else if (dd instanceof ExpectedOperationResponseTimeDegree) {
					final ExpectedTime expTime = (ExpectedTime) dd.getPrimaryChanged();
					choice.setChosenValue(expTime.getValue());
	
				}else if (dd instanceof CooldownTimeConstraintDegree) {
					final CooldownConstraint cooltime = (CooldownConstraint) dd.getPrimaryChanged();
					choice.setChosenValue(cooltime.getCooldownTime());
	
				}else if (dd instanceof IntervalDurationConstraintDegree) {
					final IntervalConstraint intdur = (IntervalConstraint) dd.getPrimaryChanged();
					choice.setChosenValue(intdur.getIntervalDuration());
	
				}else if (dd instanceof IntervalOffsetConstraintDegree) {
					final IntervalConstraint intoff = (IntervalConstraint) dd.getPrimaryChanged();
					choice.setChosenValue(intoff.getOffset());
	
				}else if (dd instanceof ThrashingConstraintDegree) {
					final ThrashingConstraint thrashing = (ThrashingConstraint) dd.getPrimaryChanged();
					choice.setChosenValue(thrashing.getMinimumTimeNoThrashing());
	
				}else {
					this.throwUnknownDegreeException(dd);
				}

				genotype.add(choice);
			} else if (dd instanceof DiscreteDegree) {
				final DiscreteDegree degree = (DiscreteDegree) dd;

				final DiscreteRangeChoice choice = this.designDecisionFactory.createDiscreteRangeChoice();
				choice.setDegreeOfFreedomInstance(degree);

				final EObject entity = degree.getPrimaryChanged();

				if (degree instanceof CapacityDegree) {
					final PassiveResource pr = (PassiveResource) entity;
					choice.setChosenValue(Integer.valueOf(pr.getCapacity_PassiveResource().getSpecification()));

				} else if (degree instanceof NumberOfCoresDegree) {
					final ProcessingResourceSpecification prd = this.getProcessingResourceSpec((ProcessingResourceDegree) degree);
					choice.setChosenValue(prd.getNumberOfReplicas());
				} else if (degree instanceof DiscreteProcessingRateDegree) {

					final DiscreteProcessingRateDegree prd = (DiscreteProcessingRateDegree) dd;

					final ProcessingResourceSpecification rightPrs = this.getProcessingResourceSpec(prd);

					if (rightPrs != null) {
						if (!prd.isLowerBoundIncluded() || !prd.isUpperBoundIncluded()) {
							throw new RuntimeException("Only DiscreteProcessingRateDegrees with upper and lower bound included are supported so far, sorry. ");
						}
						final double rate = CostUtil.getInstance().getDoubleFromSpecification(rightPrs.getProcessingRate_ProcessingResourceSpecification().getSpecification());
						final double startStep = prd.getFrom();
						final double endStep = prd.getTo();
						final double stepwidth = (endStep - startStep) / prd.getNumberOfSteps();

						final double chosenStep = (rate - startStep) / stepwidth;
						choice.setChosenValue((int) chosenStep);
					} else {
						throw new RuntimeException("Invalid degree of freedom " + dd.toString() + ". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
					}
				} else if (degree instanceof ResourceContainerReplicationDegree) {
					choice.setChosenValue(1);

				} else if (degree instanceof ATNumberOfReplicaDegree) {
					ATNumberOfReplicaDegree atNumberOfReplicasDegree = (ATNumberOfReplicaDegree) degree;
					if (entity instanceof ResourceContainer) {
						ResourceContainer resourceContainer = (ResourceContainer) entity;
						if (StereotypeAPI.isStereotypeApplied(resourceContainer, "ReplicableResourceContainer")) {
							// TODO: How should the start value be initialized?
							int min = atNumberOfReplicasDegree.getFrom();
							StereotypeAPI.setTaggedValue(resourceContainer, min, "ReplicableResourceContainer", "numberOfReplicas");
							choice.setChosenValue(min);
						}
					} else if (entity instanceof AssemblyContext) {
						// TODO: Add specific code to set numberOfReplicas of
						// AssemblyContext
					}
				} else if (degree instanceof TargetGroupSizeMaxConstraintDegree) {
					final TargetGroupSizeConstraint tgsc = (TargetGroupSizeConstraint) entity;
					choice.setChosenValue(tgsc.getMaxSize());
						
				} else if (degree instanceof TargetGroupSizeMinConstraintDegree) {
					final TargetGroupSizeConstraint tgsc = (TargetGroupSizeConstraint) entity;
					choice.setChosenValue(tgsc.getMinSize());
						
				} else if (degree instanceof StepAdjustmentDegree) {
					final StepAdjustment stadj = (StepAdjustment) entity;
					choice.setChosenValue(stadj.getStepValue());
						
				} else if (degree instanceof AbsoluteAdjustmentDegree) {
					final AbsoluteAdjustment absadj = (AbsoluteAdjustment) entity;
					choice.setChosenValue(absadj.getGoalValue());
						
				}else if (degree instanceof RelativeAdjustmentDegree) {
					final RelativeAdjustment reladj = (RelativeAdjustment) entity;
					choice.setChosenValue(reladj.getPercentageGrowthValue());
						
				}else if (degree instanceof ExpectedNumberOfElementsDegree) {
					final ExpectedCount expCount = (ExpectedCount) entity;
					choice.setChosenValue(expCount.getCount());
						
				}else if (degree instanceof ExpectedQueueLengthDegree) {
					final ExpectedCount expCount = (ExpectedCount) entity;
					choice.setChosenValue(expCount.getCount());
						
				}else if (degree instanceof ExpectedTaskCountDegree) {
					final ExpectedCount expCount = (ExpectedCount) entity;
					choice.setChosenValue(expCount.getCount());
						
				}else if (degree instanceof CooldownMaxScalingOperationsConstraintDegree) {
					final CooldownConstraint coolmaxscop = (CooldownConstraint) entity;
					choice.setChosenValue(coolmaxscop.getMaxScalingOperations());
						
				} else {
					this.throwUnknownDegreeException(dd);
				}
				genotype.add(choice);
			} else {
				this.throwUnknownDegreeException(dd);
			}
		}

		// Determine initial genotype for all registered modules
		CostRepository costModel = this.getCostModel().orElse(null);
		for (IModule module : this.registry.getModules()) {
			module.getProblemExtension().determineInitialGenotype(this.blackboard, problem, genotype, this.initialInstance, costModel);
		}

		// determineProcessingRateDecisions(new ArrayList<DesignDecision>(),
		// genotype);
		// determineAssembledComponentsDecisions(new
		// ArrayList<DesignDecision>(), genotype);
		// determineAllocationDecisions(new ArrayList<DesignDecision>(),
		// genotype);
		final List<DesignDecisionGenotype> result = new ArrayList<>();
		result.add(genotype);
		this.initialGenotype = genotype;
		return result;
	}

	private ProcessingResourceSpecification getProcessingResourceSpec(final ProcessingResourceDegree prd) {
		final ResourceContainer rc = (ResourceContainer) prd.getPrimaryChanged();
		final List<ProcessingResourceSpecification> prsList = rc.getActiveResourceSpecifications_ResourceContainer();
		final ProcessingResourceType prt = prd.getProcessingresourcetype();

		ProcessingResourceSpecification rightPrs = null;
		for (final ProcessingResourceSpecification prs : prsList) {
			if (EMFHelper.checkIdentity(prs.getActiveResourceType_ActiveResourceSpecification(), prt)) {
				rightPrs = prs;
				break;
			}
		}
		return rightPrs;
	}

	private void throwUnknownDegreeException(final DegreeOfFreedomInstance dd) {
		throw new RuntimeException("Unknown degree of freedom " + dd.toString() + ".");
	}

	/**
	 * Initialises the degrees of freedoms and at the same time determines the
	 * initial genotype.
	 */
	private void initialiseProblem() {
		this.pcmProblem = this.designDecisionFactory.createDecisionSpace();
		final List<DegreeOfFreedomInstance> dds = this.pcmProblem.getDegreesOfFreedom();

		// analyse PCM Instance and create design decisions
		// TODO: could this be possible with a M2M transformation?
		// First, only get design decisions for making resources faster.

		this.initialGenotypeList = new ArrayList<>();
		final DesignDecisionGenotype initialCandidate = new DesignDecisionGenotype();
		this.determineProcessingRateDecisions(dds, initialCandidate);
		// find equivalent components
		this.determineAssembledComponentsDecisions(dds, initialCandidate);
		this.determineAllocationDecisions(dds, initialCandidate);
		// Quickfix: Add a Soap or RMI decision. This is not meta modelled.
		// determineSOAPOrRMIDecisions();
		this.determineCapacityDecisions(dds, initialCandidate);

		// Initialize Problem for all registered modules.
		CostRepository costModel = this.getCostModel().orElse(null);
		for (IModule module : this.registry.getModules()) {
			module.getProblemExtension().initializeProblem(this.blackboard, dds, initialCandidate, this.initialInstance, costModel);
		}

		// TODO: Check if the initial genotype is actually a valid genotype?
		// (this may not be the case if the degrees of freedom have been reduced
		// for the
		// optimisation?)
		this.initialGenotypeList.add(initialCandidate);

	}

	/**
	 * Determine Capacity options based on {@link Repository}. Thus, this may
	 * detect {@link PassiveResource}s of components that are not used in the
	 * system. These need to be deleted manually.
	 *
	 * Otherwise, I would have to descend in all composed structures to find all
	 * {@link BasicComponent}s.
	 *
	 * @param dds
	 * @param initialCandidate
	 */
	private void determineCapacityDecisions(final List<DegreeOfFreedomInstance> dds, final DesignDecisionGenotype genotype) {
		final List<Repository> repositories = this.initialInstance.getRepositories();
		for (final Repository repository : repositories) {
			final List<RepositoryComponent> components = repository.getComponents__Repository();
			for (final RepositoryComponent repositoryComponent : components) {
				if (repositoryComponent instanceof BasicComponent) {
					final BasicComponent basicComponent = (BasicComponent) repositoryComponent;
					final List<PassiveResource> passiveResources = basicComponent.getPassiveResource_BasicComponent();
					for (final PassiveResource passiveResource : passiveResources) {
						final CapacityDegree capacityDegree = this.specificDesignDecisionFactory.createCapacityDegree();
						capacityDegree.setPrimaryChanged(passiveResource);
						capacityDegree.setFrom(1);
						capacityDegree.setTo(Integer.valueOf(passiveResource.getCapacity_PassiveResource().getSpecification()));
						dds.add(capacityDegree);

						final DiscreteRangeChoice choice = this.designDecisionFactory.createDiscreteRangeChoice();
						choice.setDegreeOfFreedomInstance(capacityDegree);
						choice.setChosenValue(Integer.valueOf(passiveResource.getCapacity_PassiveResource().getSpecification()));

						genotype.add(choice);
					}
				}
			}
		}

	}

	/**
	 * XXX: This is not meta modelled and just a quick fix
	 *
	 */
	// private void determineSOAPOrRMIDecisions(List<DesignDecision> dds,
	// DesignDecisionGenotype
	// genotype) {
	//
	// Configuration connectorConfig =
	// this.initialInstance.getConnectorConfig();
	// FeatureConfig featureConfig = connectorConfig.getDefaultConfig();
	//
	// ConnectorConfigDecision cd =
	// this.designDecisionFactory.createConnectorConfigDecision();
	// SoapOrRmi domain = this.designDecisionFactory.createSoapOrRmi();
	//
	// cd.setDomain(domain);
	// cd.setFeatureconfig(featureConfig);
	//
	// dds.add(cd);
	//
	// //0.0 stands for SOAP, 1.0 for RMI
	// genotype.add(0.0);
	//
	// }

	// TODO: change this to two visitors that either create the design decision
	// and initial genotype
	// or just initial genotype.
	private void determineAllocationDecisions(final List<DegreeOfFreedomInstance> dds, final DesignDecisionGenotype genotype) {
		final List<AllocationContext> acs = this.initialInstance.getAllocation().getAllocationContexts_Allocation();
		final List<ResourceContainer> rcs = this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();

		// each allocation context could be allocated on each container.
		for (final AllocationContext ac : acs) {
			final AllocationDegree ad = this.specificDesignDecisionFactory.createAllocationDegree();
			ad.setPrimaryChanged(ac);
			ad.getClassDesignOptions().addAll(rcs);
			dds.add(ad);

			final ClassChoice choice = this.designDecisionFactory.createClassChoice();
			choice.setDegreeOfFreedomInstance(ad);
			choice.setChosenValue(ac.getResourceContainer_AllocationContext());

			genotype.add(choice);
		}

	}

	/**
	 * Be sure to add one design decision and one gene in the initial genotype
	 * at once. The index is important.
	 *
	 * @param genotypeIndex
	 */
	private void determineAssembledComponentsDecisions(final List<DegreeOfFreedomInstance> dds, final DesignDecisionGenotype genotype) {
		final AlternativeComponent ac = AlternativeComponent.getInstance();
		final List<AssembledComponentDegree> decisions = ac.generateDesignDecisions(this.initialInstance);

		for (final AssembledComponentDegree designDecision : decisions) {
			dds.add(designDecision);
			final RepositoryComponent currentlyAssembledComponent = ((AssemblyContext) designDecision.getPrimaryChanged()).getEncapsulatedComponent__AssemblyContext();

			final ClassChoice choice = this.designDecisionFactory.createClassChoice();
			choice.setDegreeOfFreedomInstance(designDecision);
			choice.setChosenValue(currentlyAssembledComponent);
			genotype.add(choice);

		}

	}

	/**
	 * Be sure to add one design decision and one gene in the initial genotype
	 * at once. The index is important. Creates
	 * {@link ContinuousProcessingRateDegree} decisions for each found
	 * processing resource.
	 *
	 * Also determines {@link SchedulingPolicyDegree}s.
	 *
	 * TODO: make configurable to also add
	 * {@link DiscreteProcessingRateDegree}s.
	 */
	private void determineProcessingRateDecisions(final List<DegreeOfFreedomInstance> dds, final DesignDecisionGenotype genotype) {
		final List<ResourceContainer> resourceContainers = this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
		for (final ResourceContainer resourceContainer : resourceContainers) {
			final List<ProcessingResourceSpecification> resources = resourceContainer.getActiveResourceSpecifications_ResourceContainer();
			for (final ProcessingResourceSpecification resource : resources) {

				// Create ContinuousProcessingRateDegree
				final ContinuousProcessingRateDegree decision = this.specificDesignDecisionFactory.createContinuousProcessingRateDegree();
				decision.setLowerBoundIncluded(false);
				final double currentRate = CostUtil.getInstance().getDoubleFromSpecification(resource.getProcessingRate_ProcessingResourceSpecification().getSpecification());
				// XXX initial assumption: the highest possible processingRate
				// is 10 times the
				// current one.
				decision.setTo(currentRate * 2.0);
				decision.setFrom(currentRate * 0.5);
				decision.setPrimaryChanged(resourceContainer);
				decision.setProcessingresourcetype(resource.getActiveResourceType_ActiveResourceSpecification());
				dds.add(decision);

				final ContinousRangeChoice choice = this.designDecisionFactory.createContinousRangeChoice();
				choice.setDegreeOfFreedomInstance(decision);
				choice.setChosenValue(currentRate);

				genotype.add(choice);

				// Create SchedulingPolicyDegree (excluded here, not in default
				// problem, can be
				// modelled manually).
				/*
				 * SchedulingPolicyDegree schedulingDecision =
				 * this.designDecisionFactory.createSchedulingPolicyDegree();
				 * SchedulingPolicy currentPolicy =
				 * resource.getSchedulingPolicy();
				 *
				 * schedulingDecision.getDomainOfAllowedSchedulingPolicies().add
				 * (SchedulingPolicy. FCFS);
				 * schedulingDecision.getDomainOfAllowedSchedulingPolicies().add
				 * (SchedulingPolicy. PROCESSOR_SHARING);
				 * schedulingDecision.setPrimaryChanged(resourceContainer);
				 * schedulingDecision.setProcessingresourcetype(resource.
				 * getActiveResourceType_ActiveResourceSpecification());
				 * dds.add(schedulingDecision);
				 *
				 * SchedulingPolicyChoice schedulingChoice =
				 * this.designDecisionFactory.createSchedulingPolicyChoice();
				 * schedulingChoice.setDegreeOfFreedomInstance(
				 * schedulingDecision);
				 * schedulingChoice.setChosenValue(currentPolicy);
				 *
				 * genotype.add(schedulingChoice);
				 */

			}
		}
	}

	private Optional<CostRepository> getCostModel() {
		Optional<String> costModelFileName = this.getCostModelFileName();
		if (!costModelFileName.isPresent()) {
			return Optional.empty();
		}
		String fileName = costModelFileName.get();
		URI locationToLoadFrom = URI.createURI(fileName);
		if (locationToLoadFrom == null || !locationToLoadFrom.isPlatform()) {
			locationToLoadFrom = URI.createFileURI(fileName);
		}
		CostRepository cr = (CostRepository) EMFHelper.loadFromXMIFile(locationToLoadFrom, costPackage.eINSTANCE);
		return cr == null ? Optional.empty() : Optional.of(cr);
	}

	private Optional<String> getCostModelFileName() {
		try {
			return Optional.of(this.dseConfig.getRawConfiguration().getAttribute(DSEConstantsContainer.COST_FILE, ""));
		} catch (CoreException e) {
			return Optional.empty();
		}
	}

	protected DegreeOfFreedomInstance getDesignDecision(final int index) {
		return this.pcmProblem.getDegreesOfFreedom().get(index);
	}

	public List<DegreeOfFreedomInstance> getDesignDecisions() {
		return this.pcmProblem.getDegreesOfFreedom();
	}

	public PCMInstance getInitialInstance() {
		// TODO rename to getCurrentInstance, return latest copy
		// new method getCopyOfInitialInstance, which returns new copy of
		// initialInstance
		// and saves new copy as currentInstance?
		return this.initialInstance;
	}

	public DesignDecisionGenotype getGenotypeOfInitialPCMInstance() {
		return this.initialGenotype;
	}

	protected List<DesignDecisionGenotype> getInitialGenotypeList() {
		return this.initialGenotypeList;
	}

	public void saveProblem() {

		final URI filename = this.dseConfig.getDesignDecisionFileName();

		// resourceSet.getPackageRegistry().put
		// (designdecisionPackage.eNS_URI,
		// designdecisionPackage.eINSTANCE);

		EMFHelper.saveToXMIFile(this.pcmProblem, filename);

	}

	@Override
	public String toString() {

		String result = "";

		final List<DegreeOfFreedomInstance> decisions = this.pcmProblem.getDegreesOfFreedom();
		for (final DegreeOfFreedomInstance designDecision : decisions) {
			result += DegreeOfFreedomHelper.getDegreeDescription(designDecision) + ";";
		}

		return result;

	}

	public void setInitialPopulation(final List<DesignDecisionGenotype> population) throws CoreException {
		this.initialGenotypeList = population;
		Opt4JStarter.getDSECreator().setNumberOfNotEvaluatedPredefinedOnes(population.size());
	}

	/**
	 * Returns the degree of freedom of the type (or subtype) that has the given
	 * entity as the changeableEntity.
	 *
	 * @param entity
	 * @param degreeClass
	 * @return The matching DegreeOfFreedomInstance from this problem.
	 */
	public DegreeOfFreedomInstance getDegree(final Entity entity, final Class<? extends DegreeOfFreedomInstance> degreeClass) {
		final List<DegreeOfFreedomInstance> degrees = this.pcmProblem.getDegreesOfFreedom();
		for (final DegreeOfFreedomInstance DegreeOfFreedomInstance : degrees) {

			if (degreeClass.isInstance(DegreeOfFreedomInstance) && DegreeOfFreedomInstance.getPrimaryChanged().equals(entity)) {
				return DegreeOfFreedomInstance;
			}
		}
		return null;
	}

	public DecisionSpace getEMFProblem() {
		return this.pcmProblem;
	}

	/**
	 * Perform cleanup jobs (e.g. CostRepo)
	 *
	 * @author Dominik Fuchss
	 */
	public void cleanup() {
		ModuleRegistry.getModuleRegistry().reset();
	}
}
