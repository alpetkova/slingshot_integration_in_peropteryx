/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorPackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.impl.gdofPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl;
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
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.impl.resourcerepositoryPackageImpl;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class specificPackageImpl extends EPackageImpl implements specificPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeComponentRuleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAsReferenceDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classWithCopyDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousRangeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteRangeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unorderedDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedDataTypeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedIntegerDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringSetDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unorderedPrimitiveDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousComponentParamDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousProcessingRateDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingRateDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteComponentParamDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteProcessingRateDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConfigDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSubsetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfCoresAsListDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfCoresDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfCoresAsRangeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalFeatureDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContainerReplicationDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContainerReplicationDegreeWithComponentChangeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceSelectionDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingPolicyDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringComponentParamDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assembledComponentDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacityDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringDegreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atNumberOfReplicaDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureCompletionDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicatorDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleInclusionDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advicePlacementDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementumVisnetisDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetGroupSizeMaxConstraintDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepAdjustmentDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedCPUUtilizationDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedMemoryUtilizationDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedHDDUtilizationDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedNetworkUtilizationDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedSimulationTimeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedOperationResponseTimeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedNumberOfElementsDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedQueueLengthDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedTaskCountDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooldownTimeConstraintDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooldownMaxScalingOperationsConstraintDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteAdjustmentDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeAdjustmentDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalDurationConstraintDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalOffsetConstraintDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thrashingConstraintDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetGroupSizeMinConstraintDegreeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private specificPackageImpl() {
		super(eNS_URI, specificFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link specificPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static specificPackage init() {
		if (isInited)
			return (specificPackage) EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredspecificPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		specificPackageImpl thespecificPackage = registeredspecificPackage instanceof specificPackageImpl
				? (specificPackageImpl) registeredspecificPackage
				: new specificPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		costPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		featuremodelPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ResultdecoratorPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI);
		designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (registeredPackage instanceof designdecisionPackageImpl
				? registeredPackage
				: designdecisionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI);
		gdofPackageImpl thegdofPackage = (gdofPackageImpl) (registeredPackage instanceof gdofPackageImpl
				? registeredPackage
				: gdofPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(qualitypropertiesPackage.eNS_URI);
		qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (registeredPackage instanceof qualitypropertiesPackageImpl
				? registeredPackage
				: qualitypropertiesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(resourcerepositoryPackage.eNS_URI);
		resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (registeredPackage instanceof resourcerepositoryPackageImpl
				? registeredPackage
				: resourcerepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		thespecificPackage.createPackageContents();
		thedesigndecisionPackage.createPackageContents();
		thegdofPackage.createPackageContents();
		thequalitypropertiesPackage.createPackageContents();
		theresourcerepositoryPackage.createPackageContents();

		// Initialize created meta-data
		thespecificPackage.initializePackageContents();
		thedesigndecisionPackage.initializePackageContents();
		thegdofPackage.initializePackageContents();
		thequalitypropertiesPackage.initializePackageContents();
		theresourcerepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thespecificPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(specificPackage.eNS_URI, thespecificPackage);
		return thespecificPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExchangeComponentRule() {
		return exchangeComponentRuleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExchangeComponentRule_RepositoryComponent() {
		return (EReference) exchangeComponentRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExchangeComponentRule_AllocationContext() {
		return (EReference) exchangeComponentRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassAsReferenceDegree() {
		return classAsReferenceDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassDegree() {
		return classDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDegree_ClassDesignOptions() {
		return (EReference) classDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassWithCopyDegree() {
		return classWithCopyDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousRangeDegree() {
		return continuousRangeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousRangeDegree_To() {
		return (EAttribute) continuousRangeDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousRangeDegree_From() {
		return (EAttribute) continuousRangeDegreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRangeDegree() {
		return rangeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeDegree_UpperBoundIncluded() {
		return (EAttribute) rangeDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeDegree_LowerBoundIncluded() {
		return (EAttribute) rangeDegreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeDegree_NumberOfSteps() {
		return (EAttribute) rangeDegreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTypeDegree() {
		return dataTypeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteDegree() {
		return discreteDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteRangeDegree() {
		return discreteRangeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteRangeDegree_To() {
		return (EAttribute) discreteRangeDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteRangeDegree_From() {
		return (EAttribute) discreteRangeDegreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumDegree() {
		return enumDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumDegree_Enumeration() {
		return (EReference) enumDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnorderedDegree() {
		return unorderedDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderedDataTypeDegree() {
		return orderedDataTypeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderedIntegerDegree() {
		return orderedIntegerDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderedIntegerDegree_ListOfIntegers() {
		return (EAttribute) orderedIntegerDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringSetDegree() {
		return stringSetDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringSetDegree_StringValues() {
		return (EAttribute) stringSetDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnorderedPrimitiveDegree() {
		return unorderedPrimitiveDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousComponentParamDegree() {
		return continuousComponentParamDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousProcessingRateDegree() {
		return continuousProcessingRateDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingRateDegree() {
		return processingRateDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingResourceDegree() {
		return processingResourceDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingResourceDegree_Processingresourcetype() {
		return (EReference) processingResourceDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteComponentParamDegree() {
		return discreteComponentParamDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteProcessingRateDegree() {
		return discreteProcessingRateDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureConfigDegree() {
		return featureConfigDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureGroupDegree() {
		return featureGroupDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupDegree_Featuregroup() {
		return (EReference) featureGroupDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupDegree_DomainOfFeatureConfigCombinations() {
		return (EReference) featureGroupDegreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureSubset() {
		return featureSubsetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureSubset_Feature() {
		return (EReference) featureSubsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberOfCoresAsListDegree() {
		return numberOfCoresAsListDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberOfCoresDegree() {
		return numberOfCoresDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberOfCoresAsRangeDegree() {
		return numberOfCoresAsRangeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptionalFeatureDegree() {
		return optionalFeatureDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptionalFeatureDegree_Simple() {
		return (EReference) optionalFeatureDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceContainerReplicationDegree() {
		return resourceContainerReplicationDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceContainerReplicationDegreeWithComponentChange() {
		return resourceContainerReplicationDegreeWithComponentChangeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule() {
		return (EReference) resourceContainerReplicationDegreeWithComponentChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceSelectionDegree() {
		return resourceSelectionDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulingPolicyDegree() {
		return schedulingPolicyDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringComponentParamDegree() {
		return stringComponentParamDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocationDegree() {
		return allocationDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssembledComponentDegree() {
		return assembledComponentDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapacityDegree() {
		return capacityDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonitoringDegree() {
		return monitoringDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATNumberOfReplicaDegree() {
		return atNumberOfReplicaDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureCompletionDegree() {
		return featureCompletionDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureDegree() {
		return featureDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndicatorDegree() {
		return indicatorDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultipleInclusionDegree() {
		return multipleInclusionDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvicePlacementDegree() {
		return advicePlacementDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplementumVisnetisDegree() {
		return complementumVisnetisDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetGroupSizeMaxConstraintDegree() {
		return targetGroupSizeMaxConstraintDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStepAdjustmentDegree() {
		return stepAdjustmentDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectedCPUUtilizationDegree() {
		return expectedCPUUtilizationDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectedMemoryUtilizationDegree() {
		return expectedMemoryUtilizationDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectedHDDUtilizationDegree() {
		return expectedHDDUtilizationDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectedNetworkUtilizationDegree() {
		return expectedNetworkUtilizationDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectedSimulationTimeDegree() {
		return expectedSimulationTimeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectedOperationResponseTimeDegree() {
		return expectedOperationResponseTimeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectedNumberOfElementsDegree() {
		return expectedNumberOfElementsDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectedQueueLengthDegree() {
		return expectedQueueLengthDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectedTaskCountDegree() {
		return expectedTaskCountDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCooldownTimeConstraintDegree() {
		return cooldownTimeConstraintDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCooldownMaxScalingOperationsConstraintDegree() {
		return cooldownMaxScalingOperationsConstraintDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsoluteAdjustmentDegree() {
		return absoluteAdjustmentDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelativeAdjustmentDegree() {
		return relativeAdjustmentDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntervalDurationConstraintDegree() {
		return intervalDurationConstraintDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntervalOffsetConstraintDegree() {
		return intervalOffsetConstraintDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThrashingConstraintDegree() {
		return thrashingConstraintDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetGroupSizeMinConstraintDegree() {
		return targetGroupSizeMinConstraintDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public specificFactory getspecificFactory() {
		return (specificFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		exchangeComponentRuleEClass = createEClass(EXCHANGE_COMPONENT_RULE);
		createEReference(exchangeComponentRuleEClass, EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT);
		createEReference(exchangeComponentRuleEClass, EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT);

		classAsReferenceDegreeEClass = createEClass(CLASS_AS_REFERENCE_DEGREE);

		classDegreeEClass = createEClass(CLASS_DEGREE);
		createEReference(classDegreeEClass, CLASS_DEGREE__CLASS_DESIGN_OPTIONS);

		classWithCopyDegreeEClass = createEClass(CLASS_WITH_COPY_DEGREE);

		continuousRangeDegreeEClass = createEClass(CONTINUOUS_RANGE_DEGREE);
		createEAttribute(continuousRangeDegreeEClass, CONTINUOUS_RANGE_DEGREE__TO);
		createEAttribute(continuousRangeDegreeEClass, CONTINUOUS_RANGE_DEGREE__FROM);

		rangeDegreeEClass = createEClass(RANGE_DEGREE);
		createEAttribute(rangeDegreeEClass, RANGE_DEGREE__UPPER_BOUND_INCLUDED);
		createEAttribute(rangeDegreeEClass, RANGE_DEGREE__LOWER_BOUND_INCLUDED);
		createEAttribute(rangeDegreeEClass, RANGE_DEGREE__NUMBER_OF_STEPS);

		dataTypeDegreeEClass = createEClass(DATA_TYPE_DEGREE);

		discreteDegreeEClass = createEClass(DISCRETE_DEGREE);

		discreteRangeDegreeEClass = createEClass(DISCRETE_RANGE_DEGREE);
		createEAttribute(discreteRangeDegreeEClass, DISCRETE_RANGE_DEGREE__TO);
		createEAttribute(discreteRangeDegreeEClass, DISCRETE_RANGE_DEGREE__FROM);

		enumDegreeEClass = createEClass(ENUM_DEGREE);
		createEReference(enumDegreeEClass, ENUM_DEGREE__ENUMERATION);

		unorderedDegreeEClass = createEClass(UNORDERED_DEGREE);

		orderedDataTypeDegreeEClass = createEClass(ORDERED_DATA_TYPE_DEGREE);

		orderedIntegerDegreeEClass = createEClass(ORDERED_INTEGER_DEGREE);
		createEAttribute(orderedIntegerDegreeEClass, ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS);

		stringSetDegreeEClass = createEClass(STRING_SET_DEGREE);
		createEAttribute(stringSetDegreeEClass, STRING_SET_DEGREE__STRING_VALUES);

		unorderedPrimitiveDegreeEClass = createEClass(UNORDERED_PRIMITIVE_DEGREE);

		continuousComponentParamDegreeEClass = createEClass(CONTINUOUS_COMPONENT_PARAM_DEGREE);

		continuousProcessingRateDegreeEClass = createEClass(CONTINUOUS_PROCESSING_RATE_DEGREE);

		processingRateDegreeEClass = createEClass(PROCESSING_RATE_DEGREE);

		processingResourceDegreeEClass = createEClass(PROCESSING_RESOURCE_DEGREE);
		createEReference(processingResourceDegreeEClass, PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE);

		discreteComponentParamDegreeEClass = createEClass(DISCRETE_COMPONENT_PARAM_DEGREE);

		discreteProcessingRateDegreeEClass = createEClass(DISCRETE_PROCESSING_RATE_DEGREE);

		featureConfigDegreeEClass = createEClass(FEATURE_CONFIG_DEGREE);

		featureGroupDegreeEClass = createEClass(FEATURE_GROUP_DEGREE);
		createEReference(featureGroupDegreeEClass, FEATURE_GROUP_DEGREE__FEATUREGROUP);
		createEReference(featureGroupDegreeEClass, FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS);

		featureSubsetEClass = createEClass(FEATURE_SUBSET);
		createEReference(featureSubsetEClass, FEATURE_SUBSET__FEATURE);

		numberOfCoresAsListDegreeEClass = createEClass(NUMBER_OF_CORES_AS_LIST_DEGREE);

		numberOfCoresDegreeEClass = createEClass(NUMBER_OF_CORES_DEGREE);

		numberOfCoresAsRangeDegreeEClass = createEClass(NUMBER_OF_CORES_AS_RANGE_DEGREE);

		optionalFeatureDegreeEClass = createEClass(OPTIONAL_FEATURE_DEGREE);
		createEReference(optionalFeatureDegreeEClass, OPTIONAL_FEATURE_DEGREE__SIMPLE);

		resourceContainerReplicationDegreeEClass = createEClass(RESOURCE_CONTAINER_REPLICATION_DEGREE);

		resourceContainerReplicationDegreeWithComponentChangeEClass = createEClass(
				RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE);
		createEReference(resourceContainerReplicationDegreeWithComponentChangeEClass,
				RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__EXCHANGE_COMPONENT_RULE);

		resourceSelectionDegreeEClass = createEClass(RESOURCE_SELECTION_DEGREE);

		schedulingPolicyDegreeEClass = createEClass(SCHEDULING_POLICY_DEGREE);

		stringComponentParamDegreeEClass = createEClass(STRING_COMPONENT_PARAM_DEGREE);

		allocationDegreeEClass = createEClass(ALLOCATION_DEGREE);

		assembledComponentDegreeEClass = createEClass(ASSEMBLED_COMPONENT_DEGREE);

		capacityDegreeEClass = createEClass(CAPACITY_DEGREE);

		monitoringDegreeEClass = createEClass(MONITORING_DEGREE);

		atNumberOfReplicaDegreeEClass = createEClass(AT_NUMBER_OF_REPLICA_DEGREE);

		featureCompletionDegreeEClass = createEClass(FEATURE_COMPLETION_DEGREE);

		featureDegreeEClass = createEClass(FEATURE_DEGREE);

		indicatorDegreeEClass = createEClass(INDICATOR_DEGREE);

		multipleInclusionDegreeEClass = createEClass(MULTIPLE_INCLUSION_DEGREE);

		advicePlacementDegreeEClass = createEClass(ADVICE_PLACEMENT_DEGREE);

		complementumVisnetisDegreeEClass = createEClass(COMPLEMENTUM_VISNETIS_DEGREE);

		targetGroupSizeMaxConstraintDegreeEClass = createEClass(TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE);

		stepAdjustmentDegreeEClass = createEClass(STEP_ADJUSTMENT_DEGREE);

		expectedCPUUtilizationDegreeEClass = createEClass(EXPECTED_CPU_UTILIZATION_DEGREE);

		expectedMemoryUtilizationDegreeEClass = createEClass(EXPECTED_MEMORY_UTILIZATION_DEGREE);

		expectedHDDUtilizationDegreeEClass = createEClass(EXPECTED_HDD_UTILIZATION_DEGREE);

		expectedNetworkUtilizationDegreeEClass = createEClass(EXPECTED_NETWORK_UTILIZATION_DEGREE);

		expectedSimulationTimeDegreeEClass = createEClass(EXPECTED_SIMULATION_TIME_DEGREE);

		expectedOperationResponseTimeDegreeEClass = createEClass(EXPECTED_OPERATION_RESPONSE_TIME_DEGREE);

		expectedNumberOfElementsDegreeEClass = createEClass(EXPECTED_NUMBER_OF_ELEMENTS_DEGREE);

		expectedQueueLengthDegreeEClass = createEClass(EXPECTED_QUEUE_LENGTH_DEGREE);

		expectedTaskCountDegreeEClass = createEClass(EXPECTED_TASK_COUNT_DEGREE);

		cooldownTimeConstraintDegreeEClass = createEClass(COOLDOWN_TIME_CONSTRAINT_DEGREE);

		cooldownMaxScalingOperationsConstraintDegreeEClass = createEClass(
				COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE);

		absoluteAdjustmentDegreeEClass = createEClass(ABSOLUTE_ADJUSTMENT_DEGREE);

		relativeAdjustmentDegreeEClass = createEClass(RELATIVE_ADJUSTMENT_DEGREE);

		intervalDurationConstraintDegreeEClass = createEClass(INTERVAL_DURATION_CONSTRAINT_DEGREE);

		intervalOffsetConstraintDegreeEClass = createEClass(INTERVAL_OFFSET_CONSTRAINT_DEGREE);

		thrashingConstraintDegreeEClass = createEClass(THRASHING_CONSTRAINT_DEGREE);

		targetGroupSizeMinConstraintDegreeEClass = createEClass(TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(RepositoryPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage) EPackage.Registry.INSTANCE
				.getEPackage(AllocationPackage.eNS_URI);
		designdecisionPackage thedesigndecisionPackage = (designdecisionPackage) EPackage.Registry.INSTANCE
				.getEPackage(designdecisionPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ResourcetypePackage theResourcetypePackage = (ResourcetypePackage) EPackage.Registry.INSTANCE
				.getEPackage(ResourcetypePackage.eNS_URI);
		featuremodelPackage thefeaturemodelPackage = (featuremodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(featuremodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classAsReferenceDegreeEClass.getESuperTypes().add(this.getClassDegree());
		classDegreeEClass.getESuperTypes().add(thedesigndecisionPackage.getDegreeOfFreedomInstance());
		classWithCopyDegreeEClass.getESuperTypes().add(this.getClassDegree());
		continuousRangeDegreeEClass.getESuperTypes().add(this.getRangeDegree());
		rangeDegreeEClass.getESuperTypes().add(this.getOrderedDataTypeDegree());
		dataTypeDegreeEClass.getESuperTypes().add(thedesigndecisionPackage.getDegreeOfFreedomInstance());
		discreteDegreeEClass.getESuperTypes().add(this.getDataTypeDegree());
		discreteRangeDegreeEClass.getESuperTypes().add(this.getRangeDegree());
		discreteRangeDegreeEClass.getESuperTypes().add(this.getDiscreteDegree());
		enumDegreeEClass.getESuperTypes().add(this.getUnorderedDegree());
		unorderedDegreeEClass.getESuperTypes().add(this.getDataTypeDegree());
		orderedDataTypeDegreeEClass.getESuperTypes().add(this.getDataTypeDegree());
		orderedIntegerDegreeEClass.getESuperTypes().add(this.getDiscreteDegree());
		orderedIntegerDegreeEClass.getESuperTypes().add(this.getOrderedDataTypeDegree());
		stringSetDegreeEClass.getESuperTypes().add(this.getUnorderedDegree());
		unorderedPrimitiveDegreeEClass.getESuperTypes().add(this.getUnorderedDegree());
		continuousComponentParamDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		continuousProcessingRateDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		continuousProcessingRateDegreeEClass.getESuperTypes().add(this.getProcessingRateDegree());
		processingRateDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
		processingResourceDegreeEClass.getESuperTypes().add(thedesigndecisionPackage.getDegreeOfFreedomInstance());
		discreteComponentParamDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		discreteProcessingRateDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		discreteProcessingRateDegreeEClass.getESuperTypes().add(this.getProcessingRateDegree());
		featureConfigDegreeEClass.getESuperTypes().add(thedesigndecisionPackage.getDegreeOfFreedomInstance());
		featureGroupDegreeEClass.getESuperTypes().add(this.getFeatureConfigDegree());
		numberOfCoresAsListDegreeEClass.getESuperTypes().add(this.getNumberOfCoresDegree());
		numberOfCoresAsListDegreeEClass.getESuperTypes().add(this.getOrderedIntegerDegree());
		numberOfCoresDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
		numberOfCoresAsRangeDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		numberOfCoresAsRangeDegreeEClass.getESuperTypes().add(this.getNumberOfCoresDegree());
		optionalFeatureDegreeEClass.getESuperTypes().add(this.getFeatureConfigDegree());
		resourceContainerReplicationDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		resourceContainerReplicationDegreeWithComponentChangeEClass.getESuperTypes()
				.add(this.getResourceContainerReplicationDegree());
		resourceSelectionDegreeEClass.getESuperTypes().add(this.getClassWithCopyDegree());
		resourceSelectionDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
		schedulingPolicyDegreeEClass.getESuperTypes().add(this.getClassAsReferenceDegree());
		schedulingPolicyDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
		stringComponentParamDegreeEClass.getESuperTypes().add(this.getStringSetDegree());
		allocationDegreeEClass.getESuperTypes().add(this.getClassAsReferenceDegree());
		assembledComponentDegreeEClass.getESuperTypes().add(this.getClassAsReferenceDegree());
		capacityDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		monitoringDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		atNumberOfReplicaDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		featureCompletionDegreeEClass.getESuperTypes().add(this.getClassAsReferenceDegree());
		featureDegreeEClass.getESuperTypes().add(this.getClassAsReferenceDegree());
		indicatorDegreeEClass.getESuperTypes().add(thedesigndecisionPackage.getDegreeOfFreedomInstance());
		multipleInclusionDegreeEClass.getESuperTypes().add(this.getIndicatorDegree());
		advicePlacementDegreeEClass.getESuperTypes().add(this.getIndicatorDegree());
		complementumVisnetisDegreeEClass.getESuperTypes().add(this.getClassAsReferenceDegree());
		targetGroupSizeMaxConstraintDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		stepAdjustmentDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		expectedCPUUtilizationDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		expectedMemoryUtilizationDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		expectedHDDUtilizationDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		expectedNetworkUtilizationDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		expectedSimulationTimeDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		expectedOperationResponseTimeDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		expectedNumberOfElementsDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		expectedQueueLengthDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		expectedTaskCountDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		cooldownTimeConstraintDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		cooldownMaxScalingOperationsConstraintDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		absoluteAdjustmentDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		relativeAdjustmentDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
		intervalDurationConstraintDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		intervalOffsetConstraintDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		thrashingConstraintDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
		targetGroupSizeMinConstraintDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());

		// Initialize classes and features; add operations and parameters
		initEClass(exchangeComponentRuleEClass, ExchangeComponentRule.class, "ExchangeComponentRule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchangeComponentRule_RepositoryComponent(), theRepositoryPackage.getRepositoryComponent(),
				null, "repositoryComponent", null, 1, -1, ExchangeComponentRule.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExchangeComponentRule_AllocationContext(), theAllocationPackage.getAllocationContext(), null,
				"allocationContext", null, 0, 1, ExchangeComponentRule.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classAsReferenceDegreeEClass, ClassAsReferenceDegree.class, "ClassAsReferenceDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classDegreeEClass, ClassDegree.class, "ClassDegree", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDegree_ClassDesignOptions(), theEcorePackage.getEObject(), null, "classDesignOptions",
				null, 1, -1, ClassDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classWithCopyDegreeEClass, ClassWithCopyDegree.class, "ClassWithCopyDegree", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousRangeDegreeEClass, ContinuousRangeDegree.class, "ContinuousRangeDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousRangeDegree_To(), ecorePackage.getEDouble(), "to", null, 1, 1,
				ContinuousRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContinuousRangeDegree_From(), ecorePackage.getEDouble(), "from", null, 1, 1,
				ContinuousRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rangeDegreeEClass, RangeDegree.class, "RangeDegree", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeDegree_UpperBoundIncluded(), ecorePackage.getEBoolean(), "upperBoundIncluded", "true", 1,
				1, RangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRangeDegree_LowerBoundIncluded(), ecorePackage.getEBoolean(), "lowerBoundIncluded", "true", 1,
				1, RangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRangeDegree_NumberOfSteps(), ecorePackage.getEInt(), "numberOfSteps", null, 0, 1,
				RangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(dataTypeDegreeEClass, DataTypeDegree.class, "DataTypeDegree", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(discreteDegreeEClass, DiscreteDegree.class, "DiscreteDegree", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(discreteRangeDegreeEClass, DiscreteRangeDegree.class, "DiscreteRangeDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteRangeDegree_To(), ecorePackage.getEInt(), "to", null, 1, 1, DiscreteRangeDegree.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getDiscreteRangeDegree_From(), ecorePackage.getEInt(), "from", null, 1, 1,
				DiscreteRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumDegreeEClass, EnumDegree.class, "EnumDegree", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumDegree_Enumeration(), theEcorePackage.getEEnum(), null, "enumeration", null, 0, 1,
				EnumDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unorderedDegreeEClass, UnorderedDegree.class, "UnorderedDegree", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedDataTypeDegreeEClass, OrderedDataTypeDegree.class, "OrderedDataTypeDegree", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedIntegerDegreeEClass, OrderedIntegerDegree.class, "OrderedIntegerDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderedIntegerDegree_ListOfIntegers(), ecorePackage.getEInt(), "listOfIntegers", null, 1, -1,
				OrderedIntegerDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringSetDegreeEClass, StringSetDegree.class, "StringSetDegree", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringSetDegree_StringValues(), theTypesPackage.getString(), "stringValues", null, 1, -1,
				StringSetDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(unorderedPrimitiveDegreeEClass, UnorderedPrimitiveDegree.class, "UnorderedPrimitiveDegree",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousComponentParamDegreeEClass, ContinuousComponentParamDegree.class,
				"ContinuousComponentParamDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousProcessingRateDegreeEClass, ContinuousProcessingRateDegree.class,
				"ContinuousProcessingRateDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingRateDegreeEClass, ProcessingRateDegree.class, "ProcessingRateDegree", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingResourceDegreeEClass, ProcessingResourceDegree.class, "ProcessingResourceDegree",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingResourceDegree_Processingresourcetype(),
				theResourcetypePackage.getProcessingResourceType(), null, "processingresourcetype", null, 1, 1,
				ProcessingResourceDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(discreteComponentParamDegreeEClass, DiscreteComponentParamDegree.class,
				"DiscreteComponentParamDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discreteProcessingRateDegreeEClass, DiscreteProcessingRateDegree.class,
				"DiscreteProcessingRateDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureConfigDegreeEClass, FeatureConfigDegree.class, "FeatureConfigDegree", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureGroupDegreeEClass, FeatureGroupDegree.class, "FeatureGroupDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureGroupDegree_Featuregroup(), thefeaturemodelPackage.getFeatureGroup(), null,
				"featuregroup", null, 1, 1, FeatureGroupDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupDegree_DomainOfFeatureConfigCombinations(), this.getFeatureSubset(), null,
				"domainOfFeatureConfigCombinations", null, 1, -1, FeatureGroupDegree.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureSubsetEClass, FeatureSubset.class, "FeatureSubset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureSubset_Feature(), thefeaturemodelPackage.getFeature(), null, "feature", null, 0, -1,
				FeatureSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numberOfCoresAsListDegreeEClass, NumberOfCoresAsListDegree.class, "NumberOfCoresAsListDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberOfCoresDegreeEClass, NumberOfCoresDegree.class, "NumberOfCoresDegree", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberOfCoresAsRangeDegreeEClass, NumberOfCoresAsRangeDegree.class, "NumberOfCoresAsRangeDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionalFeatureDegreeEClass, OptionalFeatureDegree.class, "OptionalFeatureDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionalFeatureDegree_Simple(), thefeaturemodelPackage.getSimple(), null, "simple", null, 1,
				1, OptionalFeatureDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceContainerReplicationDegreeEClass, ResourceContainerReplicationDegree.class,
				"ResourceContainerReplicationDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceContainerReplicationDegreeWithComponentChangeEClass,
				ResourceContainerReplicationDegreeWithComponentChange.class,
				"ResourceContainerReplicationDegreeWithComponentChange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule(),
				this.getExchangeComponentRule(), null, "exchangeComponentRule", null, 0, -1,
				ResourceContainerReplicationDegreeWithComponentChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceSelectionDegreeEClass, ResourceSelectionDegree.class, "ResourceSelectionDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schedulingPolicyDegreeEClass, SchedulingPolicyDegree.class, "SchedulingPolicyDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringComponentParamDegreeEClass, StringComponentParamDegree.class, "StringComponentParamDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationDegreeEClass, AllocationDegree.class, "AllocationDegree", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(assembledComponentDegreeEClass, AssembledComponentDegree.class, "AssembledComponentDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capacityDegreeEClass, CapacityDegree.class, "CapacityDegree", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(monitoringDegreeEClass, MonitoringDegree.class, "MonitoringDegree", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(atNumberOfReplicaDegreeEClass, ATNumberOfReplicaDegree.class, "ATNumberOfReplicaDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureCompletionDegreeEClass, FeatureCompletionDegree.class, "FeatureCompletionDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureDegreeEClass, FeatureDegree.class, "FeatureDegree", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(indicatorDegreeEClass, IndicatorDegree.class, "IndicatorDegree", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleInclusionDegreeEClass, MultipleInclusionDegree.class, "MultipleInclusionDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(advicePlacementDegreeEClass, AdvicePlacementDegree.class, "AdvicePlacementDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complementumVisnetisDegreeEClass, ComplementumVisnetisDegree.class, "ComplementumVisnetisDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetGroupSizeMaxConstraintDegreeEClass, TargetGroupSizeMaxConstraintDegree.class,
				"TargetGroupSizeMaxConstraintDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepAdjustmentDegreeEClass, StepAdjustmentDegree.class, "StepAdjustmentDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedCPUUtilizationDegreeEClass, ExpectedCPUUtilizationDegree.class,
				"ExpectedCPUUtilizationDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedMemoryUtilizationDegreeEClass, ExpectedMemoryUtilizationDegree.class,
				"ExpectedMemoryUtilizationDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedHDDUtilizationDegreeEClass, ExpectedHDDUtilizationDegree.class,
				"ExpectedHDDUtilizationDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedNetworkUtilizationDegreeEClass, ExpectedNetworkUtilizationDegree.class,
				"ExpectedNetworkUtilizationDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedSimulationTimeDegreeEClass, ExpectedSimulationTimeDegree.class,
				"ExpectedSimulationTimeDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedOperationResponseTimeDegreeEClass, ExpectedOperationResponseTimeDegree.class,
				"ExpectedOperationResponseTimeDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedNumberOfElementsDegreeEClass, ExpectedNumberOfElementsDegree.class,
				"ExpectedNumberOfElementsDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedQueueLengthDegreeEClass, ExpectedQueueLengthDegree.class, "ExpectedQueueLengthDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedTaskCountDegreeEClass, ExpectedTaskCountDegree.class, "ExpectedTaskCountDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cooldownTimeConstraintDegreeEClass, CooldownTimeConstraintDegree.class,
				"CooldownTimeConstraintDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cooldownMaxScalingOperationsConstraintDegreeEClass,
				CooldownMaxScalingOperationsConstraintDegree.class, "CooldownMaxScalingOperationsConstraintDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(absoluteAdjustmentDegreeEClass, AbsoluteAdjustmentDegree.class, "AbsoluteAdjustmentDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relativeAdjustmentDegreeEClass, RelativeAdjustmentDegree.class, "RelativeAdjustmentDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalDurationConstraintDegreeEClass, IntervalDurationConstraintDegree.class,
				"IntervalDurationConstraintDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalOffsetConstraintDegreeEClass, IntervalOffsetConstraintDegree.class,
				"IntervalOffsetConstraintDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thrashingConstraintDegreeEClass, ThrashingConstraintDegree.class, "ThrashingConstraintDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetGroupSizeMinConstraintDegreeEClass, TargetGroupSizeMinConstraintDegree.class,
				"TargetGroupSizeMinConstraintDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} // specificPackageImpl
