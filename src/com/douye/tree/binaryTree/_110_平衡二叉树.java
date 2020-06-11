package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

public class _110_平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        boolean flag = Math.abs(getHeight(root.left,0)-getHeight(root.right,0)) <= 1 ? true :false;
        return flag && isBalanced(root.right) && isBalanced(root.left);
    }


    public int getHeight(TreeNode node, int height) {
        if (node == null) return height;
        height ++;
        return Math.max(getHeight(node.left,height),getHeight(node.right,height));
    }
}
