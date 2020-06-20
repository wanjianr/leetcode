package com.offer.binaryTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _32_I_从上到下打印二叉树 {
    public int[] levelOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        while (!queue.isEmpty()) {
            node = queue.poll();
            list.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
