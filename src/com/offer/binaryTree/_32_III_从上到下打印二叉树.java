package com.offer.binaryTree;

import com.douye.tree.TreeNode;

import javax.xml.namespace.QName;
import java.util.*;
// 思路一，层序遍历，偶数层时反转该层的列表
// 思路二，
public class _32_III_从上到下打印二叉树 {


    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) return lists;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        int levelSize = 1;
        int height = 0;
        while (!queue.isEmpty()) {
            node = queue.poll();
            levelSize --;
            list.add(node.val);

            if (levelSize == 0) {
                levelSize = queue.size();
                height ++;
                if (height % 2 == 0) Collections.reverse(list);
                lists.add(list);
                list = new ArrayList<>();
            }
        }
        return lists;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) return lists;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        int levelSize = 1;
        int height = 0;
        while (!queue.isEmpty()) {
            node = queue.poll();
            levelSize --;
            list.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
//            if (height % 2 == 0) {
//                if (node.right != null) queue.offer(node.right);
//                if (node.left != null) queue.offer(node.left);
//            } else {
//                if (node.left != null) queue.offer(node.left);
//                if (node.right != null) queue.offer(node.right);
//            }
            if (levelSize == 0) {
                levelSize = queue.size();
                height ++;
                if (height % 2 == 0) Collections.reverse(list);
                lists.add(list);
                list = new ArrayList<>();
            }
        }
        return lists;
    }
}
