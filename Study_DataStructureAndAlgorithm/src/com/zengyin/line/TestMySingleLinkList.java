package com.zengyin.line;

public class TestMySingleLinkList {

	public static void main(String[] args) {
		List list = (List) new MySingleLinkedList();
		list.add((Integer)123);
		list.add((Integer)456);
		list.add((Integer)567);
		list.add((Integer)789);
		list.add((Integer)895);
		
		/*//list.add(2 , "天津");
		boolean b = list.contains((Integer)456);
		System.out.println(b);
		System.out.println(list.indexOf((Integer)123));*/
		/*System.out.println(list.get(3));
		//list.display();
		System.out.println(list.size());*/
		
		/*list.addBefore((Integer)456, "天津");
		
		list.addAfter((Integer)456, "河北");*/
		//list.remove(0);
		//list.remove(3);
		list.replace(3, "天津");
		list.display();
	}

}
