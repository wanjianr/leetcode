package com.douye;


import com.offer.linkedlist.ListNode;

public class _19_删除链表的倒数第N个节点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = dummy;
        for (int i = 0; i < n + 1; i++) {
            cur = cur.next;
        }
        while (cur != null) {
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return dummy.next;
    }
}
