package com.offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _12_矩阵中的路径 {
    char[][] board;
    String word;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(i,j,0)) return true;
            }
        }
        return dfs(0,0,0);
    }

    private boolean dfs(int i, int j, int k) {
        if (i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] != word.charAt(k)) return false;
        if (k == word.length()-1) return true;
        char c = board[i][j];
        k++;
        board[i][j] = '0';
        boolean flag = dfs(i-1,j,k) || dfs(i+1,j,k) || dfs(i,j-1,k) || dfs(i,j+1,k);
        board[i][j] = c;
        return flag;
    }

    public static void main(String[] args) {
        _12_矩阵中的路径 l = new _12_矩阵中的路径();
        boolean ba = l.exist(new char[][]{{'a', 'b'}}, "ba");
        System.out.println(ba);
    }
}
