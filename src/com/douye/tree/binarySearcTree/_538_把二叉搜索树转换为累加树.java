package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

public class _538_把二叉搜索树转换为累加树 {
    public int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        root.right = convertBST(root.right);
        int temp = root.val;
        root.val = temp + sum;
        sum += temp;
        root.left = convertBST(root.left);
        return root;
    }
}
