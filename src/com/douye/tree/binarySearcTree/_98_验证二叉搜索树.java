package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _98_验证二叉搜索树 {
    //public List<Integer> list = new ArrayList<>();
    public TreeNode pre = null;
    public boolean flag;
    public boolean isValidBST(TreeNode root) {
        inorder(root);
//        if (list.size()<1) return true;
//        for (int i = 0; i < list.size()-1; i++) {
//            if (list.get(i) >= list.get(i+1))
//                return false;
//        }
        return flag;
    }
    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        //list.add(node.val);
        if (pre != null) {
            flag = node.val<pre.val ? false : true;
        }
        pre = node;
        inorder(node.right);
    }
}
