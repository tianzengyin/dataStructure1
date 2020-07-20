package com.tute.array;

import org.junit.Test;
import sun.text.resources.cldr.ia.FormatData_ia;

import java.util.concurrent.ForkJoinPool;

/**
 * @Author: 田增印
 * @Date: 2020/7/20
 * @Time: 7:44
 * @Description: com.tute.array
 *      https://leetcode-cn.com/problems/search-insert-position/
 *      35. 搜索插入位置
 *      给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 *      如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
        你可以假设数组中无重复元素。
        示例 1:

        输入: [1,3,5,6], 5
        输出: 2
        示例 2:

        输入: [1,3,5,6], 2
        输出: 1
 * @VERSION: 1.0
 */
public class Leetcode35 {
    @Test
    public void TestsearchInsert(){
        int[] nums = {1};
        int target = 2;
        int i = new Leetcode35().searchInsert(nums, target);
        System.out.println(i);
    }
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0] ){
            return 0;
        }
        if(target>=nums[nums.length-1] ){
            return nums.length;
        }

        for (int j = 1; j <nums.length ; j++) {

            if(nums[j-1]<target  && target<=nums[j] ){
                return j;
            }

        }
        return -1;
    }
}
