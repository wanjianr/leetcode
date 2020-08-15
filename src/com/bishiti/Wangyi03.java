package com.bishiti;

import java.util.Scanner;

public class Wangyi03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i = 0, count = 0;
        while (i < input.length()) {
            if (input.charAt(i) == '\\') {
                i += 2;
            } else if (input.charAt(i) == '\"') {
                count ++;
                i += 1;
            } else {
                i += 1;
            }
        }
        if (count == 2) System.out.println("true");
        else System.out.println("false");
        // or
        // System.out.println("false");
    }
}
