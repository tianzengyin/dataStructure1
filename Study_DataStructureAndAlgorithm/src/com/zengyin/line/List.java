package com.zengyin.line;
/**
 * 线性表接口
 * 和存储结构无关
 * */
public interface List {
	//返回线性表的大小,根据元素的个数
	public int size();
	//返回线性表中序号为i的数据元素
	public Object get(int i);
	//判断是否为空
	public boolean isEmpty();
	//判断线性表是否包含数据元素e
	public boolean contains(Object e);
	//返回数据元素e在线性表中的序号
	public int indexOf(Object e);
	//将元素e添加到第i个位置
	public void add(int i , Object e);
	//将数据元素e添加到线性表末尾
	public void add(Object e);
	//将数据元素e插入到元素obj之前
	public boolean addBefore(Object obj , Object e);
	//将数据元素e插入到元素obj之后
	public boolean addAfter(Object obj , Object e);
	//删除线性表序号为i的元素,并返回元素
	public Object remove(int i);
	//删除线性表中第一个与e相同的元素
	public boolean remove(Object e);
	//替换线性表中序号为i的数据元素e,返回数据元素
	public Object replace(int i , Object e);
	//输出各个元素的值
	public void display();
}
