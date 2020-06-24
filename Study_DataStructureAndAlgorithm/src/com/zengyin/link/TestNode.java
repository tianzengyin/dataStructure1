package com.zengyin.link;

public class TestNode {

	public static void main(String[] args) {
		//创建节点
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		//追加节点
		 n1.append_2(n2);
		 n1.append_2(n3);
		//取出下一个节点
		//System.out.println(n1.next().next().getData());
		//System.out.println(n1.next().getData());
		 n1.show();
	}

}
