package com.d3.prac.interview.tomtom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This is a demo task.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class DemoFindMissingInteger {

    public static int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i++) {
            if (Math.abs(A[i + 1] - A[i]) > 1) {
                if (A[i + 1] < 0 || A[i] < 0) {
                    return 1;
                }
                return A[i] + 1;
            } else {
                if (A[i + 1] < 0 || A[i] < 0) {
                    return 1;
                }
            }
        }
        return A[A.length - 1] + 1;
    }

    public static int simplestSolutionEver(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if(a>0){
                set.add(a);
            }
        }
        for(int i = 1; i<=A.length +1; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arrItems = in.next().split(",");
        int[] arr = Arrays.stream(arrItems).mapToInt(item -> Integer.parseInt(item)).toArray();

        System.out.println(solution(arr));
    }

}
