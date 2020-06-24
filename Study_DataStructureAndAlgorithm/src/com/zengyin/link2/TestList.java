package com.zengyin.link2;

public class TestList {

	public static void main(String[] args) {
		IList list = new SqList(5);
		list.insert("中国");
		list.insert(123);
		list.insert("天津");
		for(int i = 0 ; i<list.length();i++){
			 System.out.println(list.get(i));
		 }
		 System.out.println("-------------");
		 
		 list.insert(1,"hello");
		 
		 for(int i = 0 ; i<list.length();i++){
			 System.out.println(list.get(i));
		 }
		 System.out.println("-------------");
		 list.insert(3,456);
		 System.out.println(list.length());
		 for(int i = 0 ; i<list.length();i++){
			 System.out.println(list.get(i));
		 }
		 System.out.println("-------------");
		
		System.out.println(list.indexOf(456));
		
		list.display();
		/*boolean b =list.isEmpty();
		list.remove(0);
		boolean b1 =list.isEmpty();
		list.remove(0);
		boolean b2 =list.isEmpty();
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2)*/
	}

}
