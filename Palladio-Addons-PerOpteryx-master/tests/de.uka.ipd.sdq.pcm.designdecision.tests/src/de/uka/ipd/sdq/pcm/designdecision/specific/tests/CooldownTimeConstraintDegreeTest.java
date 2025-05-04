/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.CooldownTimeConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cooldown Time Constraint Degree</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CooldownTimeConstraintDegreeTest extends ContinuousRangeDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CooldownTimeConstraintDegreeTest.class);
	}

	/**
	 * Constructs a new Cooldown Time Constraint Degree test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CooldownTimeConstraintDegreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cooldown Time Constraint Degree test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CooldownTimeConstraintDegree getFixture() {
		return (CooldownTimeConstraintDegree) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createCooldownTimeConstraintDegree());
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

} //CooldownTimeConstraintDegreeTest
