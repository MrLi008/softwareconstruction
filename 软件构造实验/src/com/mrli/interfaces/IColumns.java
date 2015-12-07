package com.mrli.interfaces;
/**
 * 每一个被保存在数据库的类都要实现该类中的方法
 * 排序要求: 字典序
 * @author MrLi
 *
 */
public interface IColumns {
	/**
	 * 转换为{ 属性名, 属性类型}
	 */
	public String toAttributes();
	/**
	 * 转换为属性值
	 * @return
	 */
	public String toValue();
	/**
	 * 转换为每一个属性的名字
	 * @return
	 */
	public String toName();
	/**
	 * 得到存储该数据表名
	 */
	public String toTableName();
	/**
	 * 得到关键字名称
	 * 不可同名
	 */
	public String toPrimaryKeyName();
	/**
	 * 得到关键字值
	 */
	public String toPrimaryKeyValue();
}