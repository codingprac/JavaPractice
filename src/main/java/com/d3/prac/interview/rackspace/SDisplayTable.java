package com.d3.prac.interview.rackspace;

import java.util.*;

public class SDisplayTable {

        public void solution(int[] A, int K) {
            if(A.length < K){
                K = A.length;
            }
            int maxDigit = String.valueOf(Arrays.stream(A).max().getAsInt()).length();
            int numberOfRows = (A.length / K) + (A.length % K == 0 ? 0 : 1);
            for (int i = 0; i < numberOfRows; i++) {
                printTableHorizontalLine(K, maxDigit);
                System.out.println("");
                if(A.length >= K){
                    printTableNumbers(A, K, maxDigit);
                    A = Arrays.copyOfRange(A, K, A.length);
                    System.out.println("");
                    if(A.length == 0){
                        printTableHorizontalLine(K, maxDigit);
                    }
                }else{
                    printTableNumbers(A, A.length, maxDigit);
                    System.out.println("");
                    printTableHorizontalLine(A.length, maxDigit);
                }
            }
        }
        private void printTableNumbers(int[] a, int k, int maxDigit) {
            printVertical();
            for(int i=0; i<k; i++){
                printNumberWithFiller(String.valueOf(a[i]) ,maxDigit);
                printVertical();
            }
        }
        private void printNumberWithFiller(String s, int maxDigit) {
            System.out.print(String.format("%1$"+maxDigit+ "s", s));
        }
        private void printTableHorizontalLine(int k, int maxDigit) {
            for (int p = 0; p < k; p++) {
                printCorner();
                printHorizontal(maxDigit);
            }
            printCorner();
        }
        public void printVertical() {
            System.out.print("|");
        }
        public void printCorner() {
            System.out.print("+");
        }
        public void printHorizontal(int i) {
            char[] charArray = new char[i];
            Arrays.fill(charArray, '-');
            String str = new String(charArray);
            System.out.print(str);
        }

    public static void main(String[] args) {

        int[] n = {4,35,80,123,12345,44,8,5, 24, 3};

        SDisplayTable displayTable = new SDisplayTable();
        displayTable.solution(n, 4);
    }
}
