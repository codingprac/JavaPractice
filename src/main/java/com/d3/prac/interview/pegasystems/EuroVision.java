package com.d3.prac.interview.pegasystems;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EuroVision {

    public static void main(String[] args) {
        //fetch file
        //convert it into an array of objects
        //put it into the hashmap with the count

        List<List<String>> countriesList = fetchCountriesListFromFile();

        for(List<String> list : countriesList) {
            System.out.println(list.get(0));
            System.out.println(list.get(1));

        }

    }

    private static List<List<String>> fetchCountriesListFromFile() {
        List<List<String>> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("temp.csv"));
            String line;
            while((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                list.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
