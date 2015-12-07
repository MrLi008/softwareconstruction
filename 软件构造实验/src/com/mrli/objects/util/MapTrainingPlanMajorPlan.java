package com.mrli.objects.util;

import java.util.LinkedList;
import java.util.List;

import com.mrli.interfaces.IColumns;
import com.mrli.objects.MajorPlan;

/**
 * TrainingPlan Map to MajorPlan
 * 负责保存List< MajorPlan>
 * @author MrLi
 *
 */
public class MapTrainingPlanMajorPlan {
	
	private List<IColumns> majorPlanList;
	
	public MapTrainingPlanMajorPlan() {
		majorPlanList = new LinkedList<IColumns>();
	}

	/**
	 * 添加一个MajorPlan
	 * @param listMajorPlan
	 */
	public void add(IColumns listMajorPlan){
		if( listMajorPlan != null){
			majorPlanList.add(listMajorPlan);
		}
	}
	/**
	 * 添加一个MajorPlanList
	 */
	public void add(List<IColumns> mpList){
		if( mpList != null){
			majorPlanList.addAll(mpList);
		}
	}
	@Override
	public String toString() {
		String str = "MajorPlans: ";
		for (int i = 0; i < majorPlanList.size(); i++) {
			str += majorPlanList.get(i).toString() + ",";
		}
		return str;
	}
}

