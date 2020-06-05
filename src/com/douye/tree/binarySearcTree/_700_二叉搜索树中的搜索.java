package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

public class _700_二叉搜索树中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        int cmp = val - root.val;
        if (cmp > 0) {
            return searchBST(root.right,val);
        } else if (cmp < 0) {
            return searchBST(root.left,val);
        } else {
            return root;
        }
    }
}
