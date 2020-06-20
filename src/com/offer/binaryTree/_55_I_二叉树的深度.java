package com.offer.binaryTree;

import com.douye.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _55_I_二叉树的深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        int depth = 0;
        int levelSize = 1;
        while (!queue.isEmpty()) {
            node = queue.poll();
            levelSize --;

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);

            if (levelSize == 0) {
                depth++;
                levelSize = queue.size();
            }
        }
        return depth;
    }
}
