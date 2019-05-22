package com.d3.prac;

import java.util.Scanner;

public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c) {
        int jumps = 0;

        for (int i = 0; i < c.length - 1; ) {
            if (i + 2 < c.length && c[i + 2] != 1) {
                i = i + 2;
                jumps++;
            } else {
                jumps++;
                i++;
            }
        }
        return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println("result = " + result);

        scanner.close();
    }
}
