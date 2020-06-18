package com.d3.prac.hackerRank.interviewPrepKit.stacksandqueues;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StackBrackets {

    private static boolean verifyString(String input) {
        Stack<Character> stack = new Stack<>();

        if (input.isEmpty()) {
            return true;
        }

        for (int i = 0; i < input.length(); i++) {
            try {
                if (input.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (input.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (input.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(input.charAt(i));
                }
            } catch (EmptyStackException e) {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            boolean result = verifyString(input);
            System.out.println(result);
        }

    }

}
