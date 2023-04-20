package day6_hw;

import java.util.*;

public class exercise {
	public static void main(String[] args) 	{	
		
		StringBuilder stringBuilder = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		list.add("첫번째, ");
		list.add("두번째, ");
		list.add("세번째, ");
		list.add("네번째, ");
		
		for (int i = 0; i < list.size(); i++) {
			
			stringBuilder.append(list.get(i));	
		}
		
		System.out.println(stringBuilder);
		
	} 

} //첫번째, 두번째, 세번째, 네번째,


	


