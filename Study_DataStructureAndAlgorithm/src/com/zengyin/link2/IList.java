package com.zengyin.link2;

public interface IList {
	public void clear();//���Ա���ÿղ���
	public boolean isEmpty();//�ж����Ա��Ƿ�Ϊ��
	public int length();//�����Ա�������Ԫ�ظ�����������ֵ
	public Object get(int i);//��ȡ���������Ա��еĵ�i��Ԫ�ص�ֵ i��ȡֵ��ΧΪ0~length()-1
	public void insert(Object x);//����Ԫ��x
	public void insert(int index , Object x);//�����Ա��i��Ԫ��ǰ����Ԫ��x
	public void remove(int i);//ɾ�����Ա��е�i��Ԫ��
	public int indexOf(Object x);//�������Ա����״γ���x��Ϊ���,��������,�򷵻�-1
	public void display();//������Ա��еĸ���Ԫ�ص�ֵ
	public  void cheak(int index);//������Ա��±��Ƿ�Խ��
}
