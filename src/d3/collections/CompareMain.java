package d3.collections;

import java.util.*;

//Collections.sort() is only applicable for LIST so we have to use TreeSet & TreeMap to sort SET & MAP.
//To use SORT method for list of OBJECT then that class needs to implement Comparable.
//SET won't remove duplicate OBJECTS until you implement Comparable or Comparator. It can identify primitive datatypes & string but not OBJECTS.
//

public class CompareMain {
	
	List<String> strList = new ArrayList<String>();
	Set<String> strSet = new HashSet<String>();
	Map<String,String> strMap = new HashMap<String, String>();
	
	List<ComparableDemo> bleObjList = new ArrayList<ComparableDemo>();
	Set<ComparableDemo> bleObjSet = new HashSet<ComparableDemo>();
	Map<ComparableDemo,String> bleObjMap = new HashMap<ComparableDemo,String>();
	
	List<ComparatorDemo> torObjList = new ArrayList<ComparatorDemo>();
	Set<ComparatorDemo> torObjSet = new HashSet<ComparatorDemo>();
	Map<ComparatorDemo,String> torObjMap = new HashMap<ComparatorDemo,String>();
	

	public static void main(String[] args) {
		
		CompareMain cm = new CompareMain();
		
		cm.populate();
		cm.sortEverything();
		
	}
	
	private void populate(){
		strList.add("Z");
		strList.add("E");
		strList.add("L");
		strList.add("B");
		strList.add("P");
		
		strSet.add("Z");
		strSet.add("E");
		strSet.add("L");
		strSet.add("B");
		strSet.add("P");
		
		strMap.put("Z","Zebra");
		strMap.put("E","Elephant");
		strMap.put("L","Lion");
		strMap.put("B","Ball");
		strMap.put("P","Parrot");
		
		bleObjList.add(new ComparableDemo(1, "Deep", 10));
		bleObjList.add(new ComparableDemo(9, "Vishal", 50));
		bleObjList.add(new ComparableDemo(4, "Ankit", 15));
		bleObjList.add(new ComparableDemo(4, "Ashi", 100));
		bleObjList.add(new ComparableDemo(6, "Sairaj", 5));
		
		bleObjSet.add(new ComparableDemo(1, "Deep", 10));
		bleObjSet.add(new ComparableDemo(9, "Vishal", 50));
		bleObjSet.add(new ComparableDemo(4, "Ankit", 15));
		bleObjSet.add(new ComparableDemo(4, "Ashi", 100));
		bleObjSet.add(new ComparableDemo(6, "Sairaj", 5));
		
		Comparator<ComparatorDemo> idComp = new Comparator<ComparatorDemo>(){
			@Override
			public int compare(ComparatorDemo o1, ComparatorDemo o2) {
				return o1.id - o2.id;
			}
		};
		
		bleObjMap.put(new ComparableDemo(1, "Deep", 10), "Deep");
		bleObjMap.put(new ComparableDemo(9, "Vishal", 50), "Vishal");
		bleObjMap.put(new ComparableDemo(4, "Ankit", 15), "Ankit");
		bleObjMap.put(new ComparableDemo(4, "Ashi", 100), "Ashi");
		bleObjMap.put(new ComparableDemo(6, "Sairaj", 5), "Sairaj");
		
	
		
	}
	
	private void sortEverything(){
		
		Collections.sort(strList); //Collections.sort() is only applicable for LIST so we have to use TreeSet & TreeMap to sort SET & MAP
		System.out.println("Sorted List : "+strList);
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		//TreeSet<String> sortedStrSet = new TreeSet<String>(strSet);
		System.out.println("Sorted Set : "+new TreeSet<String>(strSet));
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		//TreeMap<String,String> sorteStrMap = new TreeMap<String, String>(strMap);
		System.out.println("Sorted Map : "+new TreeMap<String, String>(strMap));//This will print map in entrySet() format
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		Collections.sort(bleObjList);
		System.out.println("Sorted Object List : "+bleObjList);
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("Sorted Object Set : "+new TreeSet<ComparableDemo>(bleObjSet));
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("Sorted Object Map : "+new TreeMap<ComparableDemo, String>(bleObjMap));
		
	}

}
