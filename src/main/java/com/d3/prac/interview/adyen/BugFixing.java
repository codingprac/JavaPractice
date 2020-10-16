package com.d3.prac.interview.adyen;

import java.util.ArrayList;
import java.util.Arrays;

public class BugFixing {

    public String[] solution(int N, int K) {
        if (N == 0) {
            return new String[]{""};
        }
        ArrayList<String> result = new ArrayList<String>();
        for (String p : solution(N - 1, K - 1)) {
            for (char l : new char[]{'a', 'b', 'c'}) {
                int pLen = p.length();
                if (pLen == 0 || p.charAt(pLen - 1) != l) {
                    result.add(p + l);
                }
            }
        }
        int prefSize = Math.min(result.size(), K);
        return result.subList(0, prefSize).toArray(new String[prefSize]);
    }

    public static void main(String[] args) {

        BugFixing bugFixing = new BugFixing();

        int N = 3;
        int K = 20;

        String[] result = bugFixing.solution(N, K);

        Arrays.stream(result).forEach(System.out::println);
    }

}
