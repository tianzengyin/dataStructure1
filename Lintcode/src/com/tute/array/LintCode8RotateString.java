package com.tute.array;

/**
 * @Author: 田增印
 * @Date: 2020/6/25
 * @Time: 8:07
 * @Description: com.tute.array
 *      给定一个字符串（以字符数组的形式给出）和一个偏移量，
 *      根据偏移量原地旋转字符串(从左向右旋转)。
 *      输入:  str="abcdefg", offset = 3
 *      输出:  str = "efgabcd"
 *      样例解释:  注意是原地旋转，即str旋转后为"efgabcd"
 *      https://www.lintcode.com/problem/rotate-string/description
 * @VERSION: 1.0
 */
public class LintCode8RotateString {

    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset)
    {
        // write your code here
        char temp;
        if(offset==0) {
            return;
        }
        if(str.length==0) {
            return;
        }

        int len = str.length;
        for(int i= 0; i<offset%len;i++)
        {
            temp = str[len-1];
            for(int j =len-1 ;j>0;j--)
            {
                str[j]=str[j-1];
            }
            str[0]=temp;
        }

    }

}
