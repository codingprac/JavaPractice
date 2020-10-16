package com.d3.prac.interview.adyen;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HammerDownNails {

    public int solution(int[] A, int Y) {

        int N = A.length;
        TreeMap< Integer, Integer > treeMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            if (!treeMap.containsKey(A[i])) {
                treeMap.put(A[i], 1);
            } else {
                treeMap.put(A[i], treeMap.get(A[i]) + 1);
            }
        }
        List<Integer> nums = treeMap.values().stream().collect(Collectors.toList());
        if (nums.size() == 1) {
            return nums.get(0);
        }
        int max = nums.get(0);
        int longer = 0;
        for (int j = 0; j < nums.size(); j++) {
            int count = 0;
            if (Y < longer) {
                count = Y + nums.get(j);
            } else {
                count = longer + nums.get(j);
            }
            if (max < count) {
                max = count;
            }
            longer += nums.get(j);
        }
        return max;
    }

    /*public int solution(int[] A, int Y) {

        int n = A.length;
        int best = 0;
        int count = 1;

        for (int i = 0; i < n - Y - 1; i++) {
            if (A[i] == A[i + 1]) {
                count = count + 1;
            } else {
                count = 0;
            }
            if (count > best) {
                best = count;
            }
        }
        int result = best + 1 + Y;

        return result;
    }*/

    public static void main(String[] args) {
        int Y = 3;
        int[] A = {1, 1, 3, 3, 3, 4, 5};

        HammerDownNails nails = new HammerDownNails();

        int ans = nails.solution(A, Y);

        System.out.println("ans = " + ans);
    }
}
