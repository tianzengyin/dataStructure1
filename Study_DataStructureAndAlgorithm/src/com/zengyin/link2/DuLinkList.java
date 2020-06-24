package com.zengyin.link2;

public class DuLinkList implements IList{
    /*private*/ DuLNode head;//头结点
    public DuLinkList(){
    	head = new DuLNode();
    	head.setPrior(head);
    	head.setNext(head);
    	
    }
	@Override
	public void clear() {
		
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public int length() {
		
		return 0;
	}

	@Override
	public Object get(int i) {
		
		return null;
	}

	@Override
	public void insert(Object x) {
	}

	@Override
	public void insert(int index, Object x) {
	}

	@Override
	public void remove(int i) {
	}

	@Override
	public int indexOf(Object x) {
		
		return 0;
	}

	@Override
	public void display() {
	}

	@Override
	public void cheak(int index) {
	}

}
