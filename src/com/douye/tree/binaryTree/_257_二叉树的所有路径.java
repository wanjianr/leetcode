package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _257_二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<String> pathQueue = new LinkedList<>();
        TreeNode node = root;
        String path = Integer.toString(root.val);
        nodeQueue.offer(node);
        pathQueue.offer(path);
        while (!nodeQueue.isEmpty()) {
            node = nodeQueue.poll();
            path = pathQueue.poll();
            if (node.left==null && node.right==null) {
                paths.add(path);
            } else {
                if (node.left != null) {
                    nodeQueue.offer(node.left);
                    pathQueue.offer(path+"->"+Integer.toString(node.left.val));
                }
                if (node.right != null) {
                    nodeQueue.offer(node.right);
                    pathQueue.offer(path+"->"+Integer.toString(node.right.val));
                }
            }
        }
        return paths;
    }
}
