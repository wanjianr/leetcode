package com.offer;

import java.util.LinkedList;
import java.util.Queue;

public class _13_机器人的运动范围 {




    int m,n,k;
    boolean[][] arrived;

    // bfs
    public int movingCount(int m, int n, int k) {
        arrived = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,0,0});
        int count = 0;
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            count++;
            if (point[0] >= m || point[1] >= n || point[2]+point[3] > k || arrived[point[0]][point[1]]) continue;
            arrived[point[0]][point[1]] = true;
            if (point[0]+1 < m) queue.add(new int[]{point[0]+1,point[1],bitSum(point[2]+1),bitSum(point[3])});
            if (point[1]+1 < n) queue.add(new int[]{point[0],point[1]+1,bitSum(point[2]),bitSum(point[3]+1)});
        }
        return count;
    }
    //dfe
    public int movingCount1(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        arrived = new boolean[m][n];
        return dfs(0,0,0,0);
    }
    public int dfs(int i, int j, int si, int sj) {
        if (i>=m || j>=n || k<si+sj || arrived[i][j]) return 0;
        arrived[i][j] = true;
        return 1 + dfs(i+1,j,bitSum(i+1),bitSum(j)) + dfs(i,j+1,bitSum(i),bitSum(j+1));
    }
    public int bitSum(int x) {
        int s = 0;
        while (x != 0) {
            s += (x%10);
            x = x/10;
        }
        return s;
    }



    public int movingCount0(int m, int n, int k) {
        int sum = 0;
        int count = 0;
        boolean[][] arrive = new boolean[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                String s = i+""+j;
                for(int l=0; l<s.length(); l++) {
                    sum += s.charAt(l) - '0';
                }
                if(sum > k) {
                    arrive[i][j] = false;
                } else {
                    arrive[i][j] = true;
                }
                sum = 0;
            }
        }
        return m*n - count;
    }

    public static void main(String[] args) {
        _13_机器人的运动范围 l = new _13_机器人的运动范围();
        int i = l.movingCount(11, 1, 4);
        System.out.println(i);
    }
}
