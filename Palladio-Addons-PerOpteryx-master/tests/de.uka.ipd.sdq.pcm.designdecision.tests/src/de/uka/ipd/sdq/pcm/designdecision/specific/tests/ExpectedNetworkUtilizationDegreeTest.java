/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNetworkUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expected Network Utilization Degree</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpectedNetworkUtilizationDegreeTest extends ContinuousRangeDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpectedNetworkUtilizationDegreeTest.class);
	}

	/**
	 * Constructs a new Expected Network Utilization Degree test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedNetworkUtilizationDegreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Expected Network Utilization Degree test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExpectedNetworkUtilizationDegree getFixture() {
		return (ExpectedNetworkUtilizationDegree) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createExpectedNetworkUtilizationDegree());
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

} //ExpectedNetworkUtilizationDegreeTest
