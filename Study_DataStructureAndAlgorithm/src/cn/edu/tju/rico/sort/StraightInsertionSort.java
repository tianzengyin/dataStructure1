package cn.edu.tju.rico.sort;
  
/**        
 * Title: ���������е�ֱ�Ӳ������� �������ڳ�ʼ����  
 * Description: �����������в��ϲ����µļ�¼�Դﵽ���������������������Ŀ��
 * 				ʱ�临�Ӷȣ��������O(n)��ƽ������O(n^2)���������O(n^2)
 * 				�ռ临�Ӷȣ�O(1)
 * 				��    ��   �ԣ��ȶ�
 * 				�ڲ�����(���������������Ԫ����ȫ���ڴ�)
 * @author rico       
 * @created 2017��5��20�� ����10:40:00    
 */      
public class StraightInsertionSort {
	
	public static int[] insertSort(int[] target){
		
		if(target != null && target.length != 1){   // ���������鲻Ϊ���ҳ��ȴ���1
			for (int i = 1; i < target.length; i++) {  // ���������������У�ֱ����չ����������
				for (int j = i; j > 0; j--) {    // �����������в����µ�Ԫ��
					if(target[j]  < target[j-1]){  // ����
						int temp = target[j];
						target[j] = target[j-1];
						target[j-1] = temp;
					}
				}
			}
		}
		return target;
	}
}