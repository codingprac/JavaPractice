package d3.collections;

import java.util.*;

public class MapDemo {

	static Map<String, String> hashMap = new HashMap<String,String>(){
		{
			put("Deep","Lotia");
			put("Ankit","Jain");
			put("Deep","Lotia2");
			put(null,null);
			put("Sairaj",null);
			put("Chandra",null);
			put(null,"Deep");
		}
	};
	
	static Map<String, String> hashTable = new Hashtable<String,String>(){
		{
			put("Deep","Lotia");
			put("Ankit","Jain");
			put("Deep","Lotia2");
			put("Vishal","123");
			//put(null,null);
		}
	};
	static Map<String, String> linkedHashMap = new LinkedHashMap<String,String>(){
		{
			put("Deep","Lotia");
			put("Ankit","Jain");
			put("Deep","Lotia2");
			put("Vishal","123");
			put(null,null);
			put(null,"Deep");
			put("Sairaj",null);
		}
	};
	public static void main(String[] args){
		
		System.out.println(hashMap);
		System.out.println(hashTable);
		System.out.println(linkedHashMap);
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(hashMap.entrySet());
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		
	}

}
