package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _653_两数之和IV_输入BST {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        List<Integer> list = new ArrayList<>();
        return preOrder(root,list,k);
    }
    public boolean preOrder(TreeNode node, List<Integer> list, int k) {
        if (node == null) return false;
        if (list.contains(k-node.val))
            return true;
        list.add(node.val);
        return preOrder(node.left,list,k) || preOrder(node.right,list,k);
    }
}
