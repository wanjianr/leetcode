package com.douye.tree.binarySearcTree;

import com.douye.tree.TreeNode;

public class _108_将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length < 1) return null;
        return sortedArrayToBST(nums,0,nums.length-1);
    }
    public static TreeNode sortedArrayToBST(int[] nums, int l, int r) {
        if (r < l) return null;
        int mid = l + (r-l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums,l,mid-1);
        root.right = sortedArrayToBST(nums,mid+1,r);
        return root;
    }
}
