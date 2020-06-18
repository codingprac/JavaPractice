package com.d3.prac.hackerRank.interviewPrepKit.dictandmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        boolean canUse = true;

        Map<String, Integer> map = new HashMap<>();

        for(String magWords : magazine) {
            if(map.containsKey(magWords)) {
                map.put(magWords, map.get(magWords) + 1);
            } else {
                map.put(magWords, 1);
            }
            //Other way of creating the map
            //map.merge(magWords, 1, Integer::sum);
        }

        //Streams way of creating the same map
        //Map<String, Long> magWords = Arrays.stream(magazine).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(String word: note) {
            if(map.containsKey(word)) {
                if(map.get(word) > 1) {
                    map.put(word, map.get(word) - 1);
                } else if(map.get(word) == 1) {
                    map.remove(word);
                }
            } else {
                canUse = false;
            }
        }

        if(canUse) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
