/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Candidate</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Candidate represents one solution candidate to the optimisation problem. It contains as many choices as there are DegreeOfFreedoms.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.Candidate#getChoices <em>Choices</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.Candidate#getQualityProperty <em>Quality Property</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getCandidate()
 * @model
 * @generated
 */
public interface Candidate extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.designdecision.Choice}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getCandidate_Choices()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Choice> getChoices();

	/**
	 * Returns the value of the '<em><b>Quality Property</b></em>' containment reference list. The
	 * list contents are of type
	 * {@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Quality Property</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getCandidate_QualityProperty()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<QualityProperty> getQualityProperty();

} // Candidate
