package com.offer.binaryTree;

import com.douye.tree.TreeNode;

public class _28_对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return cmp(root.left,root.right);
    }


    public boolean cmp(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        if (n1.val != n2.val) return false;
        else return cmp(n1.left,n2.right) && cmp(n1.right,n2.left);
    }

}
