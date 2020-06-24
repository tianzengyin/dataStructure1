package com.zengyin.package1;

public class DemoArrays {

	
	
	//获取最值
	public static int getMax(int[] arr){
		int Max = arr[0];
		for(int i = 1; i<arr.length;i++){
			if(Max < arr[i])
				Max = arr[i];
		}
		return Max;		
	}
	public static int getMax_2(int[] arr){
		int Max = 0;
		for(int i=1; i<arr.length;i++){
			if(arr[Max] < arr[i] ){
				arr[Max] = arr[i];
			}
		}
		return arr[Max];
	}
	/*public static int[] selectSort(int[] arr){
		for(int i = 0 ; i<arr.length - 1 ;){}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[]{2,3,56,20,45,72};
		
		System.out.println(getMax_2(arr1));
	//System.out.println(arr1[0]);	
		//int[] arr2 = new int[3];
	}

}
