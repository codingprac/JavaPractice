package com.d3.prac.codility.algorithms;

public class MyNailingPlanks {

    public int solution(int[] A, int[] B, int[] C) {

        int N = A.length;
        int M = C.length;
        int result = -1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (C[j] >= A[i] && C[j] <= B[i]) {
                    if (j > result) {
                        result = j;
                    }
                    break;
                }
            }
        }

        if (result == -1) {
            return result;
        }

        return result + 1;
    }

    public static void main(String[] args) {

        MyNailingPlanks np = new MyNailingPlanks();

        /*int[] A = {1, 4, 5, 8};
        int[] B = {4, 5, 9, 10};
        int[] C = {4, 6, 7, 10, 2};*/

        int[] A = {1};
        int[] B = {4};
        int[] C = {1, 1};

        System.out.println(np.solution(A, B, C));
    }

}
