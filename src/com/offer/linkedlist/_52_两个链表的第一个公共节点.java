package com.offer.linkedlist;

public class _52_两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA.next;
            pB = pB.next;
            if (pA == null && pB == null) break;
            if (pA == null) pA = headB;
            if (pB == null) pB = headA;
        }
        return pA;
    }
}
