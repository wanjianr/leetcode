package com.offer.binaryTree;

import com.douye.tree.TreeNode;

import java.util.Arrays;

public class _07_重建二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length < 1 || inorder.length < 1) return null;
        TreeNode node = new TreeNode(preorder[0]);
        for (int i = 0 ; i < preorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                node.left = buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                node.right = buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
            }
        }
        return node;
    }
}
