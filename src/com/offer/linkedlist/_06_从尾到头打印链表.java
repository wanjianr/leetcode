package com.offer.linkedlist;

public class _06_从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        ListNode node=null,newHead=null;
        int i = 0;
        while (head != null) {
            node = head;
            head = head.next;

            node.next = newHead;
            newHead = node;
            i++;
        }
        int[] res = new int[i];
        for (int j = 0; j < i; j++) {
            res[j] = newHead.val;
            newHead = newHead.next;
        }
        return res;
    }
}
