package com.offer.linkedlist;

public class _25_合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode node = res.next;
        while (l1 != null || l2 != null) {
            if (l1.val > l2.val) {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            } else {
                node.next = l1;
                node = node.next;
                l1 = l1.next;
            }
        }
        if (l1 == null) node.next = l2;
        if (l2 == null) node.next = l1;
        return res.next;
    }
}
