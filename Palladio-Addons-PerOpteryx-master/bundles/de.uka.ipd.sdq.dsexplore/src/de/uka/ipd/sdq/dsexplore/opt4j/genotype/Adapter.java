package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotypeRepresentation.TypeOfDegree;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMaxConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.TargetGroupSizeMinConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StepAdjustmentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedCPUUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedMemoryUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedHDDUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNetworkUtilizationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedSimulationTimeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedOperationResponseTimeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedNumberOfElementsDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedQueueLengthDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExpectedTaskCountDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CooldownTimeConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CooldownMaxScalingOperationsConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AbsoluteAdjustmentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.RelativeAdjustmentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.IntervalDurationConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.IntervalOffsetConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ThrashingConstraintDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
/**
 * The {@link Adapter} contains methods to translate between {@link DesignDecisionGenotype} 
 * and {@link FinalBinaryGenotype}. In the conversion process, the following steps are
 * involved:
 * 
 * <p>
 * 1) The {@link DesignDecisionGenotype} (a list of {@link Choice} objects), is first converted to 
 * a list of {@link BinaryGenotype} objects.
 * <p>
 *  2) The list of {@link BinaryGenotype} objects are converted to {@link FinalBinaryGenotype} object
 *  using the {@link FinalBinaryGenotype} constructor. This is the final stage of the conversion where
 *  we have obtained our end result (that of converting the {@link DesignDecisionGenotype} to a {@link FinalBinaryGenotype}).
 *  <p>
 *  For the retranslation process, we have to convert the {@link FinalBinaryGenotype} to a {@link DesignDecisionGenotype}. The 
 *  process goes as follows:
 *  
 * <p>
 * 1) {@link FinalBinaryGenotype} is converted to a list of {@link BinaryGenotype} objects
 * <p>
 * 2)This list is converted to a list of {@link Choice} objects and is used
 * to construct a {@link DesignDecisionGenotype}
 * 
 *<p>
 *NOTE: During the retranslation for the ContinuousProcessingRateDegree, we cannot assign
 *the correct server speed value to the corresponding {@link Choice} object, because
 * the binary representation gives us server speed intervals (instead of particular values).
 * This problem is partially overcome by randomly assigning one of the previously used values of server speed
 * (in a particular interval) during the initialization of the problem.
 * @author Apoorv
 *
 */
public class Adapter {
	
	private static Logger logger = 
			Logger.getLogger("de.uka.ipd.sdq.dsexplore.opt4j.genotype.Adapter");
	
	// These have to be set in the constructor according to the Design problem
	List<EObject> SERVERS; 
	List<EObject> WEBSERVERS; 
	List<EObject> COMPONENTS;
	double[] SERVER_INTERVALS = {0,0,0,0}; // Initialization
	double[] CAPACITYDEGREE_INTERVALS = {0,0,0,0}; // Initialization
	double[] TARGETGROUPSIZEMAXCONSTRAINTDEGREE = {0,0,0,0}; // Initialization
	double[] TARGETGROUPSIZEMINCONSTRAINTDEGREE = {0,0,0,0}; // Initialization
	double[] STEPADJUSTMENTDEGREE = {0,0,0,0}; // Initialization
	double[] ABSOLUTEADJUSTMENTDEGREE = {0,0,0,0}; // Initialization
	double[] RELATIVEADJUSTMENTDEGREE = {0,0,0,0}; // Initialization
	double[] EXPECTEDCPUUTILIZATIONDEGREE = {0,0,0,0}; // Initialization
	double[] EXPECTEDMEMORYUTILIZATIONDEGREE = {0,0,0,0}; // Initialization
	double[] EXPECTEDHDDUTILIZATIONDEGREE = {0,0,0,0}; // Initialization
	double[] EXPECTEDNETWORKUTILIZATIONDEGREE = {0,0,0,0}; // Initialization
	double[] EXPECTEDSIMULATIONTIMEDEGREE = {0,0,0,0}; // Initialization
	double[] EXPECTEDOPERATIONRESPONSETIMEDEGREE = {0,0,0,0}; // Initialization
	double[] EXPECTEDNUMBEROFELEMENTSDEGREE = {0,0,0,0}; // Initialization
	double[] EXPECTEDQUEUELENGTHDEGREE = {0,0,0,0}; // Initialization
	double[] EXPECTEDTASKCOUNTDEGREE = {0,0,0,0}; // Initialization
	double[] COOLDOWNMAXSCALINGOPERATIONSCONSTRAINTDEGREE = {0,0,0,0}; // Initialization
	double[] COOLDOWNTIMECONSTRAINTDEGREE = {0,0,0,0}; // Initialization
	double[] INTERVALDURATIONCONSTRAINTDEGREE = {0,0,0,0}; // Initialization
	double[] INTERVALOFFSETCONSTRAINTDEGREE = {0,0,0,0}; // Initialization
	double[] THRASHINGCONSTRAINTDEGREE = {0,0,0,0}; // Initialization

	
	
	
	/**The ContinuousProcessingRateArchiveStorage stores the 
	 * various values of server speeds of the candidates 
	 * given to translateDesignDecisionGenotype method. These stored values are then used by 
	 * translateFinalBinaryGenotype (while retranslating the {@link ContinuousProcessingRateDegree}) to produce {@link DesignDecisonGenotype}
	*/
	Map<Integer, ArrayList<Object>> ContinuousProcessingRateArchiveStorage;
	DecisionSpace problemSpace;
	
	// Constructor here
	//@Inject
	public Adapter(){
		this.ContinuousProcessingRateArchiveStorage = new HashMap<Integer, ArrayList<Object>>();
		this.problemSpace = Opt4JStarter.getProblem().getEMFProblem();
		
		logger.info("The problem is registered in Adapter");
		
		// Based on the problemSpace variable initialize the SERVERS,WEBSERVERS and SERVER_INTERVALS fields.
		boolean traversed_AllocationDegree = false;
		boolean traversed_ResourceSelectionDegree = false;
		int count = 0;
		for(DegreeOfFreedomInstance dofi: this.problemSpace.getDegreesOfFreedom()){
			
			if(dofi instanceof ContinuousProcessingRateDegree){
				// then set the SERVER_INTERVALS variable here
				
				double server_interval_lowerbound = ((ContinuousProcessingRateDegree) dofi).getFrom();
				double server_interval_upperbound = ((ContinuousProcessingRateDegree) dofi).getTo();
				// Currently code to create 4 equi_length intervals
				double diff = (server_interval_upperbound - server_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++){
					SERVER_INTERVALS[i] = server_interval_lowerbound + i*diff;
				}
				// Also set the ContinuousProcessingRateArchiveStorage
				ContinuousProcessingRateArchiveStorage.put(count, new ArrayList<Object>());
				List<ArrayList<Double>> arrayList = new ArrayList<ArrayList<Double>>();
				List<Double> server_intervals_list = new ArrayList<Double>();
				for(int i=0; i< this.SERVER_INTERVALS.length;i++){
					List<Double> list = new ArrayList<Double>();
					
					double rnum = 0;
					if(i == 0){
						rnum = Math.random()*SERVER_INTERVALS[i];
					}else{
						rnum = Math.random()*(SERVER_INTERVALS[i]-SERVER_INTERVALS[i-1])+SERVER_INTERVALS[i-1];
					}
					list.add(rnum);
					server_intervals_list.add(SERVER_INTERVALS[i]);
					arrayList.add((ArrayList<Double>) list);
				}
				ContinuousProcessingRateArchiveStorage.get(count).add(arrayList);
				ContinuousProcessingRateArchiveStorage.get(count).add(server_intervals_list);
			}else if(dofi instanceof AllocationDegree && !traversed_AllocationDegree){
				// then set the SERVERS variable here
				this.SERVERS = ((AllocationDegree) dofi).getClassDesignOptions();
				traversed_AllocationDegree = true;
			}else if(dofi instanceof ResourceSelectionDegree && !traversed_ResourceSelectionDegree){
				// then set the WEBSERVERS variable here
				this.WEBSERVERS = ((ResourceSelectionDegree) dofi).getClassDesignOptions();
				traversed_ResourceSelectionDegree = true;
			}else if(dofi instanceof AssembledComponentDegree){
				this.COMPONENTS = ((AssembledComponentDegree) dofi).getClassDesignOptions();
			}else if(dofi instanceof CapacityDegree){
				// then set the CAPACITYDEGREE_INTERVALS variable here
				
				double capacitydegree_interval_lowerbound = ((CapacityDegree) dofi).getFrom();
				double capacitydegree_interval_upperbound = ((CapacityDegree) dofi).getTo();
				// Currently code to create 4 equi_length intervals
				double diff = (capacitydegree_interval_upperbound - capacitydegree_interval_lowerbound)/4;
				if(diff != 0){
					for(int i = 0 ; i < 4 ; i++){
						CAPACITYDEGREE_INTERVALS[i] = capacitydegree_interval_lowerbound + i*diff;
					}
				}else{
					for(int i = 0 ; i < 4 ; i++){
						CAPACITYDEGREE_INTERVALS[i] = SERVER_INTERVALS[i];
					}
				}
				//logger.info(CAPACITYDEGREE_INTERVALS);
			}else if(dofi instanceof TargetGroupSizeMaxConstraintDegree) {
				double targetgroupsizemaxconstraintdegree_interval_lowerbound = ((TargetGroupSizeMaxConstraintDegree) dofi).getFrom();
				double targetgroupsizemaxconstraintdegree_interval_upperbound = ((TargetGroupSizeMaxConstraintDegree) dofi).getTo();
				double diff = (targetgroupsizemaxconstraintdegree_interval_upperbound - targetgroupsizemaxconstraintdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					TARGETGROUPSIZEMAXCONSTRAINTDEGREE[i] = targetgroupsizemaxconstraintdegree_interval_lowerbound + i*diff;
				}
			
			}else if(dofi instanceof TargetGroupSizeMinConstraintDegree) {
				double targetgroupsizeminconstraintdegree_interval_lowerbound = ((TargetGroupSizeMinConstraintDegree) dofi).getFrom();
				double targetgroupsizeminconstraintdegree_interval_upperbound = ((TargetGroupSizeMinConstraintDegree) dofi).getTo();
				double diff = (targetgroupsizeminconstraintdegree_interval_upperbound - targetgroupsizeminconstraintdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					TARGETGROUPSIZEMINCONSTRAINTDEGREE[i] = targetgroupsizeminconstraintdegree_interval_lowerbound + i*diff;
				}
			
			}else if(dofi instanceof StepAdjustmentDegree) {
				double stepadjustmentdegree_interval_lowerbound = ((StepAdjustmentDegree) dofi).getFrom();
				double stepadjustmentdegree_interval_upperbound = ((StepAdjustmentDegree) dofi).getTo();
				double diff = (stepadjustmentdegree_interval_upperbound - stepadjustmentdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					STEPADJUSTMENTDEGREE[i] = stepadjustmentdegree_interval_lowerbound + i*diff;
				}
			
			}else if(dofi instanceof AbsoluteAdjustmentDegree) {
				double absoluteadjustmentdegree_interval_lowerbound = ((AbsoluteAdjustmentDegree) dofi).getFrom();
				double absoluteadjustmentdegree_interval_upperbound = ((AbsoluteAdjustmentDegree) dofi).getTo();
				double diff = (absoluteadjustmentdegree_interval_upperbound - absoluteadjustmentdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					ABSOLUTEADJUSTMENTDEGREE[i] = absoluteadjustmentdegree_interval_lowerbound + i*diff;
				}
			
			}else if(dofi instanceof RelativeAdjustmentDegree) {
				double relativeadjustmentdegree_interval_lowerbound = ((RelativeAdjustmentDegree) dofi).getFrom();
				double relativeadjustmentdegree_interval_upperbound = ((RelativeAdjustmentDegree) dofi).getTo();
				double diff = (relativeadjustmentdegree_interval_upperbound - relativeadjustmentdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					RELATIVEADJUSTMENTDEGREE[i] = relativeadjustmentdegree_interval_lowerbound + i*diff;
				}
			
			}else if(dofi instanceof ExpectedCPUUtilizationDegree) {
				double expectedcpuutilizationdegree_interval_lowerbound = ((ExpectedCPUUtilizationDegree) dofi).getFrom();
				double expectedcpuutilizationdegree_interval_upperbound = ((ExpectedCPUUtilizationDegree) dofi).getTo();
				double diff = (expectedcpuutilizationdegree_interval_upperbound - expectedcpuutilizationdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					EXPECTEDCPUUTILIZATIONDEGREE[i] = expectedcpuutilizationdegree_interval_lowerbound + i*diff;
				}
			
			}else if(dofi instanceof ExpectedMemoryUtilizationDegree) {
				double expectedmemoryutilizationdegree_interval_lowerbound = ((ExpectedMemoryUtilizationDegree) dofi).getFrom();
				double expectedmemoryutilizationdegree_interval_upperbound = ((ExpectedMemoryUtilizationDegree) dofi).getTo();
				double diff = (expectedmemoryutilizationdegree_interval_upperbound - expectedmemoryutilizationdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					EXPECTEDMEMORYUTILIZATIONDEGREE[i] = expectedmemoryutilizationdegree_interval_lowerbound + i*diff;
				}
			
			}else if(dofi instanceof ExpectedHDDUtilizationDegree) {
				double expectedhddutilizationdegree_interval_lowerbound = ((ExpectedHDDUtilizationDegree) dofi).getFrom();
				double expectedhddutilizationdegree_interval_upperbound = ((ExpectedHDDUtilizationDegree) dofi).getTo();
				double diff = (expectedhddutilizationdegree_interval_upperbound - expectedhddutilizationdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					EXPECTEDHDDUTILIZATIONDEGREE[i] = expectedhddutilizationdegree_interval_lowerbound + i*diff;
				}
			
			}else if(dofi instanceof ExpectedNetworkUtilizationDegree) {
				double expectednetworkutilizationdegree_interval_lowerbound = ((ExpectedNetworkUtilizationDegree) dofi).getFrom();
				double expectednetworkutilizationdegree_interval_upperbound = ((ExpectedNetworkUtilizationDegree) dofi).getTo();
				double diff = (expectednetworkutilizationdegree_interval_upperbound - expectednetworkutilizationdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					EXPECTEDNETWORKUTILIZATIONDEGREE[i] = expectednetworkutilizationdegree_interval_lowerbound + i*diff;
				}
			
			}
			else if(dofi instanceof ExpectedSimulationTimeDegree) {
				double expectedsimulationtimedegree_interval_lowerbound = ((ExpectedSimulationTimeDegree) dofi).getFrom();
				double expectedsimulationtimedegree_interval_upperbound = ((ExpectedSimulationTimeDegree) dofi).getTo();
				double diff = (expectedsimulationtimedegree_interval_upperbound - expectedsimulationtimedegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					EXPECTEDSIMULATIONTIMEDEGREE[i] = expectedsimulationtimedegree_interval_lowerbound + i*diff;
				}
			
			}
			else if(dofi instanceof ExpectedOperationResponseTimeDegree) {
				double expectedoperationresponsetimedegree_interval_lowerbound = ((ExpectedOperationResponseTimeDegree) dofi).getFrom();
				double expectedoperationresponsetimedegree_interval_upperbound = ((ExpectedOperationResponseTimeDegree) dofi).getTo();
				double diff = (expectedoperationresponsetimedegree_interval_upperbound - expectedoperationresponsetimedegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					EXPECTEDOPERATIONRESPONSETIMEDEGREE[i] = expectedoperationresponsetimedegree_interval_lowerbound + i*diff;
				}
			
			}
			else if(dofi instanceof ExpectedNumberOfElementsDegree) {
				double expectednumberofelementsdegree_interval_lowerbound = ((ExpectedNumberOfElementsDegree) dofi).getFrom();
				double expectednumberofelementsdegree_interval_upperbound = ((ExpectedNumberOfElementsDegree) dofi).getTo();
				double diff = (expectednumberofelementsdegree_interval_upperbound - expectednumberofelementsdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					EXPECTEDNUMBEROFELEMENTSDEGREE[i] = expectednumberofelementsdegree_interval_lowerbound + i*diff;
				}
			
			}
			else if(dofi instanceof ExpectedQueueLengthDegree) {
				double expectedqueuelengthdegree_interval_lowerbound = ((ExpectedQueueLengthDegree) dofi).getFrom();
				double expectedqueuelengthdegree_interval_upperbound = ((ExpectedQueueLengthDegree) dofi).getTo();
				double diff = (expectedqueuelengthdegree_interval_upperbound - expectedqueuelengthdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					EXPECTEDQUEUELENGTHDEGREE[i] = expectedqueuelengthdegree_interval_lowerbound + i*diff;
				}
			
			}
			else if(dofi instanceof ExpectedTaskCountDegree) {
				double expectedtaskcountdegree_interval_lowerbound = ((ExpectedTaskCountDegree) dofi).getFrom();
				double expectedtaskcountdegree_interval_upperbound = ((ExpectedTaskCountDegree) dofi).getTo();
				double diff = (expectedtaskcountdegree_interval_upperbound - expectedtaskcountdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					EXPECTEDTASKCOUNTDEGREE[i] = expectedtaskcountdegree_interval_lowerbound + i*diff;
				}
			
			}
			else if(dofi instanceof CooldownMaxScalingOperationsConstraintDegree) {
				double cooldownmaxscopconstdegree_interval_lowerbound = ((CooldownMaxScalingOperationsConstraintDegree) dofi).getFrom();
				double cooldownmaxscopconstdegree_interval_upperbound = ((CooldownMaxScalingOperationsConstraintDegree) dofi).getTo();
				double diff = (cooldownmaxscopconstdegree_interval_upperbound - cooldownmaxscopconstdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					COOLDOWNMAXSCALINGOPERATIONSCONSTRAINTDEGREE[i] = cooldownmaxscopconstdegree_interval_lowerbound + i*diff;
				}
			
			}
			else if(dofi instanceof CooldownTimeConstraintDegree) {
				double cooldowntimeconstraintdegree_interval_lowerbound = ((CooldownTimeConstraintDegree) dofi).getFrom();
				double cooldowntimeconstraintdegree_interval_upperbound = ((CooldownTimeConstraintDegree) dofi).getTo();
				double diff = (cooldowntimeconstraintdegree_interval_upperbound - cooldowntimeconstraintdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					COOLDOWNTIMECONSTRAINTDEGREE[i] = cooldowntimeconstraintdegree_interval_lowerbound + i*diff;
				}
			
			}
			else if(dofi instanceof IntervalDurationConstraintDegree) {
				double intervaldurationconstraintdegree_interval_lowerbound = ((IntervalDurationConstraintDegree) dofi).getFrom();
				double intervaldurationconstraintdegree_interval_upperbound = ((IntervalDurationConstraintDegree) dofi).getTo();
				double diff = (intervaldurationconstraintdegree_interval_upperbound - intervaldurationconstraintdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					INTERVALDURATIONCONSTRAINTDEGREE[i] = intervaldurationconstraintdegree_interval_lowerbound + i*diff;
				}
			
			}
			else if(dofi instanceof IntervalOffsetConstraintDegree) {
				double intervaloffsetconstraintdegree_interval_lowerbound = ((IntervalOffsetConstraintDegree) dofi).getFrom();
				double intervaloffsetconstraintdegree_interval_upperbound = ((IntervalOffsetConstraintDegree) dofi).getTo();
				double diff = (intervaloffsetconstraintdegree_interval_upperbound - intervaloffsetconstraintdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					INTERVALOFFSETCONSTRAINTDEGREE[i] = intervaloffsetconstraintdegree_interval_lowerbound + i*diff;
				}
			
			}
			else if(dofi instanceof ThrashingConstraintDegree) {
				double thrashingconstraintdegree_interval_lowerbound = ((ThrashingConstraintDegree) dofi).getFrom();
				double thrashingconstraintdegree_interval_upperbound = ((ThrashingConstraintDegree) dofi).getTo();
				double diff = (thrashingconstraintdegree_interval_upperbound - thrashingconstraintdegree_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++) {
					THRASHINGCONSTRAINTDEGREE[i] = thrashingconstraintdegree_interval_lowerbound + i*diff;
				}
			
			}
			count++;
		}
		
		
	}
	
	// Testing here
	public static void main(String[] args){
		Map<DegreeOfFreedomInstance, ArrayList<Double> > Dict = new HashMap<DegreeOfFreedomInstance, ArrayList<Double> >();
		DegreeOfFreedomInstance dof = designdecisionFactory.eINSTANCE.createDegreeOfFreedomInstance();
		List<Double> list = new ArrayList<Double>();
		Dict.put(dof, (ArrayList<Double>) list);
		System.out.println(Dict.get(dof).size());
		Dict.get(dof).add(0.0);
		Dict.get(dof).add(1.0);
		System.out.println(Dict.get(dof).get(1));
	}
	
	// Methods here
	/**
	 * Translates the given {@link DesignDecisionGenotype} named DDGenotype 
	 * to a {@link List} of {@link BinaryGenotype} objects. 
	 * Each {@link BinaryGenotype} object holds 
	 * the binary representation of a particular {@link Choice} object in the DDGenotype. 
	 * The DDGenotype contains the private field "choices", which
	 *  is actually a {@link List} of {@link Choice} objects. 
	 *  Each {@link Choice} object is referenced to a particular DOF
	 * @param DDGenotype
	 * @return
	 */
	public List<BinaryGenotype> translateDesignDecisionGenotype(DesignDecisionGenotype DDGenotype){
		
		// ChoiceList contains the list of Choice objects in DDGenotype 
		List<Choice> ChoiceList = DDGenotype.getInternalList();
		
		/* The TranslatedGenotype list is a list of BinaryGenotype Objects. 
		 * The for loop will convert each Choice in ChoiceList
		 * to a corresponding Binary representation of 1s and 0s --> (which is a BinaryGenotype Object).
		 * The only whimsical thing is that the binary nature
		 * of TranslatedGenotype is encoded using integers.
		 */
		List<BinaryGenotype> TranslatedGenotype = new ArrayList<BinaryGenotype>();
		
		
		/* Now, iterate through each choice object
		 * in the ChoiceList, find its corresponding degree of Freedom
		 * and apply the conversion to it.
		 */
		Iterator<Choice> ChoiceIteratorInstance = ChoiceList.iterator();
		  for(int i=0; i < ChoiceList.size(); i++){
			/* A comprehensive list of 
			 * if-else statements corresponding to each
			 * DOF.
			 */
			  Choice ChoiceIterator = ChoiceIteratorInstance.next();
			  if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ContinuousProcessingRateDegree){	
			  /* If the Choice object is representing Server Speed (ContinuousProcessingRateDegree)
				 * then take the server speed value and convert to
				 * binary number.
				 */
				double ServerSpeed=(Double) ChoiceIterator.getValue(); // Got the Server speed in double
				/* Now determine the interval 
				 * in which ServerSpeed value lies
				 */
				
				List<Integer> ServerBinaryRep = getServerBinaryRep(ServerSpeed,i);
				
				// Add the server speed value at the proper place in the archive storage
				for(int w=0;w<ServerBinaryRep.size();w++){
					if(ServerBinaryRep.get(w) == 1){
						//this.ContinuousProcessingRateArchiveStorage.get(w).add(ServerSpeed);
						((ArrayList<ArrayList<Double>>) this.ContinuousProcessingRateArchiveStorage.get(i).get(0)).get(w).add(ServerSpeed);
					}
				}
				
				BinaryGenotype ServerBinaryGenotypeObj = new BinaryGenotype(ServerBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ContinuousProcessingRateDegree);
				TranslatedGenotype.add(ServerBinaryGenotypeObj);
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ResourceSelectionDegree){
				// TODO Find the class corresponding to Webserver Selection. (Maybe it is the ResourceSelectionDegree?)
				/* If the Choice object is representing WebServer Allocation
				 * then take the Webserver and convert to
				 * binary number.
				 */
				EObject WebServer= ((ClassChoice) ChoiceIterator).getChosenValue(); // Got the WebServer in EObject
				List<Integer> WebServerBinaryRep = getWebServerBinaryRep(WebServer);
				BinaryGenotype WebServerBinaryGenotypeObj = new BinaryGenotype(WebServerBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ResourceSelectionDegree);
				TranslatedGenotype.add(WebServerBinaryGenotypeObj);
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof AllocationDegree){
				/* If the Choice object is representing Component Allocation (AllocationDegree)
				 * then take the Server and convert to
				 * binary number.
				 */
				EObject AllocatedServer= ((ClassChoice) ChoiceIterator).getChosenValue(); // Got the Component in EObject
			    List<Integer> AllocatedServerBinaryRep = getAllocatedServerBinaryRep(AllocatedServer);
				BinaryGenotype AllocatedServerBinaryGenotypeObj = new BinaryGenotype(AllocatedServerBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.AllocationDegree);			    
			    TranslatedGenotype.add(AllocatedServerBinaryGenotypeObj);
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof AssembledComponentDegree){
				/* If the Choice object is representing AssembledComponentDegree 
				 * then take the Component and convert to
				 * binary number.
				 */
				EObject AllocatedComponent= ((ClassChoice) ChoiceIterator).getChosenValue(); // Got the Component in EObject
			    List<Integer> AllocatedComponentBinaryRep = getAllocatedComponentBinaryRep(AllocatedComponent);
				BinaryGenotype AllocatedComponentBinaryGenotypeObj = new BinaryGenotype(AllocatedComponentBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.AssembledComponentDegree);			    
			    TranslatedGenotype.add(AllocatedComponentBinaryGenotypeObj);
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof CapacityDegree){
				/* If the Choice object is representing CapacityDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double capacityDegreeValue=(Integer) ChoiceIterator.getValue(); // Got the Server speed in double
				/* Now determine the interval 
				 * in which capacityDegreeValue value lies
				 */
				
				List<Integer> capacityDegreeValueBinaryRep = getCapacityBinaryRep(capacityDegreeValue);
				
				BinaryGenotype capacityDegreeValueBinaryGenotypeObj = new BinaryGenotype(capacityDegreeValueBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.CapacityDegree);
				TranslatedGenotype.add(capacityDegreeValueBinaryGenotypeObj);
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof TargetGroupSizeMaxConstraintDegree){
				/* If the Choice object is representing TargetGroupSizeMaxConstraintDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double targetGroupSizeMaxConstraintDegreeValue=(Integer) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which targetGroupSizeMaxConstraintDegreeValue value lies
				 */
				
				List<Integer> targetGroupSizeMaxConstraintBinaryRep = getTargetGroupSizeMaxConstraintBinaryRep(targetGroupSizeMaxConstraintDegreeValue);
				
				BinaryGenotype targetGroupSizeMaxConstraintDegreeValueBinaryGenotypeObj = new BinaryGenotype(targetGroupSizeMaxConstraintBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.TargetGroupSizeMaxConstraintDegree);
				TranslatedGenotype.add(targetGroupSizeMaxConstraintDegreeValueBinaryGenotypeObj);
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof TargetGroupSizeMinConstraintDegree){
				/* If the Choice object is representing TargetGroupSizeMinConstraintDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double targetGroupSizeMinConstraintDegreeValue=(Integer) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which targetGroupSizeMinConstraintDegreeValue value lies
				 */
				
				List<Integer> targetGroupSizeMinConstraintBinaryRep = getTargetGroupSizeMinConstraintBinaryRep(targetGroupSizeMinConstraintDegreeValue);
				
				BinaryGenotype targetGroupSizeMinConstraintDegreeValueBinaryGenotypeObj = new BinaryGenotype(targetGroupSizeMinConstraintBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.TargetGroupSizeMinConstraintDegree);
				TranslatedGenotype.add(targetGroupSizeMinConstraintDegreeValueBinaryGenotypeObj);
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof StepAdjustmentDegree){
				/* If the Choice object is representing StepAdjustmentDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double stepAdjustmentDegreeValue=(Integer) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which stepAdjustmentDegreeValue value lies
				 */
				
				List<Integer> stepAdjustmentBinaryRep = getStepAdjustmentBinaryRep(stepAdjustmentDegreeValue);
				
				BinaryGenotype stepAdjustmentDegreeValueBinaryGenotypeObj = new BinaryGenotype(stepAdjustmentBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.StepAdjustmentDegree);
				TranslatedGenotype.add(stepAdjustmentDegreeValueBinaryGenotypeObj);
				
			}
			else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof AbsoluteAdjustmentDegree){
				/* If the Choice object is representing AbsoluteAdjustmentDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double absoluteAdjustmentDegreeValue=(Integer) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which absoluteAdjustmentDegreeValue value lies
				 */
				
				List<Integer> absoluteAdjustmentBinaryRep = getAbsoluteAdjustmentBinaryRep(absoluteAdjustmentDegreeValue);
				
				BinaryGenotype absoluteAdjustmentDegreeValueBinaryGenotypeObj = new BinaryGenotype(absoluteAdjustmentBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.AbsoluteAdjustmentDegree);
				TranslatedGenotype.add(absoluteAdjustmentDegreeValueBinaryGenotypeObj);
				
			}
			else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof RelativeAdjustmentDegree){
				/* If the Choice object is representing RelativeAdjustmentDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double relativeAdjustmentDegreeValue=(Integer) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which relativeAdjustmentDegreeValue value lies
				 */
				
				List<Integer> relativeAdjustmentBinaryRep = getRelativeAdjustmentBinaryRep(relativeAdjustmentDegreeValue);
				
				BinaryGenotype relativeAdjustmentDegreeValueBinaryGenotypeObj = new BinaryGenotype(relativeAdjustmentBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.RelativeAdjustmentDegree);
				TranslatedGenotype.add(relativeAdjustmentDegreeValueBinaryGenotypeObj);
				
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ExpectedCPUUtilizationDegree){
				/* If the Choice object is representing ExpectedCPUUtilizationDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double expectedCPUUtilizationDegreeValue=(Double) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which expectedCPUUtilizationDegreeValue value lies
				 */
				
				List<Integer> expectedCPUUtilizationBinaryRep = getExpectedCPUUtilizationBinaryRep(expectedCPUUtilizationDegreeValue);
				
				BinaryGenotype expectedCPUUtilizationDegreeValueBinaryGenotypeObj = new BinaryGenotype(expectedCPUUtilizationBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ExpectedCPUUtilizationDegree);
				TranslatedGenotype.add(expectedCPUUtilizationDegreeValueBinaryGenotypeObj);
				
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ExpectedMemoryUtilizationDegree){
				/* If the Choice object is representing ExpectedMemoryUtilizationDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double expectedMemoryUtilizationDegreeValue=(Double) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which expectedMemoryUtilizationDegreeValue value lies
				 */
				
				List<Integer> expectedMemoryUtilizationBinaryRep = getExpectedMemoryUtilizationBinaryRep(expectedMemoryUtilizationDegreeValue);
				
				BinaryGenotype expectedMemoryUtilizationDegreeValueBinaryGenotypeObj = new BinaryGenotype(expectedMemoryUtilizationBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ExpectedMemoryUtilizationDegree);
				TranslatedGenotype.add(expectedMemoryUtilizationDegreeValueBinaryGenotypeObj);
				
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ExpectedHDDUtilizationDegree){
				/* If the Choice object is representing ExpectedHDDUtilizationDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double expectedHDDUtilizationDegreeValue=(Double) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which expectedHDDUtilizationDegreeValue value lies
				 */
				
				List<Integer> expectedHDDUtilizationBinaryRep = getExpectedHDDUtilizationBinaryRep(expectedHDDUtilizationDegreeValue);
				
				BinaryGenotype expectedHDDUtilizationDegreeValueBinaryGenotypeObj = new BinaryGenotype(expectedHDDUtilizationBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ExpectedHDDUtilizationDegree);
				TranslatedGenotype.add(expectedHDDUtilizationDegreeValueBinaryGenotypeObj);
				
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ExpectedNetworkUtilizationDegree){
				/* If the Choice object is representing ExpectedNetworkUtilizationDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double expectedNetworkUtilizationDegreeValue=(Double) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which expectedNetworkUtilizationDegreeValue value lies
				 */
				
				List<Integer> expectedNetworkUtilizationBinaryRep = getExpectedNetworkUtilizationBinaryRep(expectedNetworkUtilizationDegreeValue);
				
				BinaryGenotype expectedNetworkUtilizationDegreeValueBinaryGenotypeObj = new BinaryGenotype(expectedNetworkUtilizationBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ExpectedNetworkUtilizationDegree);
				TranslatedGenotype.add(expectedNetworkUtilizationDegreeValueBinaryGenotypeObj);
				
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ExpectedSimulationTimeDegree){
				/* If the Choice object is representing ExpectedSimulationTimeDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double expectedSimulationTimeDegreeValue=(Double) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which expectedSimulationTimeDegreeValue value lies
				 */
				
				List<Integer> expectedSimulationTimeBinaryRep = getExpectedSimulationTimeBinaryRep(expectedSimulationTimeDegreeValue);
				
				BinaryGenotype expectedSimulationTimeDegreeValueBinaryGenotypeObj = new BinaryGenotype(expectedSimulationTimeBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ExpectedSimulationTimeDegree);
				TranslatedGenotype.add(expectedSimulationTimeDegreeValueBinaryGenotypeObj);
				
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ExpectedOperationResponseTimeDegree){
				/* If the Choice object is representing ExpectedOperationResponseTimeDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double expectedOperationResponseTimeDegreeValue=(Double) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which expectedOperationResponseTimeDegree value lies
				 */
				
				List<Integer> expectedOperationResponseTimeBinaryRep = getExpectedOperationResponseTimeBinaryRep(expectedOperationResponseTimeDegreeValue);
				
				BinaryGenotype expectedOperationResponseTimeDegreeValueBinaryGenotypeObj = new BinaryGenotype(expectedOperationResponseTimeBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ExpectedOperationResponseTimeDegree);
				TranslatedGenotype.add(expectedOperationResponseTimeDegreeValueBinaryGenotypeObj);
				
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ExpectedNumberOfElementsDegree){
				/* If the Choice object is representing ExpectedNumberOfElementsDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double expectedNumberOfElementsDegreeValue=(Integer) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which expectedNumberOfElementsDegreeValue value lies
				 */
				
				List<Integer> expectedNumberOfElementsBinaryRep = getExpectedNumberOfElementsBinaryRep(expectedNumberOfElementsDegreeValue);
				
				BinaryGenotype expectedNumberOfElementsDegreeValueBinaryGenotypeObj = new BinaryGenotype(expectedNumberOfElementsBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ExpectedNumberOfElementsDegree);
				TranslatedGenotype.add(expectedNumberOfElementsDegreeValueBinaryGenotypeObj);
				
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ExpectedQueueLengthDegree){
				/* If the Choice object is representing ExpectedQueueLengthDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double expectedQueueLengthDegreeValue=(Integer) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which expectedQueueLengthDegreeValue value lies
				 */
				
				List<Integer> expectedQueueLengthBinaryRep = getExpectedQueueLengthBinaryRep(expectedQueueLengthDegreeValue);
				
				BinaryGenotype expectedQueueLengthDegreeValueBinaryGenotypeObj = new BinaryGenotype(expectedQueueLengthBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ExpectedQueueLengthDegree);
				TranslatedGenotype.add(expectedQueueLengthDegreeValueBinaryGenotypeObj);
				
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ExpectedTaskCountDegree){
				/* If the Choice object is representing ExpectedTaskCountDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double expectedTaskCountDegreeValue=(Integer) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which expectedTaskCountDegreeValue value lies
				 */
				
				List<Integer> expectedTaskCountBinaryRep = getExpectedTaskCountBinaryRep(expectedTaskCountDegreeValue);
				
				BinaryGenotype expectedTaskCountDegreeValueBinaryGenotypeObj = new BinaryGenotype(expectedTaskCountBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ExpectedTaskCountDegree);
				TranslatedGenotype.add(expectedTaskCountDegreeValueBinaryGenotypeObj);
				
			}
			else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof CooldownMaxScalingOperationsConstraintDegree){
				/* If the Choice object is representing CooldownMaxScalingOperationsConstraintDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double cooldownMaxScalingOperationsConstraintDegreeValue=(Integer) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which cooldownMaxScalingOperationsConstraintDegreeValue value lies
				 */
				
				List<Integer> coolmaxscopconstrBinaryRep = getCooldownMaxScalingOperationsBinaryRep(cooldownMaxScalingOperationsConstraintDegreeValue);
				
				BinaryGenotype cooldmaxscopconstrDegreeValueBinaryGenotypeObj = new BinaryGenotype(coolmaxscopconstrBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.CooldownMaxScalingOperationsConstraintDegree);
				TranslatedGenotype.add(cooldmaxscopconstrDegreeValueBinaryGenotypeObj);
				
			}
			else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof CooldownTimeConstraintDegree){
				/* If the Choice object is representing CooldownTimeConstraintDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double cooldownTimeConstraintDegreeValue=(Double) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which cooldownTimeConstraintDegreeValue value lies
				 */
				
				List<Integer> cooldownTimeConstraintBinaryRep = getCooldownTimeConstraintBinaryRep(cooldownTimeConstraintDegreeValue);
				
				BinaryGenotype cooldownTimeConstraintDegreeValueBinaryGenotypeObj = new BinaryGenotype(cooldownTimeConstraintBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.CooldownTimeConstraintDegree);
				TranslatedGenotype.add(cooldownTimeConstraintDegreeValueBinaryGenotypeObj);
				
			}
			else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof IntervalDurationConstraintDegree){
				/* If the Choice object is representing IntervalDurationConstraintDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double intervalDurationConstraintDegreeValue=(Double) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which intervalDurationConstraintDegreeValue value lies
				 */
				
				List<Integer> intervalDurationConstraintBinaryRep = getIntervalDurationConstraintBinaryRep(intervalDurationConstraintDegreeValue);
				
				BinaryGenotype intervalDurationConstraintDegreeValueBinaryGenotypeObj = new BinaryGenotype(intervalDurationConstraintBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.IntervalDurationConstraintDegree);
				TranslatedGenotype.add(intervalDurationConstraintDegreeValueBinaryGenotypeObj);
				
			}
			else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof IntervalOffsetConstraintDegree){
				/* If the Choice object is representing IntervalOffsetConstraintDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double intervalOffsetConstraintDegreeValue=(Double) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which intervalOffsetConstraintDegreeValue value lies
				 */
				
				List<Integer> intervalOffsetConstraintBinaryRep = getIntervalOffsetConstraintBinaryRep(intervalOffsetConstraintDegreeValue);
				
				BinaryGenotype intervalOffsetConstraintDegreeValueBinaryGenotypeObj = new BinaryGenotype(intervalOffsetConstraintBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.IntervalOffsetConstraintDegree);
				TranslatedGenotype.add(intervalOffsetConstraintDegreeValueBinaryGenotypeObj);
				
			}
			else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ThrashingConstraintDegree){
				/* If the Choice object is representing ThrashingConstraintDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double thrashingConstraintDegreeValue=(Double) ChoiceIterator.getValue(); 
				/* Now determine the interval 
				 * in which thrashingConstraintDegreeValue value lies
				 */
				
				List<Integer> thrashingConstraintBinaryRep = getThrashingConstraintBinaryRep(thrashingConstraintDegreeValue);
				
				BinaryGenotype thrashingConstraintDegreeValueBinaryGenotypeObj = new BinaryGenotype(thrashingConstraintBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ThrashingConstraintDegree);
				TranslatedGenotype.add(thrashingConstraintDegreeValueBinaryGenotypeObj);
				
			}
			else throwOutOfScopeDegreeException(ChoiceIterator.getDegreeOfFreedomInstance());
		}
	 
		return TranslatedGenotype;
	}
	
	

	

	

	/** Translates the given {@link FinalBinaryGenotype} named FBGenotype to a 
	 * {@link DesignDecisionGenotype}.
	 * @param FBGenotype
	 * @return
	 */
	public DesignDecisionGenotype translateFinalBinaryGenotype(FinalBinaryGenotype FBGenotype){
		 
		// First create a list of BinaryGenotype Objects
		List<BinaryGenotype> TranslatedBGObjects = new ArrayList<BinaryGenotype>();
		for(int i=0; i < FBGenotype.getBitsPerDegree().size(); i++){
			List<Integer> BinaryString = new ArrayList<Integer>();
			for(int j = 0; j < FBGenotype.getBitsPerDegree().get(i); j++){
				BinaryString.add(FBGenotype.getBinaryGenotype().remove(0));
			}
			BinaryGenotype BGObject = new BinaryGenotype(BinaryString, FBGenotype.getOrderOfDegrees().get(i));
			TranslatedBGObjects.add(BGObject);
		}
		// Now, TranslatedBGObjects is a list of BinaryGenotypeObjects
		
		//Make them compatible
		makeCompatible(TranslatedBGObjects);
		/* In the following for loop,
		 * we have to take each BinaryGenotype Object
		 * and convert to corresponding Choice Objects
		 */
		List<Choice> ChoiceObjectList = new ArrayList<Choice>();
		
		for(int i = 0 ; i < TranslatedBGObjects.size() ; i++ ){
			
			if(TranslatedBGObjects.get(i).getDegreeType().toString() == "ContinuousProcessingRateDegree" ){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				logger.info(BinaryList);
				ContinousRangeChoice ChoiceObject = designdecisionFactory.eINSTANCE.createContinousRangeChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						
						// Old code -------------------------------------------
						// /* Create a 
						//  * random value between
						//  * SERVER_INTERVALS[j] AND SERVER_INTERVALS[j-1] 
						//  */
						// double ServerSpeedValue = Math.random()*(SERVER_INTERVALS[j]-SERVER_INTERVALS[j-1])+SERVER_INTERVALS[j-1];
						// ChoiceObject.setValue(ServerSpeedValue);
					    // -----------------------------------------------------
						
						// New Code --------------------------------------------
						/* Take out a random value from the archive storage 
						 * from the jth ArrayList
						 */
						Random rnum = new Random();
						//logger.info(this.ContinuousProcessingRateArchiveStorage.get(j).size());
						
						double ServerSpeedValue = (Double) ((ArrayList<ArrayList<Double>>) this.ContinuousProcessingRateArchiveStorage.get(i).get(0)).get(j).get(rnum.nextInt(((ArrayList<ArrayList<Double>>) this.ContinuousProcessingRateArchiveStorage.get(i).get(0)).get(j).size()));
						ChoiceObject.setValue(ServerSpeedValue);
								
						logger.info("Adapter Line 528: The ServerSpeedValue is " + ((Double)ServerSpeedValue).toString());
						
					}
				}
				ContinuousProcessingRateDegree DegreeObject = specificFactory.eINSTANCE.createContinuousProcessingRateDegree(); 
				DegreeObject.setEntityName("Server Speed");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add((ContinousRangeChoice)ChoiceObject);
			}else if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.ResourceSelectionDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				Choice ChoiceObject = designdecisionFactory.eINSTANCE.createClassChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						((ClassChoice) ChoiceObject).setChosenValue(WEBSERVERS.get(j));
					}
				}
				ResourceSelectionDegree DegreeObject = specificFactory.eINSTANCE.createResourceSelectionDegree(); 
				DegreeObject.setEntityName("WebServer");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}else if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.AllocationDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				ClassChoice ChoiceObject = designdecisionFactory.eINSTANCE.createClassChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						ChoiceObject.setChosenValue(SERVERS.get(j));
					}
				}
				AllocationDegree DegreeObject = specificFactory.eINSTANCE.createAllocationDegree(); 
				DegreeObject.setEntityName("Allocation Degree");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}else if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.AssembledComponentDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				ClassChoice ChoiceObject = designdecisionFactory.eINSTANCE.createClassChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						ChoiceObject.setChosenValue(COMPONENTS.get(j));
					}
				}
				AssembledComponentDegree DegreeObject = specificFactory.eINSTANCE.createAssembledComponentDegree(); 
				DegreeObject.setEntityName("AssembledComponent Degree");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}else if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.CapacityDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				DiscreteRangeChoice ChoiceObject = designdecisionFactory.eINSTANCE.createDiscreteRangeChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						
						// Old code -------------------------------------------
						// /* Create a 
						//  * random value between
						//  * SERVER_INTERVALS[j] AND SERVER_INTERVALS[j-1] 
						//  */
						 int CapacityDegreeValue = 1;//Math.random()*(CAPACITYDEGREE_INTERVALS[j]-CAPACITYDEGREE_INTERVALS[j-1])+CAPACITYDEGREE_INTERVALS[j-1];
						 ChoiceObject.setValue(CapacityDegreeValue);
					    // -----------------------------------------------------
						
					}
				}
				CapacityDegree DegreeObject = specificFactory.eINSTANCE.createCapacityDegree(); 
				DegreeObject.setEntityName("Capacity Degree");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}else throwUnidentifiedObjectException(TranslatedBGObjects.get(i).getDegreeType());
		}
		// Here in ChoiceObjectList, a list of Choice objects have been created
		// Now create a Candidate object
		logger.info("Line 595: FBGeno");
		Candidate CandidateObject = designdecisionFactory.eINSTANCE.createCandidate();
		CandidateObject.getChoices().addAll(ChoiceObjectList);
		DesignDecisionGenotype FinalDesignDecisionGenotype=new DesignDecisionGenotype(CandidateObject);
		return FinalDesignDecisionGenotype;
	}
	
	/**
	 * Converts the input value of server speed
	 * to a binary string according to the 
	 * server-speed intervals specified in the field
	 * SERVER_INTERVALS
	 * @param serverSpeed
	 * @return
	 */
	private List<Integer> getServerBinaryRep(double serverSpeed, int key) {
		Double[] Server_Intervals = new Double[((List<Double>) this.ContinuousProcessingRateArchiveStorage.get(key).get(1)).size()];
		((List<Double>) this.ContinuousProcessingRateArchiveStorage.get(key).get(1)).toArray(Server_Intervals);
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<Server_Intervals.length;i++){
			if(serverSpeed< Server_Intervals[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	/**
	 * Converts the input value of webServer (an EObject)
	 * to a binary string according to the 
	 * {@link List} of EObjects stored
	 * in the field WEBSERVERS
	 * @param webServer
	 * @return
	 */
	private List<Integer> getWebServerBinaryRep(EObject webServer) {
		// TODO Auto-generated method stub
		
		List<Integer> Result = new ArrayList<Integer>(); // For returning the final result
		
		for(int i=0;i<WEBSERVERS.size();i++){
			if(webServer.equals(WEBSERVERS.get(i))){
				Result.add(1);
			}else{
				Result.add(0);
			}
		}
		return Result;
	}
	
	/**
	 * Converts the input value of allocatedServer (an EObject)
	 * to a binary string according to the 
	 * {@link List} of EObjects stored
	 * in the field SERVERS
	 * @param allocatedServer
	 * @return
	 */
	private List<Integer> getAllocatedServerBinaryRep(EObject allocatedServer) {
		// TODO Auto-generated method stub
		
		List<Integer> Result = new ArrayList<Integer>(); // For returning the final result
		
		for(int i=0;i<SERVERS.size();i++){
			if(allocatedServer.equals(SERVERS.get(i))){
				Result.add(1);
			}else{
				Result.add(0);
			}
		}
		return Result;
	}
	
	private List<Integer> getAllocatedComponentBinaryRep(EObject allocatedComponent) {
		// TODO Auto-generated method stub
		List<Integer> Result = new ArrayList<Integer>(); // For returning the final result
		
		for(int i=0;i<COMPONENTS.size();i++){
			if(allocatedComponent.equals(COMPONENTS.get(i))){
				Result.add(1);
			}else{
				Result.add(0);
			}
		}
		return Result;
	}
	
	private List<Integer> getCapacityBinaryRep(double capacityDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<CAPACITYDEGREE_INTERVALS.length;i++){
			if(capacityDegreeValue< SERVER_INTERVALS[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getTargetGroupSizeMaxConstraintBinaryRep(double targetGroupSizeMaxConstraintDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<TARGETGROUPSIZEMAXCONSTRAINTDEGREE.length;i++){
			if(targetGroupSizeMaxConstraintDegreeValue< TARGETGROUPSIZEMAXCONSTRAINTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getTargetGroupSizeMinConstraintBinaryRep(double targetGroupSizeMinConstraintDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<TARGETGROUPSIZEMINCONSTRAINTDEGREE.length;i++){
			if(targetGroupSizeMinConstraintDegreeValue< TARGETGROUPSIZEMINCONSTRAINTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getStepAdjustmentBinaryRep(double stepAdjustmentDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<STEPADJUSTMENTDEGREE.length;i++){
			if(stepAdjustmentDegreeValue< STEPADJUSTMENTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getAbsoluteAdjustmentBinaryRep(double absoluteAdjustmentDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<ABSOLUTEADJUSTMENTDEGREE.length;i++){
			if(absoluteAdjustmentDegreeValue< ABSOLUTEADJUSTMENTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getRelativeAdjustmentBinaryRep(double relativeAdjustmentDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<RELATIVEADJUSTMENTDEGREE.length;i++){
			if(relativeAdjustmentDegreeValue< RELATIVEADJUSTMENTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getExpectedCPUUtilizationBinaryRep(double expectedCPUUtilizationDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<EXPECTEDCPUUTILIZATIONDEGREE.length;i++){
			if(expectedCPUUtilizationDegreeValue< EXPECTEDCPUUTILIZATIONDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getExpectedMemoryUtilizationBinaryRep(double expectedMemoryUtilizationDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<EXPECTEDMEMORYUTILIZATIONDEGREE.length;i++){
			if(expectedMemoryUtilizationDegreeValue< EXPECTEDMEMORYUTILIZATIONDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getExpectedHDDUtilizationBinaryRep(double expectedHDDUtilizationDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<EXPECTEDHDDUTILIZATIONDEGREE.length;i++){
			if(expectedHDDUtilizationDegreeValue< EXPECTEDHDDUTILIZATIONDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getExpectedNetworkUtilizationBinaryRep(double expectedNetworkUtilizationDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<EXPECTEDNETWORKUTILIZATIONDEGREE.length;i++){
			if(expectedNetworkUtilizationDegreeValue< EXPECTEDNETWORKUTILIZATIONDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getExpectedSimulationTimeBinaryRep(double expectedSimulationTimeDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<EXPECTEDSIMULATIONTIMEDEGREE.length;i++){
			if(expectedSimulationTimeDegreeValue< EXPECTEDSIMULATIONTIMEDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getExpectedOperationResponseTimeBinaryRep(double expectedOperationResponseTimeDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<EXPECTEDOPERATIONRESPONSETIMEDEGREE.length;i++){
			if(expectedOperationResponseTimeDegreeValue< EXPECTEDOPERATIONRESPONSETIMEDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getExpectedNumberOfElementsBinaryRep(double expectedNumberOfElementsDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<EXPECTEDNUMBEROFELEMENTSDEGREE.length;i++){
			if(expectedNumberOfElementsDegreeValue< EXPECTEDNUMBEROFELEMENTSDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getExpectedQueueLengthBinaryRep(double expectedQueueLengthDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<EXPECTEDQUEUELENGTHDEGREE.length;i++){
			if(expectedQueueLengthDegreeValue< EXPECTEDQUEUELENGTHDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getExpectedTaskCountBinaryRep(double expectedTaskCountDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<EXPECTEDTASKCOUNTDEGREE.length;i++){
			if(expectedTaskCountDegreeValue< EXPECTEDTASKCOUNTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getCooldownMaxScalingOperationsBinaryRep(double cooldownMaxScalingOperationsConstraintDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<COOLDOWNMAXSCALINGOPERATIONSCONSTRAINTDEGREE.length;i++){
			if(cooldownMaxScalingOperationsConstraintDegreeValue< COOLDOWNMAXSCALINGOPERATIONSCONSTRAINTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getCooldownTimeConstraintBinaryRep(double cooldownTimeConstraintDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<COOLDOWNTIMECONSTRAINTDEGREE.length;i++){
			if(cooldownTimeConstraintDegreeValue< COOLDOWNTIMECONSTRAINTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getIntervalDurationConstraintBinaryRep(double intervalDurationConstraintDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<INTERVALDURATIONCONSTRAINTDEGREE.length;i++){
			if(intervalDurationConstraintDegreeValue< INTERVALDURATIONCONSTRAINTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getIntervalOffsetConstraintBinaryRep(double intervalOffsetConstraintDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<INTERVALOFFSETCONSTRAINTDEGREE.length;i++){
			if(intervalOffsetConstraintDegreeValue< INTERVALOFFSETCONSTRAINTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private List<Integer> getThrashingConstraintBinaryRep(double thrashingConstraintDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<THRASHINGCONSTRAINTDEGREE.length;i++){
			if(thrashingConstraintDegreeValue< THRASHINGCONSTRAINTDEGREE[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}

	
	private void throwOutOfScopeDegreeException(DegreeOfFreedomInstance dd) {
		throw new RuntimeException("The degree of freedom "+dd.toString()+" is out of scope for the current version of Adapter.");		
	}
	
	private void throwUnidentifiedObjectException(Object dd) {
		throw new RuntimeException("The object "+dd.toString()+" is not identified/out of scope for the current version of Adapter.");		
	}
	
	private void makeCompatible(List<BinaryGenotype> bg){
		for(int i = 0 ; i < bg.size() ; i++){
			List<Integer> binaryList = bg.get(i).getInternalList();
			if(!binaryList.contains(1)){
				// randomly set any element to 1
				Random random = new Random();
				binaryList.set(random.nextInt(binaryList.size()-1), 1);
			}else{
				int index = 0;
				for(int j = 0 ; j < binaryList.size() ; j++){
					if(binaryList.get(j) == 1){
						index = j;
					}
				}
				for(int j = 0 ; j < binaryList.size() ; j++){
					if(j != index){
						binaryList.set(j, 0);
					}
				}
				bg.get(i).setInternalList(binaryList);	
			}
			
		}
	}
	
}
