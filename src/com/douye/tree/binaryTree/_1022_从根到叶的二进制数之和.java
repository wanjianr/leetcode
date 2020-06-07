package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import javax.xml.namespace.QName;
import java.util.*;

public class _1022_从根到叶的二进制数之和 {
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;

        List<String> list = new ArrayList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<String> valueQueue = new LinkedList<>();
        TreeNode node = root;
        String value = Integer.toString(root.val);
        nodeQueue.offer(node);
        valueQueue.offer(value);
        while (!nodeQueue.isEmpty()) {
            node = nodeQueue.poll();
            value = valueQueue.poll();
            if (node.left == null && node.right == null) {
                list.add(value);
            } else {
                if (node.left!=null) {
                    nodeQueue.offer(node.left);
                    valueQueue.offer(value+Integer.toString(node.left.val));
                }
                if (node.right!=null) {
                    nodeQueue.offer(node.right);
                    valueQueue.offer(value+Integer.toString(node.right.val));
                }
            }
        }
        int sum = 0;
        int subSum = 0;
        for (String val:list) {
            subSum = 0;
            String[] split = val.split("");
            for (String s : split) {
                subSum = subSum << 1;
                int i = Integer.parseInt(s);
                subSum += i;
            }
            sum += subSum;
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(0);
        root.right = node1;
        root.left = node2;
        _1022_从根到叶的二进制数之和 l = new _1022_从根到叶的二进制数之和();
        int i = l.sumRootToLeaf(root);
        System.out.println(i);
    }
}
