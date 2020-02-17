package d3.hackerRank.days30;

import java.util.Scanner;

public class D29BitwiseAND {

    private static final Scanner scanner = new Scanner(System.in);

    //timeout error
    private static int bitwiseAnd(int n, int k) {

        int bitwiseAnd;
        int result =0;

        for (int i = 1; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                bitwiseAnd = i&j;
                if(bitwiseAnd < k && bitwiseAnd > result) {
                    result = bitwiseAnd;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            if(((k-1)|k) > n && k%2==0){
                System.out.println(k-2);
            }else{
                System.out.println(k-1);
            }
        }

        scanner.close();
    }


}
