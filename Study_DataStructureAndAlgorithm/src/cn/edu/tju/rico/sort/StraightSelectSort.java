package cn.edu.tju.rico.sort;

/**        
 * Title: ѡ�������е�ֱ��ѡ������   
 * Description: ÿ���ҵ������е�ǰ����Χ�е���Сֵ����÷�Χ�еĵ�һ�����ֽ�����ͬʱ��С���������������Χ
 * 				ʱ�临�Ӷȣ��������O(n^2)��ƽ������O(n^2)���������O(n^2)
 * 				�ռ临�Ӷȣ�O(1)
 * 				��    ��   �ԣ����ȶ�
 * 				�ڲ�����(���������������Ԫ����ȫ���ڴ�)
 * @author rico       
 * @created 2017��5��20�� ����10:40:00    
 */      
public class StraightSelectSort {
	
	public static int[] selectSort(int[] target){
		
		if(target != null && target.length != 1){
			for (int i = 0; i < target.length; i++) {
				int min_index = i;
				for (int j = i + 1; j < target.length; j++) {
					if(target[min_index] > target[j]){
						min_index = j;
					}
				}
				if(target[min_index] != target[i]){  // ���²��ȶ������أ�����
					int min = target[min_index];
					target[min_index] = target[i];
					target[i] = min;
				}
			}
		}
		return target;
	}
}
