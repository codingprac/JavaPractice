package com.d3.prac.hackerRank.algorithms.arrays;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class MagicSquare {

    static boolean verifyMagicSquare(int[][] s) {
        if(s[0][0] + s[0][1] + s[0][2] != 15) {

        }
        return true;
    }


    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                }
            }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
