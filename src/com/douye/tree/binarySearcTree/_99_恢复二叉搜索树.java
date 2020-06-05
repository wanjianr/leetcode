package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

public class _99_恢复二叉搜索树 {
    public TreeNode t1,t2,pre;
    public void recoverTree(TreeNode root) {
        recover(root);
        int temp = t1.val;
        t1.val = t2.val;
        t2.val = temp;
    }

    private void recover(TreeNode node) {
        if (node == null) return;
        recover(node.left);
        if (pre != null) {
            if (pre.val > node.val && t1 == null) {
                t1 = pre;
                t2 = node;
            }
            if (pre.val > node.val && t1 != null) {
                t2 = node;
            }
        }
        pre = node;
        recover(node.right);
    }
}
