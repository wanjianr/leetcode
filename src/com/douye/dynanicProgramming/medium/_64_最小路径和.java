package com.douye.dynanicProgramming.medium;

public class _64_最小路径和 {
    public int minPathSum(int[][] grid) {
        if (grid.length < 1) return 0;
        int row = grid.length, col = grid[0].length;
        int[][] dp = new int[row+1][col+1];
        for (int i = 0; i < col; i++) {
            dp[0][i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < row; i++) {
            dp[i][0] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 && j == 1) dp[i][j] = grid[0][0];
                else dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i-1][j-1];
            }
        }
        return dp[row][col];
    }
}
