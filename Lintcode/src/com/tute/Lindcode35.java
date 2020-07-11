package com.tute;

import org.junit.Test;

/**
 * @Author: 田增印
 * @Date: 2020/7/7
 * @Time: 7:34
 * @Description: com.tute
 *      https://www.lintcode.com/problem/reverse-linked-list/description?_from=ladder&&fromId=6
 *      翻转一个链表
 *          输入: 1->2->3->null
 *          输出: 3->2->1->null
 *          解答：https://blog.csdn.net/qq_42351880/article/details/88637387
 * @VERSION: 1.0
 */
public class Lindcode35 {
    @Test
    public  void  TestReverse(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode reverse = new Lindcode35().reverse(node1);
        while (reverse!=null){
            System.out.println(reverse.val);
            reverse= reverse.next;
        }
    }
    public ListNode reverse(ListNode head) {
        // write your code here
        ListNode newHead = null;
        ListNode node = null;
        while (head!=null){
            node = head;
            head = head.next;

            node.next = newHead;
            newHead = node;
        }
        return newHead;
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}