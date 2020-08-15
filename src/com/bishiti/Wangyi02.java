package com.bishiti;

import java.util.*;

public class Wangyi02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(in.nextInt());
        }

        int[] temp = new int[n-m];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (list.contains(i)) continue;
            temp[index++] = i;
        }

        List<Integer> res = new ArrayList<>();
        int x=0,y=0;
        while (x<list.size() && y<temp.length)
            if (list.get(x) < temp[y]) {
                res.add(list.get(x++));
            } else {
                res.add(temp[y++]);
            }
        if (x != list.size()) {
            for (int i = x; i < list.size(); i++) {
                res.add(list.get(x));
            }
        }
        if (y != temp.length) {
            for (int i = y; i < temp.length; i++) {
                res.add(temp[i]);
            }
        }

        for (int i = 0; i < res.size(); i++) {
            if (i == res.size()-1) {
                System.out.print(res.get(i));
            } else {
                System.out.print(res.get(i) + " ");
            }
        }
    }
}
