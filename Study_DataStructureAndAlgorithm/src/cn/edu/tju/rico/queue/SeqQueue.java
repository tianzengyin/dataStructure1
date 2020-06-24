package cn.edu.tju.rico.queue;

import java.util.Arrays;

  
/**        
 * Title: ��������Ķ���ʵ��     
 * Description: 
 * @author rico       
 * @created 2017��5��19�� ����8:23:55    
 */      
public class SeqQueue<E> {

	
	/**  ���еĴ洢�ṹ   (@author: rico) */      
	private Object[] queue;         
	private int size;
	private int maxSize;    // �������
	
	public SeqQueue(int maxSize){
		this.maxSize = maxSize;
		queue = new Object[maxSize];
	}
	
	  
	/**     
	 * @description ���Ԫ�ص���β
	 * @author rico       
	 * @created 2017��5��19�� ����8:25:32     
	 * @param data     
	 */
	public void put(E data){
		if(!isFull()){
			queue[size] = data;
			size ++;
		}
	}
	
	  
	/**     
	 * @description ɾ����ͷ�����ض�ͷԪ�ص�ֵ
	 * @author rico       
	 * @created 2017��5��19�� ����8:25:47     
	 * @return     
	 */
	public E pop(){
		if (!isEmpty()) {
			E temp = (E) queue[0];
			for (int i = 0; i < size - 1; i++) {
				queue[i] = queue[i+1];
			}
			queue[size-1] = null;
			size--;
			return temp;
		}
		return null;
	}
	
	  
	/**     
	 * @description ���ض�ͷԪ��
	 * @author rico       
	 * @created 2017��5��19�� ����8:26:01     
	 * @return     
	 */
	public E peek(){
		if (!isEmpty()) {
			return (E) queue[0];
		}
		return null;
	}
	
	  
	/**     
	 * @description �����Ƿ�����
	 * @author rico       
	 * @created 2017��5��19�� ����8:26:14     
	 * @return     
	 */
	public boolean isFull(){
		return size == maxSize;
	}
	
	  
	/**     
	 * @description �����Ƿ�Ϊ��
	 * @author rico       
	 * @created 2017��5��19�� ����8:26:25     
	 * @return     
	 */
	public boolean isEmpty(){
		return size == 0;
	}
	
	  
	/**     
	 * @description ���еĴ�С
	 * @author rico       
	 * @created 2017��5��19�� ����8:26:34     
	 * @return     
	 */
	public int size(){
		return size;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(queue);
	}
}
