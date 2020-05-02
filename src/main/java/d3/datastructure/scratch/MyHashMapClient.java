package d3.datastructure.scratch;

public class MyHashMapClient {

    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();

        myHashMap.put("Deep", "Lotia");
        myHashMap.put("Sayali", "Gole");

        System.out.println("Values : " + myHashMap.get("Deep"));
    }
}
