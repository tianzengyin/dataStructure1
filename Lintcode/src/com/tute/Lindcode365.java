package com.tute;

import org.junit.Test;

/**
 * @Author: 田增印
 * @Date: 2020/6/29
 * @Time: 6:07
 * @Description: com.tute
 *        https://www.lintcode.com/problem/count-1-in-binary/description?_from=ladder&&fromId=6
 *        描述
          计算在一个 32 位的整数的二进制表示中有多少个 1。
            样例
            样例 1：
            输入：32
            输出：1
            解释：
            32(100000)，返回 1。
 * @VERSION: 1.0
 */
public class Lindcode365 {
    @Test
    public void testCountOnes(){
        int i = new Lindcode365().countOnes(9);
        System.out.println(i);
    }
    /*
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
        // write your code here
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}
