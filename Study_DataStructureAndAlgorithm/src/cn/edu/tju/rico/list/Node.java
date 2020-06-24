package cn.edu.tju.rico.list;

/**
 * Title: ����� 
 * Description: ����Ļ���Ԫ��
 * 
 * @author rico
 * @created 2017��4��6�� ����9:55:58
 */
 public class Node<T> {
	//���ɼ���
	Node<T> next;   
	T data;

	/**
	 * ���캯��
	 * 
	 * @description ����һ���½ڵ�
	 * @author rico
	 * @created 2017��4��6�� ����9:56:56
	 * @param data
	 *            ��Ԫ������
	 * @param next
	 *            ��Ԫ���������Ͻڵ�
	 */
	public Node(T data) { 
		this.data = data;
	}

	@Override
	public String toString() {
		return data.toString();
	}
}
