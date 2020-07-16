package com.tute.link;

/**
 * @Author: 田增印
 * @Date: 2020/7/17
 * @Time: 7:21
 * @Description: com.tute.link 删除排序链表中的重复元素
 *      https://www.lintcode.com/problem/remove-duplicates-from-sorted-list/description
        给定一个排序链表，删除所有重复的元素每个元素只留下一个。
        样例 1:
        输入:  null
        输出: null
        样例 2:
        输入: 1->1->2->null
        输出: 1->2->null
        样例 3:
        输入: 1->1->2->3->3->null
        输出: 1->2->3->null
 *
 * @VERSION: 1.0
 */
public class Lintcode112 {
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode node = head;
        while (node.next!=null){
            if(node.val == node.next.val ){
                node.next=node.next.next;
            }else {
                node = node.next;
            }
        }
        return  head;
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
