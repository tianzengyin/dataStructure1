package com.tute.sort;

/**
 * @Author: 田增印
 * @Date: 2020/10/28
 * @Time: 23:20
 * @Description: com.tute.sort
 *              https://leetcode-cn.com/problems/shuffle-string/
 *              1528. 重新排列字符串
 *              给你一个字符串 s 和一个 长度相同 的整数数组 indices 。
 *              请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。
 *              返回重新排列后的字符串。
 * @VERSION: 1.0
 */
public class Leetcode1528 {
    public static void main(String[] args){
      String s = "codeleet"; int[] indices = {4,5,6,7,0,2,1,3};
        String s1 = restoreString(s, indices);
        System.out.println(s1);
    }
    public static String restoreString(String s, int[] indices) {
        int len = s.length();
        char[] arr = new char[len];
        for (int i = 0; i <len ; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }
}
