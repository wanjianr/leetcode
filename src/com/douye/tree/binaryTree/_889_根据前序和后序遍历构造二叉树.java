package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

import java.util.Arrays;

/**
 * 提示：
    * 1 <= pre.length == post.length <= 30
    * pre[] 和 post[] 都是 1, 2, ..., pre.length 的排列
    * 每个输入保证至少有一个答案。如果有多个答案，可以返回其中一个。
 */
public class _889_根据前序和后序遍历构造二叉树 {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        if (pre.length < 1 || post.length < 1) return null;
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < post.length; i++) {
            if (root.val == post[i]) {
                root.left = constructFromPrePost(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(post,0,i));
                root.right = constructFromPrePost(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(post,i,post.length));
            }
        }
        return root;
    }
}
