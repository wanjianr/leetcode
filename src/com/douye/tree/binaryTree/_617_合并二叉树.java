package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import javax.xml.namespace.QName;
import java.util.LinkedList;
import java.util.Queue;

public class _617_合并二叉树 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;
    }

    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        TreeNode root = new TreeNode((t1==null ? 0 : t1.val) + (t2==null ? 0 : t2.val));
        root.left = mergeTrees(t1==null ? null : t1.left, t2==null ? null : t2.left);
        root.right = mergeTrees(t1==null ? null : t1.right, t2==null ? null : t2.right);
        return root;
    }


}
