package com.mrli.interfaces;
/**
 * ÿһ�������������ݿ���඼Ҫʵ�ָ����еķ���
 * ����Ҫ��: �ֵ���
 * @author MrLi
 *
 */
public interface IColumns {
	/**
	 * ת��Ϊ{ ������, ��������}
	 */
	public String toAttributes();
	/**
	 * ת��Ϊ����ֵ
	 * @return
	 */
	public String toValue();
	/**
	 * ת��Ϊÿһ�����Ե�����
	 * @return
	 */
	public String toName();
	/**
	 * �õ��洢�����ݱ���
	 */
	public String toTableName();
	/**
	 * �õ��ؼ�������
	 * ����ͬ��
	 */
	public String toPrimaryKeyName();
	/**
	 * �õ��ؼ���ֵ
	 */
	public String toPrimaryKeyValue();
}