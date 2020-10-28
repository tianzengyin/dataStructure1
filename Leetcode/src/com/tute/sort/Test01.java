package com.tute.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

/**
 * @Author: 田增印
 * @Date: 2020/7/24
 * @Time: 8:12
 * @Description: com.tute.sort
 * @VERSION: 1.0
 */
public class Test01 {
    @Test
    public void test01(){
        int[] nums ={3,2,1,5,6,4};
        //Object[] array = Arrays.stream(nums).boxed().sorted((n1, n2) -> n2 - n1).toArray();
        int i = new Test01().findKthLargest(nums, 2);
        System.out.println(i);
    }
    public int findKthLargest(int[] nums,int k){
        Optional<Integer> first = Arrays.stream(nums)
                .boxed()
                .sorted((n1, n2) -> n2 - n1)
                .skip(k - 1)
                .findFirst();
            return first.get();
    }
}
