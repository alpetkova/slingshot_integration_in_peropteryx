/**
 */
package de.uka.ipd.sdq.pcm.designdecision.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.core.entity.provider.NamedElementItemProvider;

import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesFactory;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.Candidate} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class CandidateItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public CandidateItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
	 * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(designdecisionPackage.Literals.CANDIDATE__CHOICES);
			childrenFeatures.add(designdecisionPackage.Literals.CANDIDATE__QUALITY_PROPERTY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Candidate.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Candidate"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Candidate) object).getEntityName();
		return label == null || label.length() == 0 ? getString("_UI_Candidate_type")
				: getString("_UI_Candidate_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Candidate.class)) {
		case designdecisionPackage.CANDIDATE__CHOICES:
		case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.CANDIDATE__CHOICES,
				designdecisionFactory.eINSTANCE.createDiscreteRangeChoice()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.CANDIDATE__CHOICES,
				designdecisionFactory.eINSTANCE.createClassChoice()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.CANDIDATE__CHOICES,
				designdecisionFactory.eINSTANCE.createContinousRangeChoice()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.CANDIDATE__CHOICES,
				designdecisionFactory.eINSTANCE.createBoolChoice()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.CANDIDATE__CHOICES,
				designdecisionFactory.eINSTANCE.createFeatureChoice()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.CANDIDATE__QUALITY_PROPERTY,
				qualitypropertiesFactory.eINSTANCE.createElementQualityProperty()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.CANDIDATE__QUALITY_PROPERTY,
				qualitypropertiesFactory.eINSTANCE.createIntegerQualityProperty()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.CANDIDATE__QUALITY_PROPERTY,
				qualitypropertiesFactory.eINSTANCE.createDoubleQualityProperty()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DesignDecisionEditPlugin.INSTANCE;
	}

}
