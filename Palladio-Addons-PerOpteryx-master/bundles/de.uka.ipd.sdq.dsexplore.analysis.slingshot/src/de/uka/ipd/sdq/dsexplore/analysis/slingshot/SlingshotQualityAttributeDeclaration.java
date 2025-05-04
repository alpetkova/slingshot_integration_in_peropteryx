package de.uka.ipd.sdq.dsexplore.analysis.slingshot;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;

/**
 * Defines the Dimensions of this analyzer.
 * Based on Simucom
 * @author Dominik Fuchss (original author)
 *
 */
public class SlingshotQualityAttributeDeclaration extends AbstractPerformanceAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

	public SlingshotQualityAttributeDeclaration() {
		super();

	}

	@Override
	public boolean canEvaluateAspectForDimension(EvaluationAspect aspect, Dimension dimension) {
		if (EcoreUtil.equals(dimension, this.responseTimeDimension) && aspect instanceof Mean) {
			return true;
		}
		 if (EcoreUtil.equals(dimension, this.throughputDimension) && aspect
		 instanceof Mean) {
		 return true;
		 }
		 if (EcoreUtil.equals(dimension, this.maxUtilizationDimension)) {
		 return true;
		 }
		return false;
	}

}
