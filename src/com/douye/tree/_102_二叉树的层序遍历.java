package com.douye.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_二叉树的层序遍历 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> listList = new ArrayList<>();
        if (root == null) return listList;
        Queue<TreeNode> queue = new  LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        int count = 1;
        while (!queue.isEmpty()) {
            count = queue.size();
            while (count > 0) {
                node = queue.poll();
                list.add(node.val);
                count--;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            listList.add(list);
            list = new ArrayList<>();
        }
        return listList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.right = node1;
        root.left = node2;
        node2.left = node3;
        node2.right = node4;
        List<List<Integer>> list = levelOrder(root);
        list.stream().forEach(System.out::println);
    }
}
