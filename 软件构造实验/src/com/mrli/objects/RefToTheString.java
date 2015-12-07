/**
 * 这个类负责实现
 * 将继承自IColumn的类中所需实现的方法在此自动完成
 */
package com.mrli.objects;

import java.lang.reflect.Field;

import com.mrli.interfaces.IColumns;

/**
 * @author MrLi
 *
 */
public class RefToTheString {

	private static Class<?> getString;
	public RefToTheString(String className) {
		try {
			getString = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public String toAttributes(){
		String str = new String();
		Field[] fields = getString.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			str += fields[i].getName() + " " + fields[i].getType().toString().split(".")
					+ ", ";
		}
		/**
		 * 添加主键
		 */
		str += "primary key ( " + fields[0].getName() + ")";
		return str;
	}
}
