package com.offer.binaryTree;


public class _36_二叉搜索树与双向链表 {
    Node head,pre;
    public Node treeToDoublyList(Node root) {
        if (root == null) return head;
        inorder(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    public void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        if (pre == null) {
            head = node;
        } else {
            pre.right = node;
            node.left = pre;
        }
        pre = node;
        inorder(node.right);
    }
}











//public class _36_二叉搜索树与双向链表 {
//    Node head,pre;
//    public Node treeToDoublyList(Node root) {
//        if (root == null) return null;
//        inorder(root);
//        pre.right = head;
//        head.left = pre;
//        return head;
//    }
//
//    public void inorder(Node node) {
//        if (node == null) return;
//        inorder(node.left);
//        if (pre != null) {
//            pre.right = node;
//            node.left = pre;
//        } else {
//            head = node;
//        }
//        pre = node;
//        inorder(node.right);
//    }
//}
