package com.douye;

import com.offer.linkedlist.ListNode;

public class _61_旋转链表 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int len = 1;
        ListNode node = head;
        while (node.next != null) {
            len++;
            node = node.next;
        }
        node.next = head;
        k = k % len;
        int index = len - k;
        while (index > 0) {
            node = node.next;
            index--;
        }
        head = node.next;
        node.next = null;
        return head;
    }
}
