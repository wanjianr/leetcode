package com.douye;

import com.offer.linkedlist.ListNode;

public class _83_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy.next;
        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                if (node.next == null) { // 已经到达最后一个节点
                    break;
                }
                node = dummy.next;
            } else {
                node = node.next;
            }
        }
        return dummy.next;
    }
}
