package com.zengyin.link2;

import java.util.List;

public class SqList implements IList{
	
	private Object[] listElem;//���Ա�Ĵ洢�ռ�
	private int curLen;//���Ա�ĳ���
	
	//���췽��
	public SqList(int maxSize){
		curLen = 0;
		listElem = new Object[maxSize];
	}
	
	
	
	//���Ա���ÿղ���
	public void clear() {
		curLen = 0;
	}
	//�ж����Ա��Ƿ�Ϊ��
	public boolean isEmpty() {
		/*if(curLen == 0){
			return true;
		}
		return false;*/
		return curLen == 0;
	}
	//�����Ա�������Ԫ�ظ�����������ֵ
	public int length() {
		
		return curLen;
	}
	//��ȡ���������Ա��еĵ�i��Ԫ�ص�ֵ i��ȡֵ��ΧΪ0~length()-1
	public Object get(int index) {
		cheak(index);
		return listElem[index];
	}
	//�����Ա��i��Ԫ��ǰ����Ԫ��x
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
	//����Ԫ��x
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
	//ɾ�����Ա��е�i��Ԫ��
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
	//�������Ա����״γ���x�����,��������,�򷵻�-1
	public int indexOf(Object x) {
		
		for(int i = 0;i<listElem.length;i++){
			if(listElem[i].equals(x))
				return i;
		}
		return -1;
	}
	//������Ա��еĸ���Ԫ�ص�ֵ
	public void display() {
		for(Object obj : listElem){
			System.out.println(obj);
		}
	}
	//������Ա��±��Ƿ�Խ��
	public void cheak(int index){
		if(index < 0 || index > listElem.length - 1){
			try {
				throw new Exception("��"+index+"��Ԫ�ز�����");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
