package com.tute.test;

import java.math.BigDecimal;

/**
 * @Author: 田增印
 * @Date: 2020/6/22
 * @Time: 21:15
 * @Description: com.tute.test
 * @VERSION: 1.0
 */
public class Test {
    public static void main(String[] args){
        Long round = Math.round(44.4444444445*100);
        System.out.println(round);

        BigDecimal bigDecimal = new BigDecimal(44.4444444445);
        Double f1 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
    }

    //@Test
    public void roundTest(){
        Long round = Math.round(44.4444444445*100);
        System.out.println(round);

        BigDecimal bigDecimal = new BigDecimal(44.4444444445);
        Double f1 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
    }

}
