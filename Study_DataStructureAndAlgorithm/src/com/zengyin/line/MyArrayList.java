package com.zengyin.line;
/**
 * 顺序表,底层采用数组
 * */
public class MyArrayList implements List{
    private Object[] elementData;
    private int size;//元素个数
    //final  int DEFAULTSIZE = 4;//定义一个默认大小的常量
    public MyArrayList(){
    	//没有指定长度,默认长度为4
    	this(4);
    	//elementData = new object[]{};
    }
    
    /**
     * inttialCapacityS数组的初始长度
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
	//删除线性表序号为i的元素,并返回元素
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
	//删除线性表中第一个与e相同的元素
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
	//替换线性表中序号为i的数据元素e,返回数据元素
	public Object replace(int i, Object e) {
		check(i);
		Object obj = elementData[i];
		elementData[i]=e;
		return obj;
	}
	//输出各个元素的值
	public void display(){
		for(Object obj :elementData ){
			System.out.println(obj);
		}
	}
	public void check(int i){
		if(i<0|| i>=size){
			try {
				throw new MyArrayIndexOutOfBoundsException("数组索引越界索引异常:" + i);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}

}
