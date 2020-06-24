package cn.edu.tju.rico.heap;

/**        
 * Title: ��С�� ����ȫ���������ܷ���ش���ȡ����С/��Ԫ��   
 * Description: 
 * �ѵĹ���
 * �ѵĴ�ӡ(ǰ�������Ӧ��)
 * �ѵĲ���(���뵽��β�����������ϵ���Ϊ��С��)
 * �ѵ�ɾ��(ɾ���Ѷ�Ԫ�ز��ö�βԪ���������������µ���Ϊ��С��)
 * ������(ʱ�临�Ӷȣ�O(nlgn),�ռ临�Ӷ�O(1),���ȶ�)����������һ��������
 * @author rico       
 * @created 2017��5��24�� ����9:23:22    
 */      
public class MinHeap {
	
	private int[] heap;  // ������Ԫ������ȫ����������ʽ��������
	private int size;  // ����Ԫ�صĸ���

	/**
	 * ���캯��
	 * 
	 * @description ����һ����СΪsize����С��
	 * @author rico
	 * @created 2017��5��24�� ����8:19:46
	 * @param size
	 */
	public MinHeap(int maxSize) {
		heap = new int[maxSize];
	}

	/**
	 * ���캯��
	 * 
	 * @description �������鹹����С��
	 * @author rico
	 * @created 2017��5��24�� ����8:18:56
	 * @param arr
	 */
	public MinHeap(int[] arr, int maxSize) {
		heap = new int[maxSize > arr.length ? maxSize : arr.length];
		System.arraycopy(arr, 0, heap, 0, arr.length);
		size = arr.length;

		int pos = (size - 2) / 2; // �������λ�ã����ķ�֧�ڵ�(���Ҷ�ڵ�ĸ���)
		while (pos >= 0) {    //���ε���ÿ����֧�ڵ�
			shiftDown(pos, size - 1);
			pos--;
		}
	}

	/**
	 * @description �������µ���Ϊ��С��(�Ӳ�����С�ѵ���Ϊ��С��)��������ǰ����������������������Ϊ��С��
	 * @author rico
	 * @created 2017��5��24�� ����7:52:39
	 * @param start
	 * @param end
	 */
	private void shiftDown(int start, int end) {
		int i = start;       // ��ʼ����λ�ã���֧�ڵ�
		int j = 2 * start + 1;  // �÷�֧�ڵ���ӽڵ�
		int temp = heap[i];   
		while (j <= end) {  // �����������ӽڵ㲻�ܳ���end(��Χ)
			if (j < end) { 
				j = heap[j] > heap[j + 1] ? j + 1 : j; // ѡ���������н�С���Ǹ�
			}
			if (temp < heap[j]) {   // ��С�ĺ��Ӵ��ڸ��ף������κδ���
				break;
			} else {    // �����滻���ڵ��ֵ
				heap[i] = heap[j];  
				i = j;
				j = 2 * j + 1;
			}
		}
		heap[i] = temp;  // һ����λ
	}
	
	/**     
	 * @description �������ϵ���Ϊ��С��(ԭ��������С�ѣ����Ԫ�غ�ȷ���仹����С��)
	 * @author rico       
	 * @created 2017��5��24�� ����9:09:37     
	 * @param start     
	 */
	private void shiftUp(int start) {
		int j = start;
		int i = (j - 1) / 2;   // ��ʼ����λ�ã���֧�ڵ�
		int temp = heap[j];
		while (j > 0) {      // �����������ӽڵ���벻Ϊ��
			if (temp >= heap[i]) {  //ԭ������С�ѣ�����ֻ��Ƚ������Ů�븸�׵Ĺ�ϵ����
				break;
			} else {
				heap[j] = heap[i];
				j = i;
				i = (j - 1) / 2;
			}
		}
		heap[j] = temp;   // һ����λ
	}

	/**
	 * @description ����С�Ѳ���Ԫ��(���ǲ��뵽��С�ѵ����)
	 * @author rico
	 * @created 2017��5��24�� ����8:22:58
	 * @param data
	 */
	public void insert(int data){
		if (size < heap.length) {
			heap[size++] = data;   // �����β
			shiftUp(size-1);   // ���¶��ϵ���
		}
	}

	  
	/**     
	 * @description ɾ���Ѷ�Ԫ�أ��Զѵ����һ��Ԫ�����
	 * @author rico       
	 * @created 2017��5��24�� ����9:11:46          
	 */
	public void remove() {
		if (size > 0) {
			heap[0] = heap[size-1];   // ɾ���Ѷ�Ԫ�أ�������βԪ�ػ���Ѷ�
			size --;   // �Ѵ�С��һ
			shiftDown(0, size-1);   // �������µ���Ϊ��С��
		}
	}
	
	  
	/**     
	 * @description ������:ÿ�ν���СԪ�ؽ��������
	 * @author rico       
	 * @created 2017��5��24�� ����9:42:31          
	 */
	public void sort(){
		for (int i = size - 1; i >= 0; i--) {
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			
			shiftDown(0, i-1);
		}
		
		for (int i = size-1; i >= 0; i--) {
			System.out.print(heap[i] + " ");
		}
	}

	/**
	 * @description ��ӡ��Ϊ i ����С��
	 * @author rico
	 * @created 2017��5��24�� ����8:17:16
	 * @param i
	 */
	public void printMinHeap(int i) {
		if (size > i) {
			System.out.print(heap[i]);
			if (2 * i + 1 < size || 2 * i + 2 < size) {
				System.out.print("(");
				printMinHeap(2 * i + 1);
				System.out.print(",");
				printMinHeap(2 * i + 2);
				System.out.print(")");
			}
		}
	}
}
