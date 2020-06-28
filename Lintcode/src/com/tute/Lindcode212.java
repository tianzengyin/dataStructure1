package com.tute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: 田增印
 * @Date: 2020/6/28
 * @Time: 5:26
 * @Description: com.tute
 *         https://www.lintcode.com/problem/space-replacement/description?_from=ladder&&fromId=6
 *         描述
           设计一种方法，将一个字符串中的所有空格替换成 %20 。你可以假设该字符串有足够的空间来加入新的字符，且你得到的是“真实的”字符长度。
           你的程序还需要返回被替换后的字符串的长度。
           输入：string[] = "Mr John Smith" and length = 13
           输出：string[] = "Mr%20John%20Smith" and return 17
           解释：
           对于字符串 "Mr John Smith"，长度为 13。替换空格之后，参数中的字符串需要变为 "Mr%20John%20Smith"，并且把新长度 17 作为结果返回。

 * @VERSION: 1.0
 */
public class Lindcode212 {
    public static void main(String[] args){
        char[] chars = "Mr John Smith".toCharArray();
        int i = Lindcode212.replaceBlank(chars, chars.length);
        System.out.println(i);
    }
    public static int replaceBlank1(char[] string, int length){
        List<Character> list = new ArrayList<>();
        for (int i = 0; i <length ; i++) {
            if( string[i]!=' '){
                list.add(string[i]);
            }else {
                list.add('%');
                list.add('2');
                list.add('0');
            }
        }
        System.out.println(Arrays.toString(string));
        System.out.println(list.toString());
        Character[] newString =  list.toArray(new Character[list.size()]);
        String s = newString.toString();
        char[] chars = s.toCharArray();
        int length1 = newString.length;
        return length1;
    }
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public static int replaceBlank(char[] string, int length) {
        // write your code here
        /*String s = String.valueOf(string);
        String s1 = s.replaceAll(" ", "%20");
        int length1 = s1.length();
        return length1;*/
        int newLen = length;
        for (Character c : string) {
            if(c.equals(' ')){
                newLen = newLen+2;
            }
        }
        char[] chars = new char[newLen];
        /*int j = 1;
        for (int i = length-1; i >=0 ; i--) {
            if(string[i] != ' ' ){
                chars[newLen-j] = string[i];
                j++;
            }else {
                chars[newLen-j] = '0';
                j++;
                chars[newLen-j] = '2';
                j++;
                chars[newLen-j] = '%';
                j++;
            }
        }*/
        int k = 0;
        for (int i = 0; i <length ; i++) {
            if(string[i] != ' '){
                chars[k] = string[i];
                k++;
            }else {
                chars[k]='%';
                k++;
                chars[k]='2';
                k++;
                chars[k]='0';
                k++;
            }
        }
        System.out.println(Arrays.toString(chars));
        return newLen;
    }
}
