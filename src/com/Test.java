package com;

import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class Test {
    public boolean isBanlance(TreeNode root) {
        if (root == null) return true;
        return Math.abs(getDepth(root.left)-getDepth(root.right)) < 2 && isBanlance(root.left) && isBanlance(root.right);
    }
    public int getDepth(TreeNode node) {
        if (node == null) return 0;
        return Math.max(getDepth(node.left),getDepth(node.right)) + 1;
    }

    TreeNode pre;
    public boolean isBST(TreeNode root) {
        if (root == null) return true;
        boolean l = isBST(root.left);
        if (pre != null) {
            if (pre.val >= root.val)
                return false;
        }
        pre = root;
        boolean r = isBST(root.right);
        return l && r;
    }
}
