package com.d3.prac.strings;

import java.util.*;

public class StringsExamples {


	public static void journalDevEg1(){
		String s = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s.substring(start,end));
	}

	public static void journalDevEg2(){
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());
	}

	public static void journalDevEg3(){
		String str = null;
		String str1="abc";
		System.out.println(str1.equals("abc") | str.equals(null));
	}

	public static void main(String[] args){
		String a = "Test";
		String b = "Test";

		Integer c = 2;
		Integer d = 2;

		Float e = 2.2f;
		Float f = 2.2f;

		if(a == b){
			System.out.println("Equal");
		}else{
			System.out.println("Unequal");
		}

		if(c == d){
			System.out.println("Equal");
		}else{
			System.out.println("Unequal");
		}

		System.out.println(a.intern());


		journalDevEg1();
		journalDevEg2();
		journalDevEg3();
		/*for(int i=1; i<11;i++){
			System.out.println(++i);
		}*/

	}
}
