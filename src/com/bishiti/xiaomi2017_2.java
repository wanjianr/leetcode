package com.bishiti;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class xiaomi2017_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\HP-\\Desktop\\data.txt"));
        int n = scanner.nextInt();
        int[] nods = new int[n];
        for (int i = 0; i < n; i++) {
            nods[i] = -1;
        }
        for (int i = 0; i < n - 1; i++) {
            int parent = scanner.nextInt();
            int child = scanner.nextInt();
            nods[child] = parent;
        }
        int depth = 0;
        for (int i = n-1; i >= 0; i--) {
            int height = 1;
            int index = i;
            while (nods[index] != -1) {
                height ++;
                index = nods[index];
            }
            depth = depth > height ? depth : height;
        }
        System.out.println(depth);
    }
}
