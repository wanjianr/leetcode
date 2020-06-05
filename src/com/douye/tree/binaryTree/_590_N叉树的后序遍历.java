package com.douye.tree.binaryTree;

import com.douye.tree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _590_N叉树的后序遍历 {
    public static List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        List<Node> child = root.children;
        if (child!=null) {
            for (Node node : child) {
                list.addAll(postorder(node));
            }
        }
        list.add(root.val);
        return list;
    }

    // 迭代
    public static List<Integer> postorder1(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Node node = null;
        Node temp = null;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            temp = stack.peek();
            if (temp.children==null || (node!=null && temp.children.contains(node))) {
                node = stack.pop();
                list.add(node.val);
            } else {
                if (temp.children!=null) {
                    for (int i = temp.children.size()-1; i >= 0 ; i--) {
                        stack.push(temp.children.get(i));
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        List<Node> child = new ArrayList<>();
        List<Node> child2 = new ArrayList<>();

        Node n4 = new Node(5);
        Node n5 = new Node(6);
        child2.add(n4);
        child2.add(n5);

        Node n1 = new Node(2);
        Node n2 = new Node(3,child2);
        Node n3 = new Node(4);
        child.add(n1);
        child.add(n2);
        child.add(n3);
        Node root = new Node(1,child);

        List<Integer> list = postorder1(root);
        list.stream().forEach(System.out::println);
    }
}
