package cn.edu.tju.rico.sort;
  
/**        
 * Title: ������(ѡ������)����������(����)   
 * Description: �ֽ��������е���Ϊ���ѣ�Ȼ��ÿ�ν��Ѷ�Ԫ�����βԪ�ؽ�������С�ѵķ�Χ��ֱ��������С��1
 * ʱ�临�Ӷȣ�O(nlgn)
 * �ռ临�Ӷȣ�O(1) 
 * �� �� �ԣ����ȶ�
 * �ڲ�����(���������������Ԫ����ȫ���ڴ�)
 * @author rico       
 * @created 2017��5��25�� ����9:48:06    
 */      
public class HeapSort {

	public static int[] heapSort(int[] target) {
		if (target != null && target.length > 1) {
			
			// ����Ϊ����
			int pos = (target.length - 2) / 2;
			while (pos >= 0) {
				shiftDown(target, pos, target.length - 1);
				pos--;
			}

			// ������
			for (int i = target.length-1; i > 0; i--) {
				int temp = target[i];
				target[i] = target[0];
				target[0] = temp;
				shiftDown(target, 0, i-1);
			}
			return target;
		}
		return target;
	}

	  
	/**     
	 * @description ���϶��µ���Ϊ����
	 * @author rico       
	 * @created 2017��5��25�� ����9:45:40     
	 * @param target
	 * @param start
	 * @param end     
	 */
	private static void shiftDown(int[] target, int start, int end) {
		int i = start;
		int j = 2 * start + 1;
		int temp = target[i];
		while (j <= end) {   // ��������
			if (j < end && target[j + 1] > target[j]) {  //�ҳ��ϴ���Ů
				j = j + 1;
			}
			if (target[j] <= temp) {  // ���״�����Ů
				break;
			} else {
				target[i] = target[j];
				i = j;
				j = 2 * j + 1;
			}
		}
		target[i] = temp;
	}
}
