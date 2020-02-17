package d3.geeks4geeks.misc;

import java.util.Scanner;

/**
 * This code wont work for larger number. Its a DP problem.
 */
public class CatalnNumber {

    // A recursive function to find nth catalan number
    int catalan(int n) {
        int res = 0;

        // Base case
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        CatalnNumber cn = new CatalnNumber();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            System.out.println(cn.catalan(num));
        }

        // Print a list of cataln numbers
        /*for (int i = 0; i < 10; i++) {
            System.out.print(cn.catalan(i) + " ");
        }*/
    }
}
