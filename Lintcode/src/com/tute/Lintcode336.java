package com.tute;


import org.junit.Test;

/**
 * @Author: 田增印
 * @Date: 2020/6/26
 * @Time: 5:41
 * @Description: https://www.lintcode.com/problem/fibonacci/description?_from=ladder&&fromId=6
 *      描述
            查找斐波纳契数列中第 N 个数。

            所谓的斐波纳契数列是指：

            前2个数是 0 和 1 。
            第 i 个数是第 i-1 个数和第i-2 个数的和。
            斐波纳契数列的前10个数字是：

            0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 * @VERSION: 1.0
 */
public class Lintcode336 {
    @Test
    public void TestFibonacci(){
        long start = System.currentTimeMillis();
        int fibonacci = new Lintcode336().fibonacci1(30);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(fibonacci+" "+time);
    }

    public int fibonacci(int n) {
        // write your code here
        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Test
    public void TestFibonacci1(){
        int fibonacci = new Lintcode336().fibonacci1(2);
        System.out.println(fibonacci);
    }

    public int fibonacci1(int n) {
        // write your code here
        int a = 0;
        int b = 1;
        for (int i = 0; i <n-1 ; i++) {
            int c = a+b;
            a = b;
            b = c;
        }
        return  a;
    }
}
