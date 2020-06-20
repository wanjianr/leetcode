package com.offer.binaryTree;

import com.douye.tree.TreeNode;

public class _54_二叉搜索树的第k大节点 {
    public int n;
    public int max;
    public int kthLargest(TreeNode root, int k) {

        if (root == null) return 0;
        kthLargest1(root,k);
        return max;
    }
    public void kthLargest1(TreeNode root, int k) {
        if (root == null) return;
        int knum = 0;
        kthLargest1(root.right,k);
        n++;
        if (n == k) {
            max = root.val;
            return;
        }
        kthLargest1(root.left,k);
    }
}
