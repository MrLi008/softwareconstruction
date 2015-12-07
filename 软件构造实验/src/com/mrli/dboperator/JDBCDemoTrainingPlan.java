package com.mrli.dboperator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.mrli.interfaces.IColumns;
import com.mrli.objects.MajorPlan;
import com.mrli.objects.TablesName;
import com.mrli.objects.TrainingPlan;
import com.mrli.objects.util.MapTrainingPlanMajorPlan;

/**
 * ’Î∂‘TrainingPlan select
 * @author MrLi
 *
 */
public class JDBCDemoTrainingPlan {

	private JDBCDemo jdbc = new JDBCDemo();
	
	public Map<TrainingPlan,MapTrainingPlanMajorPlan> select(TrainingPlan tp){
		Map<TrainingPlan, MapTrainingPlanMajorPlan> mp = new HashMap<TrainingPlan, MapTrainingPlanMajorPlan>();
		
		MapTrainingPlanMajorPlan mtpmp = new MapTrainingPlanMajorPlan();
		 List<IColumns> listTrainingPlan = jdbc.select(tp, tp.toTableName(), tp.toPrimaryKeyName(), tp.toPrimaryKeyValue());
		 List<IColumns> listMajorPlan  = new LinkedList<IColumns>();
		if( listTrainingPlan != null && !listTrainingPlan.isEmpty()){
			listMajorPlan = jdbc.select(tp, TablesName.TableNameOfMajorPlan, tp.toPrimaryKeyName(), tp.toPrimaryKeyValue());
		}
		mtpmp.add(listMajorPlan);
		mp.put(tp, mtpmp);
		
		return mp;
	}
	
	public void insert(TrainingPlan tp, List<MajorPlan> mpList){
		JDBCDemo jdbc = new JDBCDemo();
		if( tp != null){
			jdbc.insert(tp);
		}
		if( mpList != null){
			for (int i = 0; i < mpList.size(); i++) {
				jdbc.insert(mpList.get(i));
			}
		}
	}
}
