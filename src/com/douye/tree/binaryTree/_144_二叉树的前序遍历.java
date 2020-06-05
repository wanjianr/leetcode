package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class _144_二叉树的前序遍历 {
    // 递归
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        list.add(root.val);
        if(root.left!=null) list.addAll(preorderTraversal(root.left));
        if(root.right!=null) list.addAll(preorderTraversal(root.right));
        return list;
    }

    // 迭代
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null) return list;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right!=null) stack.push(node.right);
            if (node.left!=null) stack.push(node.left);
        }
        return list;
    }
}
