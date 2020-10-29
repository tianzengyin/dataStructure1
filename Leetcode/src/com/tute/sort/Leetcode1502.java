package com.tute.sort;

/**
 * @Author: 田增印
 * @Date: 2020/10/29
 * @Time: 7:29
 * @Description: com.tute.sort
 *               https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
 *               1502. 判断能否形成等差数列
 *               给你一个数字数组 arr .
 *               如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
 *               如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
 *
 * @VERSION: 1.0
 */
public class Leetcode1502 {
    public static void main(String[] args){
        int[] arr = {300,600,900,1200};
        boolean b = canMakeArithmeticProgression(arr);
        System.out.println(b);
        int a1 = 356;
        int a2 = 356;
        System.out.println(a1==a2);
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        for (int i = 0; i <arr.length-2 ; i++) {
            int a1 = arr[i]-arr[i+1];
            int a2 = arr[i+1]-arr[i+2];
            if(a1!=a2 ){
                return false;
            }
        }
        return true;
    }

}
