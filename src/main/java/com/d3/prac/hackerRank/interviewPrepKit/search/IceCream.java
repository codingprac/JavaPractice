package com.d3.prac.hackerRank.interviewPrepKit.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCream {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        Map<String, Integer> map = new HashMap<>();
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < cost.length; i++) {
            if (map.containsKey(cost[i]+"")) {
                map.put(cost[i] + "a", i);
            } else {
                map.put(String.valueOf(cost[i]), i);
            }
        }

        for (int i = 0; i < cost.length; i++) {
            int complement = money - cost[i];
            if (complement > 0) {
                if (complement == cost[i]) {
                    if (map.containsKey(cost[i] + "a")) {
                        index1 = map.get(cost[i] + "");
                        index2 = map.get(cost[i] + "a");
                        break;
                    } else {
                        continue;
                    }
                }
                //String complementKey = String.valueOf(complement);
                if (map.containsKey(complement+"")) {
                    index1 = map.get(cost[i] + "");
                    index2 = map.get(complement + "");
                    break;
                }
            }
        }

        if (index1 < index2) {
            System.out.print((index1 + 1) + " " + (index2 + 1));
        } else {
            System.out.print((index2 + 1) + " " + (index1 + 1));
        }
        System.out.println();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
