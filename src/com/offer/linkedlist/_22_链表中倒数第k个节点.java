package com.offer.linkedlist;

public class _22_链表中倒数第k个节点 {

    // 快慢指针
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head, quick = head;
        while (k != 0) {
            quick = quick.next;
            k--;
        }
        while (quick != null) {
            slow = slow.next;
            quick = quick.next;
        }
        return slow;
    }

    public ListNode getKthFromEnd1(ListNode head, int k) {
        int len = 0,i=0;
        ListNode h = head,res=head;
        while (h!=null) {
            len++;
            h = h.next;
        }
        while ((i+k) != len) {
            head = head.next;
            res = head;
            i++;
        }
        return res;
        // 反转链表
//        ListNode newNode = null,node;
//        while (head != null) {
//            // 头删
//            // 1. 保存头部
//            node = head;
//            // 2. 头部指向下下一个节点
//            head = head.next;
//
//            // 头插
//            // 1. 指向新节点
//            node.next = newNode;
//            newNode = node;
//        }

    }
}
