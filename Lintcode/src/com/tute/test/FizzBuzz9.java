package com.tute.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 田增印
 * @Date: 2020/6/22
 * @Time: 5:58
 * @Description: com.tute.test
 *    https://www.lintcode.com/problem/fizz-buzz/description
 *
        9. Fizz Buzz 问题
        中文English
        给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：

        如果这个数被3整除，打印fizz.
        如果这个数被5整除，打印buzz.
        如果这个数能同时被3和5整除，打印fizz buzz.
        如果这个数既不能被 3 整除也不能被 5 整除，打印数字本身。
        样例
        比如 n = 15, 返回一个字符串数组：

        [
        "1", "2", "fizz",
        "4", "buzz", "fizz",
        "7", "8", "fizz",
        "buzz", "11", "fizz",
        "13", "14", "fizz buzz"
        ]
 * @VERSION: 1.0
 */
public class FizzBuzz9 {
    public static void main(String[] args){
        List<String> strings = new FizzBuzz9().fizzBuzz(15);

    }
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    @Test
    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("fizz buzz");
            } else if (i % 3 == 0) {
                list.add("fizz");
            } else if (i % 5 == 0 ) {
                list.add("buzz");
            } else {
                //String string = new Integer(i).toString();
                String string = Integer.toString(i);
                list.add(string);
            }
        }
        for (int j = 0; j < list.size(); j++) {
            if (j == list.size() - 1) {
                System.out.print(list.get(j));
            } else {
                System.out.print(list.get(j) + ",");
            }
        }
        return list;
    }

    /**
     *
     *  vector<string> results;
     vector<string> sampling{ "", "fizz", "buzz", "fizz buzz" };
     for (int i = 1; i <= n; i++) {
     sampling[0] = to_string(i);
     int index = 0;
     index += i % 15 == 0;
     index += i % 3 == 0;
     index += i % 5 == 0;
     if (i % 3 != 0 && i % 5 == 0) {
     index += 1;
     }
     string result = sampling[index];
     results.push_back(result);
     }
     return results;
     * @param n
     * @return
     */
    public List<String> fizzBuzz2(int n){

        return null;
    }

}
