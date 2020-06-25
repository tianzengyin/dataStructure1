package com.tute.sort;

import java.util.Arrays;

/**
 * @Author: 田增印
 * @Date: 2020/6/24
 * @Time: 14:46
 * @Description: com.tute.sort
 *      912. 排序数组
 *      https://leetcode-cn.com/problems/sort-an-array/
 *      给你一个整数数组 nums，请你将该数组升序排列。
 * @VERSION: 1.0
 */
public class SelectSort {

    public static void main(String[] args){
        int[] arr = {2,45,32,15,1,5,48,35,10,4,6,56,20,78,23};
        SelectSort.selectSort(arr);
    }

    /**
     *
     * @param nums
     * @return
     */
    public int[] sortArray(int[] nums) {
        for(int i = 0 ;i<nums.length-1;i++){
            int min = i;
            for(int j = i+1;j<nums.length;j++){
                if(nums[min]>nums[j]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
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
