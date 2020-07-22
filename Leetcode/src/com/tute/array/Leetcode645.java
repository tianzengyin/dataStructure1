package com.tute.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @Author: 田增印
 * @Date: 2020/7/22
 * @Time: 7:35
 * @Description: com.tute.array
 *      https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 *      剑指 Offer 11. 旋转数组的最小数字
 *      把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 *      例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
            示例 1：
            输入：[3,4,5,1,2]
            输出：1

 * @VERSION: 1.0
 */
public class Leetcode645 {
    @Test
    public void testMinArray(){
        int[] arr = {2,2,2,0,1};
        int i = new Leetcode645().minArray2(arr);
        System.out.println("i = " + i);

    }
    public int minArray2(int[] numbers){
        OptionalInt min = Arrays.stream(numbers)
                .min();
        return min.getAsInt();
    }
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int li = 0;
        int lo =len-1;
        while (li<lo){
            int mid =  (lo+li)/2;
            if(numbers[mid]>numbers[li] ){
                li = mid+1;
            }
            else if(numbers[mid]<numbers[lo] ){
                lo = mid;
            }else {
                lo--;
            }
        }
        return numbers[li];
        /*for (int i = 1; i <len-1 ; i++) {
            if(numbers[i-1] > numbers[i] && numbers[i]<=numbers[i+1] ){
                return numbers[i];
            }

        }*/

    }
}
