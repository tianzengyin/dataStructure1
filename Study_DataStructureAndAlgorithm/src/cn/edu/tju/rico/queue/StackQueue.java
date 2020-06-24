package cn.edu.tju.rico.queue;

import cn.edu.tju.rico.stack.LinkedStack;

  
/**        
 * Title: ʹ������ջģ��һ������    
 * Description: ����һ��ջ���洢�ռ䣬��һ��ջ����ʱ������
 * @author rico       
 * @created 2017��5��19�� ����10:45:11    
 */      
public class StackQueue<E> {

	private LinkedStack<E> stack1;    // �洢�ռ�
	private LinkedStack<E> stack2;  //��ʱ������

	public StackQueue() {
		stack1 = new LinkedStack<E>();
		stack2 = new LinkedStack<E>();
	}

	  
	/**     
	 * @description ���Ԫ�ص���β���ȼ��stack2�Ƿ�Ϊ�գ�
	 * 				��Ϊ�գ���ֱ�Ӷ�stack1ִ��ѹջ����
	 * 				�����Ƚ�stack2�е�Ԫ�ص���stack1���ٶ�stack1ִ��ѹջ����
	 * @author rico       
	 * @created 2017��5��19�� ����10:47:59     
	 * @param e     
	 */
	public void put(E e) {
		if (!stack2.isEmpty()) {
			while (stack2.size() > 0) {
				stack1.push(stack2.pop().getData());
			}
		}
		stack1.push(e);
	}

	  
	/**     
	 * @description ɾ����ͷ�����ض�ͷԪ�ص�ֵ���ȼ��stack2�Ƿ�Ϊ�գ�
	 * 				��Ϊ�գ��Ƚ�stack1�е�size-1��Ԫ�ص���stack2���ٶ�stack1��ջ��Ԫ��ִ�е�ջ����
	 * 				������ֱ�Ӷ�stack2ִ�е�ջ����
	 * @author rico       
	 * @created 2017��5��19�� ����10:48:32     
	 * @return     
	 */
	public E pop() {
		if (stack2.isEmpty()) {
			if (!stack1.isEmpty()) {
				while (stack1.size() > 1) {
					stack2.push(stack1.pop().getData());
				}
				return stack1.pop().getData();
			}
			return null;
		} else {
			return stack2.pop().getData();
		}
	}

	@Override
	public String toString() {
		if (!stack1.isEmpty()) {
			return new StringBuilder(stack1.toString()).reverse().toString();
		}
		return stack2.toString();
	}
}
