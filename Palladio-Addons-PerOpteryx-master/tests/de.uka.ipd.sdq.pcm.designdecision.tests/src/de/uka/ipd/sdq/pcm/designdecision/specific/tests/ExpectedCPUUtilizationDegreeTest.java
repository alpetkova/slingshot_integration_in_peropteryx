/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedCPUUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expected CPU Utilization Degree</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpectedCPUUtilizationDegreeTest extends ContinuousRangeDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpectedCPUUtilizationDegreeTest.class);
	}

	/**
	 * Constructs a new Expected CPU Utilization Degree test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedCPUUtilizationDegreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Expected CPU Utilization Degree test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExpectedCPUUtilizationDegree getFixture() {
		return (ExpectedCPUUtilizationDegree) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createExpectedCPUUtilizationDegree());
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

} //ExpectedCPUUtilizationDegreeTest
