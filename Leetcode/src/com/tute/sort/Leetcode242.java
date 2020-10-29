package com.tute.sort;

import java.util.Arrays;

/**
 * @Author: 田增印
 * @Date: 2020/10/29
 * @Time: 9:06
 * @Description: com.tute.sort
 *              https://leetcode-cn.com/problems/valid-anagram/
 *              242. 有效的字母异位词
 *              给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *              示例 1:
 *              输入: s = "anagram", t = "nagaram"
 *              输出: true
 *
 * @VERSION: 1.0
 */
public class Leetcode242 {
    public static void main(String[] args){
       String s = "anagram", t = "nagaram";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }
}
