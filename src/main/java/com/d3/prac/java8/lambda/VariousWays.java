package com.d3.prac.java8.lambda;

import java.util.Comparator;
import java.util.function.Consumer;

public class VariousWays {

    Comparator<String> byName = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };

    Comparator<String> byNameLambda =
            (String a, String b) -> {return a.compareTo(b); };

    Comparator<String> byNameLambda2 =
            (a, b) -> { return a.compareTo(b); };

    Comparator<String> byNameLambda3 =
            (a, b) -> a.compareTo(b);

    Consumer<Integer> getFI() {
        int l = 10;

        //Consumer<Integer> reassign = x -> l = x; // effectively final varible l
        Consumer<Integer> reassign = x -> System.out.println(x);

        return reassign;
    }

    public static void main(String[] args) {
        VariousWays vw = new VariousWays();
        vw.getFI().accept(10);
    }
}
