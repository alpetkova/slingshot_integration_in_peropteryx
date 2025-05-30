/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourcerepository.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentFactory;

import de.uka.ipd.sdq.pcm.cost.costFactory;
import de.uka.ipd.sdq.pcm.designdecision.provider.DesignDecisionEditPlugin;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceDescriptionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ResourceDescriptionItemProvider(AdapterFactory adapterFactory) {
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

			addResourcesCanBeUsedIndividuallyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resources Can Be Used Individually feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addResourcesCanBeUsedIndividuallyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResourceDescription_ResourcesCanBeUsedIndividually_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResourceDescription_ResourcesCanBeUsedIndividually_feature",
						"_UI_ResourceDescription_type"),
				resourcerepositoryPackage.Literals.RESOURCE_DESCRIPTION__RESOURCES_CAN_BE_USED_INDIVIDUALLY, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(
					resourcerepositoryPackage.Literals.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION);
			childrenFeatures.add(
					resourcerepositoryPackage.Literals.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION);
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
	 * This returns ResourceDescription.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourceDescription"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ResourceDescription resourceDescription = (ResourceDescription) object;
		return getString("_UI_ResourceDescription_type") + " "
				+ resourceDescription.getResourcesCanBeUsedIndividually();
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

		switch (notification.getFeatureID(ResourceDescription.class)) {
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__RESOURCES_CAN_BE_USED_INDIVIDUALLY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION:
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION:
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

		newChildDescriptors.add(createChildParameter(
				resourcerepositoryPackage.Literals.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION,
				costFactory.eINSTANCE.createFixedProcessingResourceCost()));

		newChildDescriptors.add(createChildParameter(
				resourcerepositoryPackage.Literals.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION,
				ResourceenvironmentFactory.eINSTANCE.createResourceContainer()));
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
