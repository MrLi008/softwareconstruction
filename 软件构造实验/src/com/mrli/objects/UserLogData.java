package com.mrli.objects;

import com.mrli.interfaces.IColumns;

/**
 * 保存用户登陆所需要的信息
 * @author MrLi
 *
 */
public class UserLogData implements IColumns{

	private String userName;
	private String userPassword;

	public UserLogData() {
		this("userName", "123456");
	}
	public UserLogData(String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toValue() {
		return " " 
				+ "\'"
				+ this.getUserName() + "\'" + ", " + "\'"
				+ this.getUserPassword() + "\'"
				+ " ";
	}
	@Override
	public String toName() {
		return " "
				+ "userName " + ", "
				+ "userPassword" 
				+ " ";
	}
	@Override
	public String toTableName() {
		return TablesName.TableNameOfUserLogData;
	}
	@Override
	public String toPrimaryKeyName() {
		return " userName"
				+ " " ;
	}
	@Override
	public String toPrimaryKeyValue() {
		return " " 
				+ "\'"
				+ this.getUserName() + "\'";
	}
	/**
	 * 设置用户名为主键
	 */
	@Override
	public String toAttributes() {
		return " "
//				+ "userName char(25) primary key, "
				+ "userName char(25), "
				+ "userPassword char( 25), "
//				+ "primary key ( userName, userPassword)"
				+ "primary key ( userName )"
				+ " ";
	}
	@Override
	public String toString() {
		return "user {name: " + this.getUserName() 
				+ ", password: " + this.getUserPassword()
				+ "}";
	}
}
