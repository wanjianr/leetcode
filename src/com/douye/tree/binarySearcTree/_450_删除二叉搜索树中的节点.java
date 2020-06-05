package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

public class _450_删除二叉搜索树中的节点 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        int cmp = root.val - key;
        if (cmp < 0) {
            root.right = deleteNode(root.right,key);
            return root;
        } else if (cmp > 0) {
            root.left = deleteNode(root.left,key);
            return root;
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode successor = getSuccessor(root.right);
                successor.right = deleteMin(root.right);
                successor.left = root.left;
                return successor;
            }
        }
    }
    public static TreeNode getSuccessor(TreeNode node) {
        if (node.left == null) return node;
        return getSuccessor(node.left);
    }

    public static TreeNode deleteMin(TreeNode node) {
        if (node.left == null) return node.right;
        node.left = deleteMin(node.left);
        return node;
    }

}
