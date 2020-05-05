package com.d3.prac.hackerRank.ctci.recursion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingSteps {

    void countWays(int s, int n, int stepNo, int count) {
        if(s+1 <= n) {
            countWays(s+1, n, 1, 0);
        }
        if(s+2 <= n) {
            countWays(s+2, n, 2, 0);
        }
        if(s+3 <= n) {
            countWays(s+3, n, 3 , 0);
        }
    }

    // Complete the stepPerms function below.
    static int stepPerms(int n) {
            for(int i = 1; i<n ; i++) {

            }
            return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < s; sItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
