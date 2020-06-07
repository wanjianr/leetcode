package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;


/**
 * 注意：
 * 输入： [1,2,3,null,4]
 * 输出： "1(2(4))(3)"
 * 预期： "1(2()(4))(3)"
 */
public class _606_根据二叉树创建字符串 {
    public String tree2str(TreeNode t) {
        if (t == null) return "";
        String str = Integer.toString(t.val);
        if (t.right!=null && t.left != null)
            return str+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
        else if (t.left == null && t.right == null) {
            return str;
        } else {
            if (t.left == null)
                return str + "()("+tree2str(t.right)+")";
            else
                return str + "("+tree2str(t.left)+")";
        }
    }
}


