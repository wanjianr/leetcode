package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.*;

public class _107_二叉树的层次遍历II {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> listList = new ArrayList<>();
        if (root == null) return listList;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        int count = 1;
        while (!queue.isEmpty()) {
//            node = queue.poll();
//            count --;
//            list.add(node.val);
//            if (node.left!=null) queue.offer(node.left);
//            if (node.right!=null) queue.offer(node.right);
//            if (count == 0) {
//                count = queue.size();
//                listList.add(list);
//                list = new ArrayList<>();
//            }
            count = queue.size();
            while (count > 0) {
                node = queue.poll();
                count--;
                list.add(node.val);
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            listList.add(list);
            list = new ArrayList<>();
        }
        //Collections.reverse(listList);
        List<List<Integer>> newList = new ArrayList<>(listList.size());
        for (int i = listList.size()-1; i >= 0; i--) {
            newList.add(listList.get(i));
        }
        return newList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.right = node1;
        root.left = node2;
        node2.right = node3;
        node2.left = node4;
        List<List<Integer>> list = levelOrderBottom(root);
        list.stream().forEach(System.out::println);
    }
}
