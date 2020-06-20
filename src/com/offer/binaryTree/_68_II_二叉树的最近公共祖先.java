package com.offer.binaryTree;

/**
 * 详细题解：
 *  https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/solution/mian-shi-ti-68-ii-er-cha-shu-de-zui-jin-gong-gon-7/
 */

import com.douye.tree.TreeNode;

public class _68_II_二叉树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val || root.val == q.val) return root;

        if (searchSubTree(root.left,p) == false && searchSubTree(root.left,q) == false) {
            return lowestCommonAncestor(root.right,p,q);
        } else if (searchSubTree(root.right,p) == false && searchSubTree(root.right,q) == false) {
            return lowestCommonAncestor(root.left,p,q);
        } else
            return root;
    }

    public boolean searchSubTree(TreeNode root, TreeNode node) {
         if (root == null) return false;
         if (root.val == node.val) return true;
         return searchSubTree(root.left, node) || searchSubTree(root.right,node);
    }
}
