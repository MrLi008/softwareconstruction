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
//		TrainingPlan tp = new TrainingPlan("2002", "��ѵ����", 2015, 100, 200);
//		jdbc.insert(tp);
//		List<IColumns> cLink = jdbc.select(tp);
//		if( cLink.size() <= 0 ){
//			System.out.println(" ��ѯ���Ϊ��");
//		} else if( cLink.size() == 1){
//			System.out.println(" ��ѯ���ֻ��һ��Ԫ��: " + cLink.get(0));
//		} else {
//			System.out.println(" ��ѯ�����ֹһ��");
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
//				"רҵ����", 
//				"1005", 
//				"Java�������", 
//				"��ϰJava�������", 
//				10, 
//				"Bruselee",
//				"2003"
//				);
//		jdbc.insert(mp);
//		List<IColumns> cLink = jdbc.select(mp);
//		if( cLink.size() <= 0 ){
//			System.out.println(" ��ѯ���Ϊ��");
//		} else if( cLink.size() == 1){
//			System.out.println(" ��ѯ���ֻ��һ��Ԫ��: " + cLink.get(0));
//		} else {
//			System.out.println(" ��ѯ�����ֹһ��");
//			for( int i=0; i < cLink.size(); i++){
//				System.out.println(cLink.get(i));
//			}
//		}
//	}
//	/**
//	 * ���Բ������ݺͲ�ѯ����
//	 * ��֧��һ���û�����ѯ���������
//	 * UserLogData insert two data
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		JDBCDemo jdbc = new JDBCDemo();
//		UserLogData uld = new UserLogData("�������", "110110");
//		UserLogData uld1 = new UserLogData( "������", "110110");
//		jdbc.insert( uld);
//		jdbc.insert( uld1);
//		List<IColumns> cLink = jdbc.select(uld, uld.toTableName());
//		if( cLink.size() <= 0){
//			System.out.println(" ��ѯ���Ϊ��");
//		} else if( cLink.size() == 1){
//			System.out.println(" ��ѯ���ֻ��һ��Ԫ��: " + cLink.get(0));
//		} else {
//			System.out.println(" ��ѯ�����ֹһ��");
//			for( int i=0; i < cLink.size(); i++){
//				System.out.println(cLink.get(i));
//			}
//		}
//	}
//
//	/**
//	 * �������ݿ����, ���Գɹ���, �������ظ����������ݿ�
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
//				"רҵ����", 
//				"1001", 
//				"Java�������", 
//				"��ϰJava�������", 
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