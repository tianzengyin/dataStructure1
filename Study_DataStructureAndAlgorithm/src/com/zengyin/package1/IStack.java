package com.zengyin.package1;
//ջ��һ���Ƚ���������Ա�
public interface IStack {
	public void clear();//��һ���Ѿ����ڵ�ջ�óɿ�ջ
	public boolean isEmpty();//�ж�һ��ջ�Ƿ�Ϊ��,��Ϊ��,����true
	public int length();//����ջ������Ԫ�صĸ���
	public Object peek();//��ȡջ��Ԫ�ز�������ֵ,��Ϊ��,����null
	public void push(Object x) throws Exception;//������Ԫ��ѹ��ջ��
	public Object pop();//ɾ��������ջ��Ԫ��
	
	
}
