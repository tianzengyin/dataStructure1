package com.tute.binarySearch;

import org.junit.Test;

import javax.sql.rowset.serial.SQLOutputImpl;

/**
 * @Author: 田增印
 * @Date: 2020/7/9
 * @Time: 7:44
 * @Description: com.tute.binarySearch
 *
 *      https://www.lintcode.com/problem/first-position-of-target/description
 *      描述
 *       给定一个排序的整数数组（升序）和一个要查找的整数target，
 *       用O(logn)的时间查找到target第一次出现的下标（从0开始），
 *       如果target不存在于数组中，返回-1。
 *
 *      https://www.jiuzhang.com/solution/first-position-of-target/
 *
 * @VERSION: 1.0
 */
public class Lindcode14 {
    @Test
    public  void binarySearchTest(){
        int[] arr = {1,4,4,5,7,7,8,9,9,10};
        int i = new Lindcode14().binarySearch(arr, 4);
        System.out.println(i);
    }
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int lo = 0;
        int li = nums.length-1;
        while (lo+1<li){
            int mid = lo + (li-lo)/2;
            if(target<nums[mid]){
                li=mid;
            }
            if(target> nums[mid]){
                lo=mid;
            }
            if(target== nums[mid]){

                li=mid;
               //return mid;
            }
        }
        if(nums[li]== target){
            return li;
        }
        if(nums[lo] == target ){
            return lo;
        }
        return  -1;
    }
}
