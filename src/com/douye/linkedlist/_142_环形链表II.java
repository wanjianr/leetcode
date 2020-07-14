package com.douye.linkedlist;

import com.offer.linkedlist.ListNode;

import java.util.HashSet;
import java.util.Set;

public class _142_环形链表II {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode quick = head;
        while (quick != null && quick.next != null) {
            slow = slow.next;
            quick = quick.next.next;
            if (slow == quick) break;
        }
        if (quick == null || quick.next == null) return null;
        quick = head;
        while (quick != slow) {
            quick = quick.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode detectCycle1(ListNode head) {
         if(head == null) return null;
         Set<ListNode> set = new HashSet<>();
         ListNode node = head;
         while(node != null) {
             if(set.contains(node)) {
                 return node;
             }
             set.add(node);
             node = node.next;
         }
         return null;
    }
}
