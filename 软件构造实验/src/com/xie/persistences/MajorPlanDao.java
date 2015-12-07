package com.xie.persistences;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.xie.dto.MajorPlanDTO;
import com.xie.dto.UserDTO;
import com.xie.services.majorplan.MajorPlan;
import com.xie.util.DBUtil;

/**
 * 
 * @author MrLi
 *
 */
public class MajorPlanDao {

	private DBUtil dbUtil;
	private Connection conn;
	
	public MajorPlanDao() {
		dbUtil = new DBUtil();
		conn = dbUtil.getConnection();
	}
	
	public boolean save(String iDMajor, String nameMajor,
			String trainingPurpose, String trainingContent, int calssHours,
			String teacher) {
		boolean result = false;
		QueryRunner qr = new QueryRunner();
		int majorPlanDTO = 0;
		
		String sql = "insert into MajorPlan (IDMajor, nameMajor, trainingPurpose, trainingContent, calssHours,"
				+ "teacher)values("+ "?" + "," + "?" + "," + "?" + "," + "?" + "," + "?" + "," + "?"+ ");";
		String[] params = new String[6];
		params[0] = iDMajor;
		params[1] = nameMajor;
		params[2] = trainingPurpose;
		params[3] = trainingContent;
		params[4] = calssHours + "";
		params[5] = teacher;
		try {
			majorPlanDTO = qr.update(conn, sql, new BeanHandler<UserDTO>(UserDTO.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<MajorPlan> select(String iDMajor, String nameMajor,
			String trainingPurpose, String trainingContent, int calssHours,
			String teacher) {
		return null;
	}
}