package com.tute;

import org.junit.Test;

/**
 * @Author: 田增印
 * @Date: 2020/8/23
 * @Time: 8:20
 * @Description: com.tute
 * @VERSION: 1.0
 */
public class Leetcode69 {
    @Test
    public void  test1(){
        int i = new Leetcode69().mySqrt1(8);
        System.out.println(i);
    }
    public int mySqrt(int x) {
        int last_n = x,n = x/2;
        while (last_n - n > 1e-4){
            last_n = n;
            n = (last_n + x/last_n)/2;
        }
        return n;//int(n) ** 2 ==x
    }
    public int mySqrt1(int x){
        long n = x;
        while (n * n > x) {
            n = (n + x / n) / 2;
        }
        return (int) n;
    }
}
