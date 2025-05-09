/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>OCL Rule</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.OCLRuleImpl#getMainOclQuery <em>Main Ocl Query</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.OCLRuleImpl#getHelperDefinition <em>Helper Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OCLRuleImpl extends EObjectImpl implements OCLRule {
	/**
	 * The default value of the '{@link #getMainOclQuery() <em>Main Ocl Query</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMainOclQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_OCL_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainOclQuery() <em>Main Ocl Query</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMainOclQuery()
	 * @generated
	 * @ordered
	 */
	protected String mainOclQuery = MAIN_OCL_QUERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHelperDefinition() <em>Helper Definition</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHelperDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<HelperOCLDefinition> helperDefinition;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gdofPackage.Literals.OCL_RULE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMainOclQuery() {
		return mainOclQuery;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainOclQuery(String newMainOclQuery) {
		String oldMainOclQuery = mainOclQuery;
		mainOclQuery = newMainOclQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gdofPackage.OCL_RULE__MAIN_OCL_QUERY, oldMainOclQuery,
					mainOclQuery));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HelperOCLDefinition> getHelperDefinition() {
		if (helperDefinition == null) {
			helperDefinition = new EObjectContainmentEList<>(HelperOCLDefinition.class, this,
					gdofPackage.OCL_RULE__HELPER_DEFINITION);
		}
		return helperDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case gdofPackage.OCL_RULE__HELPER_DEFINITION:
			return ((InternalEList<?>) getHelperDefinition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case gdofPackage.OCL_RULE__MAIN_OCL_QUERY:
			return getMainOclQuery();
		case gdofPackage.OCL_RULE__HELPER_DEFINITION:
			return getHelperDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case gdofPackage.OCL_RULE__MAIN_OCL_QUERY:
			setMainOclQuery((String) newValue);
			return;
		case gdofPackage.OCL_RULE__HELPER_DEFINITION:
			getHelperDefinition().clear();
			getHelperDefinition().addAll((Collection<? extends HelperOCLDefinition>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case gdofPackage.OCL_RULE__MAIN_OCL_QUERY:
			setMainOclQuery(MAIN_OCL_QUERY_EDEFAULT);
			return;
		case gdofPackage.OCL_RULE__HELPER_DEFINITION:
			getHelperDefinition().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case gdofPackage.OCL_RULE__MAIN_OCL_QUERY:
			return MAIN_OCL_QUERY_EDEFAULT == null ? mainOclQuery != null
					: !MAIN_OCL_QUERY_EDEFAULT.equals(mainOclQuery);
		case gdofPackage.OCL_RULE__HELPER_DEFINITION:
			return helperDefinition != null && !helperDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mainOclQuery: ");
		result.append(mainOclQuery);
		result.append(')');
		return result.toString();
	}

} // OCLRuleImpl
