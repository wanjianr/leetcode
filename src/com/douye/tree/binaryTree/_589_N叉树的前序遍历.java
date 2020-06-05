package com.douye.tree.binaryTree;

import com.douye.tree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _589_N叉树的前序遍历 {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.add(root.val);
        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                list.addAll(preorder(root.children.get(i)));
            }
        }
        return list;
    }

    // 迭代
    public List<Integer> preorder1(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node> stack = new Stack<>();
        Node node = root;
        stack.push(node);
        while (!stack.isEmpty()) {
            node = stack.pop();
            list.add(node.val);
            if (node.children != null) {
                for (int i = node.children.size()-1; i >=0;  i--) {
                    stack.push(node.children.get(i));
                }
            }
        }
        return list;
    }
}
