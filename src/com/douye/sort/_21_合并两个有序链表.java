package com.douye.sort;

import sun.plugin.javascript.navig.Link;

import java.util.LinkedList;
import java.util.List;

public class _21_合并两个有序链表 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        node.next = node1;
        node1.next = node2;

        node3.next = node4;
        node4.next = node5;

//        _21_合并两个有序链表 merge = new _21_合并两个有序链表();
//        ListNode integers = merge.mergeTwoLists(node, node3);
//        while (integers != null) {
//            System.out.print(integers.val+" -> ");
//            integers = integers.next;
//        }

        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(6);
        node6.next = node7;
        _23_合并K个排序链表 mergeK = new _23_合并K个排序链表();
        ListNode[] listNodes = {node,node3,node6};
        ListNode integers = mergeK.mergeKLists(listNodes);
        while (integers != null) {
            System.out.print(integers.val+" -> ");
            integers = integers.next;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergeResult = new ListNode(0);
        ListNode cur = mergeResult;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) // 总有一个链表先为null，若l1先为null，则接上l2的最后一个元素，否则接上l1
            cur.next = l2;
        else
            cur.next = l1;
        return mergeResult.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}