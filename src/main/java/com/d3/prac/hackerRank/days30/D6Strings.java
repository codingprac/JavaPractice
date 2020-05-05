package com.d3.prac.hackerRank.days30;

import java.util.Arrays;
import java.util.Scanner;

public class D6Strings {

    private static String oddEvenString(String str) {
        char[] ch = str.toCharArray();
        String st1 = "";
        String st2 = "";

        /*str.chars().mapToObj(c -> (char) c).forEach(i -> );*/
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                st1 = st1 + ch[i];
            } else {
                st2 += ch[i];
            }
        }
        return st1 + " " + st2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String[] arr = new String[T];

        for (int i = 0; i < T; i++) {
            arr[i] = oddEvenString(sc.next());
        }

        Arrays.stream(arr).forEach(System.out::println);

        /*for (int i = 0; i < T; i++) {
            System.out.println(arr[i]);
        }*/
    }
}