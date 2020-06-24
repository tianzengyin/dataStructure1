package cn.edu.tju.rico.stack;

import java.util.Arrays;

/**        
 * Title: ˳��ջ    
 * Description: ������Ϊ�ײ�ʵ��
 * @author rico       
 * @created 2017��4��6�� ����5:27:13    
 */      
public class SeqStack<E> {
	
	private Object[] stack;    // ֧������
	private int top;    // ջ��ָ��
	private int maxSize;    // ջ���������
	
	// Ĭ�Ϲ��캯��
	public SeqStack(){
		this(10);
	}
	
	// ����ָ�������Ĺ��캯��
	public SeqStack(int maxSize){
		this.stack = new Object[maxSize];
		this.top = -1;
		this.maxSize = maxSize;
	}
	
	// �Ƿ�Ϊ��
	public boolean isEmpty(){
		return top == -1;
	}
	
	// ������ɾ��ջ��Ԫ��
	@SuppressWarnings("unchecked")
	public E pop() throws Exception{
		if (top == -1) {
			throw new Exception("ջΪ��...");
		}
		E element = (E)stack[top];
		stack[top --] = null;    // ɾ����Ԫ��
		return element;
	}
	
	// ���Ԫ��
	public void push(E e) throws Exception{
		if (top == maxSize -1) {
			throw new Exception("ջ����...");
		}
		stack[++top] = e;
	}

	// ��ӡջ
	@Override
	public String toString() {
		return Arrays.toString(stack);
	}
	
	public static void main(String[] args) throws Exception {
		SeqStack<String> stack = new SeqStack<String>();
		stack.push("Rico");
		stack.push("TJU");
		stack.push("Livia");
		stack.push("NEU");
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
	}
}
