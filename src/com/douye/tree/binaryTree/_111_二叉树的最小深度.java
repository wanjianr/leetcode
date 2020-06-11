package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

public class _111_二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right != null)
            return Math.min(minDepth(root.left), minDepth(root.right)+1);
        else if (root.left != null && root.right == null)
            return Math.min(minDepth(root.left)+1, minDepth(root.right)+1);
        else
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
