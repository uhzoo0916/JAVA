package ex02.collection_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>(10); //크기 10개로 잡기 
		
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		//sublist
		ArrayList list2 = new ArrayList<>(list.subList(1, 4));
		print(list, list2);
//		list.add(33);
		
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		
		System.out.println("list.containAll(list2) : " + list.containsAll(list2));
		
		for(int i = list2.size()-1; i >=0; i++) {	
			if(list.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list, list2);
	}
	
	public static void print(ArrayList list, ArrayList list2) {	
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
		
}


