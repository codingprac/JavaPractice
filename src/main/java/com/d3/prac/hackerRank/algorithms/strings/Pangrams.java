package com.d3.prac.hackerRank.algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

public class Pangrams {

    // Complete the pangrams function below.

    /**
     * input - We promptly judged antique ivory buckles for the next prize
     * @param s
     * @return
     */
    static String pangrams(String s) {
        boolean a[] = new boolean[128];

        char[] cArr = s.toCharArray();
        for (int i = 0; i < s.toCharArray().length; i++) {
            a[Character.toLowerCase(cArr[i])] = true;
        }

        for (int i = 97; i <= 122; i++) {
            if(a[i]) {
                continue;
            } else {
                return "not pangram";
            }
        }

        return "pangram";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));*/

        String s = scanner.nextLine();

        String result = pangrams(s);

        /*bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
