package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _563_二叉树的坡度 {

    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        return Math.abs(valSum(root.left) - valSum(root.right)) + findTilt(root.left) + findTilt(root.right);

    }

    public int valSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + valSum(node.left) + valSum(node.right);
    }

    // 超出时间限制
    public int valSum1(TreeNode node) {
        if (node == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode temp = node;
        queue.offer(temp);
        int sum = 0;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            sum += temp.val;
            if (node.left!=null) queue.offer(node.left);
            if (node.right!=null) queue.offer(node.right);
        }
        return sum;
    }

}
