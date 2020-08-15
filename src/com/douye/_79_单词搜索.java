package com.douye;

public class _79_单词搜索 {
    int rows,cols;
    String word;
    char[][] board;
    boolean[][] marked;                                     // 标记已经到过的坐标
    int[][] directions = {{-1,0},{0,-1},{0,1},{1,0}};       // 每到一个元素就分别朝四个方向移动
    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        this.board = board;
        this.word = word;
        marked = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(i,j,0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int start) {
        if (start == word.length()-1) {
            return board[i][j] == word.charAt(start);
        }
        if (board[i][j] == word.charAt(start)) {
            marked[i][j] = true;
            // 以坐标(i，j)为中心，向四个方向扩散
            for (int k = 0; k < 4; k++) {
                int newX = i + directions[k][0];
                int newY = j + directions[k][1];
                if (isArea(newX,newY) && !marked[newX][newY] ) {
                    if (dfs(newX,newY,start+1)) return true;
                }
            }
            marked[i][j] = false;
        }
        return false;
    }

    private boolean isArea(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return true;
        }
        return false;
    }
}
