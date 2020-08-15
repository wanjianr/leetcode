package com.douye;

import com.offer.linkedlist.ListNode;

public class _92_反转链表II {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode start =  head, startTemp = start;
        ListNode reverse = reverse(startTemp);
        return null;
    }

    private ListNode reverse(ListNode head) {
        ListNode node = null, newHead = null;
        while (head != null) {
            node = head;
            head = head.next;

            node.next = newHead;
            newHead = node;
        }
        return newHead;
    }
}
