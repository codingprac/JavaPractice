package com.d3.prac.hackerRank.ctci.recursion;

public class StringPermutation {

    static int count = 0;

    static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            count++;
        } else {
            for(int i=0; i< str.length(); i++) {
                String rem = str.substring(0,i) + str.substring(i+1);
                permutation(rem, prefix + str.charAt(i));
            }

        }
    }

    public static void main(String[] args) {

        permutation("xab", "");
        System.out.println("Count : "+count);
    }
}
