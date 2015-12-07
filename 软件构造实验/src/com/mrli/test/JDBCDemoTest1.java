package com.mrli.test;

import com.mrli.dboperator.JDBCDemo;
import com.mrli.objects.MajorPlan;
import com.mrli.objects.TrainingPlan;

public class JDBCDemoTest1 {

//	/**
//	 * 测试对TrainingPlan数据的完整查询
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		JDBCDemo jdbc = new JDBCDemo();
//		TrainingPlan tp = new TrainingPlan("2002", "",0,0,0);
//		List<IColumns> cl = jdbc.select(tp, tp.toTableName(), tp.toPrimaryKeyName(), tp.toPrimaryKeyValue());
//		System.out.println(cl);
//		JDBCDemoTrainingPlan jdbcdt = new JDBCDemoTrainingPlan();
//		System.out.println(jdbcdt.select(tp));
//	}
	
	public static void main(String[] args) {
		JDBCDemo jdbc = new JDBCDemo();
		TrainingPlan tp = new TrainingPlan("2004", "", 0, 0, 0);
		jdbc.insert(tp);
		MajorPlan[] mps = new MajorPlan[20];
		for (int i = 0; i < mps.length; i++) {
			mps[i] = new MajorPlan("pppp", "101"+i, "", "", 1, "", "2004");
			jdbc.insert(mps[i]);
		}
		jdbc.select(tp, tp.toTableName(), tp.toPrimaryKeyName(), tp.toPrimaryKeyValue());
	}
}
