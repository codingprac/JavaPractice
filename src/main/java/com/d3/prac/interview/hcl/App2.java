package com.d3.prac.interview.hcl;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

class MyResource1 implements Closeable {
    public void close() {
        System.out.print("r1 ");
    }
}

class MyResource2 implements AutoCloseable {
    public void close() throws IOException {
        System.out.print("r2 ");
        throw new IOException();
    }
}

public class App2 {
    public static void main(String[] args) {

        int a=1;
        /*while(a){
            System.out.println("a :"+a);
            a=a+1;
        }*/

        Arrays.asList("Fred", "Jim", "Sheila")
                .stream()
                .peek(System.out::println)
                .allMatch(s -> s.startsWith("F"));

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);

        try (MyResource1 r1 = new MyResource1(); MyResource2 r2 = new MyResource2();) {
            System.out.print("try ");
        } catch (Exception e) {
            System.out.print("catch ");
            for (Throwable t : e.getSuppressed()) {
                System.out.println(t.getClass().getName());
            }
        }
    }
}
