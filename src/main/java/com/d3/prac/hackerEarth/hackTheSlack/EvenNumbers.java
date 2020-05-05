package com.d3.prac.hackerEarth.hackTheSlack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class EvenNumbers {

	public static void main(String[] args) {

		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		boolean flag = true;

		System.out.println("Input");
		try {
			int num=0;
			//Example 1
			/*while(num!=-1){
				num = Integer.parseInt(br.readLine());
				list.add(num);
			}*/

			//Example 2
			String[] str = new String[10]; 
			str = br.readLine().split(" ");
			int i = 0;
			while(num!=-1){
				num = Integer.parseInt(str[i]);
				list.add(num);
				i++;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Output");
		for(int n : list){
			if(n%2==0){
				System.out.println(n);
			}
		}

	}

}
