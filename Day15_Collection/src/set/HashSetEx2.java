package set;


import java.util.*;
class HashSetEx2 {
	public static void main(String[] args) 	{
		Object[] objArr = {"1",new Integer(1),"3","3","4","2","2","4","4"};
		
		Set set = new LinkedHashSet();	
		//  LinkedHashSet 중복허용하지 않음 이라는 성질 동일 
		
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set); //[1, 3, 4, 2] >> 들어가 있는 순서 성질은 유지함 
	}
}