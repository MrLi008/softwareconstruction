package com.mrli.dboperator;

import java.util.List;

import com.mrli.interfaces.IColumns;

/**
 * 
 * @author MrLi
 *
 */
public class BridgeOfDataAndFrame {
	
	private static JDBCDemo jdbc = new JDBCDemo();
	/**
	 * 查询
	 * 用户名和密码一致性判断
	 */
	public static boolean isSame( IColumns column){
		boolean flag = true;
		List<IColumns> js = jdbc.select(column, column.toTableName(), column.toPrimaryKeyName(), column.toPrimaryKeyValue());
		System.out.println(js.toString());
		System.out.println(column.toString());
		if( js != null 
				&& !js.isEmpty() ){
			IColumns c = js.get(0);
			String[] values = c.toValue().split(",");
			String[] values1 = column.toValue().split(",");
			for( int i=0; i < values.length; i++){
				System.out.println(values[i] + ":" + values1[i]);
				if( !values[i].equals(values1[i])){
					flag = false;
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}

}
