package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 1. 将 root 入栈
 * 2. 循环执行以下操作，直到栈为空
 * 如果栈顶节点是叶子节点 或者 上一次访问的节点是栈顶节点的子节点
 * ✓ 弹出栈顶节点，进行访问
 * 否则
 * ✓ 将栈顶节点的right、 left按顺序入栈
 */
public class _145_二叉树的后序遍历 {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = null;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.peek();
            if ((temp.left==null && temp.right==null) || (node!=null && (node==temp.right || node==temp.left))){
                node = stack.pop();
                list.add(node.val);
            } else {
                if (temp.right!=null) stack.push(temp.right);
                if (temp.left!=null) stack.push(temp.left);
            }
        }
        return list;
    }

    public static List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.addAll(postorderTraversal1(root.left));
        list.addAll(postorderTraversal1(root.right));
        list.add(root.val);
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.right = node1;
        node1.left = node2;
        List<Integer> list = postorderTraversal1(root);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
