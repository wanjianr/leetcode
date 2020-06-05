package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.Arrays;

public class _106_从中序与后序遍历序列构造二叉树 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length < 1 || postorder.length < 1) return null;
        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        for (int i = 0; i < inorder.length; i++) {
            if (root.val == inorder[i]) {
                root.left = buildTree(Arrays.copyOfRange(inorder,0,i),Arrays.copyOfRange(postorder,0,i));
                root.right = buildTree(Arrays.copyOfRange(inorder,i+1,inorder.length),Arrays.copyOfRange(postorder,i,postorder.length-1));
            }
        }
        return root;
    }
}
