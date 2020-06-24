package cn.edu.tju.rico.test;

import java.util.Comparator;
import cn.edu.tju.rico.stack.LinkedStack;
  
public class LinkedStackTest {
	// ����
	public static void main(String[] args) throws Exception {
		
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1 > o2)
					return 1;
				else if(o1 < o2)
					return -1;
				else
					return 0;
			}
		};
		
		stack.push(7,c);
		stack.push(6,c);
		stack.push(8,c);
		stack.push(5,c);
		stack.push(3,c);
		
		System.out.println("ԭջ(�����Ԫ����ջ��Ԫ��)��");
		stack.print();
		System.out.println();
		
		System.out.println("����ջ��Ԫ�أ�");
		System.out.println(stack.peek());
		System.out.println("ջ�е���Сֵ��" + stack.min());
		System.out.println();

		System.out.println("������ɾ��ջ��Ԫ�غ������");
		stack.pop(c);
		stack.print();
		System.out.println("ջ�е���Сֵ��" + stack.min());
		System.out.println();
	}
}
