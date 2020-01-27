package d3.hackerEarth.hackTheSlack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Strings {

	public static void main(String[] args) {

		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
			
		try {
			int testCases = Integer.parseInt(br.readLine());
			String[] inputs = new String[testCases];
			StringBuilder[] outputs = new StringBuilder[testCases];
			
			for(int i=0;i<testCases;i++){
				inputs[i] = br.readLine();
				char[] ch = inputs[i].toCharArray();
				List<Character> charList = new LinkedList<Character>();
				
				for(int j=0;j<ch.length;j++){
					if(!charList.contains(ch[j]))
					charList.add(ch[j]);
				}
				outputs[i] = new StringBuilder();
				for(char c : charList){
					outputs[i].append(c);
				}
			}
			
			for(int i=0;i<testCases;i++){
				System.out.println(outputs[i]);
			}
			
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}


	}

}
