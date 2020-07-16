package com.tute;

import com.tute.array.Leetcode88;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: 田增印
 * @Date: 2020/7/13
 * @Time: 6:41
 * @Description: com.tute
 *      https://www.lintcode.com/problem/remove-duplicates-from-sorted-array/description
 *      https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 *
 *      26. 删除排序数组中的重复项
            给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
            不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
            示例 1:
                给定数组 nums = [1,1,2],
                函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
                你不需要考虑数组中超出新长度后面的元素。
 * @VERSION: 1.0
 */
public class Leetcode26 {
    @Test
    public void removeDuplicatesTest(){
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int i = new Leetcode26().removeDuplicates(nums);
        System.out.println(Arrays.toString(nums)+"--"+i);
    }
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int k =0;
        for (int i = 0; i <nums.length; i++) {
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }
        return k+1;
    }

}
