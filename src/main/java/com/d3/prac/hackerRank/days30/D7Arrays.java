package com.d3.prac.hackerRank.days30;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class D7Arrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        //Collections.reverse(Arrays.asList(arr));
        //System.out.println(IntStream.of(arr).mapToObj(Integer::toString).collect(Collectors.joining(" ")));

        for(int i = arr.length -1; i>=0; i--) {
            System.out.print(arr[i]);
            if(i!=0){
                System.out.print(" ");
            }
        }

        Arrays.stream(arrItems).mapToInt(items -> Integer.parseInt(items));
        /*Stream<Integer> reverseArr = IntStream.range(0, arr.length).mapToObj(i -> arr[arr.length - i - 1]);
        System.out.print(reverseArr.map(item -> Integer.toString(item)).collect(Collectors.joining(" ")));*/

        System.out.print(IntStream.range(0, arr.length).mapToObj(i -> arr[arr.length - i - 1]).map(item -> Integer.toString(item)).collect(Collectors.joining(" ")));
        //IntStream.rangeClosed(0, to).mapToObj(i -> list.get(to-i)).forEach(System.out::print);

        /*System.out.println(IntStream.range(0, from).map(i -> to - i + from - 1).mapToObj(Integer::toString).collect(Collectors.joining(" ")));*/

        //System.out.println(IntStream.range(0, arr.length).map(i -> arr.length - i + 0 - i).mapToObj(Integer::toString).collect(Collectors.joining(" ")));

        //Arrays.stream(arr).mapToObj(Integer::toString).sorted(Collections.reverseOrder()).collect(Collectors.joining(" "));
        /*Arrays.stream(arr).forEach(item -> System.out.print(item + " "));
        Arrays.stream(arr).mapToObj(item -> item + " ").forEach(System.out::print);*/

        scanner.close();
    }

}