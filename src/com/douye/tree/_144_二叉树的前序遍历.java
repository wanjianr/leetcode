package com.douye.tree;

import java.util.ArrayList;
import java.util.List;

public class _144_二叉树的前序遍历 {
    // 递归
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        list.add(root.val);
        if(root.left!=null) list.addAll(preorderTraversal(root.left));
        if(root.right!=null) list.addAll(preorderTraversal(root.right));
        return list;
    }

    // 迭代

}
