package com.douye.sort;

public class _23_合并K个排序链表 {
    private _21_合并两个有序链表 merge = new _21_合并两个有序链表();
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        ListNode node = merge.mergeTwoLists(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            node = merge.mergeTwoLists(node, lists[i]);
        }
        return node;
    }
}
