package com.douye;

import com.offer.linkedlist.ListNode;

public class _86_分隔链表 {
    public ListNode partition(ListNode head, int x) {
        ListNode minDummy = new ListNode(0);
        ListNode maxDummy = new ListNode(0);
        ListNode minNode = minDummy;
        ListNode maxNode = maxDummy;
        while (head != null) {
            if (head.val < x) {
                minNode.next = head;
                minNode = minNode.next;
                head = head.next;
                minNode.next = null; // 切断dummy
            } else {
                maxNode.next = head;
                maxNode = maxNode.next;
                head = head.next;
                maxNode.next = null;
            }
        }
        minNode.next = maxDummy.next;
        return minDummy.next;
    }
}
