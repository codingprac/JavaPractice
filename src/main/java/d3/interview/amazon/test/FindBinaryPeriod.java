package d3.interview.amazon.test;

import java.util.Arrays;

public class FindBinaryPeriod {

    static int solution(int n) {
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for (p = 1; p < 1 + l; ++p) {
            if (p <= 1 / 2) {
                int i;
                boolean ok = true;
                for (i = 0; i < l - p; ++i) {
                    if (d[i] != d[i + p]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    return p;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println("BV: " + Integer.toBinaryString(655));
        int result = solution(34);
        System.out.println();
        System.out.println("result = " + result);
    }
}
