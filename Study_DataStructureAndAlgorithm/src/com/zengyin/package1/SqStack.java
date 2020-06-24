package com.zengyin.package1;

public class SqStack implements IStack {

	private Object[] stackElem;//对象数组
	private int top;//指向栈顶
	public SqStack(){}
	public SqStack(int maxSize){
		top = 0;
		stackElem = new Object[maxSize];
		
	}
	/**栈置空
	 * */
	public void clear(){
		top = 0;
	}
	/*
	 * 判断是否为空
	 * */
	public boolean isEmpty(){
		if( top == 0)
			return true;
		return false;
		
	}
	public int length(){
		return top;
	}
	//取栈顶元素
	public Object peek(){
		if(!isEmpty()){
			return stackElem[top-1];
		}else
			return null;
	}
	//入栈
	public  void push(Object x) throws Exception{
		if(top == stackElem.length){
			throw new Exception("栈已满");
		}else
			stackElem[top++] = x;
	}
	//出栈
	public Object pop(){
		if(isEmpty()){
			return null;
		}else
			return stackElem[--top];
	}
	public void display(){
		for(int i = top - 1 ; i > 0 ; i++){
			System.out.println(stackElem[i]+" ");
		}
	}
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		SqStack sq = new SqStack(30);
		for(int i=0;i<20;i++){
			
			sq.push(new SqStack());
		}
		
		sq.display();
	}
	
	/*int[] arr = {2,3,4};
	String arr1 = arr.toString();*/
	
}
