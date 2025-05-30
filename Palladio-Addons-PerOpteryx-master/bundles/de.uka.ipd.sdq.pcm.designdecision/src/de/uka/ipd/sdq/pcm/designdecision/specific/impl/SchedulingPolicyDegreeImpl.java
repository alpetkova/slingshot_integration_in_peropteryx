/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;

import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Scheduling Policy Degree</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.SchedulingPolicyDegreeImpl#getProcessingresourcetype <em>Processingresourcetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingPolicyDegreeImpl extends ClassAsReferenceDegreeImpl implements SchedulingPolicyDegree {
	/**
	 * The cached value of the '{@link #getProcessingresourcetype() <em>Processingresourcetype</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProcessingresourcetype()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceType processingresourcetype;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingPolicyDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.SCHEDULING_POLICY_DEGREE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingResourceType getProcessingresourcetype() {
		if (processingresourcetype != null && processingresourcetype.eIsProxy()) {
			InternalEObject oldProcessingresourcetype = (InternalEObject) processingresourcetype;
			processingresourcetype = (ProcessingResourceType) eResolveProxy(oldProcessingresourcetype);
			if (processingresourcetype != oldProcessingresourcetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE, oldProcessingresourcetype,
							processingresourcetype));
			}
		}
		return processingresourcetype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType basicGetProcessingresourcetype() {
		return processingresourcetype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessingresourcetype(ProcessingResourceType newProcessingresourcetype) {
		ProcessingResourceType oldProcessingresourcetype = processingresourcetype;
		processingresourcetype = newProcessingresourcetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE, oldProcessingresourcetype,
					processingresourcetype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE:
			if (resolve)
				return getProcessingresourcetype();
			return basicGetProcessingresourcetype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE:
			setProcessingresourcetype((ProcessingResourceType) newValue);
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
		case specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE:
			setProcessingresourcetype((ProcessingResourceType) null);
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
		case specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE:
			return processingresourcetype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ProcessingResourceDegree.class) {
			switch (derivedFeatureID) {
			case specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE:
				return specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ProcessingResourceDegree.class) {
			switch (baseFeatureID) {
			case specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE:
				return specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // SchedulingPolicyDegreeImpl
