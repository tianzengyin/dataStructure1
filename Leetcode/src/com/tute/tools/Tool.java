package com.tute.tools;

import java.util.Random;

/**
 * @Author: 田增印
 * @Date: 2020/10/28
 * @Time: 13:55
 * @Description: com.tute.tools
 * @VERSION: 1.0
 */


public class Tool {
    /**
     * 生成随机数组
     * @param n 数组长度
     * @param randomL 数组最小元素
     * @param randomR 数组最大元素
     * @return
     */
    public static int[] generateIntArray(int n ,int randomL, int randomR){
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            int num = new Random().nextInt(randomR-randomL+1)+randomL;
            arr[i] = num;
        }
        return arr;
    }
}
