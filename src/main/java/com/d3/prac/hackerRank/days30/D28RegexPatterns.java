package com.d3.prac.hackerRank.days30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D28RegexPatterns {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Map<String, String> hashMap = new HashMap<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            if(emailID.contains("@gmail.com")) {
                hashMap.put(emailID, firstName);
            }
        }

        hashMap.values().stream().sorted().forEach(System.out::println);

        scanner.close();
    }


}
