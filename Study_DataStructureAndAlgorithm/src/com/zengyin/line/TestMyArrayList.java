package com.zengyin.line;

public class TestMyArrayList {

	public static void main(String[] args) {
		List list = new MyArrayList();
		list.add(123);
		list.add(456);
		list.add(567);
		list.add(789);
		list.add(895);
		Object obj = list.replace(2,"中国");
		list.display();
		System.out.println(obj);
		
	}

}
