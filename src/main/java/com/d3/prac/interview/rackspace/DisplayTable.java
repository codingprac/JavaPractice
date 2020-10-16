package com.d3.prac.interview.rackspace;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DisplayTable {

    int maxCellWidth;

    public void solution(int[] A, int K) {
        this.maxCellWidth = String.valueOf(Arrays.stream(A).max().getAsInt()).length();
        int rows = (int) Math.ceil(A.length / (float) K);
        int rem = 0;

        for (int i = 0; i < rows; i++) {
            printLines(K);
            printRows(A, K);
            A = Arrays.copyOfRange(A, i*K, A.length);
            //A = Arrays.copyOfRange(A, K, A.length);
        }
        printLines(K); // reduce it to the elements remaining
    }

    public void printRows(int[] A, int K) {
        for (int i = 0; i < K; i++) {
            System.out.print("|");
            System.out.print(String.format("%1$" + maxCellWidth + "s", A[i]));

        }
        System.out.print("|");
        System.out.println("");
    }

    public void printLines(int noOfColumns) {
        int verticalLines = maxCellWidth;
        while (noOfColumns > 0) {
            System.out.print("+");
            while (verticalLines > 0) {
                System.out.print("-");
                verticalLines--;
            }
            verticalLines = maxCellWidth;
            noOfColumns--;
        }
        System.out.print("+");
        System.out.println("");
    }

    public static void main(String[] args) {

        int[] n = {4, 35, 80, 123, 12345, 44, 8, 5, 10, 20};

        DisplayTable displayTable = new DisplayTable();
        displayTable.solution(n, 4);
    }


}