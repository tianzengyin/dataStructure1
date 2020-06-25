package com.tute.sort;

import java.util.Arrays;

/**
 * @Author: 田增印
 * @Date: 2020/6/25
 * @Time: 8:02
 * @Description: com.tute.sort
 *              合并两个有序升序的整数数组A和B变成一个新的数组。新数组也要有序。
 *              https://www.lintcode.com/problem/merge-two-sorted-arrays/description
 * @VERSION: 1.0
 */
public class MergeArray6 {

    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] C = new int[A.length+B.length];
        for (int i=0;i<=A.length-1 ;i++ ){
            C[i] = A[i];
        }
        for(int j=0 ;j<=(B.length-1);j++){
            C[A.length+j]= B[j];
        }
        Arrays.sort(C);
        return C;
    }

    /*
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray2(int[] A, int[] B) {
        // write your code here
        int[] result = new int[A.length + B.length];
        int i = 0;
        int a = 0;
        int b = 0;
        while (a < A.length && b < B.length) {
            // 如果a和b都不越界，那么执行比较操作
            if (A[a] < B[b]) {
                // 如果A[a]比B[b]小，那么放A[a]
                result[i] = A[a];
                a++;
            } else {
                // 反之，放B[b]
                result[i] = B[b];
                b++;
            }
            i++;
        }
        // 此时，一定有某个数组的数全部比较完了，一定有一个数组还有数没比较，并且这些数比
        // 另一个数组大
        while (a < A.length) {
            // 如果A数组没越界，说明还有数没比较，直接添加到新数组
            result[i] = A[a];
            a++;
            i++;
        }
        while (b < B.length) {
            // 同理
            result[i] = B[b];
            b++;
            i++;
        }
        return result;
    }
}
