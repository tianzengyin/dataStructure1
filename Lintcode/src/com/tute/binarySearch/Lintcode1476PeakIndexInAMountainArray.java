package com.tute.binarySearch;

import org.junit.Test;

/**
 * @Author: 田增印
 * @Date: 2020/7/11
 * @Time: 5:41
 * @Description: com.tute.binarySearch
 *      https://www.lintcode.com/problem/peak-index-in-a-mountain-array/description
 *      描述
            我们把符合下列属性的数组 A 称作山脉：

            A.length >= 3
            存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
            给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。

            1.3 <= A.length <= 10000
            2.0 <= A[i] <= 10^6
 * @VERSION: 1.0
 */
public class Lintcode1476PeakIndexInAMountainArray {
    @Test
    public void peakIndexInMountainArrayTest(){
        int[] arr = {0,2,1,0};
        int i = new Lintcode1476PeakIndexInAMountainArray().peakIndexInMountainArray2(arr);
        System.out.println("i = " + i);
    }
    public int peakIndexInMountainArray2(int[] A){
        // Write your code here
        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > A[mid - 1]) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        return  (A[start] > A[start - 1] && A[start] > A[start + 1]) ? start : end ;
    }
    public int peakIndexInMountainArray(int[] A) {
        // Write your code here
        if(A.length<3||A.length>1000 ){
            return -1;
        }
        for (int i = 0; i <A.length ; i++) {
            if(A[i+1]<A[i] ){
                return i;
            }
        }
        return -1;
    }
}
