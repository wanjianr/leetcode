package com.douye.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _101_对称二叉树 {

    public static boolean isSymmetric1(TreeNode root) {
        if (root==null) return true;
        return check(root.left,root.right);
    }

    public static boolean check(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        if (node1==null || node2==null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        return check(node1.left,node2.right) && check(node1.right,node2.left);
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        List<Integer> list = new ArrayList<>();
        TreeNode flag = new TreeNode(-1);
        int count = 1;
        int s = 0;
        while (!queue.isEmpty()) {
            node = queue.poll();
            count--;
            list.add(node.val);

            if (node.left!=null)
                queue.offer(node.left);
            else
                queue.offer(flag);

            if (node.right!=null)
                queue.offer(node.right);
            else
                queue.offer(flag);

            if (count == 0) {
                list.stream().forEach(System.out::print);
                System.out.println();;
                for (int i = 0; i < (list.size()>>1); i++) {
                    if (list.get(i) != list.get(list.size()-i-1))
                        return false;
                }
                count = queue.size();
                list = new ArrayList<>();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);
//        root.left = node1;
//        root.right = node2;
//        node1.left = node3;
//        node1.right = node4;
//        node2.left = node5;
//        node2.right = node6;

        TreeNode root2 = new TreeNode(1);
        root2.left = node1;
        root2.right = node2;
        node1.right = node3;
        node2.right = node6;
        boolean flag = isSymmetric1(root);
        System.out.println(flag);
    }
}
