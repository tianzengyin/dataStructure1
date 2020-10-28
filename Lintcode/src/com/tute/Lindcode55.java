package com.tute;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: 田增印
 * @Date: 2020/9/16
 * @Time: 8:12
 * @Description: com.tute
 *          https://www.lintcode.com/problem/compare-strings/description
 *          比较字符串
 *          描述
 *           比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母
 *          样例
 *           给出 A = "ABCD" B = "ACD"，返回 true
 *           给出 A = "ABCD" B = "AABC"， 返回 false
 * @VERSION: 1.0
 */
public class Lindcode55 {
    public static void main(String[] args){
        Lindcode55 lindcode55 = new Lindcode55();
        boolean b = lindcode55.compareStrings("ABCD", "ACD");
        System.out.println(b);
    }
    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        char[] charsA = A.toCharArray();
        Collection<Character> listA = new ArrayList<>();
        for (int i=0;i<charsA.length;i++){
            listA.add(charsA[i]);
        }
        char[] charsB = B.toCharArray();
        Collection<Character> listB = new ArrayList<>();
        for (int i=0;i<charsB.length;i++){
            listB.add(charsB[i]);
        }
        for (int i=0;i<charsB.length;i++){
            boolean remove = listA.remove(charsB[i]);
            if (!remove){
                return remove;
            }
        }
        return true;
    }
}
