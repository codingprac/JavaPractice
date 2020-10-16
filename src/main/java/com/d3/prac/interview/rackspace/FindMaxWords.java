package com.d3.prac.interview.rackspace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxWords {

    public int solution(String S) {
        int max = 0;
        String[] sentences = S.split("[.?!]+");

        for(String s: sentences) {
            int size = s.trim().split("\\s+").length;
            if(size > max) {
                max = size;
            }
        }

        System.out.println(max);
        Arrays.stream(sentences).forEach(System.out::println);

        return 0;
    }

    public static void main(String[] args) {
        FindMaxWords f = new FindMaxWords();
        f.solution("We test coders. Give us a try? Please God! Save Me");

        f.solution("Forget  CVs..Save time . x x");

        f.solution("We test coders. Give us a try? Please God! Save Me.Hello World I am here! Go there");


    }

    public static void addNumber(List<? extends Number> list) {

    }




}
