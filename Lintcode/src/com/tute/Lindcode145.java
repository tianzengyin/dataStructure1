package com.tute;

/**
 * @Author: 田增印
 * @Date: 2020/9/18
 * @Time: 8:23
 * @Description: com.tute 145. 大小写转换
 *              描述
 *                  将一个字符由小写字母转换为大写字母
 *                  样例 1:
                        输入: 'a'
                        输出: 'A'
                        样例 2:

                        输入: 'b'
                        输出: 'B'
 * @VERSION: 1.0
 */
public class Lindcode145 {
    public static void main(String[] args){
        char a = new Lindcode145().lowercaseToUppercase2('a');
        System.out.println(a);
    }
    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        // write your code here
        String s = Character.toString(character).toUpperCase();
        char c = s.charAt(0);
        return c;
    }
    public char lowercaseToUppercase1(char character){
        //获得character与'a'的差值，在'A'的基础上加上这个差值
        return (char)(character - 'a' + 'A');
    }
    public char lowercaseToUppercase2(char character){
        //ASCII码中小写字母与对应的大写字母相差32
        return (char)(character - 32);
    }
}
