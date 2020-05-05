package com.d3.prac.hackerRank.algorithms.strings;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SuperReducedString {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        char[] arr = s.toCharArray();
        List<Character> arrlst = new ArrayList<>();
        arrlst.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arrlst.size() > 0 && arr[i] == arrlst.get(arrlst.size() - 1)) {
                arrlst.remove(arrlst.size() - 1);
            } else
                arrlst.add(arr[i]);
        }
        StringBuilder result =  new StringBuilder();
        if(arrlst.size() == 0) {
            return "Empty String";
        } else {
            arrlst.forEach(c -> result.append(c));
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        System.out.println("result = " + result);

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
