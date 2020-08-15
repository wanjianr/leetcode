package com.douye;


/**
 * 定义:
 *      DP(n) : n个节点有DP(n)中不同的二叉搜索树
 *      F(i) : 以i为根节点，有F(i)棵不同的二叉搜索树
 * 关系:
 *      DP(n) = F(1) + F(2) + ... + F(n)
 *      F(i) = DP(i-1) * DP(n-i)
 * 递推
 *      DP(0) = DP(1) = 1
 *      DP(n) = Σ(DP(i-1) * DP(n-i))
 */
public class _96_不同的二叉搜索树 {
    public int numTrees(int n) {
        if (n < 2) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i] += dp[i-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
