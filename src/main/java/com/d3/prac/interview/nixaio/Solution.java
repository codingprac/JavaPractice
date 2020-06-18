package com.d3.prac.interview.nixaio;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'fetchItemsToDisplay' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. 2D_STRING_ARRAY items
     *  2. INTEGER sortParameter
     *  3. INTEGER sortOrder
     *  4. INTEGER itemsPerPage
     *  5. INTEGER pageNumber
     */

    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {
        List<Items> itemsArrayList = generateList(items, sortParameter, sortOrder);
        Map<Integer, List<String>> map = new HashMap<>();
        int itemsPerPagTemp = itemsPerPage;

        for(Items sortedItems : itemsArrayList) {
            List<Items> itemsListPerPage = new ArrayList<>();
            while(itemsPerPagTemp != 0) {
                itemsListPerPage.add(sortedItems);
                itemsPerPagTemp--;
            }
            //map.put(pageNumberTemp, itemsListPerPage);
        }
        return map.get(pageNumber);
    }

    private static List<Items>  generateList(List<List<String>> items, int sortParameter, int sortOrder) {
        List<Items> itemsArrayList = new ArrayList<>();
        for(List<String> item : items) {
            itemsArrayList.add(new Items(item.get(0), Integer.parseInt(item.get(1)), Integer.parseInt(item.get(2))));
        }

        Comparator byName = Comparator.comparing((Items i) -> i.getItemName());
        Comparator byRelevance = Comparator.comparing((Items i) -> i.getRelevance());
        Comparator byPrice = Comparator.comparing((Items i) -> i.getPrice());

        if(sortParameter == 0) {
            if(sortOrder == 1) {
                byName.reversed();
            }
            Collections.sort(itemsArrayList, byName);
        } else if(sortParameter == 1) {
            if(sortOrder == 1) {
                byRelevance.reversed();
            }
            Collections.sort(itemsArrayList, byRelevance);
        } else if(sortParameter == 2) {
            if(sortOrder == 1) {
                byPrice.reversed();
            }
            Collections.sort(itemsArrayList, byPrice);
        }
        return itemsArrayList;
    }


}


class Items{
    private String itemName;
    private Integer relevance;
    private Integer price;

    public Items(String itemName, Integer relevance, Integer price) {
        this.itemName = itemName;
        this.relevance = relevance;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getRelevance() {
        return relevance;
    }

    public Integer getPrice() {
        return price;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int itemsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int itemsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> items = new ArrayList<>();

        IntStream.range(0, itemsRows).forEach(i -> {
            try {
                items.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int sortParameter = Integer.parseInt(bufferedReader.readLine().trim());

        int sortOrder = Integer.parseInt(bufferedReader.readLine().trim());

        int itemsPerPage = Integer.parseInt(bufferedReader.readLine().trim());

        int pageNumber = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.fetchItemsToDisplay(items, sortParameter, sortOrder, itemsPerPage, pageNumber);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
