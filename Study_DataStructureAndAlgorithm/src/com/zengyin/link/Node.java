	package com.zengyin.link;
	
	public class Node {
		//节点数据域
	 private int data;
	 //指向下一个节点
	 Node next;
	 
	 public Node(int data){
		 this.data = data;
	 }
	//手动追加节点
	 public void append(Node node){
		 this.next = node;
		
	 }
	 //自动追加节点
	 public Node append_2(Node node){
		 //定义当前节点
		 Node currentNode = this;
		 //循环向后找
		 while(true){
			 //取出下一个节点
			 Node nextNode = currentNode.next;
			 //如果没有下一个节点
			 if(nextNode == null){
				 break;
			 }
			 //赋给当前节点
			 currentNode = nextNode; 
		 }
		currentNode.next = node;
		return this;
	 }
	 
	 
	 public Node next(){
		 return this.next;
	 }
	 
	 public int getData(){
		 return this.data;
	 }
	public void removeNext(){
		//取出下下一个节点
		Node newNext = next.next ;
		//把下下一个节点设置为当前节点的下一个节点
		this.next = newNext;
		
	}
	//显示所有节点信息
	public void show(){
		Node currentNode = this;
		while(true){
			System.out.println(currentNode.data);
			//取出下一个节点
			currentNode = currentNode.next;
			if(currentNode.next == null){
				break;
			}
		}
	}
	}
