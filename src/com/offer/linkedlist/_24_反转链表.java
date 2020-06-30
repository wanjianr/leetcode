package com.offer.linkedlist;

public class _24_反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode node = null, newNode = null;
        while (head != null) {
            node = head;
            head = head.next;

            node.next = newNode;
            newNode = node;
        }
        return newNode;
    }
}
