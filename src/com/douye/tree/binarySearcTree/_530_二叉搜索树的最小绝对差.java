package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _530_二叉搜索树的最小绝对差 {
    //public List<Integer> list = new ArrayList<>();

    public int min = Integer.MAX_VALUE;
    public TreeNode preNode = null;
    public void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);
        if (preNode != null)
            min = Math.min(min,Math.abs(node.val-preNode.val));
        preNode = node;
        inorder(node.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
//        int min = Math.abs(list.get(1)-list.get(0));
//        for (int i = 1; i < list.size()-1; i++) {
//            min = Math.min(min,Math.abs(list.get(i+1)-list.get(i)));
//        }
        return min;
    }
}
