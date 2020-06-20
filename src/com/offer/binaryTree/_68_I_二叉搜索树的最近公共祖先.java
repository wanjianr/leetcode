package com.offer.binaryTree;

import com.douye.tree.TreeNode;

public class _68_I_二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        int min=0,max=0;
//        if (p.val > q.val) {
//            min = q.val;
//            max = p.val;
//        } else {
//            max = q.val;
//            min = p.val;
//        }
//
//        if (min <= root.val && max >= root.val) {
//            return root;
//        } else if (min < root.val && max < root.val) {
//            return lowestCommonAncestor(root.left,p,q);
//        } else {
//            return lowestCommonAncestor(root.right,p,q);
//        }

        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left,p,q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right,p,q);
        } else
            return root;
    }
}
