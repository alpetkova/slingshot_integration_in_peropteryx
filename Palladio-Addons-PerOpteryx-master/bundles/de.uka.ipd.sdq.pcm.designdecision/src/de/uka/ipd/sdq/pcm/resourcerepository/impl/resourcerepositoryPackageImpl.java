/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourcerepository.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorPackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.impl.gdofPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryFactory;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.util.resourcerepositoryValidator;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class resourcerepositoryPackageImpl extends EPackageImpl implements resourcerepositoryPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDescriptionRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDescriptionEClass = null;

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
	 * @see de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private resourcerepositoryPackageImpl() {
		super(eNS_URI, resourcerepositoryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link resourcerepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static resourcerepositoryPackage init() {
		if (isInited)
			return (resourcerepositoryPackage) EPackage.Registry.INSTANCE
					.getEPackage(resourcerepositoryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredresourcerepositoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		resourcerepositoryPackageImpl theresourcerepositoryPackage = registeredresourcerepositoryPackage instanceof resourcerepositoryPackageImpl
				? (resourcerepositoryPackageImpl) registeredresourcerepositoryPackage
				: new resourcerepositoryPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI);
		specificPackageImpl thespecificPackage = (specificPackageImpl) (registeredPackage instanceof specificPackageImpl
				? registeredPackage
				: specificPackage.eINSTANCE);

		// Create package meta-data objects
		theresourcerepositoryPackage.createPackageContents();
		thedesigndecisionPackage.createPackageContents();
		thegdofPackage.createPackageContents();
		thequalitypropertiesPackage.createPackageContents();
		thespecificPackage.createPackageContents();

		// Initialize created meta-data
		theresourcerepositoryPackage.initializePackageContents();
		thedesigndecisionPackage.initializePackageContents();
		thegdofPackage.initializePackageContents();
		thequalitypropertiesPackage.initializePackageContents();
		thespecificPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theresourcerepositoryPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return resourcerepositoryValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theresourcerepositoryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(resourcerepositoryPackage.eNS_URI, theresourcerepositoryPackage);
		return theresourcerepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceDescriptionRepository() {
		return resourceDescriptionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceDescriptionRepository_AvailableProcessingResources_ResourceRepository() {
		return (EReference) resourceDescriptionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceDescription() {
		return resourceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceDescription_FixedProcessingResourceCost_ResourceDescription() {
		return (EReference) resourceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceDescription_ProcessingResourceSpecification_ResourceDescription() {
		return (EReference) resourceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceDescription_ResourcesCanBeUsedIndividually() {
		return (EAttribute) resourceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public resourcerepositoryFactory getresourcerepositoryFactory() {
		return (resourcerepositoryFactory) getEFactoryInstance();
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
		resourceDescriptionRepositoryEClass = createEClass(RESOURCE_DESCRIPTION_REPOSITORY);
		createEReference(resourceDescriptionRepositoryEClass,
				RESOURCE_DESCRIPTION_REPOSITORY__AVAILABLE_PROCESSING_RESOURCES_RESOURCE_REPOSITORY);

		resourceDescriptionEClass = createEClass(RESOURCE_DESCRIPTION);
		createEReference(resourceDescriptionEClass,
				RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION);
		createEReference(resourceDescriptionEClass,
				RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION);
		createEAttribute(resourceDescriptionEClass, RESOURCE_DESCRIPTION__RESOURCES_CAN_BE_USED_INDIVIDUALLY);
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
		costPackage thecostPackage = (costPackage) EPackage.Registry.INSTANCE.getEPackage(costPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage) EPackage.Registry.INSTANCE
				.getEPackage(ResourceenvironmentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(resourceDescriptionRepositoryEClass, ResourceDescriptionRepository.class,
				"ResourceDescriptionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceDescriptionRepository_AvailableProcessingResources_ResourceRepository(),
				this.getResourceDescription(), null, "availableProcessingResources_ResourceRepository", null, 0, -1,
				ResourceDescriptionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceDescriptionEClass, ResourceDescription.class, "ResourceDescription", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceDescription_FixedProcessingResourceCost_ResourceDescription(),
				thecostPackage.getFixedProcessingResourceCost(), null,
				"fixedProcessingResourceCost_ResourceDescription", null, 1, 1, ResourceDescription.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getResourceDescription_ProcessingResourceSpecification_ResourceDescription(),
				theResourceenvironmentPackage.getResourceContainer(), null,
				"processingResourceSpecification_ResourceDescription", null, 1, 1, ResourceDescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceDescription_ResourcesCanBeUsedIndividually(), ecorePackage.getEInt(),
				"ResourcesCanBeUsedIndividually", null, 1, 1, ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(resourceDescriptionEClass, ecorePackage.getEBoolean(), "CostAndResourceMustMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} // resourcerepositoryPackageImpl
