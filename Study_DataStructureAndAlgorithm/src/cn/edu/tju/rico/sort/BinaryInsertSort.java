package cn.edu.tju.rico.sort;

  
/**        
 * Title: ���������е��۰�������������ڳ�ʼ����  
 * Description: �۰�����������λ�ã���ֱ�Ӳ���;��ֱ�Ӳ��������������ǣ����ߵ�����Ҫ����˳������
 * 				ʱ�临�Ӷȣ��۰���������ֱ�Ӳ����������Լ����˹ؼ���֮��ıȽϴ����������ƶ�������û�иı䡣���ԣ�
 * 				�۰��������Ͳ��������ʱ�临�Ӷ���ͬ����O��N^2�����ڼ����˱Ƚϴ���������ȷʵ�൱���㣬���Ը��㷨��Ȼ��ֱ�Ӳ�������á�
 * 				�ռ临�Ӷȣ�O(1)
 * 				��    ��   �ԣ��ȶ�
 * 				�ڲ�����(���������������Ԫ����ȫ���ڴ�)
 * @author rico       
 * @created 2017��5��25�� ����12:03:23    
 */      
public class BinaryInsertSort {
	public static int[] binaryInsertSort(int[] target) {
		if (target != null && target.length > 1) {
			for (int i = 1; i < target.length; i++) {
				int left = 0;
				int right = i - 1;
				int mid;
				int temp = target[i];
				if(temp < target[right]){   // ��ǰֵС���������е����ֵʱ����ʼ���Ҳ���λ��
					while(left <= right){
						mid = (left + right)/2;
						if(target[mid] < temp){
							left = mid + 1;    // ��С��������
						}else if(target[mid] > temp){
							right = mid - 1;    // ��С��������
						}else{        // ������ֵ�����������е�target[mid]��ȣ���֤�ȶ��ԵĴ���
							left = left + 1;   
						}
					}
					
					// left������������˳������ƶ�������leftλ�ò���
					for (int j = i; j > left; j--) {
						target[j] = target[j-1];
					}
					target[left] = temp;
				}
			}
		}
		return target;
	}
}
