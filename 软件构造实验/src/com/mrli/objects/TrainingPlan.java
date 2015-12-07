package com.mrli.objects;

import com.mrli.interfaces.IColumns;

public class TrainingPlan implements IColumns {
	
	/**
	 * Attributes
	 */
	private String IDTrainingPlan;// primary key
	private String nameTrainingPlan;
	private int palnyear;
	private int startData;
	private int endDate;
	
	



	public TrainingPlan() {
		this( "", "", 0, 0, 0);
	}

	public TrainingPlan(String iDTrainingPlan, String nameTrainingPla,
			int palnyear, int startData, int endDate) {
		super();
		IDTrainingPlan = iDTrainingPlan;
		this.nameTrainingPlan = nameTrainingPla;
		this.palnyear = palnyear;
		this.startData = startData;
		this.endDate = endDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TrainingPlan [IDTrainingPlan=" + IDTrainingPlan
				+ ", nameTrainingPlan=" + nameTrainingPlan + ", palnyear="
				+ palnyear + ", startData=" + startData + ", endDate="
				+ endDate + "]";
	}

	/**
	 * @return the iDTrainingPlan
	 */
	public String getIDTrainingPlan() {
		return IDTrainingPlan;
	}

	/**
	 * @return the nameTrainingPla
	 */
	public String getNameTrainingPla() {
		return nameTrainingPlan;
	}

	/**
	 * @return the palnyear
	 */
	public int getPalnyear() {
		return palnyear;
	}

	/**
	 * @return the startData
	 */
	public int getStartData() {
		return startData;
	}

	/**
	 * @return the endDate
	 */
	public int getEndDate() {
		return endDate;
	}


	/**
	 * @param iDTrainingPlan the iDTrainingPlan to set
	 */
	public void setIDTrainingPlan(String iDTrainingPlan) {
		IDTrainingPlan = iDTrainingPlan;
	}

	/**
	 * @param nameTrainingPla the nameTrainingPla to set
	 */
	public void setNameTrainingPla(String nameTrainingPla) {
		this.nameTrainingPlan = nameTrainingPla;
	}

	/**
	 * @param palnyear the palnyear to set
	 */
	public void setPalnyear(int palnyear) {
		this.palnyear = palnyear;
	}

	/**
	 * @param startData the startData to set
	 */
	public void setStartData(int startData) {
		this.startData = startData;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toAttributes() {
		return " "
				+ "IDTrainingPlan char(10) primary key" + ", "
				+ "nameTrainingPlan char(20)" + ", "
				+ "planYear int" + ","
				+ "startDate int" + ","
				+ "endDate int" + ""
				+ " ";
	}

	@Override
	public String toValue() {
		return " "
				+ "\'" + this.getIDTrainingPlan() + "\'" + ", "
				+ "\'" + this.getNameTrainingPla() + "\'" + ", "
				+ "" + this.getPalnyear() + "" + ", "
				+ "" + this.getStartData() + "" + ", "
				+ "" + this.getEndDate() + "" + " "
				+ "";
	}

	@Override
	public String toName() {
		return ""
				+ "IDTrainingPlan" + ", "
				+ "nameTrainingPlan" + ","
				+ "planYear" + ","
				+ "startDate" + ","
				+ "endDate" + " "
				+ "";
	}

	@Override
	public String toTableName() {
		return TablesName.TableNameOfTrainingPlan;
	}

	@Override
	public String toPrimaryKeyName() {
		return "IDTrainingPlan";
	}

	@Override
	public String toPrimaryKeyValue() {
		return ""
				+ "\'" + this.getIDTrainingPlan() + "\'";
	}
}