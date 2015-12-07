package com.xie.dto;

/**
 * 
 * @author MrLi
 *
 */
public class MajorPlanDTO {

	private String IDMajor;
	private String nameMajor;
	private String trainingPurpose;
	private String trainingContent;
	private int calssHours;
	private String teacher;
	public MajorPlanDTO(String iDMajor, String nameMajor,
			String trainingPurpose, String trainingContent, int calssHours,
			String teacher) {
		super();
		IDMajor = iDMajor;
		this.nameMajor = nameMajor;
		this.trainingPurpose = trainingPurpose;
		this.trainingContent = trainingContent;
		this.calssHours = calssHours;
		this.teacher = teacher;
	}
	/**
	 * @return the iDMajor
	 */
	public String getIDMajor() {
		return IDMajor;
	}
	/**
	 * @return the nameMajor
	 */
	public String getNameMajor() {
		return nameMajor;
	}
	/**
	 * @return the trainingPurpose
	 */
	public String getTrainingPurpose() {
		return trainingPurpose;
	}
	/**
	 * @return the trainingContent
	 */
	public String getTrainingContent() {
		return trainingContent;
	}
	/**
	 * @return the calssHours
	 */
	public int getCalssHours() {
		return calssHours;
	}
	/**
	 * @return the teacher
	 */
	public String getTeacher() {
		return teacher;
	}
	/**
	 * @param iDMajor the iDMajor to set
	 */
	public void setIDMajor(String iDMajor) {
		IDMajor = iDMajor;
	}
	/**
	 * @param nameMajor the nameMajor to set
	 */
	public void setNameMajor(String nameMajor) {
		this.nameMajor = nameMajor;
	}
	/**
	 * @param trainingPurpose the trainingPurpose to set
	 */
	public void setTrainingPurpose(String trainingPurpose) {
		this.trainingPurpose = trainingPurpose;
	}
	/**
	 * @param trainingContent the trainingContent to set
	 */
	public void setTrainingContent(String trainingContent) {
		this.trainingContent = trainingContent;
	}
	/**
	 * @param calssHours the calssHours to set
	 */
	public void setCalssHours(int calssHours) {
		this.calssHours = calssHours;
	}
	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
}
