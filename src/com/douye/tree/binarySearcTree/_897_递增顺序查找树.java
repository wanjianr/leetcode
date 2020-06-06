package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class _897_递增顺序查找树 {
    public TreeNode newRoot = new TreeNode(0);
    public TreeNode pre = newRoot;
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;
        increasingBST(root.left);
        pre.right = new TreeNode(root.val);
        pre = pre.right;
        increasingBST(root.right);
        return newRoot.right;
    }

}
