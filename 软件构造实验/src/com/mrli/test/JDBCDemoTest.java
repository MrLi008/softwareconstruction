package com.mrli.test;

import java.util.List;

import com.mrli.dboperator.JDBCDemo;
import com.mrli.interfaces.IColumns;
import com.mrli.objects.MajorPlan;
import com.mrli.objects.TrainingPlan;
import com.mrli.objects.UserLogData;

public class JDBCDemoTest {
//	/**
//	 * TrainingPlan insert one row data
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		JDBCDemo jdbc = new JDBCDemo();
//		TrainingPlan tp = new TrainingPlan("2002", "培训名称", 2015, 100, 200);
//		jdbc.insert(tp);
//		List<IColumns> cLink = jdbc.select(tp);
//		if( cLink.size() <= 0 ){
//			System.out.println(" 查询结果为空");
//		} else if( cLink.size() == 1){
//			System.out.println(" 查询结果只有一个元素: " + cLink.get(0));
//		} else {
//			System.out.println(" 查询结果不止一个");
//			for( int i=0; i < cLink.size(); i++){
//				System.out.println(cLink.get(i));
//			}
//		}
//	}
//	/**
//	 * MajorPlan insert two row data
//	 */
//	public static void main(String[] args) {
//		JDBCDemo jdbc = new JDBCDemo();
//		MajorPlan mp = new MajorPlan(
//				"专业名称", 
//				"1005", 
//				"Java程序设计", 
//				"练习Java程序设计", 
//				10, 
//				"Bruselee",
//				"2003"
//				);
//		jdbc.insert(mp);
//		List<IColumns> cLink = jdbc.select(mp);
//		if( cLink.size() <= 0 ){
//			System.out.println(" 查询结果为空");
//		} else if( cLink.size() == 1){
//			System.out.println(" 查询结果只有一个元素: " + cLink.get(0));
//		} else {
//			System.out.println(" 查询结果不止一个");
//			for( int i=0; i < cLink.size(); i++){
//				System.out.println(cLink.get(i));
//			}
//		}
//	}
//	/**
//	 * 测试插入数据和查询数据
//	 * 不支持一个用户名查询到多个密码
//	 * UserLogData insert two data
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		JDBCDemo jdbc = new JDBCDemo();
//		UserLogData uld = new UserLogData("大霸王龙", "110110");
//		UserLogData uld1 = new UserLogData( "霸王龙", "110110");
//		jdbc.insert( uld);
//		jdbc.insert( uld1);
//		List<IColumns> cLink = jdbc.select(uld, uld.toTableName());
//		if( cLink.size() <= 0){
//			System.out.println(" 查询结果为空");
//		} else if( cLink.size() == 1){
//			System.out.println(" 查询结果只有一个元素: " + cLink.get(0));
//		} else {
//			System.out.println(" 查询结果不止一个");
//			for( int i=0; i < cLink.size(); i++){
//				System.out.println(cLink.get(i));
//			}
//		}
//	}
//
//	/**
//	 * 创建数据库测试, 测试成功后, 将不再重复创建此数据库
//	 * @param args
//	 */
//	/**
//	 * UserLogData create table
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		JDBCDemo jdbc = new JDBCDemo();
//		UserLogData uld = new UserLogData();
//		jdbc.createTable( uld);
////		jdbc.dropTable( uld);
//		
//	}
//
//	/**
//	 * MajorPlan create table
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		JDBCDemo jdbc = new JDBCDemo();
//		MajorPlan mp = new MajorPlan(
//				"专业名称", 
//				"1001", 
//				"Java程序设计", 
//				"练习Java程序设计", 
//				10, 
//				"Bruselee",
//				"2002"
//				);
//		jdbc.createTable(mp);
////		jdbc.dropTable(mp);
//	}
//	/**
//	 * TrainingPlan create table
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		JDBCDemo jdbc = new JDBCDemo();
//		TrainingPlan tp = new TrainingPlan();
//		jdbc.createTable(tp);
////		jdbc.dropTable(tp);
//	}
}