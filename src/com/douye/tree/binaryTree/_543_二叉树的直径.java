package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

public class _543_二叉树的直径 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int depth = getDepth(root.left) + getDepth(root.right);
        int sonDepth = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(depth,sonDepth);
    }

    public int getDepth(TreeNode node) {
        if (node == null) return 0;
        return Math.max(getDepth(node.left),getDepth(node.right)) + 1;
    }
}
