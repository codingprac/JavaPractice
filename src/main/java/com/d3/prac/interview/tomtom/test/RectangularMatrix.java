package com.d3.prac.interview.tomtom.test;

public class RectangularMatrix {

    void findAdjacentColor(int i, int j, int N, int M, int[][] A, int[][] temp) {
        if (temp[i][j] == -1) {
            return;
        }
        temp[i][j] = -1;
        if (i + 1 < N) {
            if (A[i][j] == A[i + 1][j]) {
                findAdjacentColor(i + 1, j, N, M, A, temp);
            }
        }
        if (i - 1 >= 0) {
            if (A[i][j] == A[i - 1][j]) {
                findAdjacentColor(i - 1, j, N, M, A, temp);
            }
        }
        if (j + 1 < M) {
            if (A[i][j] == A[i][j + 1]) {
                findAdjacentColor(i, j + 1, N, M, A, temp);
            }
        }
        if (j - 1 >= 0) {
            if (A[i][j] == A[i][j-1]) {
                findAdjacentColor(i, j - 1, N, M, A, temp);
            }
        }
    }

    public int solution(int[][] A) {
        if (A.length == 0 || A[0].length == 0) {
            return 0;
        }

        int N = A.length;
        int M = A[0].length;
        int sum = 0;

        int[][] temp = new int[A.length][A[0].length];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (temp[i][j] >= 0) {
                    findAdjacentColor(i, j, N, M, A, temp);
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RectangularMatrix rectangularMatrix = new RectangularMatrix();

        int[][] A = {{5, 4, 4}, {4, 3, 4}, {3, 2, 4}, {2, 2, 2}, {3, 3, 4}, {1, 4, 4}, {4, 1, 1}};

        System.out.println(rectangularMatrix.solution(A));
    }

}
