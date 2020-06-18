package com.d3.prac.hackerRank.datastructures;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class SkyScrappers {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the solve function below.
    static int solve(int[] arr) {
        Stack<Integer> stack =new Stack();

        int height = Integer.MAX_VALUE;

        for(int i=0; i < arr.length; i++) {

            if(!stack.contains(arr[i])) {
                stack.push(arr[i]);
            }

            while(!stack.empty()) {

            }
        }
        return 0;

    }

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arrItr = 0; arrItr < arrCount; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr]);
            arr[arrItr] = arrItem;
        }

        int result = solve(arr);

        System.out.println("result = " + result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }

}
