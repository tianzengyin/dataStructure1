package cn.edu.tju.rico.sort;
  
/**        
 * Title: ���������е�ϣ������  
 * Description: �ֱ�Լ��Ϊgap��gap�������н���ֱ�Ӳ������򣬲�����Сgap,ֱ��Ϊ 1 
 * 
 * 				�տ�ʼʱ��gap�ϴ�ÿ��������Ԫ�ؽ��٣������ٶȽϿ죻
 * 				����������ڣ�gap��С��ÿ��������Ԫ�ؽ϶࣬���󲿷�Ԫ�ػ����������������ٶ��ԽϿ졣				
 * 
 * 				ʱ�临�Ӷȣ�O(n) ~ O(n^2)
 * 				�ռ临�Ӷȣ�O(1)
 * 				��    ��   �ԣ����ȶ�
 * 				�ڲ�����(���������������Ԫ����ȫ���ڴ�)
 * @author rico       
 * @created 2017��5��20�� ����10:40:00    
 */      
public class ShellSort {
	
	  
	/**     
	 * @description 
	 * @author rico       
	 * @created 2017��5��21�� ����7:56:03     
	 * @param target
	 * @return     
	 */
	public static int[] shellSort(int[] target){
		if(target != null && target.length != 1){
			int gap = target.length;       // gap����СΪgap��������
			do{
				gap = gap/3 + 1;     // ������Сgapֱ��Ϊ1
				for (int i = 0 + gap; i < target.length; i++) {   // ��ÿ�������н���ֱ�Ӳ�������
					if(target[i] < target[i-gap]){
						int j = i - gap;
						int temp = target[i];         // ������ֵ
						do{
							target[j + gap] = target[j];         // ����Ԫ��
							j = j - gap;          // �ٱȽ�ǰһ��Ԫ��
						}while(j >= 0 && target[j] > temp);  // ��ǰ�Ƚϵ���ֹ����
						target[j + gap] = temp;         // ��������ֵ������ʵ�λ��
					}
				}
			}while(gap > 1);
		}
		return target;
	}
}
