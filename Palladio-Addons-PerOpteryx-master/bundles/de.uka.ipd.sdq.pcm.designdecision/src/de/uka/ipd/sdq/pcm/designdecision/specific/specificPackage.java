/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory
 * @model kind="package"
 * @generated
 */
public interface specificPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "specific";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/DesignDecision/Specific/3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "specific";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	specificPackage eINSTANCE = de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExchangeComponentRuleImpl <em>Exchange Component Rule</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExchangeComponentRuleImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExchangeComponentRule()
	 * @generated
	 */
	int EXCHANGE_COMPONENT_RULE = 0;

	/**
	 * The feature id for the '<em><b>Repository Component</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Exchange Component Rule</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_COMPONENT_RULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassDegreeImpl <em>Class Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getClassDegree()
	 * @generated
	 */
	int CLASS_DEGREE = 2;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEGREE__ENTITY_NAME = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEGREE__PRIMARY_CHANGED = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEGREE__DOF = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLASS_DEGREE__CHANGEABLE_ELEMENTS = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEGREE__DECORATOR_MODEL = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLASS_DEGREE__CLASS_DESIGN_OPTIONS = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Degree</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEGREE_FEATURE_COUNT = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassAsReferenceDegreeImpl <em>Class As Reference Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassAsReferenceDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getClassAsReferenceDegree()
	 * @generated
	 */
	int CLASS_AS_REFERENCE_DEGREE = 1;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AS_REFERENCE_DEGREE__ENTITY_NAME = CLASS_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED = CLASS_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AS_REFERENCE_DEGREE__DOF = CLASS_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS = CLASS_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AS_REFERENCE_DEGREE__DECORATOR_MODEL = CLASS_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS = CLASS_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>Class As Reference Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT = CLASS_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassWithCopyDegreeImpl <em>Class With Copy Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassWithCopyDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getClassWithCopyDegree()
	 * @generated
	 */
	int CLASS_WITH_COPY_DEGREE = 3;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_COPY_DEGREE__ENTITY_NAME = CLASS_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_COPY_DEGREE__PRIMARY_CHANGED = CLASS_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_COPY_DEGREE__DOF = CLASS_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_COPY_DEGREE__CHANGEABLE_ELEMENTS = CLASS_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_COPY_DEGREE__DECORATOR_MODEL = CLASS_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_COPY_DEGREE__CLASS_DESIGN_OPTIONS = CLASS_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>Class With Copy Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_COPY_DEGREE_FEATURE_COUNT = CLASS_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DataTypeDegreeImpl <em>Data Type Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DataTypeDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDataTypeDegree()
	 * @generated
	 */
	int DATA_TYPE_DEGREE = 6;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEGREE__ENTITY_NAME = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEGREE__PRIMARY_CHANGED = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEGREE__DOF = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEGREE__DECORATOR_MODEL = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL;

	/**
	 * The number of structural features of the '<em>Data Type Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEGREE_FEATURE_COUNT = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.RangeDegreeImpl <em>Range Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.RangeDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getRangeDegree()
	 * @generated
	 */
	int RANGE_DEGREE = 5;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousRangeDegreeImpl <em>Continuous Range Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousRangeDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getContinuousRangeDegree()
	 * @generated
	 */
	int CONTINUOUS_RANGE_DEGREE = 4;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteDegreeImpl <em>Discrete Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteDegree()
	 * @generated
	 */
	int DISCRETE_DEGREE = 7;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteRangeDegreeImpl <em>Discrete Range Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteRangeDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteRangeDegree()
	 * @generated
	 */
	int DISCRETE_RANGE_DEGREE = 8;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedDegreeImpl <em>Unordered Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getUnorderedDegree()
	 * @generated
	 */
	int UNORDERED_DEGREE = 10;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.EnumDegreeImpl <em>Enum Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.EnumDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getEnumDegree()
	 * @generated
	 */
	int ENUM_DEGREE = 9;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OrderedDataTypeDegreeImpl <em>Ordered Data Type Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.OrderedDataTypeDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getOrderedDataTypeDegree()
	 * @generated
	 */
	int ORDERED_DATA_TYPE_DEGREE = 11;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_DATA_TYPE_DEGREE__ENTITY_NAME = DATA_TYPE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_DATA_TYPE_DEGREE__PRIMARY_CHANGED = DATA_TYPE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_DATA_TYPE_DEGREE__DOF = DATA_TYPE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDERED_DATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS = DATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_DATA_TYPE_DEGREE__DECORATOR_MODEL = DATA_TYPE_DEGREE__DECORATOR_MODEL;

	/**
	 * The number of structural features of the '<em>Ordered Data Type Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDERED_DATA_TYPE_DEGREE_FEATURE_COUNT = DATA_TYPE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_DEGREE__ENTITY_NAME = ORDERED_DATA_TYPE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_DEGREE__PRIMARY_CHANGED = ORDERED_DATA_TYPE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_DEGREE__DOF = ORDERED_DATA_TYPE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGE_DEGREE__CHANGEABLE_ELEMENTS = ORDERED_DATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_DEGREE__DECORATOR_MODEL = ORDERED_DATA_TYPE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_DEGREE__UPPER_BOUND_INCLUDED = ORDERED_DATA_TYPE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_DEGREE__LOWER_BOUND_INCLUDED = ORDERED_DATA_TYPE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_DEGREE__NUMBER_OF_STEPS = ORDERED_DATA_TYPE_DEGREE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range Degree</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_DEGREE_FEATURE_COUNT = ORDERED_DATA_TYPE_DEGREE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE__ENTITY_NAME = RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED = RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE__DOF = RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS = RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL = RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED = RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED = RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS = RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE__TO = RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE__FROM = RANGE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Continuous Range Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT = RANGE_DEGREE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DEGREE__ENTITY_NAME = DATA_TYPE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DEGREE__PRIMARY_CHANGED = DATA_TYPE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DEGREE__DOF = DATA_TYPE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DEGREE__CHANGEABLE_ELEMENTS = DATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DEGREE__DECORATOR_MODEL = DATA_TYPE_DEGREE__DECORATOR_MODEL;

	/**
	 * The number of structural features of the '<em>Discrete Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DEGREE_FEATURE_COUNT = DATA_TYPE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE__ENTITY_NAME = RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED = RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE__DOF = RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS = RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE__DECORATOR_MODEL = RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED = RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED = RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS = RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE__TO = RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE__FROM = RANGE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discrete Range Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_DEGREE_FEATURE_COUNT = RANGE_DEGREE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_DEGREE__ENTITY_NAME = DATA_TYPE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_DEGREE__PRIMARY_CHANGED = DATA_TYPE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_DEGREE__DOF = DATA_TYPE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNORDERED_DEGREE__CHANGEABLE_ELEMENTS = DATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_DEGREE__DECORATOR_MODEL = DATA_TYPE_DEGREE__DECORATOR_MODEL;

	/**
	 * The number of structural features of the '<em>Unordered Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNORDERED_DEGREE_FEATURE_COUNT = DATA_TYPE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEGREE__ENTITY_NAME = UNORDERED_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEGREE__PRIMARY_CHANGED = UNORDERED_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEGREE__DOF = UNORDERED_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUM_DEGREE__CHANGEABLE_ELEMENTS = UNORDERED_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEGREE__DECORATOR_MODEL = UNORDERED_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEGREE__ENUMERATION = UNORDERED_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Degree</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEGREE_FEATURE_COUNT = UNORDERED_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OrderedIntegerDegreeImpl <em>Ordered Integer Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.OrderedIntegerDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getOrderedIntegerDegree()
	 * @generated
	 */
	int ORDERED_INTEGER_DEGREE = 12;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_INTEGER_DEGREE__ENTITY_NAME = DISCRETE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_INTEGER_DEGREE__PRIMARY_CHANGED = DISCRETE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_INTEGER_DEGREE__DOF = DISCRETE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDERED_INTEGER_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_INTEGER_DEGREE__DECORATOR_MODEL = DISCRETE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>List Of Integers</b></em>' attribute list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS = DISCRETE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordered Integer Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDERED_INTEGER_DEGREE_FEATURE_COUNT = DISCRETE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringSetDegreeImpl <em>String Set Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringSetDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getStringSetDegree()
	 * @generated
	 */
	int STRING_SET_DEGREE = 13;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_DEGREE__ENTITY_NAME = UNORDERED_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_DEGREE__PRIMARY_CHANGED = UNORDERED_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_DEGREE__DOF = UNORDERED_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_SET_DEGREE__CHANGEABLE_ELEMENTS = UNORDERED_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_DEGREE__DECORATOR_MODEL = UNORDERED_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>String Values</b></em>' attribute list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_DEGREE__STRING_VALUES = UNORDERED_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Set Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_SET_DEGREE_FEATURE_COUNT = UNORDERED_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedPrimitiveDegreeImpl <em>Unordered Primitive Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedPrimitiveDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getUnorderedPrimitiveDegree()
	 * @generated
	 */
	int UNORDERED_PRIMITIVE_DEGREE = 14;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__ENTITY_NAME = UNORDERED_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__PRIMARY_CHANGED = UNORDERED_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__DOF = UNORDERED_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__CHANGEABLE_ELEMENTS = UNORDERED_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__DECORATOR_MODEL = UNORDERED_DEGREE__DECORATOR_MODEL;

	/**
	 * The number of structural features of the '<em>Unordered Primitive Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE_FEATURE_COUNT = UNORDERED_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousComponentParamDegreeImpl
	 * <em>Continuous Component Param Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousComponentParamDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getContinuousComponentParamDegree()
	 * @generated
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE = 15;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Continuous Component Param Degree</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousProcessingRateDegreeImpl
	 * <em>Continuous Processing Rate Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousProcessingRateDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getContinuousProcessingRateDegree()
	 * @generated
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE = 16;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continuous Processing Rate Degree</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingResourceDegreeImpl <em>Processing Resource Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingResourceDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getProcessingResourceDegree()
	 * @generated
	 */
	int PROCESSING_RESOURCE_DEGREE = 18;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__ENTITY_NAME = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__PRIMARY_CHANGED = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__DOF = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__CHANGEABLE_ELEMENTS = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__DECORATOR_MODEL = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Processing Resource Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE_FEATURE_COUNT = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingRateDegreeImpl <em>Processing Rate Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingRateDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getProcessingRateDegree()
	 * @generated
	 */
	int PROCESSING_RATE_DEGREE = 17;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__ENTITY_NAME = PROCESSING_RESOURCE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__PRIMARY_CHANGED = PROCESSING_RESOURCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__DOF = PROCESSING_RESOURCE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__CHANGEABLE_ELEMENTS = PROCESSING_RESOURCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__DECORATOR_MODEL = PROCESSING_RESOURCE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE = PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE;

	/**
	 * The number of structural features of the '<em>Processing Rate Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE_FEATURE_COUNT = PROCESSING_RESOURCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteComponentParamDegreeImpl
	 * <em>Discrete Component Param Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteComponentParamDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteComponentParamDegree()
	 * @generated
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE = 19;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Discrete Component Param Degree</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteProcessingRateDegreeImpl
	 * <em>Discrete Processing Rate Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteProcessingRateDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteProcessingRateDegree()
	 * @generated
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE = 20;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Processing Rate Degree</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureConfigDegreeImpl <em>Feature Config Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureConfigDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureConfigDegree()
	 * @generated
	 */
	int FEATURE_CONFIG_DEGREE = 21;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__ENTITY_NAME = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__PRIMARY_CHANGED = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__DOF = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__CHANGEABLE_ELEMENTS = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__DECORATOR_MODEL = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL;

	/**
	 * The number of structural features of the '<em>Feature Config Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE_FEATURE_COUNT = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl <em>Feature Group Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureGroupDegree()
	 * @generated
	 */
	int FEATURE_GROUP_DEGREE = 22;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__ENTITY_NAME = FEATURE_CONFIG_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__PRIMARY_CHANGED = FEATURE_CONFIG_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__DOF = FEATURE_CONFIG_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__CHANGEABLE_ELEMENTS = FEATURE_CONFIG_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__DECORATOR_MODEL = FEATURE_CONFIG_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Featuregroup</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__FEATUREGROUP = FEATURE_CONFIG_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Of Feature Config Combinations</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS = FEATURE_CONFIG_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Group Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE_FEATURE_COUNT = FEATURE_CONFIG_DEGREE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureSubsetImpl <em>Feature Subset</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureSubsetImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureSubset()
	 * @generated
	 */
	int FEATURE_SUBSET = 23;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUBSET__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Feature Subset</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUBSET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresDegreeImpl <em>Number Of Cores Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresDegree()
	 * @generated
	 */
	int NUMBER_OF_CORES_DEGREE = 25;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__ENTITY_NAME = PROCESSING_RESOURCE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__PRIMARY_CHANGED = PROCESSING_RESOURCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__DOF = PROCESSING_RESOURCE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__CHANGEABLE_ELEMENTS = PROCESSING_RESOURCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__DECORATOR_MODEL = PROCESSING_RESOURCE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__PROCESSINGRESOURCETYPE = PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE;

	/**
	 * The number of structural features of the '<em>Number Of Cores Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE_FEATURE_COUNT = PROCESSING_RESOURCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsListDegreeImpl
	 * <em>Number Of Cores As List Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsListDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresAsListDegree()
	 * @generated
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE = 24;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__ENTITY_NAME = NUMBER_OF_CORES_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__PRIMARY_CHANGED = NUMBER_OF_CORES_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__DOF = NUMBER_OF_CORES_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__CHANGEABLE_ELEMENTS = NUMBER_OF_CORES_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__DECORATOR_MODEL = NUMBER_OF_CORES_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__PROCESSINGRESOURCETYPE = NUMBER_OF_CORES_DEGREE__PROCESSINGRESOURCETYPE;

	/**
	 * The feature id for the '<em><b>List Of Integers</b></em>' attribute list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__LIST_OF_INTEGERS = NUMBER_OF_CORES_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Of Cores As List Degree</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE_FEATURE_COUNT = NUMBER_OF_CORES_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsRangeDegreeImpl
	 * <em>Number Of Cores As Range Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsRangeDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresAsRangeDegree()
	 * @generated
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE = 26;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__PROCESSINGRESOURCETYPE = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Of Cores As Range Degree</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OptionalFeatureDegreeImpl <em>Optional Feature Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.OptionalFeatureDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getOptionalFeatureDegree()
	 * @generated
	 */
	int OPTIONAL_FEATURE_DEGREE = 27;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__ENTITY_NAME = FEATURE_CONFIG_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__PRIMARY_CHANGED = FEATURE_CONFIG_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__DOF = FEATURE_CONFIG_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__CHANGEABLE_ELEMENTS = FEATURE_CONFIG_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__DECORATOR_MODEL = FEATURE_CONFIG_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__SIMPLE = FEATURE_CONFIG_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optional Feature Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE_FEATURE_COUNT = FEATURE_CONFIG_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeImpl <em>Resource Container Replication Degree</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceContainerReplicationDegree()
	 * @generated
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE = 28;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Resource Container Replication Degree</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeWithComponentChangeImpl
	 * <em>Resource Container Replication Degree With Component Change</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeWithComponentChangeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceContainerReplicationDegreeWithComponentChange()
	 * @generated
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE = 29;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__ENTITY_NAME = RESOURCE_CONTAINER_REPLICATION_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__PRIMARY_CHANGED = RESOURCE_CONTAINER_REPLICATION_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__DOF = RESOURCE_CONTAINER_REPLICATION_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__CHANGEABLE_ELEMENTS = RESOURCE_CONTAINER_REPLICATION_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__DECORATOR_MODEL = RESOURCE_CONTAINER_REPLICATION_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__UPPER_BOUND_INCLUDED = RESOURCE_CONTAINER_REPLICATION_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__LOWER_BOUND_INCLUDED = RESOURCE_CONTAINER_REPLICATION_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__NUMBER_OF_STEPS = RESOURCE_CONTAINER_REPLICATION_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__TO = RESOURCE_CONTAINER_REPLICATION_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__FROM = RESOURCE_CONTAINER_REPLICATION_DEGREE__FROM;

	/**
	 * The feature id for the '<em><b>Exchange Component Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__EXCHANGE_COMPONENT_RULE = RESOURCE_CONTAINER_REPLICATION_DEGREE_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '
	 * <em>Resource Container Replication Degree With Component Change</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE_FEATURE_COUNT = RESOURCE_CONTAINER_REPLICATION_DEGREE_FEATURE_COUNT
			+ 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceSelectionDegreeImpl <em>Resource Selection Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceSelectionDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceSelectionDegree()
	 * @generated
	 */
	int RESOURCE_SELECTION_DEGREE = 30;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__ENTITY_NAME = CLASS_WITH_COPY_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__PRIMARY_CHANGED = CLASS_WITH_COPY_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__DOF = CLASS_WITH_COPY_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__CHANGEABLE_ELEMENTS = CLASS_WITH_COPY_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__DECORATOR_MODEL = CLASS_WITH_COPY_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__CLASS_DESIGN_OPTIONS = CLASS_WITH_COPY_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__PROCESSINGRESOURCETYPE = CLASS_WITH_COPY_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Selection Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE_FEATURE_COUNT = CLASS_WITH_COPY_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.SchedulingPolicyDegreeImpl <em>Scheduling Policy Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.SchedulingPolicyDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getSchedulingPolicyDegree()
	 * @generated
	 */
	int SCHEDULING_POLICY_DEGREE = 31;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__ENTITY_NAME = CLASS_AS_REFERENCE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__PRIMARY_CHANGED = CLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__DOF = CLASS_AS_REFERENCE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__CHANGEABLE_ELEMENTS = CLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__DECORATOR_MODEL = CLASS_AS_REFERENCE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__CLASS_DESIGN_OPTIONS = CLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE = CLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduling Policy Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE_FEATURE_COUNT = CLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringComponentParamDegreeImpl <em>String Component Param Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringComponentParamDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getStringComponentParamDegree()
	 * @generated
	 */
	int STRING_COMPONENT_PARAM_DEGREE = 32;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__ENTITY_NAME = STRING_SET_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__PRIMARY_CHANGED = STRING_SET_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__DOF = STRING_SET_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__CHANGEABLE_ELEMENTS = STRING_SET_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__DECORATOR_MODEL = STRING_SET_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>String Values</b></em>' attribute list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__STRING_VALUES = STRING_SET_DEGREE__STRING_VALUES;

	/**
	 * The number of structural features of the '<em>String Component Param Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE_FEATURE_COUNT = STRING_SET_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl <em>Allocation Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAllocationDegree()
	 * @generated
	 */
	int ALLOCATION_DEGREE = 33;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__ENTITY_NAME = CLASS_AS_REFERENCE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__PRIMARY_CHANGED = CLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__DOF = CLASS_AS_REFERENCE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__CHANGEABLE_ELEMENTS = CLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__DECORATOR_MODEL = CLASS_AS_REFERENCE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__CLASS_DESIGN_OPTIONS = CLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>Allocation Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE_FEATURE_COUNT = CLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AssembledComponentDegreeImpl <em>Assembled Component Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AssembledComponentDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAssembledComponentDegree()
	 * @generated
	 */
	int ASSEMBLED_COMPONENT_DEGREE = 34;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__ENTITY_NAME = CLASS_AS_REFERENCE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__PRIMARY_CHANGED = CLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__DOF = CLASS_AS_REFERENCE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__CHANGEABLE_ELEMENTS = CLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__DECORATOR_MODEL = CLASS_AS_REFERENCE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__CLASS_DESIGN_OPTIONS = CLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>Assembled Component Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE_FEATURE_COUNT = CLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.CapacityDegreeImpl <em>Capacity Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.CapacityDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getCapacityDegree()
	 * @generated
	 */
	int CAPACITY_DEGREE = 35;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Capacity Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.MonitoringDegreeImpl <em>Monitoring Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.MonitoringDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getMonitoringDegree()
	 * @generated
	 */
	int MONITORING_DEGREE = 36;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Monitoring Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ATNumberOfReplicaDegreeImpl <em>AT Number Of Replica Degree</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ATNumberOfReplicaDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getATNumberOfReplicaDegree()
	 * @generated
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE = 37;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>AT Number Of Replica Degree</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AT_NUMBER_OF_REPLICA_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureCompletionDegreeImpl <em>Feature Completion Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureCompletionDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureCompletionDegree()
	 * @generated
	 */
	int FEATURE_COMPLETION_DEGREE = 38;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION_DEGREE__ENTITY_NAME = CLASS_AS_REFERENCE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION_DEGREE__PRIMARY_CHANGED = CLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION_DEGREE__DOF = CLASS_AS_REFERENCE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION_DEGREE__CHANGEABLE_ELEMENTS = CLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION_DEGREE__DECORATOR_MODEL = CLASS_AS_REFERENCE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION_DEGREE__CLASS_DESIGN_OPTIONS = CLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>Feature Completion Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION_DEGREE_FEATURE_COUNT = CLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureDegreeImpl <em>Feature Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureDegree()
	 * @generated
	 */
	int FEATURE_DEGREE = 39;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEGREE__ENTITY_NAME = CLASS_AS_REFERENCE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEGREE__PRIMARY_CHANGED = CLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEGREE__DOF = CLASS_AS_REFERENCE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEGREE__CHANGEABLE_ELEMENTS = CLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEGREE__DECORATOR_MODEL = CLASS_AS_REFERENCE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEGREE__CLASS_DESIGN_OPTIONS = CLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>Feature Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEGREE_FEATURE_COUNT = CLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.IndicatorDegreeImpl <em>Indicator Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.IndicatorDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getIndicatorDegree()
	 * @generated
	 */
	int INDICATOR_DEGREE = 40;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_DEGREE__ENTITY_NAME = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_DEGREE__PRIMARY_CHANGED = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_DEGREE__DOF = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_DEGREE__CHANGEABLE_ELEMENTS = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_DEGREE__DECORATOR_MODEL = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL;

	/**
	 * The number of structural features of the '<em>Indicator Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_DEGREE_FEATURE_COUNT = designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.MultipleInclusionDegreeImpl <em>Multiple Inclusion Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.MultipleInclusionDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getMultipleInclusionDegree()
	 * @generated
	 */
	int MULTIPLE_INCLUSION_DEGREE = 41;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INCLUSION_DEGREE__ENTITY_NAME = INDICATOR_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INCLUSION_DEGREE__PRIMARY_CHANGED = INDICATOR_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INCLUSION_DEGREE__DOF = INDICATOR_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INCLUSION_DEGREE__CHANGEABLE_ELEMENTS = INDICATOR_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INCLUSION_DEGREE__DECORATOR_MODEL = INDICATOR_DEGREE__DECORATOR_MODEL;

	/**
	 * The number of structural features of the '<em>Multiple Inclusion Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INCLUSION_DEGREE_FEATURE_COUNT = INDICATOR_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AdvicePlacementDegreeImpl <em>Advice Placement Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AdvicePlacementDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAdvicePlacementDegree()
	 * @generated
	 */
	int ADVICE_PLACEMENT_DEGREE = 42;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_PLACEMENT_DEGREE__ENTITY_NAME = INDICATOR_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_PLACEMENT_DEGREE__PRIMARY_CHANGED = INDICATOR_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_PLACEMENT_DEGREE__DOF = INDICATOR_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_PLACEMENT_DEGREE__CHANGEABLE_ELEMENTS = INDICATOR_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_PLACEMENT_DEGREE__DECORATOR_MODEL = INDICATOR_DEGREE__DECORATOR_MODEL;

	/**
	 * The number of structural features of the '<em>Advice Placement Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_PLACEMENT_DEGREE_FEATURE_COUNT = INDICATOR_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ComplementumVisnetisDegreeImpl <em>Complementum Visnetis Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ComplementumVisnetisDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getComplementumVisnetisDegree()
	 * @generated
	 */
	int COMPLEMENTUM_VISNETIS_DEGREE = 43;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS_DEGREE__ENTITY_NAME = CLASS_AS_REFERENCE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS_DEGREE__PRIMARY_CHANGED = CLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS_DEGREE__DOF = CLASS_AS_REFERENCE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS_DEGREE__CHANGEABLE_ELEMENTS = CLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS_DEGREE__DECORATOR_MODEL = CLASS_AS_REFERENCE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS_DEGREE__CLASS_DESIGN_OPTIONS = CLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>Complementum Visnetis Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS_DEGREE_FEATURE_COUNT = CLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.TargetGroupSizeMaxConstraintDegreeImpl <em>Target Group Size Max Constraint Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.TargetGroupSizeMaxConstraintDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getTargetGroupSizeMaxConstraintDegree()
	 * @generated
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE = 44;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Target Group Size Max Constraint Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.StepAdjustmentDegreeImpl <em>Step Adjustment Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.StepAdjustmentDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getStepAdjustmentDegree()
	 * @generated
	 */
	int STEP_ADJUSTMENT_DEGREE = 45;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Step Adjustment Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedCPUUtilizationDegreeImpl <em>Expected CPU Utilization Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedCPUUtilizationDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedCPUUtilizationDegree()
	 * @generated
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE = 46;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Expected CPU Utilization Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_CPU_UTILIZATION_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedMemoryUtilizationDegreeImpl <em>Expected Memory Utilization Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedMemoryUtilizationDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedMemoryUtilizationDegree()
	 * @generated
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE = 47;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Expected Memory Utilization Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_MEMORY_UTILIZATION_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedHDDUtilizationDegreeImpl <em>Expected HDD Utilization Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedHDDUtilizationDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedHDDUtilizationDegree()
	 * @generated
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE = 48;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Expected HDD Utilization Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_HDD_UTILIZATION_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedNetworkUtilizationDegreeImpl <em>Expected Network Utilization Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedNetworkUtilizationDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedNetworkUtilizationDegree()
	 * @generated
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE = 49;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Expected Network Utilization Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NETWORK_UTILIZATION_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedSimulationTimeDegreeImpl <em>Expected Simulation Time Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedSimulationTimeDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedSimulationTimeDegree()
	 * @generated
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE = 50;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Expected Simulation Time Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_SIMULATION_TIME_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedOperationResponseTimeDegreeImpl <em>Expected Operation Response Time Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedOperationResponseTimeDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedOperationResponseTimeDegree()
	 * @generated
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE = 51;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Expected Operation Response Time Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OPERATION_RESPONSE_TIME_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedNumberOfElementsDegreeImpl <em>Expected Number Of Elements Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedNumberOfElementsDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedNumberOfElementsDegree()
	 * @generated
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE = 52;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Expected Number Of Elements Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_NUMBER_OF_ELEMENTS_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedQueueLengthDegreeImpl <em>Expected Queue Length Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedQueueLengthDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedQueueLengthDegree()
	 * @generated
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE = 53;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Expected Queue Length Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUEUE_LENGTH_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedTaskCountDegreeImpl <em>Expected Task Count Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedTaskCountDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedTaskCountDegree()
	 * @generated
	 */
	int EXPECTED_TASK_COUNT_DEGREE = 54;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Expected Task Count Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_TASK_COUNT_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.CooldownTimeConstraintDegreeImpl <em>Cooldown Time Constraint Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.CooldownTimeConstraintDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getCooldownTimeConstraintDegree()
	 * @generated
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE = 55;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Cooldown Time Constraint Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_TIME_CONSTRAINT_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.CooldownMaxScalingOperationsConstraintDegreeImpl <em>Cooldown Max Scaling Operations Constraint Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.CooldownMaxScalingOperationsConstraintDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getCooldownMaxScalingOperationsConstraintDegree()
	 * @generated
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE = 56;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Cooldown Max Scaling Operations Constraint Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AbsoluteAdjustmentDegreeImpl <em>Absolute Adjustment Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AbsoluteAdjustmentDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAbsoluteAdjustmentDegree()
	 * @generated
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE = 57;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Absolute Adjustment Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.RelativeAdjustmentDegreeImpl <em>Relative Adjustment Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.RelativeAdjustmentDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getRelativeAdjustmentDegree()
	 * @generated
	 */
	int RELATIVE_ADJUSTMENT_DEGREE = 58;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Relative Adjustment Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.IntervalDurationConstraintDegreeImpl <em>Interval Duration Constraint Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.IntervalDurationConstraintDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getIntervalDurationConstraintDegree()
	 * @generated
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE = 59;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Interval Duration Constraint Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_DURATION_CONSTRAINT_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.IntervalOffsetConstraintDegreeImpl <em>Interval Offset Constraint Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.IntervalOffsetConstraintDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getIntervalOffsetConstraintDegree()
	 * @generated
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE = 60;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Interval Offset Constraint Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OFFSET_CONSTRAINT_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ThrashingConstraintDegreeImpl <em>Thrashing Constraint Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ThrashingConstraintDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getThrashingConstraintDegree()
	 * @generated
	 */
	int THRASHING_CONSTRAINT_DEGREE = 61;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE__ENTITY_NAME = CONTINUOUS_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE__PRIMARY_CHANGED = CONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE__DOF = CONTINUOUS_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE__CHANGEABLE_ELEMENTS = CONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE__DECORATOR_MODEL = CONTINUOUS_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE__UPPER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE__LOWER_BOUND_INCLUDED = CONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE__NUMBER_OF_STEPS = CONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE__TO = CONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE__FROM = CONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Thrashing Constraint Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_DEGREE_FEATURE_COUNT = CONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.TargetGroupSizeMinConstraintDegreeImpl <em>Target Group Size Min Constraint Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.TargetGroupSizeMinConstraintDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getTargetGroupSizeMinConstraintDegree()
	 * @generated
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE = 62;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE__ENTITY_NAME = DISCRETE_RANGE_DEGREE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE__PRIMARY_CHANGED = DISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE__DOF = DISCRETE_RANGE_DEGREE__DOF;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE__CHANGEABLE_ELEMENTS = DISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Decorator Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE__DECORATOR_MODEL = DISCRETE_RANGE_DEGREE__DECORATOR_MODEL;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE__UPPER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE__LOWER_BOUND_INCLUDED = DISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE__NUMBER_OF_STEPS = DISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE__TO = DISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE__FROM = DISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Target Group Size Min Constraint Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE_FEATURE_COUNT = DISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule <em>Exchange Component Rule</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Component Rule</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule
	 * @generated
	 */
	EClass getExchangeComponentRule();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule#getRepositoryComponent <em>Repository Component</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repository Component</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule#getRepositoryComponent()
	 * @see #getExchangeComponentRule()
	 * @generated
	 */
	EReference getExchangeComponentRule_RepositoryComponent();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Context</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule#getAllocationContext()
	 * @see #getExchangeComponentRule()
	 * @generated
	 */
	EReference getExchangeComponentRule_AllocationContext();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree <em>Class As Reference Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class As Reference Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree
	 * @generated
	 */
	EClass getClassAsReferenceDegree();

	/**
	 * Returns the meta object for class '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree <em>Class Degree</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Class Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree
	 * @generated
	 */
	EClass getClassDegree();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree#getClassDesignOptions <em>Class Design Options</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Class Design Options</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree#getClassDesignOptions()
	 * @see #getClassDegree()
	 * @generated
	 */
	EReference getClassDegree_ClassDesignOptions();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassWithCopyDegree <em>Class With Copy Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class With Copy Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ClassWithCopyDegree
	 * @generated
	 */
	EClass getClassWithCopyDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree <em>Continuous Range Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Range Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree
	 * @generated
	 */
	EClass getContinuousRangeDegree();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree#getTo <em>To</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree#getTo()
	 * @see #getContinuousRangeDegree()
	 * @generated
	 */
	EAttribute getContinuousRangeDegree_To();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree#getFrom()
	 * @see #getContinuousRangeDegree()
	 * @generated
	 */
	EAttribute getContinuousRangeDegree_From();

	/**
	 * Returns the meta object for class '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree <em>Range Degree</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Range Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree
	 * @generated
	 */
	EClass getRangeDegree();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#isUpperBoundIncluded <em>Upper Bound Included</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound Included</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#isUpperBoundIncluded()
	 * @see #getRangeDegree()
	 * @generated
	 */
	EAttribute getRangeDegree_UpperBoundIncluded();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#isLowerBoundIncluded <em>Lower Bound Included</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound Included</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#isLowerBoundIncluded()
	 * @see #getRangeDegree()
	 * @generated
	 */
	EAttribute getRangeDegree_LowerBoundIncluded();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#getNumberOfSteps <em>Number Of Steps</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Steps</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#getNumberOfSteps()
	 * @see #getRangeDegree()
	 * @generated
	 */
	EAttribute getRangeDegree_NumberOfSteps();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DataTypeDegree <em>Data Type Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DataTypeDegree
	 * @generated
	 */
	EClass getDataTypeDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree <em>Discrete Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree
	 * @generated
	 */
	EClass getDiscreteDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree <em>Discrete Range Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Range Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree
	 * @generated
	 */
	EClass getDiscreteRangeDegree();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree#getTo <em>To</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree#getTo()
	 * @see #getDiscreteRangeDegree()
	 * @generated
	 */
	EAttribute getDiscreteRangeDegree_To();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree#getFrom()
	 * @see #getDiscreteRangeDegree()
	 * @generated
	 */
	EAttribute getDiscreteRangeDegree_From();

	/**
	 * Returns the meta object for class '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree <em>Enum Degree</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Enum Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree
	 * @generated
	 */
	EClass getEnumDegree();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree#getEnumeration()
	 * @see #getEnumDegree()
	 * @generated
	 */
	EReference getEnumDegree_Enumeration();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedDegree <em>Unordered Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedDegree
	 * @generated
	 */
	EClass getUnorderedDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OrderedDataTypeDegree <em>Ordered Data Type Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Data Type Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OrderedDataTypeDegree
	 * @generated
	 */
	EClass getOrderedDataTypeDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree <em>Ordered Integer Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Integer Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree
	 * @generated
	 */
	EClass getOrderedIntegerDegree();

	/**
	 * Returns the meta object for the attribute list '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree#getListOfIntegers <em>List Of Integers</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Of Integers</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree#getListOfIntegers()
	 * @see #getOrderedIntegerDegree()
	 * @generated
	 */
	EAttribute getOrderedIntegerDegree_ListOfIntegers();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree <em>String Set Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Set Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree
	 * @generated
	 */
	EClass getStringSetDegree();

	/**
	 * Returns the meta object for the attribute list '{@link de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree#getStringValues <em>String Values</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String Values</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree#getStringValues()
	 * @see #getStringSetDegree()
	 * @generated
	 */
	EAttribute getStringSetDegree_StringValues();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree <em>Unordered Primitive Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered Primitive Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree
	 * @generated
	 */
	EClass getUnorderedPrimitiveDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree <em>Continuous Component Param Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Component Param Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree
	 * @generated
	 */
	EClass getContinuousComponentParamDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree <em>Continuous Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Processing Rate Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree
	 * @generated
	 */
	EClass getContinuousProcessingRateDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree <em>Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Rate Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree
	 * @generated
	 */
	EClass getProcessingRateDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree <em>Processing Resource Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree
	 * @generated
	 */
	EClass getProcessingResourceDegree();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree#getProcessingresourcetype <em>Processingresourcetype</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processingresourcetype</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree#getProcessingresourcetype()
	 * @see #getProcessingResourceDegree()
	 * @generated
	 */
	EReference getProcessingResourceDegree_Processingresourcetype();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree <em>Discrete Component Param Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Component Param Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree
	 * @generated
	 */
	EClass getDiscreteComponentParamDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree <em>Discrete Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Processing Rate Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree
	 * @generated
	 */
	EClass getDiscreteProcessingRateDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree <em>Feature Config Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Config Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree
	 * @generated
	 */
	EClass getFeatureConfigDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree <em>Feature Group Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree
	 * @generated
	 */
	EClass getFeatureGroupDegree();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree#getFeaturegroup <em>Featuregroup</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Featuregroup</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree#getFeaturegroup()
	 * @see #getFeatureGroupDegree()
	 * @generated
	 */
	EReference getFeatureGroupDegree_Featuregroup();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree#getDomainOfFeatureConfigCombinations
	 * <em>Domain Of Feature Config Combinations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for the containment reference list '
	 *         <em>Domain Of Feature Config Combinations</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree#getDomainOfFeatureConfigCombinations()
	 * @see #getFeatureGroupDegree()
	 * @generated
	 */
	EReference getFeatureGroupDegree_DomainOfFeatureConfigCombinations();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset <em>Feature Subset</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Subset</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset
	 * @generated
	 */
	EClass getFeatureSubset();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset#getFeature()
	 * @see #getFeatureSubset()
	 * @generated
	 */
	EReference getFeatureSubset_Feature();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree <em>Number Of Cores As List Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Cores As List Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree
	 * @generated
	 */
	EClass getNumberOfCoresAsListDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree <em>Number Of Cores Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Cores Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree
	 * @generated
	 */
	EClass getNumberOfCoresDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree <em>Number Of Cores As Range Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Cores As Range Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree
	 * @generated
	 */
	EClass getNumberOfCoresAsRangeDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree <em>Optional Feature Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Feature Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree
	 * @generated
	 */
	EClass getOptionalFeatureDegree();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree#getSimple()
	 * @see #getOptionalFeatureDegree()
	 * @generated
	 */
	EReference getOptionalFeatureDegree_Simple();

	/**
	 * Returns the meta object for class '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree
	 * <em>Resource Container Replication Degree</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Resource Container Replication Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree
	 * @generated
	 */
	EClass getResourceContainerReplicationDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange <em>Resource Container Replication Degree With Component Change</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Container Replication Degree With Component Change</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange
	 * @generated
	 */
	EClass getResourceContainerReplicationDegreeWithComponentChange();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange#getExchangeComponentRule <em>Exchange Component Rule</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Component Rule</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange#getExchangeComponentRule()
	 * @see #getResourceContainerReplicationDegreeWithComponentChange()
	 * @generated
	 */
	EReference getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree <em>Resource Selection Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Selection Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree
	 * @generated
	 */
	EClass getResourceSelectionDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree <em>Scheduling Policy Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Policy Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree
	 * @generated
	 */
	EClass getSchedulingPolicyDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree <em>String Component Param Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Component Param Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree
	 * @generated
	 */
	EClass getStringComponentParamDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree <em>Allocation Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree
	 * @generated
	 */
	EClass getAllocationDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree <em>Assembled Component Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembled Component Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree
	 * @generated
	 */
	EClass getAssembledComponentDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree <em>Capacity Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree
	 * @generated
	 */
	EClass getCapacityDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree <em>Monitoring Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree
	 * @generated
	 */
	EClass getMonitoringDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree <em>AT Number Of Replica Degree</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>AT Number Of Replica Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree
	 * @generated
	 */
	EClass getATNumberOfReplicaDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree <em>Feature Completion Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Completion Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree
	 * @generated
	 */
	EClass getFeatureCompletionDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree <em>Feature Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree
	 * @generated
	 */
	EClass getFeatureDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.IndicatorDegree <em>Indicator Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indicator Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.IndicatorDegree
	 * @generated
	 */
	EClass getIndicatorDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree <em>Multiple Inclusion Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Inclusion Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree
	 * @generated
	 */
	EClass getMultipleInclusionDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree <em>Advice Placement Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice Placement Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree
	 * @generated
	 */
	EClass getAdvicePlacementDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree <em>Complementum Visnetis Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complementum Visnetis Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree
	 * @generated
	 */
	EClass getComplementumVisnetisDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMaxConstraintDegree <em>Target Group Size Max Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group Size Max Constraint Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMaxConstraintDegree
	 * @generated
	 */
	EClass getTargetGroupSizeMaxConstraintDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.StepAdjustmentDegree <em>Step Adjustment Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Adjustment Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.StepAdjustmentDegree
	 * @generated
	 */
	EClass getStepAdjustmentDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedCPUUtilizationDegree <em>Expected CPU Utilization Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected CPU Utilization Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedCPUUtilizationDegree
	 * @generated
	 */
	EClass getExpectedCPUUtilizationDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedMemoryUtilizationDegree <em>Expected Memory Utilization Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Memory Utilization Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedMemoryUtilizationDegree
	 * @generated
	 */
	EClass getExpectedMemoryUtilizationDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedHDDUtilizationDegree <em>Expected HDD Utilization Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected HDD Utilization Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedHDDUtilizationDegree
	 * @generated
	 */
	EClass getExpectedHDDUtilizationDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNetworkUtilizationDegree <em>Expected Network Utilization Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Network Utilization Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNetworkUtilizationDegree
	 * @generated
	 */
	EClass getExpectedNetworkUtilizationDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedSimulationTimeDegree <em>Expected Simulation Time Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Simulation Time Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedSimulationTimeDegree
	 * @generated
	 */
	EClass getExpectedSimulationTimeDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedOperationResponseTimeDegree <em>Expected Operation Response Time Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Operation Response Time Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedOperationResponseTimeDegree
	 * @generated
	 */
	EClass getExpectedOperationResponseTimeDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNumberOfElementsDegree <em>Expected Number Of Elements Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Number Of Elements Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNumberOfElementsDegree
	 * @generated
	 */
	EClass getExpectedNumberOfElementsDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedQueueLengthDegree <em>Expected Queue Length Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Queue Length Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedQueueLengthDegree
	 * @generated
	 */
	EClass getExpectedQueueLengthDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedTaskCountDegree <em>Expected Task Count Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Task Count Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedTaskCountDegree
	 * @generated
	 */
	EClass getExpectedTaskCountDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.CooldownTimeConstraintDegree <em>Cooldown Time Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooldown Time Constraint Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.CooldownTimeConstraintDegree
	 * @generated
	 */
	EClass getCooldownTimeConstraintDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.CooldownMaxScalingOperationsConstraintDegree <em>Cooldown Max Scaling Operations Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooldown Max Scaling Operations Constraint Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.CooldownMaxScalingOperationsConstraintDegree
	 * @generated
	 */
	EClass getCooldownMaxScalingOperationsConstraintDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AbsoluteAdjustmentDegree <em>Absolute Adjustment Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Adjustment Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AbsoluteAdjustmentDegree
	 * @generated
	 */
	EClass getAbsoluteAdjustmentDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.RelativeAdjustmentDegree <em>Relative Adjustment Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Adjustment Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.RelativeAdjustmentDegree
	 * @generated
	 */
	EClass getRelativeAdjustmentDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.IntervalDurationConstraintDegree <em>Interval Duration Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Duration Constraint Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.IntervalDurationConstraintDegree
	 * @generated
	 */
	EClass getIntervalDurationConstraintDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.IntervalOffsetConstraintDegree <em>Interval Offset Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Offset Constraint Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.IntervalOffsetConstraintDegree
	 * @generated
	 */
	EClass getIntervalOffsetConstraintDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ThrashingConstraintDegree <em>Thrashing Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thrashing Constraint Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ThrashingConstraintDegree
	 * @generated
	 */
	EClass getThrashingConstraintDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMinConstraintDegree <em>Target Group Size Min Constraint Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group Size Min Constraint Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMinConstraintDegree
	 * @generated
	 */
	EClass getTargetGroupSizeMinConstraintDegree();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	specificFactory getspecificFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExchangeComponentRuleImpl <em>Exchange Component Rule</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExchangeComponentRuleImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExchangeComponentRule()
		 * @generated
		 */
		EClass EXCHANGE_COMPONENT_RULE = eINSTANCE.getExchangeComponentRule();

		/**
		 * The meta object literal for the '<em><b>Repository Component</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT = eINSTANCE
				.getExchangeComponentRule_RepositoryComponent();

		/**
		 * The meta object literal for the '<em><b>Allocation Context</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT = eINSTANCE.getExchangeComponentRule_AllocationContext();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassAsReferenceDegreeImpl <em>Class As Reference Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassAsReferenceDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getClassAsReferenceDegree()
		 * @generated
		 */
		EClass CLASS_AS_REFERENCE_DEGREE = eINSTANCE.getClassAsReferenceDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassDegreeImpl <em>Class Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getClassDegree()
		 * @generated
		 */
		EClass CLASS_DEGREE = eINSTANCE.getClassDegree();

		/**
		 * The meta object literal for the '<em><b>Class Design Options</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEGREE__CLASS_DESIGN_OPTIONS = eINSTANCE.getClassDegree_ClassDesignOptions();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassWithCopyDegreeImpl <em>Class With Copy Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassWithCopyDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getClassWithCopyDegree()
		 * @generated
		 */
		EClass CLASS_WITH_COPY_DEGREE = eINSTANCE.getClassWithCopyDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousRangeDegreeImpl <em>Continuous Range Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousRangeDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getContinuousRangeDegree()
		 * @generated
		 */
		EClass CONTINUOUS_RANGE_DEGREE = eINSTANCE.getContinuousRangeDegree();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONTINUOUS_RANGE_DEGREE__TO = eINSTANCE.getContinuousRangeDegree_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONTINUOUS_RANGE_DEGREE__FROM = eINSTANCE.getContinuousRangeDegree_From();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.RangeDegreeImpl <em>Range Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.RangeDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getRangeDegree()
		 * @generated
		 */
		EClass RANGE_DEGREE = eINSTANCE.getRangeDegree();

		/**
		 * The meta object literal for the '<em><b>Upper Bound Included</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_DEGREE__UPPER_BOUND_INCLUDED = eINSTANCE.getRangeDegree_UpperBoundIncluded();

		/**
		 * The meta object literal for the '<em><b>Lower Bound Included</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_DEGREE__LOWER_BOUND_INCLUDED = eINSTANCE.getRangeDegree_LowerBoundIncluded();

		/**
		 * The meta object literal for the '<em><b>Number Of Steps</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RANGE_DEGREE__NUMBER_OF_STEPS = eINSTANCE.getRangeDegree_NumberOfSteps();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DataTypeDegreeImpl <em>Data Type Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DataTypeDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDataTypeDegree()
		 * @generated
		 */
		EClass DATA_TYPE_DEGREE = eINSTANCE.getDataTypeDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteDegreeImpl <em>Discrete Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteDegree()
		 * @generated
		 */
		EClass DISCRETE_DEGREE = eINSTANCE.getDiscreteDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteRangeDegreeImpl <em>Discrete Range Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteRangeDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteRangeDegree()
		 * @generated
		 */
		EClass DISCRETE_RANGE_DEGREE = eINSTANCE.getDiscreteRangeDegree();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DISCRETE_RANGE_DEGREE__TO = eINSTANCE.getDiscreteRangeDegree_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DISCRETE_RANGE_DEGREE__FROM = eINSTANCE.getDiscreteRangeDegree_From();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.EnumDegreeImpl <em>Enum Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.EnumDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getEnumDegree()
		 * @generated
		 */
		EClass ENUM_DEGREE = eINSTANCE.getEnumDegree();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ENUM_DEGREE__ENUMERATION = eINSTANCE.getEnumDegree_Enumeration();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedDegreeImpl <em>Unordered Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getUnorderedDegree()
		 * @generated
		 */
		EClass UNORDERED_DEGREE = eINSTANCE.getUnorderedDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OrderedDataTypeDegreeImpl <em>Ordered Data Type Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.OrderedDataTypeDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getOrderedDataTypeDegree()
		 * @generated
		 */
		EClass ORDERED_DATA_TYPE_DEGREE = eINSTANCE.getOrderedDataTypeDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OrderedIntegerDegreeImpl <em>Ordered Integer Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.OrderedIntegerDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getOrderedIntegerDegree()
		 * @generated
		 */
		EClass ORDERED_INTEGER_DEGREE = eINSTANCE.getOrderedIntegerDegree();

		/**
		 * The meta object literal for the '<em><b>List Of Integers</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS = eINSTANCE.getOrderedIntegerDegree_ListOfIntegers();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringSetDegreeImpl <em>String Set Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringSetDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getStringSetDegree()
		 * @generated
		 */
		EClass STRING_SET_DEGREE = eINSTANCE.getStringSetDegree();

		/**
		 * The meta object literal for the '<em><b>String Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_SET_DEGREE__STRING_VALUES = eINSTANCE.getStringSetDegree_StringValues();

		/**
		 * The meta object literal for the '
		 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedPrimitiveDegreeImpl
		 * <em>Unordered Primitive Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedPrimitiveDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getUnorderedPrimitiveDegree()
		 * @generated
		 */
		EClass UNORDERED_PRIMITIVE_DEGREE = eINSTANCE.getUnorderedPrimitiveDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousComponentParamDegreeImpl <em>Continuous Component Param Degree</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousComponentParamDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getContinuousComponentParamDegree()
		 * @generated
		 */
		EClass CONTINUOUS_COMPONENT_PARAM_DEGREE = eINSTANCE.getContinuousComponentParamDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousProcessingRateDegreeImpl <em>Continuous Processing Rate Degree</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousProcessingRateDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getContinuousProcessingRateDegree()
		 * @generated
		 */
		EClass CONTINUOUS_PROCESSING_RATE_DEGREE = eINSTANCE.getContinuousProcessingRateDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingRateDegreeImpl <em>Processing Rate Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingRateDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getProcessingRateDegree()
		 * @generated
		 */
		EClass PROCESSING_RATE_DEGREE = eINSTANCE.getProcessingRateDegree();

		/**
		 * The meta object literal for the '
		 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingResourceDegreeImpl
		 * <em>Processing Resource Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingResourceDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getProcessingResourceDegree()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_DEGREE = eINSTANCE.getProcessingResourceDegree();

		/**
		 * The meta object literal for the '<em><b>Processingresourcetype</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE = eINSTANCE
				.getProcessingResourceDegree_Processingresourcetype();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteComponentParamDegreeImpl <em>Discrete Component Param Degree</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteComponentParamDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteComponentParamDegree()
		 * @generated
		 */
		EClass DISCRETE_COMPONENT_PARAM_DEGREE = eINSTANCE.getDiscreteComponentParamDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteProcessingRateDegreeImpl <em>Discrete Processing Rate Degree</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteProcessingRateDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteProcessingRateDegree()
		 * @generated
		 */
		EClass DISCRETE_PROCESSING_RATE_DEGREE = eINSTANCE.getDiscreteProcessingRateDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureConfigDegreeImpl <em>Feature Config Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureConfigDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureConfigDegree()
		 * @generated
		 */
		EClass FEATURE_CONFIG_DEGREE = eINSTANCE.getFeatureConfigDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl <em>Feature Group Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureGroupDegree()
		 * @generated
		 */
		EClass FEATURE_GROUP_DEGREE = eINSTANCE.getFeatureGroupDegree();

		/**
		 * The meta object literal for the '<em><b>Featuregroup</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FEATURE_GROUP_DEGREE__FEATUREGROUP = eINSTANCE.getFeatureGroupDegree_Featuregroup();

		/**
		 * The meta object literal for the '<em><b>Domain Of Feature Config Combinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS = eINSTANCE
				.getFeatureGroupDegree_DomainOfFeatureConfigCombinations();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureSubsetImpl <em>Feature Subset</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureSubsetImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureSubset()
		 * @generated
		 */
		EClass FEATURE_SUBSET = eINSTANCE.getFeatureSubset();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FEATURE_SUBSET__FEATURE = eINSTANCE.getFeatureSubset_Feature();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsListDegreeImpl <em>Number Of Cores As List Degree</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsListDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresAsListDegree()
		 * @generated
		 */
		EClass NUMBER_OF_CORES_AS_LIST_DEGREE = eINSTANCE.getNumberOfCoresAsListDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresDegreeImpl <em>Number Of Cores Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresDegree()
		 * @generated
		 */
		EClass NUMBER_OF_CORES_DEGREE = eINSTANCE.getNumberOfCoresDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsRangeDegreeImpl <em>Number Of Cores As Range Degree</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsRangeDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresAsRangeDegree()
		 * @generated
		 */
		EClass NUMBER_OF_CORES_AS_RANGE_DEGREE = eINSTANCE.getNumberOfCoresAsRangeDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OptionalFeatureDegreeImpl <em>Optional Feature Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.OptionalFeatureDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getOptionalFeatureDegree()
		 * @generated
		 */
		EClass OPTIONAL_FEATURE_DEGREE = eINSTANCE.getOptionalFeatureDegree();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference OPTIONAL_FEATURE_DEGREE__SIMPLE = eINSTANCE.getOptionalFeatureDegree_Simple();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeImpl <em>Resource Container Replication Degree</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceContainerReplicationDegree()
		 * @generated
		 */
		EClass RESOURCE_CONTAINER_REPLICATION_DEGREE = eINSTANCE.getResourceContainerReplicationDegree();

		/**
		 * The meta object literal for the '
		 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeWithComponentChangeImpl
		 * <em>Resource Container Replication Degree With Component Change</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeWithComponentChangeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceContainerReplicationDegreeWithComponentChange()
		 * @generated
		 */
		EClass RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE = eINSTANCE
				.getResourceContainerReplicationDegreeWithComponentChange();

		/**
		 * The meta object literal for the '<em><b>Exchange Component Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__EXCHANGE_COMPONENT_RULE = eINSTANCE
				.getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceSelectionDegreeImpl <em>Resource Selection Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceSelectionDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceSelectionDegree()
		 * @generated
		 */
		EClass RESOURCE_SELECTION_DEGREE = eINSTANCE.getResourceSelectionDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.SchedulingPolicyDegreeImpl <em>Scheduling Policy Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.SchedulingPolicyDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getSchedulingPolicyDegree()
		 * @generated
		 */
		EClass SCHEDULING_POLICY_DEGREE = eINSTANCE.getSchedulingPolicyDegree();

		/**
		 * The meta object literal for the '
		 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringComponentParamDegreeImpl
		 * <em>String Component Param Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringComponentParamDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getStringComponentParamDegree()
		 * @generated
		 */
		EClass STRING_COMPONENT_PARAM_DEGREE = eINSTANCE.getStringComponentParamDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl <em>Allocation Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAllocationDegree()
		 * @generated
		 */
		EClass ALLOCATION_DEGREE = eINSTANCE.getAllocationDegree();

		/**
		 * The meta object literal for the '
		 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AssembledComponentDegreeImpl
		 * <em>Assembled Component Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AssembledComponentDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAssembledComponentDegree()
		 * @generated
		 */
		EClass ASSEMBLED_COMPONENT_DEGREE = eINSTANCE.getAssembledComponentDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.CapacityDegreeImpl <em>Capacity Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.CapacityDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getCapacityDegree()
		 * @generated
		 */
		EClass CAPACITY_DEGREE = eINSTANCE.getCapacityDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.MonitoringDegreeImpl <em>Monitoring Degree</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.MonitoringDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getMonitoringDegree()
		 * @generated
		 */
		EClass MONITORING_DEGREE = eINSTANCE.getMonitoringDegree();

		/**
		 * The meta object literal for the '
		 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ATNumberOfReplicaDegreeImpl
		 * <em>AT Number Of Replica Degree</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ATNumberOfReplicaDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getATNumberOfReplicaDegree()
		 * @generated
		 */
		EClass AT_NUMBER_OF_REPLICA_DEGREE = eINSTANCE.getATNumberOfReplicaDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureCompletionDegreeImpl <em>Feature Completion Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureCompletionDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureCompletionDegree()
		 * @generated
		 */
		EClass FEATURE_COMPLETION_DEGREE = eINSTANCE.getFeatureCompletionDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureDegreeImpl <em>Feature Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureDegree()
		 * @generated
		 */
		EClass FEATURE_DEGREE = eINSTANCE.getFeatureDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.IndicatorDegreeImpl <em>Indicator Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.IndicatorDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getIndicatorDegree()
		 * @generated
		 */
		EClass INDICATOR_DEGREE = eINSTANCE.getIndicatorDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.MultipleInclusionDegreeImpl <em>Multiple Inclusion Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.MultipleInclusionDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getMultipleInclusionDegree()
		 * @generated
		 */
		EClass MULTIPLE_INCLUSION_DEGREE = eINSTANCE.getMultipleInclusionDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AdvicePlacementDegreeImpl <em>Advice Placement Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AdvicePlacementDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAdvicePlacementDegree()
		 * @generated
		 */
		EClass ADVICE_PLACEMENT_DEGREE = eINSTANCE.getAdvicePlacementDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ComplementumVisnetisDegreeImpl <em>Complementum Visnetis Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ComplementumVisnetisDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getComplementumVisnetisDegree()
		 * @generated
		 */
		EClass COMPLEMENTUM_VISNETIS_DEGREE = eINSTANCE.getComplementumVisnetisDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.TargetGroupSizeMaxConstraintDegreeImpl <em>Target Group Size Max Constraint Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.TargetGroupSizeMaxConstraintDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getTargetGroupSizeMaxConstraintDegree()
		 * @generated
		 */
		EClass TARGET_GROUP_SIZE_MAX_CONSTRAINT_DEGREE = eINSTANCE.getTargetGroupSizeMaxConstraintDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.StepAdjustmentDegreeImpl <em>Step Adjustment Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.StepAdjustmentDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getStepAdjustmentDegree()
		 * @generated
		 */
		EClass STEP_ADJUSTMENT_DEGREE = eINSTANCE.getStepAdjustmentDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedCPUUtilizationDegreeImpl <em>Expected CPU Utilization Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedCPUUtilizationDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedCPUUtilizationDegree()
		 * @generated
		 */
		EClass EXPECTED_CPU_UTILIZATION_DEGREE = eINSTANCE.getExpectedCPUUtilizationDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedMemoryUtilizationDegreeImpl <em>Expected Memory Utilization Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedMemoryUtilizationDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedMemoryUtilizationDegree()
		 * @generated
		 */
		EClass EXPECTED_MEMORY_UTILIZATION_DEGREE = eINSTANCE.getExpectedMemoryUtilizationDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedHDDUtilizationDegreeImpl <em>Expected HDD Utilization Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedHDDUtilizationDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedHDDUtilizationDegree()
		 * @generated
		 */
		EClass EXPECTED_HDD_UTILIZATION_DEGREE = eINSTANCE.getExpectedHDDUtilizationDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedNetworkUtilizationDegreeImpl <em>Expected Network Utilization Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedNetworkUtilizationDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedNetworkUtilizationDegree()
		 * @generated
		 */
		EClass EXPECTED_NETWORK_UTILIZATION_DEGREE = eINSTANCE.getExpectedNetworkUtilizationDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedSimulationTimeDegreeImpl <em>Expected Simulation Time Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedSimulationTimeDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedSimulationTimeDegree()
		 * @generated
		 */
		EClass EXPECTED_SIMULATION_TIME_DEGREE = eINSTANCE.getExpectedSimulationTimeDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedOperationResponseTimeDegreeImpl <em>Expected Operation Response Time Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedOperationResponseTimeDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedOperationResponseTimeDegree()
		 * @generated
		 */
		EClass EXPECTED_OPERATION_RESPONSE_TIME_DEGREE = eINSTANCE.getExpectedOperationResponseTimeDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedNumberOfElementsDegreeImpl <em>Expected Number Of Elements Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedNumberOfElementsDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedNumberOfElementsDegree()
		 * @generated
		 */
		EClass EXPECTED_NUMBER_OF_ELEMENTS_DEGREE = eINSTANCE.getExpectedNumberOfElementsDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedQueueLengthDegreeImpl <em>Expected Queue Length Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedQueueLengthDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedQueueLengthDegree()
		 * @generated
		 */
		EClass EXPECTED_QUEUE_LENGTH_DEGREE = eINSTANCE.getExpectedQueueLengthDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedTaskCountDegreeImpl <em>Expected Task Count Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExpectedTaskCountDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExpectedTaskCountDegree()
		 * @generated
		 */
		EClass EXPECTED_TASK_COUNT_DEGREE = eINSTANCE.getExpectedTaskCountDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.CooldownTimeConstraintDegreeImpl <em>Cooldown Time Constraint Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.CooldownTimeConstraintDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getCooldownTimeConstraintDegree()
		 * @generated
		 */
		EClass COOLDOWN_TIME_CONSTRAINT_DEGREE = eINSTANCE.getCooldownTimeConstraintDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.CooldownMaxScalingOperationsConstraintDegreeImpl <em>Cooldown Max Scaling Operations Constraint Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.CooldownMaxScalingOperationsConstraintDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getCooldownMaxScalingOperationsConstraintDegree()
		 * @generated
		 */
		EClass COOLDOWN_MAX_SCALING_OPERATIONS_CONSTRAINT_DEGREE = eINSTANCE
				.getCooldownMaxScalingOperationsConstraintDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AbsoluteAdjustmentDegreeImpl <em>Absolute Adjustment Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AbsoluteAdjustmentDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAbsoluteAdjustmentDegree()
		 * @generated
		 */
		EClass ABSOLUTE_ADJUSTMENT_DEGREE = eINSTANCE.getAbsoluteAdjustmentDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.RelativeAdjustmentDegreeImpl <em>Relative Adjustment Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.RelativeAdjustmentDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getRelativeAdjustmentDegree()
		 * @generated
		 */
		EClass RELATIVE_ADJUSTMENT_DEGREE = eINSTANCE.getRelativeAdjustmentDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.IntervalDurationConstraintDegreeImpl <em>Interval Duration Constraint Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.IntervalDurationConstraintDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getIntervalDurationConstraintDegree()
		 * @generated
		 */
		EClass INTERVAL_DURATION_CONSTRAINT_DEGREE = eINSTANCE.getIntervalDurationConstraintDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.IntervalOffsetConstraintDegreeImpl <em>Interval Offset Constraint Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.IntervalOffsetConstraintDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getIntervalOffsetConstraintDegree()
		 * @generated
		 */
		EClass INTERVAL_OFFSET_CONSTRAINT_DEGREE = eINSTANCE.getIntervalOffsetConstraintDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ThrashingConstraintDegreeImpl <em>Thrashing Constraint Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ThrashingConstraintDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getThrashingConstraintDegree()
		 * @generated
		 */
		EClass THRASHING_CONSTRAINT_DEGREE = eINSTANCE.getThrashingConstraintDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.TargetGroupSizeMinConstraintDegreeImpl <em>Target Group Size Min Constraint Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.TargetGroupSizeMinConstraintDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getTargetGroupSizeMinConstraintDegree()
		 * @generated
		 */
		EClass TARGET_GROUP_SIZE_MIN_CONSTRAINT_DEGREE = eINSTANCE.getTargetGroupSizeMinConstraintDegree();

	}

} // specificPackage
