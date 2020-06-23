package com.offer.array;

public class _04_二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length < 1) return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int col = cols-1, row=0;
        while (row < rows && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target > matrix[row][col]) {
                row ++;
            } else {
                col --;
            }
        }
        return false;
    }
}
