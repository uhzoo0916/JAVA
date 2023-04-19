package set;

import java.util.*;
class HashSetEx1 {
	public static void main(String[] args) 	{
		//1. objArr 배열 생성 
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		
		// Set : 순서 없음, 중복 허용하지 않음 
		Set set = new HashSet();
		
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);	
		}
		System.out.println(set);	// [1, 1, 2, 3, 4]
	}
}