package d3.collections;

import java.util.*;

public class ListIteratorDemo {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("arrList")
		List<Integer> arrList = new ArrayList<Integer>();
		Set<Integer> arrSet = new HashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(50);
		arrList.add(40);
		arrList.add(60);
		arrList.add(40);
		arrList.add(70);
		arrList.add(80);
		//arrList.add(null);
		
		arrSet.add(null);
		arrSet.add(null);
		
		//arrSet.addAll(arrList);
		treeSet.addAll(arrList);
				
		System.out.println("Set value is : "+arrSet);
		System.out.println(treeSet);
	
		ListIterator<Integer> li = arrList.listIterator();
		ListIterator<Integer> secondLi = arrList.listIterator();
		
		/*Iterator<Integer> li = arrList.iterator();
		Iterator<Integer> secondLi = arrList.iterator();*/
		
		/*while(li.hasNext()){
			System.out.print(li.next()+",");
		}*/
		while(secondLi.hasNext()){
			//System.out.print(secondLi.next()+",");
			//System.out.println(arrList);
			if(secondLi.next()==40){
				System.out.println("Previous Index : "+secondLi.previousIndex());
				secondLi.remove();
				//arrList.add(100);
			}
			//System.out.println(arrList);
		}
		System.out.println();
		
		ListIterator<Integer> thirdLi = arrList.listIterator();
		while(thirdLi.hasNext()){
			System.out.print(thirdLi.next()+",");
		}
	
		
		
	}

}
