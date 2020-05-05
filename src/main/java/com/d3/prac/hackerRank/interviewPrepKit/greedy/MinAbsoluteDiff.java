package com.d3.prac.hackerRank.interviewPrepKit.greedy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**`
 * Problem
 */

public class MinAbsoluteDiff {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifferenceImproved(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (min > diff) {
                min = diff;
            }
        }
        return min;
    }

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        Integer result = null;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int num = Math.abs(arr[i] - arr[j]);
                if (result == null || result > num) {
                    result = num;
                }
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        System.out.println("result = " + result);

        scanner.close();
    }
}


