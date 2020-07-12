package com.tute.array;

import netscape.security.ForbiddenTargetException;
import org.junit.Test;

import java.util.*;

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
       //int[] nums1 = {1, 2, 2, 4,5,7,1}, nums2 = {2, 2,5};
        int[] nums1 = {61,24,20,58,95,53,17,32,45,85,70,20,83,62,35,89,5,95,12,86,58,77,30,64,46,13,5,92,67,40,20,38,31,18,89,85,7,30,67,34,62,35,47,98,3,41,53,26,66,40,54,44,57,46,70,60,4,63,82,42,65,59,17,98,29,72,1,96,82,66,98,6,92,31,43,81,88,60,10,55,66,82,0,79,11,81};
        int[] nums2 = {5,25,4,39,57,49,93,79,7,8,49,89,2,7,73,88,45,15,34,92,84,38,85,34,16,6,99,0,2,36,68,52,73,50,77,44,61,48};
        int[] intersection = new Lintcode547IntersectionOfTwoArrays().intersection2(nums1, nums2);
        for (int i : intersection) {
            System.out.print(i+",");
        }
    }
    public int[] intersection3(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int temp[] = new int[nums1.length];
        int index = 0;
        while (i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j] ){
                if(index==0||temp[index-1]!=nums1[i] ){
                    temp[index++] = nums1[i];
                }
                i++;
                j++;
            }else if(nums1[i] < nums2[j] ){
                i++;
            }else {
                j++;
            }
        }
        int[] result = new int[index];
        System.arraycopy(temp,0 ,result ,0 ,index );
//        for (int k = 0; k <index ; k++) {
//            result[k] = temp[k];
//        }
        return result;
    }

    public int[] intersection2(int[] nums1, int[] nums2){
        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> nums2Set = new HashSet<>();
        for (int i : nums1) {
            nums1Set.add(i);
        }
        for (int i : nums2) {
            nums2Set.add(i);
        }
        ArrayList<Integer> lists = new ArrayList<>();
        for (Integer integer : nums1Set) {
            if(nums2Set.contains(integer) ){
                lists.add(integer);
            }
        }
        int size = lists.size();
        int[] result = new int[size];
        int index = 0;
        for (Integer integer : lists) {
            result[index++] = integer;
        }
         //int[] arr1 = lists.stream().mapToInt(Integer::valueOf).toArray();
        return result;
        //Integer[] integers = lists.toArray(new Integer[lists.size()]);
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
