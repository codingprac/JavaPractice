package d3.hackerRank.lambda;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd() {
        return (n) -> n % 2 !=0;
    }

    public static PerformOperation isPrime() {
        return (n) -> {
            if (n == 2) return true;
            if (n % 2 == 0 || n == 1) return false;
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return (n) -> {
            int palindrome = n;
            int reverse = 0;

            while (palindrome != 0) {
                int remainder = palindrome % 10;
                reverse = reverse * 10 + remainder;
                palindrome /= 10;
            }

            return n == reverse ? true : false;
        };
    }
}

public class OddEvenPrimePalindrome {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
