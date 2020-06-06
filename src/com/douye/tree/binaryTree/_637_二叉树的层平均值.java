package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _637_二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(root);
        double levelSum = 0;
        int levelSize = 0;
        int count = queue.size();
        while (!queue.isEmpty()) {
            node = queue.poll();
            levelSum += node.val;
            levelSize++;
            count --;
            if (node.left!=null) queue.offer(node.left);
            if (node.right!=null) queue.offer(node.right);

            if (count == 0) {
                list.add(levelSum/levelSize);
                levelSize = 0;
                levelSum = 0;
                count = queue.size();
            }
        }
        return list;
    }

    // 其他简洁的写法
    public List<Double> averageOfLevels1(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (list.size() != 0){
            int len = list.size();
            double sum = 0;
            for (int i = 0; i < len; i++){
                TreeNode node = list.poll();
                sum += node.val;
                if (node.left != null) list.add(node.left);
                if (node.right != null) list.add(node.right);
            }
            res.add(sum/len);
        }
        return res;
    }
}
