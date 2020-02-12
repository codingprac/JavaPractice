package d3.hackerRank.days30;

import java.util.Scanner;

public class D10BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    static int findConsecutive1s(int num) {
        char[] binaryArr = Integer.toBinaryString(num).toCharArray();
        int count = 0;
        int maxCons1 = 0;
        int interimCount = 0;
        for(char c: binaryArr) {
            System.out.print(c);
            if (c == '1') {
                count ++;
                interimCount = count;
            } else {
                count = 0;
            }
            if(interimCount > maxCons1) {
                maxCons1 = interimCount;
            }
        }
        return maxCons1;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = findConsecutive1s(n);

        System.out.println("result = " + result);

        scanner.close();
    }

}
