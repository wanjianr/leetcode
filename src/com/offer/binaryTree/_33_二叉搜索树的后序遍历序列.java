package com.offer.binaryTree;

import java.util.Arrays;

public class _33_二叉搜索树的后序遍历序列 {

    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length < 1) return true;
        return verify(postorder,0,postorder.length-1);
    }

    public boolean verify(int[] postorder, int from, int to) {
        if (from >= to) return true;
        int f = from;
        while (postorder[f] < postorder[to]) f++;
        int t = f;
        while (postorder[t] > postorder[to]) t++;
        return t == to && verify(postorder,from,f-1) && verify(postorder,f,to-1);
    }
//    public boolean verifyPostorder(int[] postorder) {
//        if (postorder.length < 1) return true;
//        return verify(postorder,0,postorder.length-1);
//    }
//
//    public boolean verify(int[] postorder, int from, int to) {
//        if (from >= to) return true;
//        int f = from;
//        while (postorder[f] < postorder[to]) f++;
//        int t = f;
//        while (postorder[t] > postorder[to]) t++;
//
//        return t==to && verify(postorder,from,f-1) && verify(postorder,f,to-1);
//    }
}
