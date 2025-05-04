/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedMemoryUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expected Memory Utilization Degree</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpectedMemoryUtilizationDegreeTest extends ContinuousRangeDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpectedMemoryUtilizationDegreeTest.class);
	}

	/**
	 * Constructs a new Expected Memory Utilization Degree test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedMemoryUtilizationDegreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Expected Memory Utilization Degree test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExpectedMemoryUtilizationDegree getFixture() {
		return (ExpectedMemoryUtilizationDegree) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createExpectedMemoryUtilizationDegree());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ExpectedMemoryUtilizationDegreeTest
