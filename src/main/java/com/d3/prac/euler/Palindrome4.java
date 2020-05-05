package com.d3.prac.euler;

public class Palindrome4 {

	static long largest;
	public static void main(String[] args) {

		for(int i=1;i<10000;i++){
			for(int j=1;j<10000;j++){
				if(isPalindrome(i*j)){
					if(i*j>largest)
					largest = i*j;	
				}
			}
		}

	System.out.println("Largest Palindrome is : "+largest);

	}

	public static boolean isPalindrome(long l){
		Long L = (Long)l;
		int i = 0;
		char[] c = L.toString().toCharArray();
		String s1=null;
		String s2=null;
		
		if(L.toString().length()>=4 && L.toString().length()%2==0){
			int n = L.toString().length()/2;
			for(int j=0;j<L.toString().length()/2;j++){
				s1 = s1 + c[j];
			}
			for(int j=L.toString().length()-1;j>=L.toString().length()/2;j--){
				s2 = s2 + c[j];
			}
			if(s1.equals(s2)){
				//System.out.println("it is palindrome "+l);
				return true;
		}
		
		}
		return false;
	}
}
