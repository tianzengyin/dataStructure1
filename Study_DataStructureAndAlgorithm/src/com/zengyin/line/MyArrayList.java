package com.zengyin.line;
/**
 * ˳���,�ײ��������
 * */
public class MyArrayList implements List{
    private Object[] elementData;
    private int size;//Ԫ�ظ���
    //final  int DEFAULTSIZE = 4;//����һ��Ĭ�ϴ�С�ĳ���
    public MyArrayList(){
    	//û��ָ������,Ĭ�ϳ���Ϊ4
    	this(4);
    	//elementData = new object[]{};
    }
    
    /**
     * inttialCapacityS����ĳ�ʼ����
     * */
    public MyArrayList(int inttialCapacity){
    	elementData = new Object[inttialCapacity];
    	size = 0;
    }
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object get(int i) {
		check(i);
		return elementData[i];
	}

	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}

	@Override
	public boolean contains(Object e) {
		for(int i = 0;i<elementData.length;i++){
			if(elementData[i].equals(e)){
				return true;
			}
		}
		return false;
	}

	@Override
	public int indexOf(Object e) {
		for(int i = 0;i<elementData.length;i++){
			if(elementData[i].equals(e)){
				return i;
			}
		}
		return -1;
	}

	@Override
	public void add(int i, Object e) {
			check(i);
			if(size<4){
			System.arraycopy(elementData, i, elementData, i+1, size-i);
			elementData[i] = e;
		}else{
			Object[] newelementData = new Object[elementData.length+1];
			System.arraycopy(elementData, 0, newelementData, 0, i);
			System.arraycopy(elementData, i, newelementData, i+1, size-i);
			newelementData[i] = e;
			elementData = newelementData;
		}
		size++;
	}

	@Override
	public void add(Object e) {
		if(size < 4){
		elementData[size] = e;
		}else{
			Object[] newelementData = new Object[elementData.length+1];
			for(int i = 0;i<elementData.length;i++){
				newelementData[i] = elementData[i];
				
			}
			newelementData[elementData.length] = e;
			elementData = newelementData;
		}
		
		size++;
				
	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		for(int i = 0 ; i<elementData.length;i++){
			if(elementData[i].equals(obj)){
				Object[] newelementData = new Object[elementData.length+1];
				System.arraycopy(elementData, 0, newelementData, 0, i);
				System.arraycopy(elementData, i, newelementData, i+1, size-i);
				newelementData[i] = e;
				elementData = newelementData;
				size++;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		for(int i = 0 ; i<elementData.length;i++){
			if(elementData[i].equals(obj)){
				Object[] newelementData = new Object[elementData.length+1];
				System.arraycopy(elementData, 0, newelementData, 0, i+1);
				System.arraycopy(elementData, i+1, newelementData, i+2, size-i-1);
				newelementData[i+1] = e;
				elementData = newelementData;
				size++;
				return true;
			}
		}
		return false;
	}

	@Override
	//ɾ�����Ա����Ϊi��Ԫ��,������Ԫ��
	public Object remove(int i) {
		check(i);
		if(size<=4){
			Object obj = elementData[i];
			System.arraycopy(elementData, i+1, elementData, i, size-i-1);
			size--;
			return obj;
		}else{
		Object[] newelementData = new Object[elementData.length-1];
		    Object obj = elementData[i];
		    System.arraycopy(elementData, 0, newelementData, 0, i);
		    System.arraycopy(elementData, i+1, newelementData, i, size-i-1);
		    elementData = newelementData;
		    size--;
		    return obj;
		}
		
	}

	@Override
	//ɾ�����Ա��е�һ����e��ͬ��Ԫ��
	public boolean remove(Object e) {
		for(int i = 0; i<elementData.length;i++){
			if(elementData[i].equals(e)){
				Object[] newelementData = new Object[elementData.length-1];
				System.arraycopy(elementData, 0, newelementData, 0, i);
			    System.arraycopy(elementData, i+1, newelementData, i, size-i-1);
			    elementData = newelementData;
			    size--;
			    return true;
			}
		}
		return false;
	}

	@Override
	//�滻���Ա������Ϊi������Ԫ��e,��������Ԫ��
	public Object replace(int i, Object e) {
		check(i);
		Object obj = elementData[i];
		elementData[i]=e;
		return obj;
	}
	//�������Ԫ�ص�ֵ
	public void display(){
		for(Object obj :elementData ){
			System.out.println(obj);
		}
	}
	public void check(int i){
		if(i<0|| i>=size){
			try {
				throw new MyArrayIndexOutOfBoundsException("��������Խ�������쳣:" + i);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}

}
