package cn.edu.tju.rico.list;

/**
 * Title: �����Javaʵ�� 
 * Description: ����ṹ��������Ҫ�أ� ͷ���head + �����Сsize������������
 * 				�������ɾ
 * 				�����Ƿ�Ϊ��
 * 				����Ĵ�С
 * 				����Ĵ�ӡ���
 * 				ɾ�������ظ��ڵ�
 *  			��������K��Ԫ��
 *  			����ķ�ת
 *  			����ĵ������
 *  			������м�ڵ�
 *  			�����Ƿ��л�
 *  			����ڵ��ɾ��(��֪��ͷ���������)
 *  			�����Ƿ��ཻ
 *  			����Ľ���
 * 
 * @author rico
 */
public class LinkedList<E> {

	private Node<E> head; // �����ͷ
	private int size; // �����С

	public LinkedList() {
		head = new Node<E>(null);
	}

	public Node<E> getHead() {
		return head;
	}

	/**
	 * @description ��������ָ��λ�õ�Ԫ��(0 - size),�����½ڵ�
	 * @author rico
	 * @param data
	 * @param index
	 * @throws Exception
	 */
	public Node<E> add(E data, int index) throws Exception {
		if (index > size) {
			throw new Exception("������Χ...");
		}

		Node<E> cur = head;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}
		Node<E> node = new Node<E>(data); // ����Ԫ����������
		cur.next = node;
		size++;
		return node;
	}

	/**
	 * @description ������ĩβ���Ԫ��,�����½ڵ�
	 * @author rico
	 * @param data
	 * @throws Exception
	 */
	public Node<E> add(E data) throws Exception {
		return add(data, size);
	}
	
	/**     
	 * @description ������β������½ڵ�
	 * @author rico       
	 * @param node     
	 */
	public void add(Node<E> node){
		Node<E> cur = head;
		while(cur.next != null){
			cur = cur.next;
		}
		cur.next = node;
		
		while(node != null){
			size ++;
			node = node.next;
		}
	}

	/**
	 * @description ɾ��������ָ��λ�õ�Ԫ��(0 ~ size-1)
	 * @author rico
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public E remove(int index) throws Exception {
		if (index > size - 1 || index < 0) {
			throw new Exception("������Χ...");
		}

		Node<E> cur = head;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}

		Node<E> temp = cur.next;
		cur.next = temp.next;
		temp.next = null;

		size--;
		return temp.data;
	}

	/**
	 * @description ������ĩβɾ��Ԫ��
	 * @author rico
	 * @return
	 * @throws Exception
	 */
	public E remove() throws Exception {
		return remove(size - 1);
	}

	/**
	 * @description ɾ�������е��ظ�Ԫ��(��ѭ�� + ��ѭ��)
	 * @author rico ʱ�临�Ӷȣ�O(n^2)
	 */
	public void removeDuplicateNodes() {
		Node<E> cur = head.next;
		while (cur != null) { // ��ѭ��
			Node<E> temp = cur;
			while (temp != null && temp.next != null) { // ��ѭ��
				if (cur.data.equals(temp.next.data)) {
					Node<E> duplicateNode = temp.next;
					temp.next = duplicateNode.next;
					duplicateNode.next = null;
					size --;
				}
				temp = temp.next;
			}
			cur = cur.next;
		}
	}

	/**
	 * @description �ҳ��������е�����K��Ԫ��(˫ָ�뷨,���K-1��)
	 * @author rico
	 * @param k
	 * @return ʱ�临�Ӷȣ�O(n)
	 */
	public Node<E> getEndK(int k) {
		Node<E> pre = head.next;
		Node<E> post = head.next;
		for (int i = 1; i < k; i++) { // pre����k-1��
			if (pre != null) {
				pre = pre.next;
			}
		}
		if (pre != null) {
			// ��pre�ߵ�����ĩ��ʱ��post����ָ������K���ڵ�
			while (pre != null && pre.next != null) {
				pre = pre.next;
				post = post.next;
			}
			return post;
		}
		return null;
	}

	/**
	 * @description ��ת����
	 * @author rico
	 */
	public void reverseLinkedList() {
		Node<E> cur = head.next; // ԭ����
		Node<E> pre = null; // ��ת�������

		while (cur != null) { // ��ԭ�����е�ÿ���ڵ���з�ת
			Node<E> next = cur.next; // ��¼��ǰ�ڵ����һ���ڵ�
			cur.next = pre; // ��ǰ�ڵ�ָ��ת�������
			pre = cur; // ���·�ת�������
			cur = next; // ���µ�ǰ�ڵ�
		}
		head.next = pre; // ��ԭ�����ͷ���ָ��ת�������
	}

	/**
	 * @description �жϵ������Ƿ�Ϊ��
	 * @author rico
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * @description ��ӡ���������
	 * @author rico
	 */
	public void print() {
		Node<E> cur = head.next;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	/**
	 * @description ��β��ͷ���������(�ݹ鷨)
	 * @author rico
	 * @param head
	 */
	public void reversePrint(Node<E> head) {
		if (head.next != null) {
			reversePrint(head.next); // ����"��ȥ"
			System.out.print(head.next.data + " "); // "����"��ʼ��ӡ
		}
	}

	/**
	 * @description Ѱ�ҵ������е��м�ڵ�(˫ָ�뷨)
	 * @author rico
	 */
	public void printMiddleNodes() {
		Node<E> index1 = head.next; // ��ָ��
		Node<E> index2 = head.next; // ��ָ��
		if (head.next == null) {
			System.out.println(index1.data);
		}
		while (index2 != null && index2.next != null
				&& index2.next.next != null) {
			index1 = index1.next;
			index2 = index2.next.next;
		}
		System.out.print(index1.data); // ��һ���м�ڵ�
		if (index2.next != null) { // ��������Ϊż��ʱ����ӡ�ڶ����м�ڵ�
			System.out.println(index1.next.data);
		}
	}

	/**
	 * @description �жϵ������Ƿ��л�(˫ָ�뷨)
	 * @author rico
	 * @return
	 */
	public boolean hasLoop() {
		Node<E> index1 = head.next; // ��ָ��
		Node<E> index2 = head.next; // ��ָ��
		while (index2 != null && index2.next != null
				&& index2.next.next != null) {
			index1 = index1.next;
			index2 = index2.next.next;
			if (index1 == index2) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @description �ڲ�֪��ͷ����ǰ���£�ɾ��ָ���ڵ�
	 * @author rico
	 * @param node
	 * @return
	 */
	public boolean deleteNodeWithoutHead(Node<E> node) {
		if (node == null || node.next == null) { // ��ָ���ڵ�Ϊ�ջ���Ϊβ�ڵ�ʱ���޷�ɾ��
			return false;
		}

		Node<E> next = node.next;

		// ����̽ڵ�����ݸ��Ƶ���ǰ�ڵ�
		node.data = next.data;
		node.next = next.next;

		// ����̽ڵ����
		next.next = null;
		next.data = null;
		return true;
	}

	/**     
	 * @description �жϵ�ǰ������Ŀ�������Ƿ��ཻ(�ཻ���ȡ����β�ڵ��Ƿ���ͬ)
	 * @author rico       
	 * @param head
	 * @return     
	 */
	public boolean isIntersect(LinkedList<E> list2) {
		Node<E> cur1 = head.next;   // ��ǰ����
		Node<E> cur2 = list2.getHead().next;  // Ŀ������
		
		// ��������һ��Ϊ�գ��򷵻� false
		if(cur1 == null || cur2 == null){
			return false;
		}
		
		// ��������һ�������β�ڵ�
		while(cur1.next != null){
			cur1 = cur1.next;
		}
		
		// �������ڶ��������β�ڵ�
		while(cur2.next != null){
			cur2 = cur2.next;
		}
			
		return cur1 == cur2;  // �ཻ���ȡ����β�ڵ��Ƿ���ͬ
	}

	/**
	 * @description ����������Ľ���(�����ཻ������null)
	 * @author rico
	 * @param head
	 * @return
	 */
	public Node<E> getIntersectionPoint(LinkedList<E> list2) {
		Node<E> cur1 = head.next;   // ��ǰ����
		Node<E> cur2 = list2.getHead().next;  // Ŀ������
		
		if(this.isIntersect(list2)){  // ���ж��Ƿ��ཻ
			// �ó��Ƚϳ����������ƶ�step��
			int step = Math.abs(list2.size - this.size);
			if(list2.size > this.size){
				while(step > 0){
					cur2 = cur2.next;
					step --;
				}
			}else if(list2.size < this.size){
				while(step > 0){
					cur1 = cur1.next;
					step --;
				}
			}
			
			//����ָ��ͬʱ�ƶ���һ��ָ��ͬһ���ڵ㣬��Ϊ����
			while(cur1 != cur2){
				cur1 = cur1.next;
				cur2 = cur2.next;
			}
			return cur1;
		}
		return null;
	}
	
	/**     
	 * @description ��������ĳ���
	 * @author rico       
	 * @return     
	 */
	public int size(){
		return size;
	}
}
