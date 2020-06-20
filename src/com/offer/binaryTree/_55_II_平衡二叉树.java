package com.offer.binaryTree;

import com.douye.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _55_II_平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(nodeHeight(root.left) - nodeHeight(root.right)) > 1) {
            return true;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }


    public int nodeHeight(TreeNode root) {
        if (root == null) return 0;
        return Math.max(nodeHeight(root.left),nodeHeight(root.right)) + 1;
    }

    public int nodeHeight1(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        int height = 0;
        int levelSize = 1;
        while (!queue.isEmpty()) {
            node = queue.poll();
            levelSize--;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
            if (levelSize == 0) {
                height ++;
                levelSize = queue.size();
            }
        }
        return height;
    }
}
