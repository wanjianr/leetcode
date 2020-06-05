package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

public class _230_二叉搜索树中第K小的元素 {
    public int min;
    public int n = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return min;
    }

    public void inorder(TreeNode node, int k) {
        if (node == null) return;
        inorder(node.left, k);
        n++;
        if (n == k) {
            min = node.val;
        }
        inorder(node.right,k);
    }

}
