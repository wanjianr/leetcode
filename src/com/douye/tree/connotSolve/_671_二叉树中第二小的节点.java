package com.douye.tree.connotSolve;

import com.douye.tree.TreeNode;
import com.sun.org.apache.bcel.internal.generic.LNEG;

import java.util.LinkedList;
import java.util.Queue;

public class _671_二叉树中第二小的节点 {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        int l = Math.min(getMin(root.left,root.val),getMin(root.right,root.val));
        if (l == root.val) return -1;
        return l;
    }

    public int getMin(TreeNode node, int min) {
        if (node == null) return min;
        if (node.val < min) min = node.val;
        return Math.min(getMin(node.left,min),getMin(node.right,min));
    }
}
