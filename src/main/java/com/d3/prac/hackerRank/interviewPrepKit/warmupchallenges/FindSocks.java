package com.d3.prac.hackerRank.interviewPrepKit.warmupchallenges;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FindSocks {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println("result = " + result);

        scanner.close();
    }

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for(int i: ar) {
            if(hashMap.containsKey(i)){
                count ++;
                hashMap.remove(i);
            } else {
                hashMap.put(i, 1);
            }
        }
        return count;
    }
}
