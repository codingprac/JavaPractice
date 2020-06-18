package com.d3.prac.hackerRank.interviewPrepKit.search;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pairs {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {

        //Arrays.sort(arr); // O(nlogn)
        int count = 0;

        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting())); // O(n)

        for (int i = 0; i < arr.length; i++) {
            int compliment1 = arr[i] - k > 0 ? arr[i] - k : -1;
            //int compliment2 = arr[i] + k;

            if((compliment1 != -1 && map.containsKey(compliment1))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);

        System.out.println("result = " + result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }

}
