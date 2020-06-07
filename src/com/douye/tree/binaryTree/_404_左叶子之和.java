package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.Stack;

public class _404_左叶子之和 {
    public int sum = 0;
    TreeNode pre;
    public int sumOfLeftLeaves(TreeNode root) {
        preOrder(root);
        return sum;
    }

    public void preOrder(TreeNode node) {
        if (node == null) return;
        if (pre != null) {
            if (node.left == null && node.right == null && pre.left == node){
                sum += node.val;
            }
        }
        pre = node;
        preOrder(node.left);
        preOrder(node.right);
    }
}
