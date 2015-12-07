package com.xie.services.majorplan;

import java.util.LinkedList;
import java.util.List;

import com.xie.persistences.MajorPlanDao;

/**
 * 
 * @author MrLi
 *
 */
public class MajorPlan {

	private String IDMajor;
	private String nameMajor;
	private String trainingPurpose;
	private String trainingContent;
	private int calssHours;
	private String teacher;
	public MajorPlan(String iDMajor, String nameMajor, String trainingPurpose,
			String trainingContent, int calssHours, String teacher) {
		super();
		IDMajor = iDMajor;
		this.nameMajor = nameMajor;
		this.trainingPurpose = trainingPurpose;
		this.trainingContent = trainingContent;
		this.calssHours = calssHours;
		this.teacher = teacher;
	}
	
	/**
	 * 保存输入信息
	 */
	public boolean save(){
		boolean result = false;
		result = new MajorPlanDao().save(IDMajor,nameMajor,trainingPurpose,
				trainingContent, calssHours, teacher);
		return result;
	}
	/**
	 * 查询
	 */
	public List<MajorPlan> select(){
		List<MajorPlan> majorPlanList = null;//new LinkedList<MajorPlan>();
		// TODO
		majorPlanList = new MajorPlanDao().select(IDMajor,nameMajor,trainingPurpose,
				trainingContent, calssHours, teacher);
		return majorPlanList;
	}
	//TODO
	/**
	 * 修改
	 */
	public void updata(){
		// TODO
	}
}
