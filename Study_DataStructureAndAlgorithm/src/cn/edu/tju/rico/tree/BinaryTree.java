package cn.edu.tju.rico.tree;

import java.util.LinkedList;

/**
 * Title: ������(�����Խṹ)�Ĺ�������ز���  
 * Description:
 * �Թ������ʽ���ַ���������������'()'ǰ��ʾ����㣬���������������ö��Ÿ��������Ų���ʡ�� 
 * �������Ĳ��/��������㷨
 * ��������ǰ�����򡢺�������ĵݹ�ͷǵݹ��㷨(��ÿ���ڵ���ԣ����ֱ�����ʽ����Ҫ�����ý�����Σ�����Ψһ�������ڸý��ķ���ʱ��)
 * ���ݶ�������ǰ����������򡢺�������������������
 * �������ĸ߶�
 * �������Ľ������
 * �������ĸ���㸴��һ�Ŷ�����
 * ��ȡ�������ĸ���㣬���ӽڵ�
 * ��ӡ������
 * �ж����Ŷ������Ƿ����
 * 
 * @author rico
 * @created 2017��5��23�� ����11:16:12
 */
public class BinaryTree<E> {

	
	/**  �������ĸ����   (@author: rico) */      
	private Node<E> root;

	  
	/** 
	 * �޲ι��캯�� 
	 * @description Ĭ���޲ι��캯�� 
	 * @author rico       
	 * @created 2017��5��24�� ����3:36:35           
	 */ 
	public BinaryTree() {
		super();
	}

	/**
	 * ���캯��
	 * 
	 * @description ����һ�����ĸ���㸴�ƹ�����
	 * @author rico
	 * @created 2017��5��23�� ����2:17:06
	 * @param node
	 *            ԭ���ĸ����
	 */
	public BinaryTree(Node<E> node) {
		// TODO Auto-generated constructor stub
		this.root = copy(node);
	}

	  
	/** 
	 * ���캯�� 
	 * @description ����һ������ǰ�����������ƹ�����
	 * @author rico       
	 * @created 2017��5��24�� ����3:38:02      
	 * @param preOrderStr     
	 */ 
	public BinaryTree(char[] preOrderStr) {
		root = createTreeByPreOrederStr(preOrderStr, null);
	}

	  
	/** 
	 * ���캯�� 
	 * @description ����һ������ǰ�����+�������(���������+�������)���ƹ�����
	 * @author rico       
	 * @created 2017��5��24�� ����3:38:33      
	 * @param s1
	 * @param s2
	 * @param isPreIn     
	 */ 
	public BinaryTree(String s1, String s2, boolean isPreIn) {
		if (isPreIn) {
			root = createBinaryTreeByPreAndIn(s1, s2);
		}else{
			root = createBinaryTreeByInAndPost(s1, s2);
		}
	}

	/**
	 * @description ���ݹ������ʽ������
	 * @author rico
	 * @created 2017��5��22�� ����3:16:01
	 * @param exp �����
	 */
	public void createBinaryTree(String exp) {
		LinkedList<Node<E>> stack = new LinkedList<Node<E>>(); // ����ջ
		Node<E> node = null; // �½��
		Node<E> temp = null; // ������ջ
		Node<E> parent = null; // ���׽��
		boolean flag = false; // true ��ʾ���뵽����������λ�ã�false��ʾ���븸�����Һ���λ��

		for (int i = 0; i < exp.length(); i++) { // ���������ʽ�ĸ����ַ�
			char c = exp.charAt(i);
			switch (c) {
			case '(': // ��ǰ�ڵ��к��ӽڵ㣬��ջ�Ա������亢��
				stack.push(temp);
				flag = true;
				break;
			case ')': // ���ú���ջ���ڵ�ĺ��ӣ���ջ
				stack.pop();
				break;
			case ',': // ��ǰ�ڵ��޺��ӣ�����Ҫ�����亢�ӽڵ㣬��˲���Ҫ��ջ
				flag = false;
				break;
			default: // �����������ݴ����ڵ�
				node = new Node(c);
				break;
			}

			// ���������ڣ��򴴽����ĸ����
			if (root == null) {
				root = node;
			}

			// Ϊջ���ڵ�������Ů
			if (!stack.isEmpty()) {
				if (node != null) { // ���������'('��')'��','�ַ�ʱ���Թ�
					parent = stack.peek();
					if (flag) {
						parent.left = node;
					} else {
						parent.right = node;
					}
				}
			}

			temp = node; // ������ջ
			node = null; // node������ÿ�
		}
	}
	
	/**
	 * @description ���ݹ������ʽ������
	 * @author rico
	 * @created 2017��5��22�� ����3:16:01
	 * @param exp �����
	 */
	public static Node createBinaryTree(String exp, Node root) {
		LinkedList<Node> stack = new LinkedList<Node>(); // ����ջ
		Node node = null; // �½��
		Node temp = null; // ������ջ
		Node parent = null; // ���׽��
		boolean flag = false; // true ��ʾ���뵽����������λ�ã�false��ʾ���븸�����Һ���λ��

		for (int i = 0; i < exp.length(); i++) { // ���������ʽ�ĸ����ַ�
			char c = exp.charAt(i);
			switch (c) {
			case '(': // ��ǰ�ڵ��к��ӽڵ㣬��ջ�Ա������亢��
				stack.push(temp);
				flag = true;
				break;
			case ')': // ���ú���ջ���ڵ�ĺ��ӣ���ջ
				stack.pop();
				break;
			case ',': // ��ǰ�ڵ��޺��ӣ�����Ҫ�����亢�ӽڵ㣬��˲���Ҫ��ջ
				flag = false;
				break;
			default: // �����������ݴ����ڵ�
				node = new Node(c);
				break;
			}

			// ���������ڣ��򴴽����ĸ����
			if (root == null) {
				root = node;
			}

			// Ϊջ���ڵ�������Ů
			if (!stack.isEmpty()) {
				if (node != null) { // ���������'('��')'��','�ַ�ʱ���Թ�
					parent = stack.peek();
					if (flag) {
						parent.left = node;
					} else {
						parent.right = node;
					}
				}
			}

			temp = node; // ������ջ
			node = null; // node������ÿ�
		}
		return root;
	}

	/**
	 * @description ����/��α�������������
	 * @author rico
	 * @created 2017��5��22�� ����3:05:57
	 * @return
	 */
	public String levelOrder() {
		StringBuilder sb = new StringBuilder();
		LinkedList<Node<E>> queue = new LinkedList<Node<E>>(); // ��������
		if (root != null) {
			queue.add(root);
			while (!queue.isEmpty()) {
				Node<E> temp = queue.pop();
				sb.append(temp.data).append(" ");

				// �ڱ�����ǰ�ڵ�ʱ��ͬʱ�������Һ������
				if (temp.left != null)
					queue.add(temp.left);
				if (temp.right != null)
					queue.add(temp.right);
			}
		}
		return sb.toString().trim();
	}

	/**
	 * @description ǰ�����(�ݹ�)
	 * @author rico
	 * @created 2017��5��22�� ����3:06:11
	 * @param root
	 * @return
	 */
	public String preOrder(Node<E> root) {
		StringBuilder sb = new StringBuilder(); // �浽�ݹ����ջ
		if (root != null) { // �ݹ���ֹ����
			sb.append(root.data + " "); // ǰ�������ǰ���
			sb.append(preOrder(root.left)); // ǰ�����������
			sb.append(preOrder(root.right)); // ǰ�����������
		}
		return sb.toString();
	}

	/**
	 * @description ǰ�����(����):�����Խṹ(��)������ջ����ǰ�ڵ���ջ
	 * @author rico
	 * @created 2017��5��24�� ����8:48:09
	 * @return
	 */
	public String preOrder() {

		StringBuilder sb = new StringBuilder();
		LinkedList<Node<E>> stack = new LinkedList<Node<E>>(); // ����ջ����¼����·��
		Node<E> node = root;

		while (node != null || !stack.isEmpty()) { // ��������
			if (node != null) { // ��ǰ�ڵ㲻Ϊ��
				sb.append(node.data + " "); // ���ʵ�ǰ�ڵ�
				stack.push(node); // ��ǰ�ڵ���ջ
				node = node.left; // ������������
			} else {
				node = stack.pop(); // �����丸�ڵ�
				node = node.right; // ������������
			}
		}
		return sb.toString();
	}

	/**
	 * @description �������(�ݹ�)
	 * @author rico
	 * @created 2017��5��22�� ����3:06:28
	 * @param root
	 * @return
	 */
	public String inOrder(Node<E> root) {
		StringBuilder sb = new StringBuilder(); // �浽�ݹ����ջ
		if (root != null) { // �ݹ���ֹ����
			sb.append(inOrder(root.left)); // �������������
			sb.append(root.data + " "); // ���������ǰ���
			sb.append(inOrder(root.right)); // �������������
		}
		return sb.toString();
	}

	/**
	 * @description �������(����)�������Խṹ(��)������ջ����ǰ�ڵ���ջ
	 * 
	 * @author rico
	 * @created 2017��5��24�� ����9:22:31
	 * @return
	 */
	public String inOrder() {
		StringBuilder sb = new StringBuilder();
		LinkedList<Node<E>> stack = new LinkedList<Node<E>>(); // ����ջ����¼����·��
		Node<E> node = root;

		while (node != null || !stack.isEmpty()) { // ��������
			if (node != null) { // ��ǰ�ڵ㲻Ϊ��
				stack.push(node); // ��ǰ�ڵ���ջ
				node = node.left; // ������������
			} else {
				node = stack.pop(); // ���ڵ㵯ջ
				sb.append(node.data + " "); // ���ʸ��ڵ�
				node = node.right; // ����������������
			}
		}
		return sb.toString();
	}

	/**
	 * @description �������(�ݹ�)
	 * @author rico
	 * @created 2017��5��22�� ����3:06:44
	 * @param root
	 * @return
	 */
	public String postOrder(Node<E> root) {
		StringBuilder sb = new StringBuilder(); // �浽�ݹ����ջ
		if (root != null) { // �ݹ���ֹ����
			sb.append(postOrder(root.left)); // �������������
			sb.append(postOrder(root.right)); // �������������
			sb.append(root.data + " "); // ���������ǰ���
		}
		return sb.toString();
	}

	/**
	 * @description �������(����):�����Խṹ(��)������ջ����ǰ�ڵ���ջ
	 *              �����α���һ���ڵ�ʱ�ŷ���,�����Ҫ�ڽڵ�Node������һ��bool�ֶΣ����ڱ���Ƿ���Ҫ�ڱ��η��ʸýڵ�
	 * @author rico
	 * @created 2017��5��24�� ����9:34:48
	 * @return
	 */
	public String postOrder() {
		StringBuilder sb = new StringBuilder();
		LinkedList<Node<E>> stack = new LinkedList<Node<E>>(); // ��¼����·���Ĺ���ջ
		Node<E> node = root;
		while (node != null || !stack.isEmpty()) { // ��������
			if (node != null) { // ��ǰ�ڵ㲻Ϊ��
				node.isFirst = true; // �״η��ʸýڵ㣬��Ϊtrue
				stack.push(node); // ѹջ����
				node = node.left; // ��������������
			} else { // ��ǰ�ڵ�Ϊ�յ�����ջ��Ϊ��
				node = stack.pop(); // ��ǰ�ڵ㵯ջ
				if (node.isFirst) {
					node.isFirst = false; // �ڶ��η��ʸýڵ�,��Ϊfalse
					stack.push(node); // ֻ���ڵ����βŷ��ʣ���ˣ�ǰ�ڵ��ٴ�ѹջ
					node = node.right; // ���ʸýڵ��������
				} else { // �����η��ʸýڵ�
					sb.append(node.data + " "); // ����
					node = null; // ��ǰ�ڵ������������������������ѷ���,��Ҫ���ʹ���ջ�еĽڵ�
				}
			}
		}
		return sb.toString();
	}

	/**
	 * @description ����ǰ�������������ؽ�������
	 * @author rico
	 * @created 2017��5��24�� ����12:24:41
	 * @return
	 */
	public Node<E> createBinaryTreeByPreAndIn(String pre, String in) {
		if (pre.length() > 0) {
			Node<E> root = new Node(pre.charAt(0));
			int index = in.indexOf(pre.charAt(0));
			root.left = createBinaryTreeByPreAndIn(pre.substring(1, index + 1),
					in.substring(0, index));
			root.right = createBinaryTreeByPreAndIn(
					pre.substring(index + 1, pre.length()),
					in.substring(index + 1, in.length()));
			return root;
		}
		return null;
	}

	/**
	 * @description �������򡢺����������ؽ�������
	 * @author rico
	 * @created 2017��5��24�� ����12:24:43
	 * @return
	 */
	public Node<E> createBinaryTreeByInAndPost(String in, String post) {
		if (post.length() > 0) {
			Node<E> root = new Node(post.charAt(post.length() - 1));
			int index = in.indexOf(post.charAt(post.length() - 1));

			root.left = createBinaryTreeByInAndPost(in.substring(0, index),
					post.substring(0, index));
			root.right = createBinaryTreeByInAndPost(
					in.substring(index + 1, in.length()),
					post.substring(index, post.length() - 1));
			return root;
		}
		return null;
	}

	/**
	 * @description ����ԭ���ĸ���㸴�Ƴ�һ��һģһ������
	 * @author rico
	 * @created 2017��5��23�� ����2:21:08
	 * @param root
	 * @return
	 */
	public Node<E> copy(Node<E> root) {
		if (root == null)
			return null;
		Node<E> node = new Node<E>(null);
		node.data = root.data;
		node.left = copy(root.left);
		node.right = copy(root.right);
		return node;
	}

	/** ����createTreeByPreOrederStr��Ҫ�õ���ָ�� (@author: rico) */
	private int index = 0;

	/**
	 * @description ����ǰ���������ؽ������������е�Ҷ�ӽڵ㶼��"#"��ʾ
	 * @author rico
	 * @created 2017��5��24�� ����7:51:54
	 * @param preOrderStr
	 * @param temp
	 * @return
	 */
	public Node<E> createTreeByPreOrederStr(char[] preOrderStr, Node<E> temp) {
		if (index < preOrderStr.length) {
			char c = preOrderStr[index++];
			if (c != '#') { // �ݹ���ֹ����
				Node<E> node = new Node(c);
				node.left = createTreeByPreOrederStr(preOrderStr, node); // �ݹ�Ϊ��ǰ�ڵ㴴��������
				node.right = createTreeByPreOrederStr(preOrderStr, node); // �ݹ�Ϊ��ǰ�ڵ㴴��������
				return node;
			}
			return null;
		}
		return null;
	}
	
	/**
	 * @description ��ȡ���ĸ����
	 * @author rico
	 * @created 2017��5��22�� ����3:09:18
	 * @return
	 */
	public Node<E> getRoot() {
		return root;
	}

	/**
	 * @description ��õ�ǰ�������ӽ��
	 * @author rico
	 * @created 2017��5��23�� ����11:13:48
	 * @param node
	 * @return
	 */
	public Node<E> getLeftChild(Node<E> node) {
		return node.left;
	}

	/**
	 * @description ��õ�ǰ�����Һ��ӽ��
	 * @author rico
	 * @created 2017��5��23�� ����11:13:50
	 * @param node
	 * @return
	 */
	public Node<E> getRightChild(Node<E> node) {
		return node.right;
	}

	/**
	 * @description ���������˼�룺���нڵ����
	 * @author rico
	 * @created 2017��5��23�� ����11:59:19
	 * @param root
	 * @return
	 */
	public int size(Node<E> root) {
		if (root != null) { // �ݹ���ֹ����
			return size(root.left) + size(root.right) + 1;
		}
		return 0;
	}

	/**
	 * @description ���������˼�룺���ĸ߶�(����Ϊ0)
	 * @author rico
	 * @created 2017��5��23�� ����12:00:08
	 * @param root
	 * @return
	 */
	public int height(Node<E> root) {
		if (root != null) { // �ݹ���ֹ����
			int h1 = height(root.left);
			int h2 = height(root.right);
			return h1 > h2 ? h1 + 1 : h2 + 1;
		}
		return 0;
	}

	/**
	 * @description �Թ�������ʽ��ӡ��������ǰ�������Ӧ��
	 * @author rico
	 * @created 2017��5��24�� ����8:13:08
	 * @param root
	 * @return
	 */
	public String printBinaryTree(Node<E> root) {
		StringBuilder sb = new StringBuilder();
		if (root != null) {
			sb.append(root.data);
			if (root.left != null || root.right != null) {
				sb.append('(');
				sb.append(printBinaryTree(root.left));
				sb.append(',');
				sb.append(printBinaryTree(root.right));
				sb.append(')');
			}
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return levelOrder();
	}

	/**
	 * @description �������ĸ�����ж��������Ƿ����
	 * @author rico
	 * @created 2017��5��23�� ����3:05:35
	 * @param src
	 *            ԭ���ĸ����
	 * @param des
	 *            Ŀ�����ĸ����
	 * @return
	 */
	private boolean equals0(Node<E> src, Node<E> des) {
		if (src == null && des == null) { // �������
			return true;
		} else if (src == null || des == null) { // ������ǿ��������
			return false;
		} else { // �ǿ�����ǿ����Ƿ���ȣ���ǰ�ڵ��Ƿ���� && �������Ƿ���� && �������Ƿ����
			return src.equals(des) && equals0(src.left, des.left)
					&& equals0(src.right, des.right);
		}
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof BinaryTree) { // �Է��Ƿ�Ҳ��һ�Ŷ�����
			BinaryTree<E> tree = (BinaryTree<E>) obj;
			return equals0(this.root, tree.root);
		}
		return false;
	}
}