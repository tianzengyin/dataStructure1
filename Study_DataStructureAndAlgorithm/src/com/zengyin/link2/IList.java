package com.zengyin.link2;

public interface IList {
	public void clear();//线性表的置空操作
	public boolean isEmpty();//判断线性表是否为空
	public int length();//求线性表中数据元素个数并返回其值
	public Object get(int i);//读取并返回线性表中的第i个元素的值 i的取值范围为0~length()-1
	public void insert(Object x);//插入元素x
	public void insert(int index , Object x);//在线性表第i个元素前插入元素x
	public void remove(int i);//删除线性表中第i个元素
	public int indexOf(Object x);//返回线性表中首次出现x的为序号,若不包含,则返回-1
	public void display();//输出线性表中的各个元素的值
	public  void cheak(int index);//检查线性表下标是否越界
}
