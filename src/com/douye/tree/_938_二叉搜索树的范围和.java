package com.douye.tree;

public class _938_二叉搜索树的范围和 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        int lnum = rangeSumBST(root.left,L,R);
        if(root.val>=L && root.val<=R) {
            lnum += root.val;
        }
        int rnum = rangeSumBST(root.right,L,R);
        return lnum+rnum;
    }
}
/**
 * 其他解乏
 */
/*

    int rangeSumBST(TreeNode* root, int L, int R) {
        if(root == NULL){
            return 0;
        }
        if(root->val > R){
            return rangeSumBST(root->left, L, R);
        } else if(root->val < L){
            return rangeSumBST(root->right, L, R);
        } else {
            return root->val + rangeSumBST(root->left, L, R) + rangeSumBST(root->right, L, R);
        }
    }

*/

/*

    class Solution {
        public int rangeSumBST(TreeNode root, int L, int R) {
            if (root == null) return 0;

            if(root.val >= L && root.val <= R) {
                //当前节点再两数之间，把自身值加到结果里取，并往左右子节点递归
                return root.val + rangeSumBST(root.left, L ,R) + rangeSumBST(root.right, L , R);
            } else if(root.val < L){
                //当前节点小于L，往右子节点寻找
                return rangeSumBST(root.right, L, R);
            } else {
                //当前节点大于R，往左子节点寻找
                return rangeSumBST(root.left, L, R);
            }
        }
    }

*/