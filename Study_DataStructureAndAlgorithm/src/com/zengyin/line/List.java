package com.zengyin.line;
/**
 * ���Ա�ӿ�
 * �ʹ洢�ṹ�޹�
 * */
public interface List {
	//�������Ա�Ĵ�С,����Ԫ�صĸ���
	public int size();
	//�������Ա������Ϊi������Ԫ��
	public Object get(int i);
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty();
	//�ж����Ա��Ƿ��������Ԫ��e
	public boolean contains(Object e);
	//��������Ԫ��e�����Ա��е����
	public int indexOf(Object e);
	//��Ԫ��e��ӵ���i��λ��
	public void add(int i , Object e);
	//������Ԫ��e��ӵ����Ա�ĩβ
	public void add(Object e);
	//������Ԫ��e���뵽Ԫ��obj֮ǰ
	public boolean addBefore(Object obj , Object e);
	//������Ԫ��e���뵽Ԫ��obj֮��
	public boolean addAfter(Object obj , Object e);
	//ɾ�����Ա����Ϊi��Ԫ��,������Ԫ��
	public Object remove(int i);
	//ɾ�����Ա��е�һ����e��ͬ��Ԫ��
	public boolean remove(Object e);
	//�滻���Ա������Ϊi������Ԫ��e,��������Ԫ��
	public Object replace(int i , Object e);
	//�������Ԫ�ص�ֵ
	public void display();
}
