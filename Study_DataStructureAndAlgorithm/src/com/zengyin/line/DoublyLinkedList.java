package com.zengyin.line;

public class DoublyLinkedList implements List {
	private Link head;//头结点
	private Link tail;//尾结点
	private int size;
	/**
	 * Default Constructor
	 */
	public DoublyLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	@Override
	public int size() {
		
		return 0;
	}

	@Override
	public Object get(int i) {
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public boolean contains(Object e) {
		
		return false;
	}

	@Override
	public int indexOf(Object e) {
		
		return 0;
	}

	@Override
	public void add(int i, Object e) {
		Link newLink = new Link(e);
		
	}

	@Override
	public void add(Object e) {
	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		
		return false;
	}

	@Override
	public Object remove(int i) {
		
		return null;
	}

	@Override
	public boolean remove(Object e) {
		
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		
		return null;
	}

	@Override
	public void display() {
	}
	
}
class Link{
	/** Value of node */
	public Object data;
	/** This points to the link in front of the new link */
	public Link next;
	/** This points to the link behind the new link */
	public Link previous;

	/**
	 * Constructor
	 * 
	 * @param data
	 */
	public Link(Object data){
		this.data = data;
	}

	/**
	 * Displays the node
	 */
	public void displayLink(){
		System.out.print(data+" ");
	}

	/**
	 * Main Method
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String args[]){
		DoublyLinkedList myList = new DoublyLinkedList();

	}
}
