package com.d3.prac.hackerRank.interviewPrepKit.stacksandqueues;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch: c) {
            switch (ch) {
                case '{':
                    stack.push(ch);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                case '[':
                    stack.push(ch);
                    break;
                case '}':
                    if(stack.empty() || stack.peek() != '{') {
                        return "NO";
                    }
                    stack.pop();
                    break;
                case ')':
                    if(stack.empty() || stack.peek() != '(') {
                        return "NO";
                    }
                    stack.pop();
                    break;
                case ']':
                    if(stack.empty() || stack.peek() != '[') {
                        return "NO";
                    }
                    stack.pop();
                    break;
            }
        }
        return stack.empty() ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
