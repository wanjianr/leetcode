package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import javax.xml.namespace.QName;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _662_二叉树最大宽度 {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int maxW = 1;
        int index = 1; // 每个节点的索引
        LinkedList<Integer> list = new LinkedList<>(); // 存储每层节点的索引
        Queue<TreeNode> queue = new LinkedList<>();
        list.add(index);
        TreeNode node = root;
        queue.offer(node);
        int count = 1; //记录每层的节点数
        while (!queue.isEmpty()) {
            node = queue.poll();
            count--;
            index = list.removeFirst();
            if (node.left!=null) {
                queue.offer(node.left);
                list.add(2*index);
            }
            if (node.right!=null) {
                queue.offer(node.right);
                list.add(2*index+1);
            }
            if (count==0) {
                count = queue.size();
                if (list.size() >= 2) {
                    maxW = Math.max(maxW,list.getLast()-list.getFirst()+1);
                }
            }
        }
        return maxW;
    }
}
