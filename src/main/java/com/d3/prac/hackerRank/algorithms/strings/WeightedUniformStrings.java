package com.d3.prac.hackerRank.algorithms.strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WeightedUniformStrings {

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {

        char[] charArray = s.toCharArray();
        int contigentString = 1;
        int lastAlphaNum = 0;
        Set<Integer> numList = new HashSet<Integer>();
        for (int i = 0; i < charArray.length; i++) {
            int alphaNum = charArray[i] - 'a' + 1;
            if (alphaNum == lastAlphaNum) {
                contigentString++;
            } else {
                contigentString = 1;
                lastAlphaNum = alphaNum;
            }
            int num = (alphaNum) * contigentString;
            numList.add(num);
        }
        String[] result = new String[queries.length];
        for (int a0 = 0; a0 < queries.length; a0++) {
            int x = queries[a0];
            if (numList.contains(x)) {
                result[a0] = "Yes";
            } else {
                result[a0] = "No";
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
