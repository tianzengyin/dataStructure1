package com.tute.sort;

import java.util.Arrays;

/**
 * @Author: 田增印
 * @Date: 2020/6/24
 * @Time: 14:46
 * @Description: com.tute.sort
 * @VERSION: 1.0
 */
public class SelectSort {

    public static void main(String[] args){
        int[] arr = {2,45,32,15,1,5,48,35,10,4,6,56,20,78,23};
        SelectSort.selectSort(arr);
    }

    public static void selectSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int min = i;
            for (int j = i+1; j <arr.length ; j++) {
                if( arr[min] > arr[j] ){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
