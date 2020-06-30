package com.offer.linkedlist;

public class _18_删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return head;
        ListNode node = head;
        if (node.val == val) return node.next;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;

                break;
            }
            node = node.next;
        }
        return head;
    }
}
