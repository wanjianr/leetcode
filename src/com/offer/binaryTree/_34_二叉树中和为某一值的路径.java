package com.offer.binaryTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _34_二叉树中和为某一值的路径 {

    List<List<Integer>> lists = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return lists;
        pre(root,sum);
        return lists;
    }


    public void pre(TreeNode node, int sum) {
        if (node == null) return;
        sum -= node.val;
        list.addLast(node.val);
        if (sum == 0 && node.left == null && node.right == null) {
            lists.add(new ArrayList<>(list));
        }
        pre(node.left,sum);
        pre(node.right,sum);
        list.removeLast();
    }


















//    List<List<Integer>> lists = new ArrayList<>();
//    LinkedList<Integer> list = new LinkedList<>();
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//
//        if (root == null) return lists;
//        pre(root,sum);
//        return lists;
//    }
//
//    public void pre(TreeNode node, int sum) {
//        if (node == null) return;
//        list.add(node.val);
//        sum -= node.val;
//        if (sum == 0 && node.left == null && node.right == null) {
//            lists.add(new ArrayList<>(list));
//        }
//        pre(node.left,sum);
//        pre(node.right,sum);
//        list.removeLast();
//    }
}
