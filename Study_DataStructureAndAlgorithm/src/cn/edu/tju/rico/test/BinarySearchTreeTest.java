package cn.edu.tju.rico.test;

import cn.edu.tju.rico.BinarySearchTree.BinarySearchTree;

public class BinarySearchTreeTest {
	public static void main(String[] args) {
		int[] input = {53,78,65,17,87,9,81,45,23};
		BinarySearchTree tree = new BinarySearchTree(input);
		
		System.out.println("�������������������");
		tree.inOrder(tree.getRoot());
		System.out.println();
		System.out.println("\n------------------------\n");
		System.out.println("��ӡ������������");
		tree.printTree(tree.getRoot());
		System.out.println();
		System.out.println("\n------------------------\n");
		
		System.out.println("��������������Ŀ��ֵ��");
		System.out.println(tree.search(23, tree.getRoot()));
		System.out.println("\n------------------------\n");
		
		System.out.println("���������������Ŀ��ֵ��");
		tree.insert(10, tree.getRoot());
		tree.printTree(tree.getRoot());
		System.out.println();
		System.out.println("\n------------------------\n");
		
		System.out.println("�����������ɾ��Ŀ��ֵ��");
		tree.remove(78, tree.getRoot());
		tree.printTree(tree.getRoot());
		System.out.println();
		System.out.println("\n------------------------\n");
	}
}
