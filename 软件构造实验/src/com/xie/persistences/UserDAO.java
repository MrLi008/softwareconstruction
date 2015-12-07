package com.xie.persistences;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.xie.dto.UserDTO;
import com.xie.util.DBUtil;

public class UserDAO {
	private DBUtil dbUtil;
	private Connection conn;

	public UserDAO() {
		dbUtil = new DBUtil();
		conn = dbUtil.getConnection();
	}

	public boolean findUser(String name, String psw) {
		boolean result = false;
		QueryRunner qr = new QueryRunner();
		UserDTO userDTO = null;
		
		String sql = "select user_name,password from t_base_user_info where user_name=? and password=?";
		String params[] = new String[2];
		params[0] = name;
		params[1] = psw;

		try {
			userDTO = qr.query(conn, sql, new BeanHandler<UserDTO>(UserDTO.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (userDTO != null){
			result = true;
			System.out.println(userDTO.getUser_name()+"  "+userDTO.getPassword());
		}

		return result;
	}

}
