package com.mrli.dboperator;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.mrli.interfaces.IColumns;
import com.mrli.objects.MajorPlan;
import com.mrli.objects.TablesName;
import com.mrli.objects.TrainingPlan;
import com.mrli.objects.UserLogData;
/**
 * �����ݿ�����ļ���
 * @author MrLi
 */
public class JDBCDemo {
	/**
	 * ������
	 * ������
	 */
	public void createTable(IColumns column){
		JDBCOperator jdbc = new JDBCOperator();
		jdbc.LoadDriver();
		jdbc.getConnection();
		/**
		 * ��ʼִ�н������
		 */
		jdbc.constructSQLStatement_createTable(column);
		jdbc.createStatementObject();
		jdbc.executeUpdate();
		jdbc.close();
	}
	/**
	 * ������
	 * ɾ����
	 */
	public void dropTable( IColumns column){
		JDBCOperator jdbc = new JDBCOperator();
		jdbc.LoadDriver();
		jdbc.getConnection();
		/**
		 * ��ʼִ��ɾ�����
		 */
		jdbc.constructSQLStatement_dropTable(column);
		jdbc.createStatementObject();
		jdbc.executeUpdate();
		jdbc.close();
	}
	/**
	 * ��ɰ�
	 * �������
	 */
	public boolean insert(IColumns column){
//			String sqlInsert = "use mysql insert into " 
//							+ umi.getTableName() + " "
//							+ umi.toColumn() + " "
//							+ "valuse( "
//							+ umi.toColumnValue()
//							+ ")";
		JDBCOperator jdbc = new JDBCOperator();
		// 1 ������������
		jdbc.LoadDriver();
//			System.out.println("���سɹ�");
		// 2 ��ȡ���ݿ�����
		jdbc.getConnection();
//			System.out.println("���ӳɹ�");
		// 3 ����SQL ���
		jdbc.constructSQLStatement_insertOneRow(column);
//			jdbc.sqlStatement = sqlInsert;
		// 4, ����һ��statementʵ��(��������sql��������)
		jdbc.createStatementObject();
		// 5, ִ��SQL ���
		int result = jdbc.executeUpdate();
		// 6, �ر�����
		jdbc.close();
		return result == 0 ?
				false:true;
	}
	public boolean delete( IColumns column){
		JDBCOperator jdbc = new JDBCOperator();
		jdbc.LoadDriver();
		jdbc.getConnection();
		jdbc.constructSQLStatement_deleteOneRow(column);
		jdbc.createStatementObject();
		int result = jdbc.executeUpdate();
		jdbc.close();
		return result == 0 ?
				false:true;
	}
	/**
	 * ��ѯ
	 * 
	 * @param column
	 * @return
	 * @throws SQLException 
	 */
	public List<IColumns> select( IColumns column, String tableName, String primaryKeyName, String primaryKeyValue){
		ResultSet rs = null;
		JDBCOperator jdbc = new JDBCOperator();
		jdbc.LoadDriver();
		jdbc.getConnection();
		/**
		 * ��ʼִ�в�ѯ����
		 */
		jdbc.constructSQLStatement_selectOneRow(column, tableName, primaryKeyName, primaryKeyValue);
		jdbc.createStatementObject();
		rs = jdbc.executeQuery();
//				System.out.println("result set size: " + rs.getFetchSize());
		/**
		 * ��������
		 * �ȴ�������, �ٹر����ݿ�
		 */
		List<IColumns> columnList = new LinkedList<IColumns>();
				/**
				 *  ��������
				 */
		try {
			/**
			 * �������Ϊ��
			 * ���������Ϊ��
			 */
			if( rs != null && !rs.wasNull()){
				/**
				 * ��������л���Ԫ��
				 */
								/**
								 * �˴���һ�������Ż��ĵط�
								 * Ϊ����ÿ�δ���һ����ʱ, Ҫд�Ĵ���String�ķ���
								 * �ڴ�, ���÷������
								 * ��̬������Щ�ַ���
								 */
				while( rs.next()){
					switch(tableName){
					case TablesName.TableNameOfUserLogData:
						columnList.add( new UserLogData(
								rs.getString("userName").trim(),
								rs.getString("userPassword").trim()
								));
						break;
					case TablesName.TableNameOfMajorPlan:
						columnList.add( new MajorPlan(
								rs.getString("majorID").trim(),
								rs.getString("majorName").trim(),
								rs.getString("trainingPurpose").trim(),
								rs.getString("trainingContent").trim(),
								rs.getInt("calssHourse"),
								rs.getString("teacher").trim(),
								rs.getString("IDTrainingPlan").trim()
								));
						break;
					case TablesName.TableNameOfTrainingPlan:
						columnList.add( new TrainingPlan(
								rs.getString("IDTrainingPlan").trim(),
								rs.getString("nameTrainingPlan").trim(),
								rs.getInt("planYear"),
								rs.getInt("startDate"),
								rs.getInt("endDate")
								));
						break;
					default:
						System.out.println("����");
						break;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("rs: " + rs);
		jdbc.close();
		
		return columnList;
	}
	/**
	 * ��������
	 */
	/**
	 * ����еĸ���
	 */
	public int getColumnCount(ResultSet rs){
		int columnCount = 0;
		try {
			columnCount = rs.getMetaData().getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return columnCount;
	}
	/**
	 * ���������
	 */
	public String getPrimaryKeyName( ResultSet rs){
		String primaryKeyName = "";
		try {
			primaryKeyName = rs.getMetaData().getColumnName(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return primaryKeyName;
	}
}