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
 * 对数据库操作的集合
 * @author MrLi
 */
public class JDBCDemo {
	/**
	 * 完整版
	 * 创建表
	 */
	public void createTable(IColumns column){
		JDBCOperator jdbc = new JDBCOperator();
		jdbc.LoadDriver();
		jdbc.getConnection();
		/**
		 * 开始执行建表操作
		 */
		jdbc.constructSQLStatement_createTable(column);
		jdbc.createStatementObject();
		jdbc.executeUpdate();
		jdbc.close();
	}
	/**
	 * 完整版
	 * 删除表
	 */
	public void dropTable( IColumns column){
		JDBCOperator jdbc = new JDBCOperator();
		jdbc.LoadDriver();
		jdbc.getConnection();
		/**
		 * 开始执行删表操作
		 */
		jdbc.constructSQLStatement_dropTable(column);
		jdbc.createStatementObject();
		jdbc.executeUpdate();
		jdbc.close();
	}
	/**
	 * 完成版
	 * 插入操作
	 */
	public boolean insert(IColumns column){
//			String sqlInsert = "use mysql insert into " 
//							+ umi.getTableName() + " "
//							+ umi.toColumn() + " "
//							+ "valuse( "
//							+ umi.toColumnValue()
//							+ ")";
		JDBCOperator jdbc = new JDBCOperator();
		// 1 加载驱动程序
		jdbc.LoadDriver();
//			System.out.println("加载成功");
		// 2 获取数据库连接
		jdbc.getConnection();
//			System.out.println("连接成功");
		// 3 构造SQL 语句
		jdbc.constructSQLStatement_insertOneRow(column);
//			jdbc.sqlStatement = sqlInsert;
		// 4, 构造一个statement实例(用来发送sql语句的载体)
		jdbc.createStatementObject();
		// 5, 执行SQL 语句
		int result = jdbc.executeUpdate();
		// 6, 关闭连接
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
	 * 查询
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
		 * 开始执行查询操作
		 */
		jdbc.constructSQLStatement_selectOneRow(column, tableName, primaryKeyName, primaryKeyValue);
		jdbc.createStatementObject();
		rs = jdbc.executeQuery();
//				System.out.println("result set size: " + rs.getFetchSize());
		/**
		 * 处理结果集
		 * 先处理结果集, 再关闭数据库
		 */
		List<IColumns> columnList = new LinkedList<IColumns>();
				/**
				 *  处理结果集
				 */
		try {
			/**
			 * 若结果不为空
			 * 若结果集不为空
			 */
			if( rs != null && !rs.wasNull()){
				/**
				 * 若结果集中还有元组
				 */
								/**
								 * 此处有一个可以优化的地方
								 * 为避免每次创建一个表时, 要写的大量String的方法
								 * 在此, 利用反射机制
								 * 动态生成这些字符串
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
						System.out.println("意外");
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
	 * 辅助操作
	 */
	/**
	 * 获得列的个数
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
	 * 获得主键名
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