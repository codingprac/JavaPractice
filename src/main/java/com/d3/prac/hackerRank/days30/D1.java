package com.d3.prac.hackerRank.days30;

import java.math.BigDecimal;
import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {

		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		int j = scan.nextInt();
		double e = scan.nextDouble();
		String str = scan.nextLine();
		str = scan.nextLine();
		/* Read and save an integer, double, and String to your variables.*/

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i+j);
		/* Print the sum of the double variables on a new line. */
		Double dou = BigDecimal.valueOf(d+e).setScale(1).doubleValue();
		System.out.println(dou.toString());
		/* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
		System.out.println(s+str);

	}

}
