package com.zengyin.package1;
//栈是一种先进后出的线性表
public interface IStack {
	public void clear();//将一个已经存在的栈置成空栈
	public boolean isEmpty();//判断一个栈是否为空,若为空,返回true
	public int length();//返回栈中数据元素的个数
	public Object peek();//读取栈顶元素并返回其值,若为空,返回null
	public void push(Object x) throws Exception;//将数据元素压入栈顶
	public Object pop();//删除并返回栈顶元素
	
	
}
