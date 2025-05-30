/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>specific</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class specificTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new specificTests("specific Tests");
		suite.addTestSuite(ClassAsReferenceDegreeTest.class);
		suite.addTestSuite(ContinuousRangeDegreeTest.class);
		suite.addTestSuite(DiscreteRangeDegreeTest.class);
		suite.addTestSuite(OrderedIntegerDegreeTest.class);
		suite.addTestSuite(ContinuousComponentParamDegreeTest.class);
		suite.addTestSuite(ContinuousProcessingRateDegreeTest.class);
		suite.addTestSuite(DiscreteComponentParamDegreeTest.class);
		suite.addTestSuite(DiscreteProcessingRateDegreeTest.class);
		suite.addTestSuite(FeatureGroupDegreeTest.class);
		suite.addTestSuite(NumberOfCoresAsListDegreeTest.class);
		suite.addTestSuite(NumberOfCoresAsRangeDegreeTest.class);
		suite.addTestSuite(OptionalFeatureDegreeTest.class);
		suite.addTestSuite(ResourceContainerReplicationDegreeTest.class);
		suite.addTestSuite(ResourceContainerReplicationDegreeWithComponentChangeTest.class);
		suite.addTestSuite(ResourceSelectionDegreeTest.class);
		suite.addTestSuite(SchedulingPolicyDegreeTest.class);
		suite.addTestSuite(StringComponentParamDegreeTest.class);
		suite.addTestSuite(AllocationDegreeTest.class);
		suite.addTestSuite(AssembledComponentDegreeTest.class);
		suite.addTestSuite(CapacityDegreeTest.class);
		suite.addTestSuite(MonitoringDegreeTest.class);
		suite.addTestSuite(ATNumberOfReplicaDegreeTest.class);
		suite.addTestSuite(FeatureCompletionDegreeTest.class);
		suite.addTestSuite(FeatureDegreeTest.class);
		suite.addTestSuite(MultipleInclusionDegreeTest.class);
		suite.addTestSuite(AdvicePlacementDegreeTest.class);
		suite.addTestSuite(ComplementumVisnetisDegreeTest.class);
		suite.addTestSuite(TargetGroupSizeMaxConstraintDegreeTest.class);
		suite.addTestSuite(StepAdjustmentDegreeTest.class);
		suite.addTestSuite(ExpectedCPUUtilizationDegreeTest.class);
		suite.addTestSuite(ExpectedMemoryUtilizationDegreeTest.class);
		suite.addTestSuite(ExpectedHDDUtilizationDegreeTest.class);
		suite.addTestSuite(ExpectedNetworkUtilizationDegreeTest.class);
		suite.addTestSuite(ExpectedSimulationTimeDegreeTest.class);
		suite.addTestSuite(ExpectedOperationResponseTimeDegreeTest.class);
		suite.addTestSuite(ExpectedNumberOfElementsDegreeTest.class);
		suite.addTestSuite(ExpectedQueueLengthDegreeTest.class);
		suite.addTestSuite(ExpectedTaskCountDegreeTest.class);
		suite.addTestSuite(CooldownTimeConstraintDegreeTest.class);
		suite.addTestSuite(CooldownMaxScalingOperationsConstraintDegreeTest.class);
		suite.addTestSuite(AbsoluteAdjustmentDegreeTest.class);
		suite.addTestSuite(RelativeAdjustmentDegreeTest.class);
		suite.addTestSuite(IntervalDurationConstraintDegreeTest.class);
		suite.addTestSuite(IntervalOffsetConstraintDegreeTest.class);
		suite.addTestSuite(ThrashingConstraintDegreeTest.class);
		suite.addTestSuite(TargetGroupSizeMinConstraintDegreeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public specificTests(String name) {
		super(name);
	}

} //specificTests
