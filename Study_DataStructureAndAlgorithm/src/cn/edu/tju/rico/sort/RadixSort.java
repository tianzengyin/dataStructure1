package cn.edu.tju.rico.sort;

/**        
 * Title: ���������еĻ�������  
 * Description: �����ڶ�Ԫ�ؽ��бȽϵĻ����Ͻ������򣬶��ǲ��� "���� + �ռ�" �İ취 
 * 
 * 				���ȣ���Ŀ�����и�Ԫ�ط��䵽����Ͱ�У�
 * 				��Σ�������Ͱ�е�Ԫ�ذ��Ƚ��ȳ���˳���ٷŻ�ȥ
 * 				�������...				
 * 
 * 				ʱ�临�Ӷȣ�O(d*(r+n))���� O(dn),d �Ĵ�Сһ����ܵ� n��Ӱ��
 * 				�ռ临�Ӷȣ�O(rd + n)���� O(n)
 * 				��    ��   �ԣ��ȶ�
 * 				�ڲ�����(���������������Ԫ����ȫ���ڴ�)
 * @author rico       
 * @created 2017��5��20�� ����10:40:00    
 */   
public class RadixSort {

	/**     
	 * @description ���� + �ռ�
	 * @author rico       
	 * @created 2017��5��21�� ����9:25:52     
	 * @param target ����������
	 * @param r ����
	 * @param d Ԫ�ص�λ��
	 * @param n ������Ԫ�ظ���
	 * @return     
	 */
	public static int[] radixSort(int[] target, int r, int d, int n){
		if (target != null && target.length != 1 ) {
			
			int[][] bucket = new int[r][n];  // һ���л���r��Ͱ��ÿ��Ͱ����n��Ԫ��
			int digit;  // ��ȡԪ�ض�Ӧλ�ϵ����֣���װ���Ǹ�Ͱ
			int divisor = 1;   // ����ÿһ�ֵĳ�����1, 10, 100, ...
			int[] count = new int[r];   // ͳ��ÿ��Ͱ��ʵ�ʴ��Ԫ�صĸ���
			
			for (int i = 0; i < d; i++) {  // d λ��Ԫ�أ���Ҫ�������䡢�ռ�d�μ����������
				
				// ����
				for (int ele : target) {   
					digit = (ele/divisor) % 10;  // ��ȡԪ�ض�Ӧλ�ϵ�����(�������)
					bucket[digit][count[digit]++] = ele; // ��Ԫ�ط����ӦͰ��Ͱ��Ԫ����Ŀ��1
				}
				
				// �ռ�
				int index = 0;  // Ŀ��������±�
				for (int j = 0; j < r; j++) {
					int k = 0;    // ���ڰ����Ƚ��ȳ�˳���ȡͰ��Ԫ��
					while(k < count[j]){
						target[index++] = bucket[j][k++];  // �����Ƚ��ȳ�����ȡ��Ͱ�е�Ԫ��
					}
					count[j] = 0;  // ����������
				}
				divisor *= 10;  	//���ڻ�ȡԪ�ض�Ӧλ����
			}
		}
		return target;
	}
}
