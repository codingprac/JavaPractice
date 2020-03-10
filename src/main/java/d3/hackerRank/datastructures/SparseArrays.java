package d3.hackerRank.datastructures;

import d3.hackerEarth.hackTheSlack.Strings;

import javax.swing.plaf.IconUIResource;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Collectors;

public class SparseArrays {

    /*private int binarySearch(Strings[] strings, int low, int high, String query, int count) {
        if (high < low) {
            return 0;
        }
        if (strings[low].equals(query)) {
            count++;
            binarySearch(strings, low++, high, query, count);
        }
        if (strings[high].equals(query)) {
            count++;
            binarySearch(strings, low, high--, query, count);
        }
        if ((high - low) == 1) {
            if (strings[low].equals(query)) {

            }
        }
    }*/

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {

        Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> countArr = new ArrayList<>();
        for (String s : strings) {
            int count = 0;
            if (!map.containsKey(s)) {
                count++;
                map.put(s, count);
            } else {
                count = map.get(s) + 1;

                map.put(s, count);
            }
        }

        for (String s : queries) {
            if(map.containsKey(s)) {
                countArr.add(map.get(s));
            } else {
                countArr.add(0);
            }
        }
        return countArr.stream().mapToInt(value -> value.intValue()).toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
