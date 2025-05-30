/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AbsoluteAdjustmentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassWithCopyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CooldownMaxScalingOperationsConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CooldownTimeConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DataTypeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedCPUUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedHDDUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedMemoryUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNetworkUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNumberOfElementsDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedOperationResponseTimeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedQueueLengthDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedSimulationTimeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedTaskCountDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset;
import de.uka.ipd.sdq.pcm.designdecision.specific.IndicatorDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.IntervalDurationConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.IntervalOffsetConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedDataTypeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.RelativeAdjustmentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StepAdjustmentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMaxConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMinConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ThrashingConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage
 * @generated
 */
public class specificAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static specificPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public specificAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = specificPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc
	 * --> This implementation returns <code>true</code> if the object is either the model's package
	 * or is an instance object of the model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected specificSwitch<Adapter> modelSwitch = new specificSwitch<>() {
		@Override
		public Adapter caseExchangeComponentRule(ExchangeComponentRule object) {
			return createExchangeComponentRuleAdapter();
		}

		@Override
		public Adapter caseClassAsReferenceDegree(ClassAsReferenceDegree object) {
			return createClassAsReferenceDegreeAdapter();
		}

		@Override
		public Adapter caseClassDegree(ClassDegree object) {
			return createClassDegreeAdapter();
		}

		@Override
		public Adapter caseClassWithCopyDegree(ClassWithCopyDegree object) {
			return createClassWithCopyDegreeAdapter();
		}

		@Override
		public Adapter caseContinuousRangeDegree(ContinuousRangeDegree object) {
			return createContinuousRangeDegreeAdapter();
		}

		@Override
		public Adapter caseRangeDegree(RangeDegree object) {
			return createRangeDegreeAdapter();
		}

		@Override
		public Adapter caseDataTypeDegree(DataTypeDegree object) {
			return createDataTypeDegreeAdapter();
		}

		@Override
		public Adapter caseDiscreteDegree(DiscreteDegree object) {
			return createDiscreteDegreeAdapter();
		}

		@Override
		public Adapter caseDiscreteRangeDegree(DiscreteRangeDegree object) {
			return createDiscreteRangeDegreeAdapter();
		}

		@Override
		public Adapter caseEnumDegree(EnumDegree object) {
			return createEnumDegreeAdapter();
		}

		@Override
		public Adapter caseUnorderedDegree(UnorderedDegree object) {
			return createUnorderedDegreeAdapter();
		}

		@Override
		public Adapter caseOrderedDataTypeDegree(OrderedDataTypeDegree object) {
			return createOrderedDataTypeDegreeAdapter();
		}

		@Override
		public Adapter caseOrderedIntegerDegree(OrderedIntegerDegree object) {
			return createOrderedIntegerDegreeAdapter();
		}

		@Override
		public Adapter caseStringSetDegree(StringSetDegree object) {
			return createStringSetDegreeAdapter();
		}

		@Override
		public Adapter caseUnorderedPrimitiveDegree(UnorderedPrimitiveDegree object) {
			return createUnorderedPrimitiveDegreeAdapter();
		}

		@Override
		public Adapter caseContinuousComponentParamDegree(ContinuousComponentParamDegree object) {
			return createContinuousComponentParamDegreeAdapter();
		}

		@Override
		public Adapter caseContinuousProcessingRateDegree(ContinuousProcessingRateDegree object) {
			return createContinuousProcessingRateDegreeAdapter();
		}

		@Override
		public Adapter caseProcessingRateDegree(ProcessingRateDegree object) {
			return createProcessingRateDegreeAdapter();
		}

		@Override
		public Adapter caseProcessingResourceDegree(ProcessingResourceDegree object) {
			return createProcessingResourceDegreeAdapter();
		}

		@Override
		public Adapter caseDiscreteComponentParamDegree(DiscreteComponentParamDegree object) {
			return createDiscreteComponentParamDegreeAdapter();
		}

		@Override
		public Adapter caseDiscreteProcessingRateDegree(DiscreteProcessingRateDegree object) {
			return createDiscreteProcessingRateDegreeAdapter();
		}

		@Override
		public Adapter caseFeatureConfigDegree(FeatureConfigDegree object) {
			return createFeatureConfigDegreeAdapter();
		}

		@Override
		public Adapter caseFeatureGroupDegree(FeatureGroupDegree object) {
			return createFeatureGroupDegreeAdapter();
		}

		@Override
		public Adapter caseFeatureSubset(FeatureSubset object) {
			return createFeatureSubsetAdapter();
		}

		@Override
		public Adapter caseNumberOfCoresAsListDegree(NumberOfCoresAsListDegree object) {
			return createNumberOfCoresAsListDegreeAdapter();
		}

		@Override
		public Adapter caseNumberOfCoresDegree(NumberOfCoresDegree object) {
			return createNumberOfCoresDegreeAdapter();
		}

		@Override
		public Adapter caseNumberOfCoresAsRangeDegree(NumberOfCoresAsRangeDegree object) {
			return createNumberOfCoresAsRangeDegreeAdapter();
		}

		@Override
		public Adapter caseOptionalFeatureDegree(OptionalFeatureDegree object) {
			return createOptionalFeatureDegreeAdapter();
		}

		@Override
		public Adapter caseResourceContainerReplicationDegree(ResourceContainerReplicationDegree object) {
			return createResourceContainerReplicationDegreeAdapter();
		}

		@Override
		public Adapter caseResourceContainerReplicationDegreeWithComponentChange(
				ResourceContainerReplicationDegreeWithComponentChange object) {
			return createResourceContainerReplicationDegreeWithComponentChangeAdapter();
		}

		@Override
		public Adapter caseResourceSelectionDegree(ResourceSelectionDegree object) {
			return createResourceSelectionDegreeAdapter();
		}

		@Override
		public Adapter caseSchedulingPolicyDegree(SchedulingPolicyDegree object) {
			return createSchedulingPolicyDegreeAdapter();
		}

		@Override
		public Adapter caseStringComponentParamDegree(StringComponentParamDegree object) {
			return createStringComponentParamDegreeAdapter();
		}

		@Override
		public Adapter caseAllocationDegree(AllocationDegree object) {
			return createAllocationDegreeAdapter();
		}

		@Override
		public Adapter caseAssembledComponentDegree(AssembledComponentDegree object) {
			return createAssembledComponentDegreeAdapter();
		}

		@Override
		public Adapter caseCapacityDegree(CapacityDegree object) {
			return createCapacityDegreeAdapter();
		}

		@Override
		public Adapter caseMonitoringDegree(MonitoringDegree object) {
			return createMonitoringDegreeAdapter();
		}

		@Override
		public Adapter caseATNumberOfReplicaDegree(ATNumberOfReplicaDegree object) {
			return createATNumberOfReplicaDegreeAdapter();
		}

		@Override
		public Adapter caseFeatureCompletionDegree(FeatureCompletionDegree object) {
			return createFeatureCompletionDegreeAdapter();
		}

		@Override
		public Adapter caseFeatureDegree(FeatureDegree object) {
			return createFeatureDegreeAdapter();
		}

		@Override
		public Adapter caseIndicatorDegree(IndicatorDegree object) {
			return createIndicatorDegreeAdapter();
		}

		@Override
		public Adapter caseMultipleInclusionDegree(MultipleInclusionDegree object) {
			return createMultipleInclusionDegreeAdapter();
		}

		@Override
		public Adapter caseAdvicePlacementDegree(AdvicePlacementDegree object) {
			return createAdvicePlacementDegreeAdapter();
		}

		@Override
		public Adapter caseComplementumVisnetisDegree(ComplementumVisnetisDegree object) {
			return createComplementumVisnetisDegreeAdapter();
		}

		@Override
		public Adapter caseTargetGroupSizeMaxConstraintDegree(TargetGroupSizeMaxConstraintDegree object) {
			return createTargetGroupSizeMaxConstraintDegreeAdapter();
		}

		@Override
		public Adapter caseStepAdjustmentDegree(StepAdjustmentDegree object) {
			return createStepAdjustmentDegreeAdapter();
		}

		@Override
		public Adapter caseExpectedCPUUtilizationDegree(ExpectedCPUUtilizationDegree object) {
			return createExpectedCPUUtilizationDegreeAdapter();
		}

		@Override
		public Adapter caseExpectedMemoryUtilizationDegree(ExpectedMemoryUtilizationDegree object) {
			return createExpectedMemoryUtilizationDegreeAdapter();
		}

		@Override
		public Adapter caseExpectedHDDUtilizationDegree(ExpectedHDDUtilizationDegree object) {
			return createExpectedHDDUtilizationDegreeAdapter();
		}

		@Override
		public Adapter caseExpectedNetworkUtilizationDegree(ExpectedNetworkUtilizationDegree object) {
			return createExpectedNetworkUtilizationDegreeAdapter();
		}

		@Override
		public Adapter caseExpectedSimulationTimeDegree(ExpectedSimulationTimeDegree object) {
			return createExpectedSimulationTimeDegreeAdapter();
		}

		@Override
		public Adapter caseExpectedOperationResponseTimeDegree(ExpectedOperationResponseTimeDegree object) {
			return createExpectedOperationResponseTimeDegreeAdapter();
		}

		@Override
		public Adapter caseExpectedNumberOfElementsDegree(ExpectedNumberOfElementsDegree object) {
			return createExpectedNumberOfElementsDegreeAdapter();
		}

		@Override
		public Adapter caseExpectedQueueLengthDegree(ExpectedQueueLengthDegree object) {
			return createExpectedQueueLengthDegreeAdapter();
		}

		@Override
		public Adapter caseExpectedTaskCountDegree(ExpectedTaskCountDegree object) {
			return createExpectedTaskCountDegreeAdapter();
		}

		@Override
		public Adapter caseCooldownTimeConstraintDegree(CooldownTimeConstraintDegree object) {
			return createCooldownTimeConstraintDegreeAdapter();
		}

		@Override
		public Adapter caseCooldownMaxScalingOperationsConstraintDegree(
				CooldownMaxScalingOperationsConstraintDegree object) {
			return createCooldownMaxScalingOperationsConstraintDegreeAdapter();
		}

		@Override
		public Adapter caseAbsoluteAdjustmentDegree(AbsoluteAdjustmentDegree object) {
			return createAbsoluteAdjustmentDegreeAdapter();
		}

		@Override
		public Adapter caseRelativeAdjustmentDegree(RelativeAdjustmentDegree object) {
			return createRelativeAdjustmentDegreeAdapter();
		}

		@Override
		public Adapter caseIntervalDurationConstraintDegree(IntervalDurationConstraintDegree object) {
			return createIntervalDurationConstraintDegreeAdapter();
		}

		@Override
		public Adapter caseIntervalOffsetConstraintDegree(IntervalOffsetConstraintDegree object) {
			return createIntervalOffsetConstraintDegreeAdapter();
		}

		@Override
		public Adapter caseThrashingConstraintDegree(ThrashingConstraintDegree object) {
			return createThrashingConstraintDegreeAdapter();
		}

		@Override
		public Adapter caseTargetGroupSizeMinConstraintDegree(TargetGroupSizeMinConstraintDegree object) {
			return createTargetGroupSizeMinConstraintDegreeAdapter();
		}

		@Override
		public Adapter casePCMClass(PCMClass object) {
			return createPCMClassAdapter();
		}

		@Override
		public Adapter casePCMBaseClass(PCMBaseClass object) {
			return createPCMBaseClassAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseDegreeOfFreedomInstance(DegreeOfFreedomInstance object) {
			return createDegreeOfFreedomInstanceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule <em>Exchange Component Rule</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule
	 * @generated
	 */
	public Adapter createExchangeComponentRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree <em>Class As Reference Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree
	 * @generated
	 */
	public Adapter createClassAsReferenceDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree <em>Class Degree</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree
	 * @generated
	 */
	public Adapter createClassDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassWithCopyDegree <em>Class With Copy Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ClassWithCopyDegree
	 * @generated
	 */
	public Adapter createClassWithCopyDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree <em>Continuous Range Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree
	 * @generated
	 */
	public Adapter createContinuousRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree <em>Range Degree</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree
	 * @generated
	 */
	public Adapter createRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DataTypeDegree <em>Data Type Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DataTypeDegree
	 * @generated
	 */
	public Adapter createDataTypeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree <em>Discrete Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree
	 * @generated
	 */
	public Adapter createDiscreteDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree <em>Discrete Range Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree
	 * @generated
	 */
	public Adapter createDiscreteRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree <em>Enum Degree</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree
	 * @generated
	 */
	public Adapter createEnumDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedDegree <em>Unordered Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedDegree
	 * @generated
	 */
	public Adapter createUnorderedDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OrderedDataTypeDegree <em>Ordered Data Type Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OrderedDataTypeDegree
	 * @generated
	 */
	public Adapter createOrderedDataTypeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree <em>Ordered Integer Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree
	 * @generated
	 */
	public Adapter createOrderedIntegerDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree <em>String Set Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree
	 * @generated
	 */
	public Adapter createStringSetDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree <em>Unordered Primitive Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree
	 * @generated
	 */
	public Adapter createUnorderedPrimitiveDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree <em>Continuous Component Param Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree
	 * @generated
	 */
	public Adapter createContinuousComponentParamDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree <em>Continuous Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree
	 * @generated
	 */
	public Adapter createContinuousProcessingRateDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree <em>Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree
	 * @generated
	 */
	public Adapter createProcessingRateDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree <em>Processing Resource Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree
	 * @generated
	 */
	public Adapter createProcessingResourceDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree <em>Discrete Component Param Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree
	 * @generated
	 */
	public Adapter createDiscreteComponentParamDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree <em>Discrete Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree
	 * @generated
	 */
	public Adapter createDiscreteProcessingRateDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree <em>Feature Config Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree
	 * @generated
	 */
	public Adapter createFeatureConfigDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree <em>Feature Group Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree
	 * @generated
	 */
	public Adapter createFeatureGroupDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset <em>Feature Subset</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset
	 * @generated
	 */
	public Adapter createFeatureSubsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree <em>Number Of Cores As List Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree
	 * @generated
	 */
	public Adapter createNumberOfCoresAsListDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree <em>Number Of Cores Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree
	 * @generated
	 */
	public Adapter createNumberOfCoresDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree <em>Number Of Cores As Range Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree
	 * @generated
	 */
	public Adapter createNumberOfCoresAsRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree <em>Optional Feature Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree
	 * @generated
	 */
	public Adapter createOptionalFeatureDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree <em>Resource Container Replication Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree
	 * @generated
	 */
	public Adapter createResourceContainerReplicationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange <em>Resource Container Replication Degree With Component Change</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange
	 * @generated
	 */
	public Adapter createResourceContainerReplicationDegreeWithComponentChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree <em>Resource Selection Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree
	 * @generated
	 */
	public Adapter createResourceSelectionDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree <em>Scheduling Policy Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree
	 * @generated
	 */
	public Adapter createSchedulingPolicyDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree <em>String Component Param Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree
	 * @generated
	 */
	public Adapter createStringComponentParamDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree <em>Allocation Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree
	 * @generated
	 */
	public Adapter createAllocationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree <em>Assembled Component Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree
	 * @generated
	 */
	public Adapter createAssembledComponentDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree <em>Capacity Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree
	 * @generated
	 */
	public Adapter createCapacityDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance <em>Degree Of Freedom Instance</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance
	 * @generated
	 */
	public Adapter createDegreeOfFreedomInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree <em>Monitoring Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree
	 * @generated
	 */
	public Adapter createMonitoringDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree <em>AT Number Of Replica Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree
	 * @generated
	 */
	public Adapter createATNumberOfReplicaDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree <em>Feature Completion Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree
	 * @generated
	 */
	public Adapter createFeatureCompletionDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree <em>Feature Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree
	 * @generated
	 */
	public Adapter createFeatureDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.IndicatorDegree <em>Indicator Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.IndicatorDegree
	 * @generated
	 */
	public Adapter createIndicatorDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree <em>Multiple Inclusion Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree
	 * @generated
	 */
	public Adapter createMultipleInclusionDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree <em>Advice Placement Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree
	 * @generated
	 */
	public Adapter createAdvicePlacementDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree <em>Complementum Visnetis Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree
	 * @generated
	 */
	public Adapter createComplementumVisnetisDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMaxConstraintDegree <em>Target Group Size Max Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMaxConstraintDegree
	 * @generated
	 */
	public Adapter createTargetGroupSizeMaxConstraintDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.StepAdjustmentDegree <em>Step Adjustment Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.StepAdjustmentDegree
	 * @generated
	 */
	public Adapter createStepAdjustmentDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedCPUUtilizationDegree <em>Expected CPU Utilization Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedCPUUtilizationDegree
	 * @generated
	 */
	public Adapter createExpectedCPUUtilizationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedMemoryUtilizationDegree <em>Expected Memory Utilization Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedMemoryUtilizationDegree
	 * @generated
	 */
	public Adapter createExpectedMemoryUtilizationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedHDDUtilizationDegree <em>Expected HDD Utilization Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedHDDUtilizationDegree
	 * @generated
	 */
	public Adapter createExpectedHDDUtilizationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNetworkUtilizationDegree <em>Expected Network Utilization Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNetworkUtilizationDegree
	 * @generated
	 */
	public Adapter createExpectedNetworkUtilizationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedSimulationTimeDegree <em>Expected Simulation Time Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedSimulationTimeDegree
	 * @generated
	 */
	public Adapter createExpectedSimulationTimeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedOperationResponseTimeDegree <em>Expected Operation Response Time Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedOperationResponseTimeDegree
	 * @generated
	 */
	public Adapter createExpectedOperationResponseTimeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNumberOfElementsDegree <em>Expected Number Of Elements Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNumberOfElementsDegree
	 * @generated
	 */
	public Adapter createExpectedNumberOfElementsDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedQueueLengthDegree <em>Expected Queue Length Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedQueueLengthDegree
	 * @generated
	 */
	public Adapter createExpectedQueueLengthDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedTaskCountDegree <em>Expected Task Count Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedTaskCountDegree
	 * @generated
	 */
	public Adapter createExpectedTaskCountDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.CooldownTimeConstraintDegree <em>Cooldown Time Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.CooldownTimeConstraintDegree
	 * @generated
	 */
	public Adapter createCooldownTimeConstraintDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.CooldownMaxScalingOperationsConstraintDegree <em>Cooldown Max Scaling Operations Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.CooldownMaxScalingOperationsConstraintDegree
	 * @generated
	 */
	public Adapter createCooldownMaxScalingOperationsConstraintDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AbsoluteAdjustmentDegree <em>Absolute Adjustment Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AbsoluteAdjustmentDegree
	 * @generated
	 */
	public Adapter createAbsoluteAdjustmentDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.RelativeAdjustmentDegree <em>Relative Adjustment Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.RelativeAdjustmentDegree
	 * @generated
	 */
	public Adapter createRelativeAdjustmentDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.IntervalDurationConstraintDegree <em>Interval Duration Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.IntervalDurationConstraintDegree
	 * @generated
	 */
	public Adapter createIntervalDurationConstraintDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.IntervalOffsetConstraintDegree <em>Interval Offset Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.IntervalOffsetConstraintDegree
	 * @generated
	 */
	public Adapter createIntervalOffsetConstraintDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ThrashingConstraintDegree <em>Thrashing Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ThrashingConstraintDegree
	 * @generated
	 */
	public Adapter createThrashingConstraintDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMinConstraintDegree <em>Target Group Size Min Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMinConstraintDegree
	 * @generated
	 */
	public Adapter createTargetGroupSizeMinConstraintDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.PCMClass <em>PCM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.PCMClass
	 * @generated
	 */
	public Adapter createPCMClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.PCMBaseClass <em>PCM Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.PCMBaseClass
	 * @generated
	 */
	public Adapter createPCMBaseClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // specificAdapterFactory
