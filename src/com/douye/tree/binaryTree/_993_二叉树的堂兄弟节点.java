package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

public class _993_二叉树的堂兄弟节点 {
    public TreeNode pre;
    public boolean isCousins(TreeNode root, int x, int y) {
        int d1 = getDepth(root, x, 0);
        int p1 = getParent(root, x);
        int d2 = getDepth(root, y, 0);
        int p2 = getParent(root, y);
        if (d1 == d2) {
            if (p1 == p2) return false;
            return true;
        } else
            return false;
    }

    public int getDepth(TreeNode node, int k, int depth) {
        if (node == null) return 0;
        depth ++;
        if (node.val == k) return depth;
        return Math.max(getDepth(node.left,k,depth),getDepth(node.right,k,depth));
    }

    public int getParent(TreeNode node, int k) {
        if (node == null) return 0;
        if ((node.left != null && node.left.val==k)
            || (node.right!=null && node.right.val==k)) return node.val;
        return Math.max(getParent(node.left,k),getParent(node.right,k));
    }
}
