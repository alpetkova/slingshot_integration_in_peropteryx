/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.presentation;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.palladiosimulator.analyzer.resultdecorator.provider.ResultdecoratorEditPlugin;
import org.palladiosimulator.pcm.core.provider.PalladioComponentModelEditPlugin;

import de.uka.ipd.sdq.featuremodel.provider.FeaturemodelEditPlugin;
import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;
import de.uka.ipd.sdq.pcm.cost.provider.CostModelEditPlugin;
import de.uka.ipd.sdq.probfunction.provider.ProbabilityFunctionEditPlugin;
import de.uka.ipd.sdq.stoex.provider.StoexEditPlugin;
import de.uka.ipd.sdq.units.provider.UnitsEditPlugin;

/**
 * This is the central singleton for the DesignDecision editor plugin.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public final class DesignDecisionEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final DesignDecisionEditorPlugin INSTANCE = new DesignDecisionEditorPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDecisionEditorPlugin() {
		super(new ResourceLocator[] { CostModelEditPlugin.INSTANCE, EcoreEditPlugin.INSTANCE,
				FeaturemodelEditPlugin.INSTANCE, IdentifierEditPlugin.INSTANCE,
				PalladioComponentModelEditPlugin.INSTANCE, ResultdecoratorEditPlugin.INSTANCE, StoexEditPlugin.INSTANCE,
				UnitsEditPlugin.INSTANCE, ProbabilityFunctionEditPlugin.INSTANCE, });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
