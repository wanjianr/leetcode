package com.bishiti;

import java.util.Scanner;

public class WangYi01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        long num = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 2 || a[i] == 3) {
                num++;
            }
            if (a[i] > 3) {
                num += (a[i]/2);
            }
//            if (a[i] > 3 && a[i] % 2 == 1) {
//                num += (a[i]/2);
//            }
        }
        System.out.println(num);
    }
}
