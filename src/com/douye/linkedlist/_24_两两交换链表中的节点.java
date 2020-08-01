package com.douye.linkedlist;

import com.offer.linkedlist.ListNode;

import java.util.List;

public class _24_两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        first.next = swapPairs(second.next);
        second.next = first;
        return second;
    }
}
