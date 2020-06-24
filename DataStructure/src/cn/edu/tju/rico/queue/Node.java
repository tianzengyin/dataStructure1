package cn.edu.tju.rico.queue;

/**
 * Title: 结点类 
 * Description: 线性表的基本元素
 * 
 * @author rico
 * @created 2017年4月6日 下午9:55:58
 */
 public class Node<T> {
	//包可见性
	Node<T> next;   
	T data;

	/**
	 * 构造函数
	 * 
	 * @description 构造一个新节点
	 * @author rico
	 * @created 2017年4月6日 下午9:56:56
	 * @param data
	 *            新元素数据
	 *
	 *            新元素与链表结合节点
	 */
	public Node(T data) { 
		this.data = data;
	}

	@Override
	public String toString() {
		return data.toString();
	}
}
