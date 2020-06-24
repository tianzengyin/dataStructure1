package cn.edu.tju.rico.queue;

import cn.edu.tju.rico.stack.LinkedStack;
import cn.edu.tju.rico.stack.Node;

/**
 * Title: ʹ������ջģ��һ������ Description: ����һ��ջר���������(ʼ�ղ�ִ�г��Ӳ���)����һ��ջר����������(ʼ�ղ�ִ����Ӳ���)
 * ���ֽⷨ�����StackQueue����Ҫ�߲��٣������˷���������ջ��������Ҫʱ�š�����һ�Σ�����
 * 
 * @author rico
 * @created 2017��5��19�� ����10:45:11
 */
public class OptimizationStackQueue<E> {

	private LinkedStack<E> stack1; // ���ջ
	private LinkedStack<E> stack2; // ����ջ

	public OptimizationStackQueue() {

		stack1 = new LinkedStack<E>();
		stack2 = new LinkedStack<E>();
	}

	/**
	 * @description ���Ԫ�ص���β,ֱ�Ӷ�stack1ִ��ѹջ������
	 * @author rico
	 * @created 2017��5��19�� ����10:47:59
	 * @param e
	 */
	public void put(E e) {
		stack1.push(e);
	}

	/**
	 * @description ɾ����ͷ�����ض�ͷԪ�ص�ֵ���ȼ��stack2�Ƿ�Ϊ�գ�
	 *              ��Ϊ�գ��Ƚ�stack1�е�Ԫ��ȫ������stack2���ٶ�stack2ִ�е�ջ����
	 *              ������ֱ�Ӷ�stack2ִ�е�ջ����
	 * @author rico
	 * @created 2017��5��19�� ����10:48:32
	 * @return
	 */
	public E pop() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop().getData());
			}
		}
		return stack2.pop().getData();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (!stack2.isEmpty()) {
			sb.append(stack2.toString());
		}
		return sb.append(
				new StringBuilder(stack1.toString()).reverse().toString())
				.toString();
	}
}
