package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _105_从前序与中序遍历序列构造二叉树 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        Arrays.stream(Arrays.copyOfRange(array, 1, 5)).forEach(System.out::print);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length<1 || inorder.length<1) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < preorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                root.left = buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                root.right = buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
            }
        }
        return root;
    }
}
