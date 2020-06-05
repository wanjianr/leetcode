package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

public class _701_二叉搜索树中的插入操作 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        int cmp = val - root.val;
        if (cmp > 0) {
            root.right = insertIntoBST(root.right,val);
        } else if (cmp < 0) {
            root.left = insertIntoBST(root.left,val);
        } else {
            root.val = val;
        }
        return root;
    }
}
