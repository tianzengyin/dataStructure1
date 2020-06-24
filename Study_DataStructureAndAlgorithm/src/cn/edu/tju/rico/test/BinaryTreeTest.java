package cn.edu.tju.rico.test;

import cn.edu.tju.rico.tree.BinaryTree;

public class BinaryTreeTest {
	public static void main(String[] args) {
		BinaryTree<Character> tree = new BinaryTree<Character>();
		tree.createBinaryTree("A(B(D,E(G(I,J),M)),C(F(,H(,K)),))");

		System.out.println();
		System.out.println("tree�Ĳ��(����)���� �� " + tree.levelOrder());
		System.out.println("\n----------------------------------------------\n");
		System.out.println("tree��ǰ����� (�ݹ�)�� " + tree.preOrder(tree.getRoot()));
		System.out.println("tree��ǰ����� (����)�� " + tree.preOrder());
		System.out.println("\n----------------------------------------------\n");

		System.out.println("tree��������� (�ݹ�)�� " + tree.inOrder(tree.getRoot()));
		System.out.println("tree��������� (����)�� " + tree.inOrder());
		System.out.println("\n----------------------------------------------\n");

		System.out.println("tree�ĺ������ (�ݹ�)�� " + tree.postOrder(tree.getRoot()));
		System.out.println("tree�ĺ������ (����)�� " + tree.postOrder());
		System.out.println("\n----------------------------------------------\n");

		System.out.println("tree�ĸ���� �� " + tree.getRoot());
		System.out.println("\n----------------------------------------------\n");

		System.out.println("tree�ĸ߶� �� " + tree.height(tree.getRoot()));
		System.out.println("\n----------------------------------------------\n");

		System.out.println("tree�Ľ���� �� " + tree.size(tree.getRoot()));
		System.out.println("\n----------------------------------------------\n");

		// ���Ʋ�������
		BinaryTree<Character> tree2 = new BinaryTree<Character>(tree.getRoot());
		System.out.println("treeΪ �� " + tree.printBinaryTree(tree.getRoot()));
		System.out.println("����treeΪtree2 �� " + tree2.printBinaryTree(tree2.getRoot()));
		// �ж� tree2 �� tree �Ƿ����
		System.out.println("tree2 �� tree �Ƿ����: " + tree.equals(tree2));
		System.out.println("\n----------------------------------------------\n");

		// ����tree1
		BinaryTree<Character> tree1 = new BinaryTree<Character>();
		tree1.createBinaryTree("A(B(D,E(G(I,J),)),C(F(,H(,K)),))");
		System.out.println("treeΪ �� " + tree.printBinaryTree(tree.getRoot()));
		System.out.println("����tree1Ϊ �� " + tree1.printBinaryTree(tree1.getRoot()));
		// �ж� tree1 �� tree �Ƿ����
		System.out.println("tree1 �� tree �Ƿ����: " + tree.equals(tree1));
		System.out.println("\n----------------------------------------------\n");

		// ����ǰ�����������
		BinaryTree<Character> tree3 = new BinaryTree<Character>(
				"ABC##DE#G##F###".toCharArray());
		System.out.println("����ǰ���������������: " + tree3.printBinaryTree(tree3.getRoot()));
		System.out.println("ǰ�����tree3�� " + tree.preOrder(tree3.getRoot()));
		System.out.println("�������tree3�� " + tree.inOrder(tree3.getRoot()));
		System.out.println("�������tree3�� " + tree.postOrder(tree3.getRoot()));
		System.out.println("\n----------------------------------------------\n");

		// �Թ�������ʽ��ӡ������
		System.out.println("�Թ�������ʽ��ӡtreeΪ ��" + tree.printBinaryTree(tree.getRoot()));
		System.out.println("�Թ�������ʽ��ӡtree1Ϊ ��" + tree1.printBinaryTree(tree1.getRoot()));
		System.out.println("�Թ�������ʽ��ӡtree2Ϊ ��" + tree2.printBinaryTree(tree2.getRoot()));
		System.out.println("�Թ�������ʽ��ӡtree3Ϊ ��" + tree3.printBinaryTree(tree3.getRoot()));
		System.out.println("\n----------------------------------------------\n");

		// ����tree���������������������������
		String pre = tree.preOrder().replace(" ", "");
		String in = tree.inOrder().replace(" ", "");
		BinaryTree<Character> tree4 = new BinaryTree<Character>(pre, in, true);
		System.out.println("����tree���������������������������tree4Ϊ ��"
				+ tree.printBinaryTree(tree4.getRoot()));
		System.out.println("tree��tree4�Ƿ���ȣ� " + tree.equals(tree4));
		System.out.println("\n----------------------------------------------\n");
		
		// ����tree����������ͺ���������������
		String post = tree.postOrder().replace(" ", "");
		BinaryTree<Character> tree5 = new BinaryTree<Character>(in, post, false);
		System.out.println("����tree����������ͺ���������������tree5Ϊ ��"
				+ tree.printBinaryTree(tree5.getRoot()));
		System.out.println("tree��tree5�Ƿ���ȣ� " + tree.equals(tree5));
		
	}
}
