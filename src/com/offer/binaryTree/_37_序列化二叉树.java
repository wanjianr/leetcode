package com.offer.binaryTree;

import com.douye.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _37_序列化二叉树 {



    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "[]";
        StringBuilder stringBuilder = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                stringBuilder.append(node.val+",");
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                stringBuilder.append("null,");
            }
        }
        return stringBuilder.deleteCharAt(stringBuilder.length()-1).append("]").toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == "[]") return null;
        String[] strings = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(strings[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (!strings[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(strings[i]));
                queue.offer(node.left);
            }
            i++;
            if (!strings[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(strings[i]));
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }





















//    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//        if (root == null) return "[]";
//        //String str = "[";
//        StringBuilder str = new StringBuilder("[");
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//
//            if (node != null) {
//                str.append(node.val+",");
//                queue.offer(node.left);
//                queue.offer(node.right);
//            } else
//                str.append("null,");
//
//        }
//        return str.deleteCharAt(str.length()-1).append("]").toString();
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        if (data == "[]") return null;
//        String[] strings = data.substring(1, data.length() - 1).split(",");
//        TreeNode root = new TreeNode(Integer.parseInt(strings[0]));
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        int i = 1;
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            if (!strings[i].equals("null")) {
//                node.left = new TreeNode(Integer.parseInt(strings[i]));
//                queue.offer(node.left);
//            }
//            i ++;
//            if (!strings[i].equals("null")) {
//                node.right = new TreeNode(Integer.parseInt(strings[i]));
//                queue.offer(node.right);
//            }
//            i++;
//        }
//        return root;
//    }

    public static void main(String[] args) {
        _37_序列化二叉树 s = new _37_序列化二叉树();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        //root.right = new TreeNode(3);
        String serialize = s.serialize(root);
        System.out.println(serialize);
    }
}
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));