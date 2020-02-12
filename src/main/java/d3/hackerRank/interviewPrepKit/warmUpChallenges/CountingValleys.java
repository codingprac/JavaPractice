package d3.hackerRank.interviewPrepKit.warmUpChallenges;

import java.util.Scanner;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        boolean seaLevel = true;
        boolean valleyStarted = false;
        int mountain = 0;
        int valley = 0;
        int noOfValleys = 0;

        for (char c : s.toCharArray()) {
            if (c == 'U' && valley == 0) {
                mountain++;
                seaLevel = false;
                continue;
            }
            if (c == 'D' && valley == 0 && !seaLevel) {
                mountain--;
                if (mountain == 0) {
                    seaLevel = true;
                }
                continue;
            }
            if (c == 'D' && mountain == 0) {
                valley++;
                valleyStarted = true;
                seaLevel = false;
                continue;
            }
            if (c == 'U' && mountain == 0 && !seaLevel) {
                valley--;
                if (valley == 0) {
                    seaLevel = true;
                }
            }
            if (valley == 0 && valleyStarted) {
                noOfValleys++;
                valleyStarted = false;
                seaLevel = true;
            }
        }
        return noOfValleys;
    }

    static int countingValleysSimple(int n, String s) {
        int level = 0;
        int count = 0;
        for(char c: s.toCharArray()){
            if(c == 'U') {
                level ++;
            } else {
                if(level == 0) {
                    count++;
                }
                level --;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println("result = " + result);

        scanner.close();
    }
}
