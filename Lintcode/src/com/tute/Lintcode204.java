package com.tute;

import org.junit.Test;

/**
 * @Author: 田增印
 * @Date: 2020/6/26
 * @Time: 6:29
 * @Description: https://www.lintcode.com/problem/singleton/description?_from=ladder&&fromId=6
 *      描述
        单例 是最为最常见的设计模式之一。对于任何时刻，如果某个类只存在且最多存在一个具体的实例，那么我们称这种设计模式为单例。例如，对于 class Mouse (不是动物的mouse哦)，我们应将其设计为 singleton 模式。
        你的任务是设计一个 getInstance 方法，对于给定的类，每次调用 getInstance 时，都可得到同一个实例。
 * @VERSION: 1.0
 */
public class Lintcode204 {
    @Test
    public  void TestGetInstance(){
        Lintcode204 instance1 = Lintcode204.getInstance();
        Lintcode204 instance2 = Lintcode204.getInstance();
        System.out.println(instance1==instance2);
    }
    private Lintcode204() {
    }
    public final static Lintcode204 instance = new Lintcode204();
    public static Lintcode204 getInstance() {
        // write your code here
        return instance;
    }
}
