package com.douye.dynanicProgramming.medium;

import javafx.scene.effect.SepiaTone;

import java.util.*;

public class _120_三角形最小路径和 {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() < 1) return 0;
        int rows = triangle.size();
        int col = triangle.get(rows-1).size();
        int[][] dp = new int[rows][col];
        for (int i = 0; i < col; i++) {
            dp[rows-1][i] = triangle.get(rows-1).get(i);
        }
        for (int i = rows-2; i >= 0 ; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] = Math.min(dp[i+1][j],dp[i+1][j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }

    public int minimumTotal1(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() < 1) return 0;
        int rows = triangle.size();
        int cols = triangle.get(rows-1).size();
        int[][] dp = new int[rows+1][cols+1];
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols ; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= rows; i++) {
            int col = triangle.get(i-1).size();
            for (int j = 1; j <= col; j++) {
                if (i == 1 && j == 1) dp[i][j] = triangle.get(0).get(0);
                else dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1]) + triangle.get(i-1).get(j-1);
                if (i == rows) {
                    min = Math.min(min,dp[rows][i]);
                }
            }
        }
        return min;
    }
}
