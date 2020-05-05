package com.d3.prac.hackerRank.ishi;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		/*int[] a = {1};
		new Test().increment(a);
		System.out.println(a[a.length-1]);*/
		
		int c = 125;
		int d = 255;
		int e = (c << 1) ^ d;
		System.out.println(e);
		Double dou = 10.0;
		Double dou1 = BigDecimal.valueOf(d+e).setScale(1).doubleValue();
		String s = "asdfa";
		String str = "dsfgdf";
		System.out.println(s+str);
	}
	
	void increment(int[] a){
		a[a.length - 1]++;
	}

}
