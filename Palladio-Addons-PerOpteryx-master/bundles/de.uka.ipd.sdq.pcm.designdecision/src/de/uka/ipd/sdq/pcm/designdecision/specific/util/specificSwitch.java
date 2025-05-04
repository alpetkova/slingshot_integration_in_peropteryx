/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree;
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
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StepAdjustmentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMaxConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage
 * @generated
 */
public class specificSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static specificPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public specificSwitch() {
		if (modelPackage == null) {
			modelPackage = specificPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case specificPackage.EXCHANGE_COMPONENT_RULE: {
			ExchangeComponentRule exchangeComponentRule = (ExchangeComponentRule) theEObject;
			T result = caseExchangeComponentRule(exchangeComponentRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CLASS_AS_REFERENCE_DEGREE: {
			ClassAsReferenceDegree classAsReferenceDegree = (ClassAsReferenceDegree) theEObject;
			T result = caseClassAsReferenceDegree(classAsReferenceDegree);
			if (result == null)
				result = caseClassDegree(classAsReferenceDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(classAsReferenceDegree);
			if (result == null)
				result = caseNamedElement(classAsReferenceDegree);
			if (result == null)
				result = casePCMBaseClass(classAsReferenceDegree);
			if (result == null)
				result = casePCMClass(classAsReferenceDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CLASS_DEGREE: {
			ClassDegree classDegree = (ClassDegree) theEObject;
			T result = caseClassDegree(classDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(classDegree);
			if (result == null)
				result = caseNamedElement(classDegree);
			if (result == null)
				result = casePCMBaseClass(classDegree);
			if (result == null)
				result = casePCMClass(classDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CLASS_WITH_COPY_DEGREE: {
			ClassWithCopyDegree classWithCopyDegree = (ClassWithCopyDegree) theEObject;
			T result = caseClassWithCopyDegree(classWithCopyDegree);
			if (result == null)
				result = caseClassDegree(classWithCopyDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(classWithCopyDegree);
			if (result == null)
				result = caseNamedElement(classWithCopyDegree);
			if (result == null)
				result = casePCMBaseClass(classWithCopyDegree);
			if (result == null)
				result = casePCMClass(classWithCopyDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CONTINUOUS_RANGE_DEGREE: {
			ContinuousRangeDegree continuousRangeDegree = (ContinuousRangeDegree) theEObject;
			T result = caseContinuousRangeDegree(continuousRangeDegree);
			if (result == null)
				result = caseRangeDegree(continuousRangeDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(continuousRangeDegree);
			if (result == null)
				result = caseDataTypeDegree(continuousRangeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(continuousRangeDegree);
			if (result == null)
				result = caseNamedElement(continuousRangeDegree);
			if (result == null)
				result = casePCMBaseClass(continuousRangeDegree);
			if (result == null)
				result = casePCMClass(continuousRangeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.RANGE_DEGREE: {
			RangeDegree rangeDegree = (RangeDegree) theEObject;
			T result = caseRangeDegree(rangeDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(rangeDegree);
			if (result == null)
				result = caseDataTypeDegree(rangeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(rangeDegree);
			if (result == null)
				result = caseNamedElement(rangeDegree);
			if (result == null)
				result = casePCMBaseClass(rangeDegree);
			if (result == null)
				result = casePCMClass(rangeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DATA_TYPE_DEGREE: {
			DataTypeDegree dataTypeDegree = (DataTypeDegree) theEObject;
			T result = caseDataTypeDegree(dataTypeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(dataTypeDegree);
			if (result == null)
				result = caseNamedElement(dataTypeDegree);
			if (result == null)
				result = casePCMBaseClass(dataTypeDegree);
			if (result == null)
				result = casePCMClass(dataTypeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DISCRETE_DEGREE: {
			DiscreteDegree discreteDegree = (DiscreteDegree) theEObject;
			T result = caseDiscreteDegree(discreteDegree);
			if (result == null)
				result = caseDataTypeDegree(discreteDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(discreteDegree);
			if (result == null)
				result = caseNamedElement(discreteDegree);
			if (result == null)
				result = casePCMBaseClass(discreteDegree);
			if (result == null)
				result = casePCMClass(discreteDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DISCRETE_RANGE_DEGREE: {
			DiscreteRangeDegree discreteRangeDegree = (DiscreteRangeDegree) theEObject;
			T result = caseDiscreteRangeDegree(discreteRangeDegree);
			if (result == null)
				result = caseRangeDegree(discreteRangeDegree);
			if (result == null)
				result = caseDiscreteDegree(discreteRangeDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(discreteRangeDegree);
			if (result == null)
				result = caseDataTypeDegree(discreteRangeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(discreteRangeDegree);
			if (result == null)
				result = caseNamedElement(discreteRangeDegree);
			if (result == null)
				result = casePCMBaseClass(discreteRangeDegree);
			if (result == null)
				result = casePCMClass(discreteRangeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ENUM_DEGREE: {
			EnumDegree enumDegree = (EnumDegree) theEObject;
			T result = caseEnumDegree(enumDegree);
			if (result == null)
				result = caseUnorderedDegree(enumDegree);
			if (result == null)
				result = caseDataTypeDegree(enumDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(enumDegree);
			if (result == null)
				result = caseNamedElement(enumDegree);
			if (result == null)
				result = casePCMBaseClass(enumDegree);
			if (result == null)
				result = casePCMClass(enumDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.UNORDERED_DEGREE: {
			UnorderedDegree unorderedDegree = (UnorderedDegree) theEObject;
			T result = caseUnorderedDegree(unorderedDegree);
			if (result == null)
				result = caseDataTypeDegree(unorderedDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(unorderedDegree);
			if (result == null)
				result = caseNamedElement(unorderedDegree);
			if (result == null)
				result = casePCMBaseClass(unorderedDegree);
			if (result == null)
				result = casePCMClass(unorderedDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ORDERED_DATA_TYPE_DEGREE: {
			OrderedDataTypeDegree orderedDataTypeDegree = (OrderedDataTypeDegree) theEObject;
			T result = caseOrderedDataTypeDegree(orderedDataTypeDegree);
			if (result == null)
				result = caseDataTypeDegree(orderedDataTypeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(orderedDataTypeDegree);
			if (result == null)
				result = caseNamedElement(orderedDataTypeDegree);
			if (result == null)
				result = casePCMBaseClass(orderedDataTypeDegree);
			if (result == null)
				result = casePCMClass(orderedDataTypeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ORDERED_INTEGER_DEGREE: {
			OrderedIntegerDegree orderedIntegerDegree = (OrderedIntegerDegree) theEObject;
			T result = caseOrderedIntegerDegree(orderedIntegerDegree);
			if (result == null)
				result = caseDiscreteDegree(orderedIntegerDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(orderedIntegerDegree);
			if (result == null)
				result = caseDataTypeDegree(orderedIntegerDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(orderedIntegerDegree);
			if (result == null)
				result = caseNamedElement(orderedIntegerDegree);
			if (result == null)
				result = casePCMBaseClass(orderedIntegerDegree);
			if (result == null)
				result = casePCMClass(orderedIntegerDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.STRING_SET_DEGREE: {
			StringSetDegree stringSetDegree = (StringSetDegree) theEObject;
			T result = caseStringSetDegree(stringSetDegree);
			if (result == null)
				result = caseUnorderedDegree(stringSetDegree);
			if (result == null)
				result = caseDataTypeDegree(stringSetDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(stringSetDegree);
			if (result == null)
				result = caseNamedElement(stringSetDegree);
			if (result == null)
				result = casePCMBaseClass(stringSetDegree);
			if (result == null)
				result = casePCMClass(stringSetDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.UNORDERED_PRIMITIVE_DEGREE: {
			UnorderedPrimitiveDegree unorderedPrimitiveDegree = (UnorderedPrimitiveDegree) theEObject;
			T result = caseUnorderedPrimitiveDegree(unorderedPrimitiveDegree);
			if (result == null)
				result = caseUnorderedDegree(unorderedPrimitiveDegree);
			if (result == null)
				result = caseDataTypeDegree(unorderedPrimitiveDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(unorderedPrimitiveDegree);
			if (result == null)
				result = caseNamedElement(unorderedPrimitiveDegree);
			if (result == null)
				result = casePCMBaseClass(unorderedPrimitiveDegree);
			if (result == null)
				result = casePCMClass(unorderedPrimitiveDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CONTINUOUS_COMPONENT_PARAM_DEGREE: {
			ContinuousComponentParamDegree continuousComponentParamDegree = (ContinuousComponentParamDegree) theEObject;
			T result = caseContinuousComponentParamDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseContinuousRangeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseRangeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseDataTypeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(continuousComponentParamDegree);
			if (result == null)
				result = caseNamedElement(continuousComponentParamDegree);
			if (result == null)
				result = casePCMBaseClass(continuousComponentParamDegree);
			if (result == null)
				result = casePCMClass(continuousComponentParamDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE: {
			ContinuousProcessingRateDegree continuousProcessingRateDegree = (ContinuousProcessingRateDegree) theEObject;
			T result = caseContinuousProcessingRateDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseContinuousRangeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseProcessingRateDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseRangeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseProcessingResourceDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseDataTypeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(continuousProcessingRateDegree);
			if (result == null)
				result = caseNamedElement(continuousProcessingRateDegree);
			if (result == null)
				result = casePCMBaseClass(continuousProcessingRateDegree);
			if (result == null)
				result = casePCMClass(continuousProcessingRateDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.PROCESSING_RATE_DEGREE: {
			ProcessingRateDegree processingRateDegree = (ProcessingRateDegree) theEObject;
			T result = caseProcessingRateDegree(processingRateDegree);
			if (result == null)
				result = caseProcessingResourceDegree(processingRateDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(processingRateDegree);
			if (result == null)
				result = caseNamedElement(processingRateDegree);
			if (result == null)
				result = casePCMBaseClass(processingRateDegree);
			if (result == null)
				result = casePCMClass(processingRateDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.PROCESSING_RESOURCE_DEGREE: {
			ProcessingResourceDegree processingResourceDegree = (ProcessingResourceDegree) theEObject;
			T result = caseProcessingResourceDegree(processingResourceDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(processingResourceDegree);
			if (result == null)
				result = caseNamedElement(processingResourceDegree);
			if (result == null)
				result = casePCMBaseClass(processingResourceDegree);
			if (result == null)
				result = casePCMClass(processingResourceDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DISCRETE_COMPONENT_PARAM_DEGREE: {
			DiscreteComponentParamDegree discreteComponentParamDegree = (DiscreteComponentParamDegree) theEObject;
			T result = caseDiscreteComponentParamDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseRangeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseDiscreteDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseDataTypeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(discreteComponentParamDegree);
			if (result == null)
				result = caseNamedElement(discreteComponentParamDegree);
			if (result == null)
				result = casePCMBaseClass(discreteComponentParamDegree);
			if (result == null)
				result = casePCMClass(discreteComponentParamDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE: {
			DiscreteProcessingRateDegree discreteProcessingRateDegree = (DiscreteProcessingRateDegree) theEObject;
			T result = caseDiscreteProcessingRateDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseProcessingRateDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseRangeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseDiscreteDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseProcessingResourceDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseDataTypeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(discreteProcessingRateDegree);
			if (result == null)
				result = caseNamedElement(discreteProcessingRateDegree);
			if (result == null)
				result = casePCMBaseClass(discreteProcessingRateDegree);
			if (result == null)
				result = casePCMClass(discreteProcessingRateDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.FEATURE_CONFIG_DEGREE: {
			FeatureConfigDegree featureConfigDegree = (FeatureConfigDegree) theEObject;
			T result = caseFeatureConfigDegree(featureConfigDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(featureConfigDegree);
			if (result == null)
				result = caseNamedElement(featureConfigDegree);
			if (result == null)
				result = casePCMBaseClass(featureConfigDegree);
			if (result == null)
				result = casePCMClass(featureConfigDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.FEATURE_GROUP_DEGREE: {
			FeatureGroupDegree featureGroupDegree = (FeatureGroupDegree) theEObject;
			T result = caseFeatureGroupDegree(featureGroupDegree);
			if (result == null)
				result = caseFeatureConfigDegree(featureGroupDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(featureGroupDegree);
			if (result == null)
				result = caseNamedElement(featureGroupDegree);
			if (result == null)
				result = casePCMBaseClass(featureGroupDegree);
			if (result == null)
				result = casePCMClass(featureGroupDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.FEATURE_SUBSET: {
			FeatureSubset featureSubset = (FeatureSubset) theEObject;
			T result = caseFeatureSubset(featureSubset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE: {
			NumberOfCoresAsListDegree numberOfCoresAsListDegree = (NumberOfCoresAsListDegree) theEObject;
			T result = caseNumberOfCoresAsListDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseNumberOfCoresDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseOrderedIntegerDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseProcessingResourceDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseDiscreteDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseDataTypeDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(numberOfCoresAsListDegree);
			if (result == null)
				result = caseNamedElement(numberOfCoresAsListDegree);
			if (result == null)
				result = casePCMBaseClass(numberOfCoresAsListDegree);
			if (result == null)
				result = casePCMClass(numberOfCoresAsListDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.NUMBER_OF_CORES_DEGREE: {
			NumberOfCoresDegree numberOfCoresDegree = (NumberOfCoresDegree) theEObject;
			T result = caseNumberOfCoresDegree(numberOfCoresDegree);
			if (result == null)
				result = caseProcessingResourceDegree(numberOfCoresDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(numberOfCoresDegree);
			if (result == null)
				result = caseNamedElement(numberOfCoresDegree);
			if (result == null)
				result = casePCMBaseClass(numberOfCoresDegree);
			if (result == null)
				result = casePCMClass(numberOfCoresDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE: {
			NumberOfCoresAsRangeDegree numberOfCoresAsRangeDegree = (NumberOfCoresAsRangeDegree) theEObject;
			T result = caseNumberOfCoresAsRangeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseNumberOfCoresDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseRangeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseDiscreteDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseProcessingResourceDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseDataTypeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseNamedElement(numberOfCoresAsRangeDegree);
			if (result == null)
				result = casePCMBaseClass(numberOfCoresAsRangeDegree);
			if (result == null)
				result = casePCMClass(numberOfCoresAsRangeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.OPTIONAL_FEATURE_DEGREE: {
			OptionalFeatureDegree optionalFeatureDegree = (OptionalFeatureDegree) theEObject;
			T result = caseOptionalFeatureDegree(optionalFeatureDegree);
			if (result == null)
				result = caseFeatureConfigDegree(optionalFeatureDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(optionalFeatureDegree);
			if (result == null)
				result = caseNamedElement(optionalFeatureDegree);
			if (result == null)
				result = casePCMBaseClass(optionalFeatureDegree);
			if (result == null)
				result = casePCMClass(optionalFeatureDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE: {
			ResourceContainerReplicationDegree resourceContainerReplicationDegree = (ResourceContainerReplicationDegree) theEObject;
			T result = caseResourceContainerReplicationDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseRangeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseDiscreteDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseDataTypeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(resourceContainerReplicationDegree);
			if (result == null)
				result = caseNamedElement(resourceContainerReplicationDegree);
			if (result == null)
				result = casePCMBaseClass(resourceContainerReplicationDegree);
			if (result == null)
				result = casePCMClass(resourceContainerReplicationDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE: {
			ResourceContainerReplicationDegreeWithComponentChange resourceContainerReplicationDegreeWithComponentChange = (ResourceContainerReplicationDegreeWithComponentChange) theEObject;
			T result = caseResourceContainerReplicationDegreeWithComponentChange(
					resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseResourceContainerReplicationDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseDiscreteRangeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseRangeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseDiscreteDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseOrderedDataTypeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseDataTypeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseDegreeOfFreedomInstance(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseNamedElement(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = casePCMBaseClass(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = casePCMClass(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.RESOURCE_SELECTION_DEGREE: {
			ResourceSelectionDegree resourceSelectionDegree = (ResourceSelectionDegree) theEObject;
			T result = caseResourceSelectionDegree(resourceSelectionDegree);
			if (result == null)
				result = caseClassWithCopyDegree(resourceSelectionDegree);
			if (result == null)
				result = caseProcessingResourceDegree(resourceSelectionDegree);
			if (result == null)
				result = caseClassDegree(resourceSelectionDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(resourceSelectionDegree);
			if (result == null)
				result = caseNamedElement(resourceSelectionDegree);
			if (result == null)
				result = casePCMBaseClass(resourceSelectionDegree);
			if (result == null)
				result = casePCMClass(resourceSelectionDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.SCHEDULING_POLICY_DEGREE: {
			SchedulingPolicyDegree schedulingPolicyDegree = (SchedulingPolicyDegree) theEObject;
			T result = caseSchedulingPolicyDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseClassAsReferenceDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseProcessingResourceDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseClassDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(schedulingPolicyDegree);
			if (result == null)
				result = caseNamedElement(schedulingPolicyDegree);
			if (result == null)
				result = casePCMBaseClass(schedulingPolicyDegree);
			if (result == null)
				result = casePCMClass(schedulingPolicyDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.STRING_COMPONENT_PARAM_DEGREE: {
			StringComponentParamDegree stringComponentParamDegree = (StringComponentParamDegree) theEObject;
			T result = caseStringComponentParamDegree(stringComponentParamDegree);
			if (result == null)
				result = caseStringSetDegree(stringComponentParamDegree);
			if (result == null)
				result = caseUnorderedDegree(stringComponentParamDegree);
			if (result == null)
				result = caseDataTypeDegree(stringComponentParamDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(stringComponentParamDegree);
			if (result == null)
				result = caseNamedElement(stringComponentParamDegree);
			if (result == null)
				result = casePCMBaseClass(stringComponentParamDegree);
			if (result == null)
				result = casePCMClass(stringComponentParamDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ALLOCATION_DEGREE: {
			AllocationDegree allocationDegree = (AllocationDegree) theEObject;
			T result = caseAllocationDegree(allocationDegree);
			if (result == null)
				result = caseClassAsReferenceDegree(allocationDegree);
			if (result == null)
				result = caseClassDegree(allocationDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(allocationDegree);
			if (result == null)
				result = caseNamedElement(allocationDegree);
			if (result == null)
				result = casePCMBaseClass(allocationDegree);
			if (result == null)
				result = casePCMClass(allocationDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ASSEMBLED_COMPONENT_DEGREE: {
			AssembledComponentDegree assembledComponentDegree = (AssembledComponentDegree) theEObject;
			T result = caseAssembledComponentDegree(assembledComponentDegree);
			if (result == null)
				result = caseClassAsReferenceDegree(assembledComponentDegree);
			if (result == null)
				result = caseClassDegree(assembledComponentDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(assembledComponentDegree);
			if (result == null)
				result = caseNamedElement(assembledComponentDegree);
			if (result == null)
				result = casePCMBaseClass(assembledComponentDegree);
			if (result == null)
				result = casePCMClass(assembledComponentDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CAPACITY_DEGREE: {
			CapacityDegree capacityDegree = (CapacityDegree) theEObject;
			T result = caseCapacityDegree(capacityDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(capacityDegree);
			if (result == null)
				result = caseRangeDegree(capacityDegree);
			if (result == null)
				result = caseDiscreteDegree(capacityDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(capacityDegree);
			if (result == null)
				result = caseDataTypeDegree(capacityDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(capacityDegree);
			if (result == null)
				result = caseNamedElement(capacityDegree);
			if (result == null)
				result = casePCMBaseClass(capacityDegree);
			if (result == null)
				result = casePCMClass(capacityDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.MONITORING_DEGREE: {
			MonitoringDegree monitoringDegree = (MonitoringDegree) theEObject;
			T result = caseMonitoringDegree(monitoringDegree);
			if (result == null)
				result = caseContinuousRangeDegree(monitoringDegree);
			if (result == null)
				result = caseRangeDegree(monitoringDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(monitoringDegree);
			if (result == null)
				result = caseDataTypeDegree(monitoringDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(monitoringDegree);
			if (result == null)
				result = caseNamedElement(monitoringDegree);
			if (result == null)
				result = casePCMBaseClass(monitoringDegree);
			if (result == null)
				result = casePCMClass(monitoringDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.AT_NUMBER_OF_REPLICA_DEGREE: {
			ATNumberOfReplicaDegree atNumberOfReplicaDegree = (ATNumberOfReplicaDegree) theEObject;
			T result = caseATNumberOfReplicaDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseRangeDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseDiscreteDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseDataTypeDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(atNumberOfReplicaDegree);
			if (result == null)
				result = caseNamedElement(atNumberOfReplicaDegree);
			if (result == null)
				result = casePCMBaseClass(atNumberOfReplicaDegree);
			if (result == null)
				result = casePCMClass(atNumberOfReplicaDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.FEATURE_COMPLETION_DEGREE: {
			FeatureCompletionDegree featureCompletionDegree = (FeatureCompletionDegree) theEObject;
			T result = caseFeatureCompletionDegree(featureCompletionDegree);
			if (result == null)
				result = caseClassAsReferenceDegree(featureCompletionDegree);
			if (result == null)
				result = caseClassDegree(featureCompletionDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(featureCompletionDegree);
			if (result == null)
				result = caseNamedElement(featureCompletionDegree);
			if (result == null)
				result = casePCMBaseClass(featureCompletionDegree);
			if (result == null)
				result = casePCMClass(featureCompletionDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.FEATURE_DEGREE: {
			FeatureDegree featureDegree = (FeatureDegree) theEObject;
			T result = caseFeatureDegree(featureDegree);
			if (result == null)
				result = caseClassAsReferenceDegree(featureDegree);
			if (result == null)
				result = caseClassDegree(featureDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(featureDegree);
			if (result == null)
				result = caseNamedElement(featureDegree);
			if (result == null)
				result = casePCMBaseClass(featureDegree);
			if (result == null)
				result = casePCMClass(featureDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.INDICATOR_DEGREE: {
			IndicatorDegree indicatorDegree = (IndicatorDegree) theEObject;
			T result = caseIndicatorDegree(indicatorDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(indicatorDegree);
			if (result == null)
				result = caseNamedElement(indicatorDegree);
			if (result == null)
				result = casePCMBaseClass(indicatorDegree);
			if (result == null)
				result = casePCMClass(indicatorDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.MULTIPLE_INCLUSION_DEGREE: {
			MultipleInclusionDegree multipleInclusionDegree = (MultipleInclusionDegree) theEObject;
			T result = caseMultipleInclusionDegree(multipleInclusionDegree);
			if (result == null)
				result = caseIndicatorDegree(multipleInclusionDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(multipleInclusionDegree);
			if (result == null)
				result = caseNamedElement(multipleInclusionDegree);
			if (result == null)
				result = casePCMBaseClass(multipleInclusionDegree);
			if (result == null)
				result = casePCMClass(multipleInclusionDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ADVICE_PLACEMENT_DEGREE: {
			AdvicePlacementDegree advicePlacementDegree = (AdvicePlacementDegree) theEObject;
			T result = caseAdvicePlacementDegree(advicePlacementDegree);
			if (result == null)
				result = caseIndicatorDegree(advicePlacementDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(advicePlacementDegree);
			if (result == null)
				result = caseNamedElement(advicePlacementDegree);
			if (result == null)
				result = casePCMBaseClass(advicePlacementDegree);
			if (result == null)
				result = casePCMClass(advicePlacementDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.COMPLEMENTUM_VISNETIS_DEGREE: {
			ComplementumVisnetisDegree complementumVisnetisDegree = (ComplementumVisnetisDegree) theEObject;
			T result = caseComplementumVisnetisDegree(complementumVisnetisDegree);
			if (result == null)
				result = caseClassAsReferenceDegree(complementumVisnetisDegree);
			if (result == null)
				result = caseClassDegree(complementumVisnetisDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(complementumVisnetisDegree);
			if (result == null)
				result = caseNamedElement(complementumVisnetisDegree);
			if (result == null)
				result = casePCMBaseClass(complementumVisnetisDegree);
			if (result == null)
				result = casePCMClass(complementumVisnetisDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE: {
			TargetGroupSizeMaxConstraintDegree targetGroupSizeMaxConstraintDegree = (TargetGroupSizeMaxConstraintDegree) theEObject;
			T result = caseTargetGroupSizeMaxConstraintDegree(targetGroupSizeMaxConstraintDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(targetGroupSizeMaxConstraintDegree);
			if (result == null)
				result = caseRangeDegree(targetGroupSizeMaxConstraintDegree);
			if (result == null)
				result = caseDiscreteDegree(targetGroupSizeMaxConstraintDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(targetGroupSizeMaxConstraintDegree);
			if (result == null)
				result = caseDataTypeDegree(targetGroupSizeMaxConstraintDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(targetGroupSizeMaxConstraintDegree);
			if (result == null)
				result = caseNamedElement(targetGroupSizeMaxConstraintDegree);
			if (result == null)
				result = casePCMBaseClass(targetGroupSizeMaxConstraintDegree);
			if (result == null)
				result = casePCMClass(targetGroupSizeMaxConstraintDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.STEP_ADJUSTMENT_DEGREE: {
			StepAdjustmentDegree stepAdjustmentDegree = (StepAdjustmentDegree) theEObject;
			T result = caseStepAdjustmentDegree(stepAdjustmentDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(stepAdjustmentDegree);
			if (result == null)
				result = caseRangeDegree(stepAdjustmentDegree);
			if (result == null)
				result = caseDiscreteDegree(stepAdjustmentDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(stepAdjustmentDegree);
			if (result == null)
				result = caseDataTypeDegree(stepAdjustmentDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(stepAdjustmentDegree);
			if (result == null)
				result = caseNamedElement(stepAdjustmentDegree);
			if (result == null)
				result = casePCMBaseClass(stepAdjustmentDegree);
			if (result == null)
				result = casePCMClass(stepAdjustmentDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.EXPECTED_CPU_UTILIZATION_DEGREE: {
			ExpectedCPUUtilizationDegree expectedCPUUtilizationDegree = (ExpectedCPUUtilizationDegree) theEObject;
			T result = caseExpectedCPUUtilizationDegree(expectedCPUUtilizationDegree);
			if (result == null)
				result = caseContinuousRangeDegree(expectedCPUUtilizationDegree);
			if (result == null)
				result = caseRangeDegree(expectedCPUUtilizationDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(expectedCPUUtilizationDegree);
			if (result == null)
				result = caseDataTypeDegree(expectedCPUUtilizationDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(expectedCPUUtilizationDegree);
			if (result == null)
				result = caseNamedElement(expectedCPUUtilizationDegree);
			if (result == null)
				result = casePCMBaseClass(expectedCPUUtilizationDegree);
			if (result == null)
				result = casePCMClass(expectedCPUUtilizationDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.EXPECTED_MEMORY_UTILIZATION_DEGREE: {
			ExpectedMemoryUtilizationDegree expectedMemoryUtilizationDegree = (ExpectedMemoryUtilizationDegree) theEObject;
			T result = caseExpectedMemoryUtilizationDegree(expectedMemoryUtilizationDegree);
			if (result == null)
				result = caseContinuousRangeDegree(expectedMemoryUtilizationDegree);
			if (result == null)
				result = caseRangeDegree(expectedMemoryUtilizationDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(expectedMemoryUtilizationDegree);
			if (result == null)
				result = caseDataTypeDegree(expectedMemoryUtilizationDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(expectedMemoryUtilizationDegree);
			if (result == null)
				result = caseNamedElement(expectedMemoryUtilizationDegree);
			if (result == null)
				result = casePCMBaseClass(expectedMemoryUtilizationDegree);
			if (result == null)
				result = casePCMClass(expectedMemoryUtilizationDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.EXPECTED_HDD_UTILIZATION_DEGREE: {
			ExpectedHDDUtilizationDegree expectedHDDUtilizationDegree = (ExpectedHDDUtilizationDegree) theEObject;
			T result = caseExpectedHDDUtilizationDegree(expectedHDDUtilizationDegree);
			if (result == null)
				result = caseContinuousRangeDegree(expectedHDDUtilizationDegree);
			if (result == null)
				result = caseRangeDegree(expectedHDDUtilizationDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(expectedHDDUtilizationDegree);
			if (result == null)
				result = caseDataTypeDegree(expectedHDDUtilizationDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(expectedHDDUtilizationDegree);
			if (result == null)
				result = caseNamedElement(expectedHDDUtilizationDegree);
			if (result == null)
				result = casePCMBaseClass(expectedHDDUtilizationDegree);
			if (result == null)
				result = casePCMClass(expectedHDDUtilizationDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.EXPECTED_NETWORK_UTILIZATION_DEGREE: {
			ExpectedNetworkUtilizationDegree expectedNetworkUtilizationDegree = (ExpectedNetworkUtilizationDegree) theEObject;
			T result = caseExpectedNetworkUtilizationDegree(expectedNetworkUtilizationDegree);
			if (result == null)
				result = caseContinuousRangeDegree(expectedNetworkUtilizationDegree);
			if (result == null)
				result = caseRangeDegree(expectedNetworkUtilizationDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(expectedNetworkUtilizationDegree);
			if (result == null)
				result = caseDataTypeDegree(expectedNetworkUtilizationDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(expectedNetworkUtilizationDegree);
			if (result == null)
				result = caseNamedElement(expectedNetworkUtilizationDegree);
			if (result == null)
				result = casePCMBaseClass(expectedNetworkUtilizationDegree);
			if (result == null)
				result = casePCMClass(expectedNetworkUtilizationDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.EXPECTED_SIMULATION_TIME_DEGREE: {
			ExpectedSimulationTimeDegree expectedSimulationTimeDegree = (ExpectedSimulationTimeDegree) theEObject;
			T result = caseExpectedSimulationTimeDegree(expectedSimulationTimeDegree);
			if (result == null)
				result = caseContinuousRangeDegree(expectedSimulationTimeDegree);
			if (result == null)
				result = caseRangeDegree(expectedSimulationTimeDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(expectedSimulationTimeDegree);
			if (result == null)
				result = caseDataTypeDegree(expectedSimulationTimeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(expectedSimulationTimeDegree);
			if (result == null)
				result = caseNamedElement(expectedSimulationTimeDegree);
			if (result == null)
				result = casePCMBaseClass(expectedSimulationTimeDegree);
			if (result == null)
				result = casePCMClass(expectedSimulationTimeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.EXPECTED_OPERATION_RESPONSE_TIME_DEGREE: {
			ExpectedOperationResponseTimeDegree expectedOperationResponseTimeDegree = (ExpectedOperationResponseTimeDegree) theEObject;
			T result = caseExpectedOperationResponseTimeDegree(expectedOperationResponseTimeDegree);
			if (result == null)
				result = caseContinuousRangeDegree(expectedOperationResponseTimeDegree);
			if (result == null)
				result = caseRangeDegree(expectedOperationResponseTimeDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(expectedOperationResponseTimeDegree);
			if (result == null)
				result = caseDataTypeDegree(expectedOperationResponseTimeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(expectedOperationResponseTimeDegree);
			if (result == null)
				result = caseNamedElement(expectedOperationResponseTimeDegree);
			if (result == null)
				result = casePCMBaseClass(expectedOperationResponseTimeDegree);
			if (result == null)
				result = casePCMClass(expectedOperationResponseTimeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.EXPECTED_NUMBER_OF_ELEMENTS_DEGREE: {
			ExpectedNumberOfElementsDegree expectedNumberOfElementsDegree = (ExpectedNumberOfElementsDegree) theEObject;
			T result = caseExpectedNumberOfElementsDegree(expectedNumberOfElementsDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(expectedNumberOfElementsDegree);
			if (result == null)
				result = caseRangeDegree(expectedNumberOfElementsDegree);
			if (result == null)
				result = caseDiscreteDegree(expectedNumberOfElementsDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(expectedNumberOfElementsDegree);
			if (result == null)
				result = caseDataTypeDegree(expectedNumberOfElementsDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(expectedNumberOfElementsDegree);
			if (result == null)
				result = caseNamedElement(expectedNumberOfElementsDegree);
			if (result == null)
				result = casePCMBaseClass(expectedNumberOfElementsDegree);
			if (result == null)
				result = casePCMClass(expectedNumberOfElementsDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.EXPECTED_QUEUE_LENGTH_DEGREE: {
			ExpectedQueueLengthDegree expectedQueueLengthDegree = (ExpectedQueueLengthDegree) theEObject;
			T result = caseExpectedQueueLengthDegree(expectedQueueLengthDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(expectedQueueLengthDegree);
			if (result == null)
				result = caseRangeDegree(expectedQueueLengthDegree);
			if (result == null)
				result = caseDiscreteDegree(expectedQueueLengthDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(expectedQueueLengthDegree);
			if (result == null)
				result = caseDataTypeDegree(expectedQueueLengthDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(expectedQueueLengthDegree);
			if (result == null)
				result = caseNamedElement(expectedQueueLengthDegree);
			if (result == null)
				result = casePCMBaseClass(expectedQueueLengthDegree);
			if (result == null)
				result = casePCMClass(expectedQueueLengthDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.EXPECTED_TASK_COUNT_DEGREE: {
			ExpectedTaskCountDegree expectedTaskCountDegree = (ExpectedTaskCountDegree) theEObject;
			T result = caseExpectedTaskCountDegree(expectedTaskCountDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(expectedTaskCountDegree);
			if (result == null)
				result = caseRangeDegree(expectedTaskCountDegree);
			if (result == null)
				result = caseDiscreteDegree(expectedTaskCountDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(expectedTaskCountDegree);
			if (result == null)
				result = caseDataTypeDegree(expectedTaskCountDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(expectedTaskCountDegree);
			if (result == null)
				result = caseNamedElement(expectedTaskCountDegree);
			if (result == null)
				result = casePCMBaseClass(expectedTaskCountDegree);
			if (result == null)
				result = casePCMClass(expectedTaskCountDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.COOLDOWN_TIME_CONSTRAINT_DEGREE: {
			CooldownTimeConstraintDegree cooldownTimeConstraintDegree = (CooldownTimeConstraintDegree) theEObject;
			T result = caseCooldownTimeConstraintDegree(cooldownTimeConstraintDegree);
			if (result == null)
				result = caseContinuousRangeDegree(cooldownTimeConstraintDegree);
			if (result == null)
				result = caseRangeDegree(cooldownTimeConstraintDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(cooldownTimeConstraintDegree);
			if (result == null)
				result = caseDataTypeDegree(cooldownTimeConstraintDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(cooldownTimeConstraintDegree);
			if (result == null)
				result = caseNamedElement(cooldownTimeConstraintDegree);
			if (result == null)
				result = casePCMBaseClass(cooldownTimeConstraintDegree);
			if (result == null)
				result = casePCMClass(cooldownTimeConstraintDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE: {
			CooldownMaxScalingOperationsConstraintDegree cooldownMaxScalingOperationsConstraintDegree = (CooldownMaxScalingOperationsConstraintDegree) theEObject;
			T result = caseCooldownMaxScalingOperationsConstraintDegree(cooldownMaxScalingOperationsConstraintDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(cooldownMaxScalingOperationsConstraintDegree);
			if (result == null)
				result = caseRangeDegree(cooldownMaxScalingOperationsConstraintDegree);
			if (result == null)
				result = caseDiscreteDegree(cooldownMaxScalingOperationsConstraintDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(cooldownMaxScalingOperationsConstraintDegree);
			if (result == null)
				result = caseDataTypeDegree(cooldownMaxScalingOperationsConstraintDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(cooldownMaxScalingOperationsConstraintDegree);
			if (result == null)
				result = caseNamedElement(cooldownMaxScalingOperationsConstraintDegree);
			if (result == null)
				result = casePCMBaseClass(cooldownMaxScalingOperationsConstraintDegree);
			if (result == null)
				result = casePCMClass(cooldownMaxScalingOperationsConstraintDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Component Rule</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Component Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeComponentRule(ExchangeComponentRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class As Reference Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class As Reference Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAsReferenceDegree(ClassAsReferenceDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Degree</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDegree(ClassDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class With Copy Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class With Copy Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassWithCopyDegree(ClassWithCopyDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Range Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousRangeDegree(ContinuousRangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Degree</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeDegree(RangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeDegree(DataTypeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteDegree(DiscreteDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Range Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteRangeDegree(DiscreteRangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Degree</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDegree(EnumDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unordered Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unordered Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnorderedDegree(UnorderedDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Data Type Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Data Type Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedDataTypeDegree(OrderedDataTypeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Integer Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Integer Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedIntegerDegree(OrderedIntegerDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Set Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Set Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringSetDegree(StringSetDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unordered Primitive Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unordered Primitive Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnorderedPrimitiveDegree(UnorderedPrimitiveDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Component Param Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Component Param Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousComponentParamDegree(ContinuousComponentParamDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Processing Rate Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Processing Rate Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousProcessingRateDegree(ContinuousProcessingRateDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Rate Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Rate Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingRateDegree(ProcessingRateDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingResourceDegree(ProcessingResourceDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Component Param Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Component Param Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteComponentParamDegree(DiscreteComponentParamDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Processing Rate Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Processing Rate Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteProcessingRateDegree(DiscreteProcessingRateDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Config Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Config Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureConfigDegree(FeatureConfigDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Group Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Group Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureGroupDegree(FeatureGroupDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Subset</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSubset(FeatureSubset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Cores As List Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Cores As List Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfCoresAsListDegree(NumberOfCoresAsListDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Cores Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Cores Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfCoresDegree(NumberOfCoresDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Cores As Range Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Cores As Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfCoresAsRangeDegree(NumberOfCoresAsRangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Feature Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Feature Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalFeatureDegree(OptionalFeatureDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Container Replication Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Container Replication Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceContainerReplicationDegree(ResourceContainerReplicationDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Container Replication Degree With Component Change</em>'.
	 * <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Container Replication Degree With Component Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceContainerReplicationDegreeWithComponentChange(
			ResourceContainerReplicationDegreeWithComponentChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Selection Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Selection Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceSelectionDegree(ResourceSelectionDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Policy Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Policy Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingPolicyDegree(SchedulingPolicyDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Component Param Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Component Param Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringComponentParamDegree(StringComponentParamDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationDegree(AllocationDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembled Component Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembled Component Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembledComponentDegree(AssembledComponentDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capacity Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capacity Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapacityDegree(CapacityDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree Of Freedom Instance</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree Of Freedom Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegreeOfFreedomInstance(DegreeOfFreedomInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringDegree(MonitoringDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AT Number Of Replica Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AT Number Of Replica Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATNumberOfReplicaDegree(ATNumberOfReplicaDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Completion Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Completion Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCompletionDegree(FeatureCompletionDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureDegree(FeatureDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indicator Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indicator Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndicatorDegree(IndicatorDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Inclusion Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Inclusion Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleInclusionDegree(MultipleInclusionDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advice Placement Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advice Placement Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvicePlacementDegree(AdvicePlacementDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complementum Visnetis Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complementum Visnetis Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplementumVisnetisDegree(ComplementumVisnetisDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Group Size Max Constraint Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Group Size Max Constraint Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetGroupSizeMaxConstraintDegree(TargetGroupSizeMaxConstraintDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Adjustment Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Adjustment Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepAdjustmentDegree(StepAdjustmentDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected CPU Utilization Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected CPU Utilization Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedCPUUtilizationDegree(ExpectedCPUUtilizationDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Memory Utilization Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Memory Utilization Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedMemoryUtilizationDegree(ExpectedMemoryUtilizationDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected HDD Utilization Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected HDD Utilization Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedHDDUtilizationDegree(ExpectedHDDUtilizationDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Network Utilization Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Network Utilization Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedNetworkUtilizationDegree(ExpectedNetworkUtilizationDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Simulation Time Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Simulation Time Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedSimulationTimeDegree(ExpectedSimulationTimeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Operation Response Time Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Operation Response Time Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedOperationResponseTimeDegree(ExpectedOperationResponseTimeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Number Of Elements Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Number Of Elements Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedNumberOfElementsDegree(ExpectedNumberOfElementsDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Queue Length Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Queue Length Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedQueueLengthDegree(ExpectedQueueLengthDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Task Count Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Task Count Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedTaskCountDegree(ExpectedTaskCountDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cooldown Time Constraint Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cooldown Time Constraint Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCooldownTimeConstraintDegree(CooldownTimeConstraintDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cooldown Max Scaling Operations Constraint Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cooldown Max Scaling Operations Constraint Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCooldownMaxScalingOperationsConstraintDegree(CooldownMaxScalingOperationsConstraintDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMClass(PCMClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMBaseClass(PCMBaseClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // specificSwitch
