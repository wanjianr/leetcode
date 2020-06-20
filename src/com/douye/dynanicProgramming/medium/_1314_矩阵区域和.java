package com.douye.dynanicProgramming.medium;

public class _1314_矩阵区域和 {

    public int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] answer = new int[mat.length][mat[0].length];
        int[][] sum = new int[mat.length+1][mat[0].length+1];
        for (int i = 1; i < sum.length; i++) {
            for (int j = 1; j < sum[0].length; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + mat[i-1][j-1];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                answer[i][j] = sum[Math.min(i+K+1,mat.length)][Math.min(j+K+1,mat[0].length)] -
                                sum[Math.max(i-K,0)][Math.min(j+K+1,mat[0].length)] - sum[Math.min(i+K+1,mat.length)][Math.max(j-K,0)] +
                                sum[Math.max(i-K,0)][Math.max(j-K,0)];
            }
        }
        return answer;
    }

    public int[][] matrixBlockSum1(int[][] mat, int K) {
        int[][] answer = new int[mat.length][mat[0].length];
        int rowStart = 0, colStart = 0, rowStop = 0, colStop = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                rowStart = (i-K) >= 0 ? i-K : 0;
                colStart = (j-K) >= 0 ? j-K : 0;
                rowStop = (i+K) >= mat.length ? mat.length : i+K+1;
                colStop = (j+K) >= mat[i].length ? mat[i].length : j+K+1;
                for (int k = rowStart; k < rowStop; k++) {
                    for (int l = colStart; l < colStop; l++) {
                        answer[i][j] += mat[k][l];
                    }
                }
            }
        }
        return answer;
    }
}
