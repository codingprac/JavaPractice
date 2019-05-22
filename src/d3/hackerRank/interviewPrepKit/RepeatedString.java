package com.d3.prac;

import java.util.Scanner;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        if (s.length() == 1) {
            if (s.equals("a")) {
                return n;
            } else {
                return 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (sb.charAt(i) == 'a') {
                count++;
            }
            if (i == sb.length() - 1) {
                sb.append(s);
            }
        }
        return count;
    }

    static long repeatedStringPerformance(String s, long n) {
        if (s.length() == 1) {
            if (s.equals("a")) {
                return n;
            } else {
                return 0;
            }
        }
        int length = s.length();
        Double reps = Math.floor(n / length);
        Long rem = n%length;
        String remStr = s.substring(0, rem.intValue());
        return reps.longValue() * countA(s) + countA(remStr);
    }

    static long countA(String s) {
        int count = 0;
        for(char c: s.toCharArray()){
            if(c == 'a'){
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedStringPerformance(s, n);

        System.out.println("result = " + result);

        scanner.close();
    }
}
