package d3.hackerRank.days30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class D8Maps {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        HashMap<String, String> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrItems = in.nextLine().split(" ");
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String name = arrItems[0];
            String phone = arrItems[1];
            map.put(name, phone);
        }

        while (in.hasNext()) {
            String queryName = in.next();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String value = map.get(queryName) != null ? queryName+"="+map.get(queryName) : "Not found";
            result.add(value);
        }

        result.forEach(System.out::println);
        in.close();
    }
}
