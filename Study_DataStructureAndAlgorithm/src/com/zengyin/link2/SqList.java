package com.zengyin.link2;

import java.util.List;

public class SqList implements IList{
	
	private Object[] listElem;//线性表的存储空间
	private int curLen;//线性表的长度
	
	//构造方法
	public SqList(int maxSize){
		curLen = 0;
		listElem = new Object[maxSize];
	}
	
	
	
	//线性表的置空操作
	public void clear() {
		curLen = 0;
	}
	//判断线性表是否为空
	public boolean isEmpty() {
		/*if(curLen == 0){
			return true;
		}
		return false;*/
		return curLen == 0;
	}
	//求线性表中数据元素个数并返回其值
	public int length() {
		
		return curLen;
	}
	//读取并返回线性表中的第i个元素的值 i的取值范围为0~length()-1
	public Object get(int index) {
		cheak(index);
		return listElem[index];
	}
	//在线性表第i个元素前插入元素x
	public void insert(int index, Object x) {
		cheak(index);
		Object[] newListElem = new Object[listElem.length+1];
		/*for(int i = 0 ; i<listElem.length;i++){
			if(i == index){
				newListElem[index] = x;break;
			}else{
				
				newListElem[i] = listElem[i];
			}
		}
		for(int j = index+1;j<listElem.length+1; j++){
			newListElem[index+1] = listElem[index];
		}*/
		for(int i = 0;i<listElem.length;i++){
			if(i < index){
				newListElem[i] = listElem[i];
			}else{
				newListElem[i+1] = listElem[i];
			}
		}
		newListElem[index] = x;
		listElem = newListElem;
		curLen++;
		
	}
	//插入元素x
	public void insert(Object x){
		
		Object[] newListElem = new Object[listElem.length+1];
		/*for(int i = 0; i<listElem.length;i++){
			newListElem[i] = listElem[i];
		}*/
		System.arraycopy(listElem, 0, newListElem, 0, listElem.length);
		
		newListElem[curLen] = x;
		
		listElem = newListElem;
		curLen++;		
		
		
	}
	//删除线性表中第i个元素
	public void remove(int index) {
		cheak(index);
		Object[] newListElem = new Object[listElem.length-1];
		for(int i = 0;i<newListElem.length;i++){
			if(i<index){
				newListElem[i] = listElem[i];		
			}else{
				newListElem[i] = listElem[i+1] ;
			}
		}
		
		listElem = newListElem;
		//System.arraycopy(listElem, index+1, listElem, index, listElem.length-index-1);
		curLen--;
	}
	//返回线性表中首次出现x的序号,若不包含,则返回-1
	public int indexOf(Object x) {
		
		for(int i = 0;i<listElem.length;i++){
			if(listElem[i].equals(x))
				return i;
		}
		return -1;
	}
	//输出线性表中的各个元素的值
	public void display() {
		for(Object obj : listElem){
			System.out.println(obj);
		}
	}
	//检查线性表下标是否越界
	public void cheak(int index){
		if(index < 0 || index > listElem.length - 1){
			try {
				throw new Exception("第"+index+"个元素不存在");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
