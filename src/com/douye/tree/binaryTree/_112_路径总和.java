package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _112_路径总和 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        Queue<Integer> list = new LinkedList<>();
        TreeNode node = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int pathSum = root.val;
        list.offer(pathSum);
        while (!queue.isEmpty()) {
            node = queue.poll();
            pathSum = list.poll();
            if (node.left == null && node.right == null) {
                if (pathSum == sum)
                    return true;
            }
            if (node.left!=null) {
                queue.offer(node.left);
                list.offer(node.left.val + pathSum);
            }
            if (node.right!=null) {
                queue.offer(node.right);
                list.offer(node.right.val + pathSum);
            }
        }
        return false;
    }
}
