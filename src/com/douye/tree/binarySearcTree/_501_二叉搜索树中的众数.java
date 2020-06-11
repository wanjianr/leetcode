package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _501_二叉搜索树中的众数 {
    List<Integer> list = new ArrayList<>();
    int curSize = 0, maxSize = 0, preValue = 0;
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (preValue == node.val) {
            curSize++;
        } else {
            preValue = node.val;
            curSize = 1;
        }
        if (curSize == maxSize) {
            list.add(node.val);
        } else if (curSize > maxSize) {
            list.clear();
            list.add(node.val);
            maxSize = curSize;
        }
        inorder(node.right);
    }
}
