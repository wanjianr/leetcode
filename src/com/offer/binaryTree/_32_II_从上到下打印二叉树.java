package com.offer.binaryTree;

import com.douye.tree.TreeNode;
import sun.util.resources.cldr.az.CalendarData_az_Cyrl_AZ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _32_II_从上到下打印二叉树 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        List<Integer> level = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        int levelSize = 1;
        while (!queue.isEmpty()) {
            node = queue.poll();
            level.add(node.val);
            levelSize --;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
            if (levelSize == 0) {
                result.add(level);
                level = new ArrayList<>();
                levelSize = queue.size();
            }
        }
        return result;
    }
}
