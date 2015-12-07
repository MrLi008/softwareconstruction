package com.mrli.objects;

import com.mrli.interfaces.IColumns;

public class MajorPlan implements IColumns {
	/**
	 * Attribute
	 */
	private String majorName;
	private String majorID;
	private String trainingPurpose;
	private String trainingContent;
	private int calssHours;
	private String teacher;
	private String IDTrainingPlan;
	
	

	public MajorPlan() {
		this("", "", "", "", 0, "", "");
	}

	public MajorPlan(String majorName, String majorID, String trainingPurpose,
			String trainingContent, int calssHours, String teacher, String IDTrainingPlan) {
		super();
		this.majorName = majorName;
		this.majorID = majorID;
		this.trainingPurpose = trainingPurpose;
		this.trainingContent = trainingContent;
		this.calssHours = calssHours;
		this.teacher = teacher;
		this.IDTrainingPlan = IDTrainingPlan;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MajorPlan [majorName=" + majorName + ", majorID=" + majorID
				+ ", trainingPurpose=" + trainingPurpose + ", trainingContent="
				+ trainingContent + ", calssHours=" + calssHours + ", teacher="
				+ teacher + "]";
	}

	/**
	 * @return the majorName
	 */
	public String getMajorName() {
		return majorName;
	}

	/**
	 * @return the majorID
	 */
	public String getMajorID() {
		return majorID;
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
	 * @return the IDTrainingPlan
	 */
	public String getIDTrainingPlan(){
		return IDTrainingPlan;
	}

	/**
	 * @param majorName the majorName to set
	 */
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	/**
	 * @param majorID the majorID to set
	 */
	public void setMajorID(String majorID) {
		this.majorID = majorID;
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
	
	/**
	 * @param IDTrainingPlan the IDTrainingPlan to set
	 */
	public void setIDTrainingPlan( String IDTrainingPlan){
		this.IDTrainingPlan = IDTrainingPlan;
	}

	@Override
	public String toAttributes() {
		return " "
				+ "majorID char(10) primary key" + ", "
				+ "majorName char(20) " + ", "
				+ "trainingPurpose char(30)" + ", "
				+ "trainingContent char(30)" + ", "
				+ "calssHourse int" + ", "
				+ "teacher char(20)" + ","
				+ "IDTrainingPlan char(10)" + ","
				+ "foreign key " + "(IDTrainingPlan)" + " references " 
				+ TablesName.TableNameOfTrainingPlan + "(IDTrainingPlan)"
				+ " ";
	}

	@Override
	public String toValue() {
		return " "
				+ "\'"
				+ this.getMajorID() + "\'" + ", " + "\'"
				+ this.getMajorName() + "\'" + ", " + "\'"
				+ this.getTrainingPurpose() + "\'" + ", " + "\'"
				+ this.getTrainingContent() + "\'" + ", "
				+ this.getCalssHours() + ", " + "\'"
				+ this.getTeacher() + "\'" + "," + "\'"
				+ this.getIDTrainingPlan() + "\'"
				+ " ";
	}

	@Override
	public String toName() {
		return " "
				+ "majorID" + ", "
				+ "majorName" + ", "
				+ "trainingPurpose" + ", "
				+ "trainingContent" + ", "
				+ "calssHourse" + ", "
				+ "teacher" + ","
				+ "IDTrainingPlan"
				+ " ";
	}

	@Override
	public String toTableName() {
		return TablesName.TableNameOfMajorPlan;
	}

	@Override
	public String toPrimaryKeyName() {
		return " majorID ";
	}

	@Override
	public String toPrimaryKeyValue() {
		return " "
				+ "\'"
				+ this.getMajorID()
				+ "\'";
	}

}
