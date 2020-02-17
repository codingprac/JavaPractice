package d3.hackerRank.days30;

import java.util.Scanner;

public class D11Arrays2D {

    private static final Scanner scanner = new Scanner(System.in);

    private static int findHourGlassSum(int[][] arr) {
        int sum = 0;
        int maxSum = -10000;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    sum = 0;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(findHourGlassSum(arr));

        scanner.close();
    }
}
