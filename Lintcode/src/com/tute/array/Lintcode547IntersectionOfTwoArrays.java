package com.tute.array;

import netscape.security.ForbiddenTargetException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: 田增印
 * @Date: 2020/7/11
 * @Time: 6:22
 * @Description: com.tute.array
 *      https://www.lintcode.com/problem/intersection-of-two-arrays/description
 *      https://www.jiuzhang.com/solution/intersection-of-two-arrays/
 *      描述
            给出两个数组，写出一个方法求出它们的交集
            结果中的每个元素必须是唯一的。
            结果需要为升序。
            样例
            例1:
                输入: nums1 = [1, 2, 2, 1], nums2 = [2, 2],
                输出: [2].
 * @VERSION: 1.0
 */
public class Lintcode547IntersectionOfTwoArrays {
    @Test
    public void intersectionTest(){
       int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        int[] intersection = new Lintcode547IntersectionOfTwoArrays().intersection(nums1, nums2);
        for (int i : intersection) {
            System.out.println(i);
        }
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        List<Integer> list = new ArrayList<>();
//        int a = 0;
//        int b = 0;
        for (int a = 0; a <nums1.length  ; a++) {
            for (int b = 0; b < nums2.length; b++) {
                if(nums1[a]==nums2[b] ){
                    if(list.contains(nums1[a]) ){
                        break;
                    }
                    list.add(nums1[a]);break;
                }
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            ints[i] = list.get(i);
        }
        return   ints;
    }
}
