package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _173_二叉搜索树迭代器 {
    //public Queue<TreeNode> queue = null; // 空间复杂度O(N)
    public Stack<TreeNode> stack = null;
    public _173_二叉搜索树迭代器(TreeNode root) {
        //queue = new LinkedList<>();
        //inorder(root);

        stack = new Stack<>();
        helper(root);
    }

    public void helper(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

//    private void inorder(TreeNode node) {
//        if (node == null) return;
//        inorder(node.left);
//        queue.offer(node);
//        inorder(node.right);
//    }

    /** @return the next smallest number */
    public int next() {
        //return queue.poll().val;
        TreeNode node = stack.pop();
        if (node.right != null)
            helper(node.right);
        return node.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        //return !queue.isEmpty();
        return !stack.isEmpty();
    }
}
