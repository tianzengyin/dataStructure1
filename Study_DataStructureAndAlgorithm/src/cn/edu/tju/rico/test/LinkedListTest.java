package cn.edu.tju.rico.test;

import cn.edu.tju.rico.list.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) throws Exception {
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Rico");
		list1.add("Rico");
		list1.add("Livia");
		list1.add("TJU");
		list1.add("Livia");
		list1.add("NEU");
		list1.add("NEU");
		list1.add("Rico");
		list1.add("NEU");
		
		System.out.println("ԭ����");
		list1.print();
		System.out.println();
		
		list1.remove();
		System.out.println("ɾ��β�ڵ�������");
		list1.print();
		
		System.out.println();
		
		list1.removeDuplicateNodes();
		System.out.println("ɾ���ظ���������");
		list1.print();
		System.out.println();
		
		System.out.println("��ӡ������K���ڵ㣺");
		System.out.println(list1.getEndK(2));
		System.out.println();
		
		list1.reverseLinkedList();
		System.out.println("��ת����");
		list1.print();
		list1.reverseLinkedList();
		list1.print();
		System.out.println();
		
		System.out.println("�����ӡ����");
		list1.reversePrint(list1.getHead());
		System.out.println();
		System.out.println();
		
		System.out.println("��ӡ�����м�ڵ㣺");
		list1.printMiddleNodes();
		System.out.println();
		
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("�����");
		list2.add(list1.getEndK(2));
		System.out.println("�ж��������Ƿ��ཻ��");
		list1.print();
		list2.print();
		System.out.println(list1.size() + " : " + list2.size());
		System.out.println("�Ƿ��ཻ : " + list1.isIntersect(list2));
		System.out.println("������ �� " + list1.getIntersectionPoint(list2));
		System.out.println();
		
		list1.deleteNodeWithoutHead(list1.getEndK(2));
		System.out.println("��ӡɾ���ض��ڵ�������");
		list1.print();
	}
}
