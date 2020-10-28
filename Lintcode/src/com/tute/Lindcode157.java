package com.tute;

import java.util.HashMap;
import java.util.concurrent.ForkJoinPool;

/**
 * @Author: 田增印
 * @Date: 2020/9/18
 * @Time: 8:51
 * @Description: com.tute 157. 判断字符串是否没有重复字符
 *              描述
                    实现一个算法确定字符串中的字符是否均唯一出现
                样例 1:
                输入:  "abc_____"
                输出:  false
                样例 2:
                输入:  "abc"
                输出:  true
 * @VERSION: 1.0
 */
public class Lindcode157 {
    public static void main(String[] args){
        boolean abc = new Lindcode157().isUnique1("abc___");
        System.out.println(abc);
    }
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if(hashMap.containsKey(chars[i]) ){
                return false;
            }else {
                hashMap.put(chars[i],1 );
            }
        }
        return true;
    }
    public boolean isUnique1(String str){
        int length = str.length();
        if(length==0 || length==1 ){
            return true;
        }
        for (int i = 0; i <length-1 ; i++) {
            for (int j= i+1; j<length;j++ ){
                if(str.charAt(i) == str.charAt(j) ){
                    return false;
                }
            }
        }
        return true;
    }
}
