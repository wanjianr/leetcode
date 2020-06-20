package com.offer.binaryTree;

import com.douye.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _27_二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;

        TreeNode left = root.left;

        root.left = mirrorTree(root.right);
        root.right = mirrorTree(left);

        return root;
    }

    // 中序遍历
    public TreeNode mirrorTree1(TreeNode root) {
        if (root == null) return null;
        mirrorTree1(root.left);
        TreeNode leftNode = root.left;
        root.left = root.right;
        root.right = leftNode;
        mirrorTree1(root.left);
        return root;
    }

    // 后续遍历
    public TreeNode mirrorTree2(TreeNode root) {
        if (root == null) return null;

        TreeNode leftNode = mirrorTree(root.left);
        TreeNode rightNode = mirrorTree(root.right);
        root.right = leftNode;
        root.left = rightNode;
        return root;
    }

    // 层序遍历
    public TreeNode mirrorTree3(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);

        while (!queue.isEmpty()) {
            node = queue.poll();

            TreeNode leftNode = node.left;
            node.left = node.right;
            node.right = leftNode;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        return root;
    }
}
