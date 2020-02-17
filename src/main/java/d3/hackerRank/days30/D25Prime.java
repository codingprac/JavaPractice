package d3.hackerRank.days30;

import java.util.Scanner;

public class D25Prime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] arr = new double[n];
        boolean prime = true;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextDouble();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if(arr[i] == 1 || (arr[i] != 2 && arr[i] % 2 == 0)) {
                System.out.println("Not prime");
                continue;
            }

            int sqrt = (int) Math.sqrt(arr[i]);

            for(int j = 2; j<= sqrt; j++){
                if(arr[i] % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
