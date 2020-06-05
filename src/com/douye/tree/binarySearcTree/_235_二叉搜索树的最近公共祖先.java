package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

public class _235_二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((p.val - root.val)*(q.val - root.val)<=0) return root;
        else if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left,p,q);
        } else {
            return lowestCommonAncestor(root.right,p,q);
        }
    }
}

