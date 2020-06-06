package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

public class _965_单值二叉树 {
    public boolean flag = true;
    public TreeNode pre;
    public boolean isUnivalTree(TreeNode root) {
        scan(root);
        return flag;
    }

    public void scan(TreeNode node) {
        if (node == null) return;
        if (pre != null) {
            if (pre.val != node.val) {
                flag = false;
            }
        }
        pre = node;
        scan(node.left);
        scan(node.right);
    }

    // 另一种思路
    public boolean isUnivalTree2(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.val != root.val) {
            return false;
        }
        if (root.right != null && root.right.val != root.val) {
            return false;
        }
        return isUnivalTree(root.right) && isUnivalTree(root.left);
    }
}
