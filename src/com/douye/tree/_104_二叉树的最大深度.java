package com.douye.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        int count = 1;
        int high = 0;
        while (!queue.isEmpty()) {
            count = queue.size();
            while (count > 0) {
                node = queue.poll();
                count--;
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            high++;
        }
        return high;
    }
}
