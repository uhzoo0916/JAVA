//*

package ex01.collection_set;

import java.util.HashSet ;
import java.util.Iterator;
import java.util.Set;
//Set : 순서 없고, 중복 허용 X
public class HashSetEx {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "3", "3", "4", "4", "4"};
		
		Set set = new HashSet();
		
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
	
		}
			
		System.out.println(set); // 하나는 문자열 하나는 정수형 중복 다 빼서 출력됨
	}

}

//*/
