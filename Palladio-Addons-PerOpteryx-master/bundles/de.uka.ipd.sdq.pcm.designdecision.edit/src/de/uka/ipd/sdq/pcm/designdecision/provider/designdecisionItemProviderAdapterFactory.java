/**
 */
package de.uka.ipd.sdq.pcm.designdecision.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.uka.ipd.sdq.pcm.designdecision.util.designdecisionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class designdecisionItemProviderAdapterFactory extends designdecisionAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public designdecisionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteRangeChoiceItemProvider discreteRangeChoiceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiscreteRangeChoiceAdapter() {
		if (discreteRangeChoiceItemProvider == null) {
			discreteRangeChoiceItemProvider = new DiscreteRangeChoiceItemProvider(this);
		}

		return discreteRangeChoiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DegreeOfFreedomInstanceItemProvider degreeOfFreedomInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDegreeOfFreedomInstanceAdapter() {
		if (degreeOfFreedomInstanceItemProvider == null) {
			degreeOfFreedomInstanceItemProvider = new DegreeOfFreedomInstanceItemProvider(this);
		}

		return degreeOfFreedomInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.ClassChoice} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected ClassChoiceItemProvider classChoiceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.ClassChoice}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createClassChoiceAdapter() {
		if (classChoiceItemProvider == null) {
			classChoiceItemProvider = new ClassChoiceItemProvider(this);
		}

		return classChoiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinousRangeChoiceItemProvider continousRangeChoiceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContinousRangeChoiceAdapter() {
		if (continousRangeChoiceItemProvider == null) {
			continousRangeChoiceItemProvider = new ContinousRangeChoiceItemProvider(this);
		}

		return continousRangeChoiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.DecisionSpace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSpaceItemProvider decisionSpaceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.DecisionSpace}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createDecisionSpaceAdapter() {
		if (decisionSpaceItemProvider == null) {
			decisionSpaceItemProvider = new DecisionSpaceItemProvider(this);
		}

		return decisionSpaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.Candidate} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected CandidateItemProvider candidateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.Candidate}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createCandidateAdapter() {
		if (candidateItemProvider == null) {
			candidateItemProvider = new CandidateItemProvider(this);
		}

		return candidateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.Candidates} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected CandidatesItemProvider candidatesItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.Candidates}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createCandidatesAdapter() {
		if (candidatesItemProvider == null) {
			candidatesItemProvider = new CandidatesItemProvider(this);
		}

		return candidatesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.BoolChoice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolChoiceItemProvider boolChoiceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.BoolChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoolChoiceAdapter() {
		if (boolChoiceItemProvider == null) {
			boolChoiceItemProvider = new BoolChoiceItemProvider(this);
		}

		return boolChoiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.FeatureChoice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureChoiceItemProvider featureChoiceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.FeatureChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureChoiceAdapter() {
		if (featureChoiceItemProvider == null) {
			featureChoiceItemProvider = new FeatureChoiceItemProvider(this);
		}

		return featureChoiceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (discreteRangeChoiceItemProvider != null)
			discreteRangeChoiceItemProvider.dispose();
		if (degreeOfFreedomInstanceItemProvider != null)
			degreeOfFreedomInstanceItemProvider.dispose();
		if (classChoiceItemProvider != null)
			classChoiceItemProvider.dispose();
		if (continousRangeChoiceItemProvider != null)
			continousRangeChoiceItemProvider.dispose();
		if (decisionSpaceItemProvider != null)
			decisionSpaceItemProvider.dispose();
		if (candidateItemProvider != null)
			candidateItemProvider.dispose();
		if (candidatesItemProvider != null)
			candidatesItemProvider.dispose();
		if (boolChoiceItemProvider != null)
			boolChoiceItemProvider.dispose();
		if (featureChoiceItemProvider != null)
			featureChoiceItemProvider.dispose();
	}

}
