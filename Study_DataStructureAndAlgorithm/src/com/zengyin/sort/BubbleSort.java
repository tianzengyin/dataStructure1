package com.zengyin.sort;

/**
 * @Auther:田增印
 * @Date: 2019/4/30
 * @Description: 冒泡排序
 * @VERSION:1.0
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        for(int end = arr.length-1;end>0;end--){
            for(int i = 0 ;i<end;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
