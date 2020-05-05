package com.d3.prac.hackerRank.days30;

import java.io.IOException;
import java.util.Scanner;

public class D9Recursion {

    // Complete the factorial function below.
    static int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        while(n>0) {
            return n * factorial(n-1);
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        System.out.println("result = " + result);

        scanner.close();
    }

}
