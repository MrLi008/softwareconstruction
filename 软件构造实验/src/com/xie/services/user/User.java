package com.xie.services.user;

import com.xie.persistences.UserDAO;

public class User {
	private String user_name;
	private String password;
	

	public  User(String name, String psw){
		this.user_name = name;
		this.password = psw;
	}
	
	public boolean findUser(){
		boolean result = false;
		
		result = new UserDAO().findUser(user_name, password);
				
		return result;
	}

	
	
}
