package com.zengyin.line;

public class MySingleLinkedList implements List{
	private Node head;
	
	private int size;
	
	Node p = head;
	
	public MySingleLinkedList(){
		head = new Node(null);
		size = 0;
	}
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object get(int i) {
		check(i);
		//Node p = head;
		for(int j = 0 ;j<=i;j++){
			p = p.next;
		}
		return p.data;
	}

	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}

	@Override
	public boolean contains(Object e) {
		//Node p = head;
		for(int j = 0 ;j<size;j++){
			p = p.next;
			if(p.data.equals(e))
			return true;	
		}
		return false;
	}

	@Override
	public int indexOf(Object e) {
		//Node p = head;
		for(int j = 0 ;j<size;j++){
			p = p.next;
			if(p.data.equals(e))
			return j;	
		}
		return -1;
	}

	@Override
	public void add(int i, Object e) {
		check(i);
		//Node p = head;
		for(int j = 0;j<i;j++){
			p = p.next;
		}
		//创建一个新节点
		Node newNode = new Node(e);
		
		//指明新节点的直接后继节点
		newNode.next = p.next;
		//指明新节点的直接前驱节点
		p.next = newNode;
		size++;
		
	}

	@Override
	public void add(Object e) {
		add(size,e);
		
	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		//Node p = head;
		for(int j = 0 ;j<=size;j++){
			p = p.next;
			if(p.next.data.equals(obj)){
				Node newNode = new Node(e);
				newNode.next = p.next;
				p.next = newNode;
				return true;
			}
				
		}
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		//Node p = head;
		for(int j = 0 ;j<size;j++){
			p = p.next;
			if(p.data.equals(obj)){
				Node newNode = new Node(e);
				newNode.next = p.next;
				p.next = newNode;
				return true;
			}
				
		}
		return false;
	}

	@Override
	public Object remove(int i) {
		//Node p = head;
		for(int j = 0 ;j<i;j++){
			p = p.next;
				
		}
		Object obj = p.next.data;
		p.next = p.next.next;
		return obj;
	}

	@Override
	public boolean remove(Object e) {
		//Node p = head;
		for(int j = 0 ;j<size;j++){
			p = p.next;
			if(p.next.data.equals(e)){
				p.next = p.next.next;
			    return true;
			}
				
		}
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		//Node p = head;
		for(int j =0 ; j<i;j++){
			p = p.next;
		}
		Node newNode = new Node(e);
		Object obj = p.next.data;
		newNode.next = p.next.next;
		p.next = newNode;
		return obj;
	}

	@Override
	public void display() {
		
		while(p!=null){ 
			System.out.println(p.data);	
			p = p.next;
		}
	}
	@Override
	public String toString() {
		return "MySingleLinkedList [head=" + head + ", size=" + size + "]";
	}
	public void check(int i){
		if(i<0 || i>size){
			try {
				throw new MyArrayIndexOutOfBoundsException("数组指针索引越界异常:" + i);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}	
	}

}
