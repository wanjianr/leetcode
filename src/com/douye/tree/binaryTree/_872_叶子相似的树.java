package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _872_叶子相似的树 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String str1 = scan(root1,"");
        String str2 = scan(root2,"");
        return str1.equals(str2);
    }

    // 用前序遍历，不能用层序遍历
    public String scan(TreeNode node, String str) {
        if (node == null) return str;
        if (node.left==null && node.right==null) {
            str+=node.val;
        }
        return scan(node.left,str) + scan(node.right,str);
    }
}
