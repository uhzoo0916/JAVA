package ex02.collection_list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

//list : 순서가 있고 중복을 허용 한다.

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		System.out.println("length          /     capacity");
		System.out.println(v.size() + "             /         " + v.capacity()); // 아무것도 안넣었으니까 사이즈는 0 기본값은 10 ( notion 사진)
		
		
		System.out.println("===================================");
		Vector<Integer> v2 = new Vector<>(3, 4); //
		//인자값 2개 짜리 있음 초기용량 3 , 증가용량 4 로 지정
		
		v2.add(2);
		v2.add(21);
		v2.add(22);
		v2.add(100); // 3 + 4 = 7 이 됨 기존에 있던 3 값에 증가값 4를 넣었으니 7
		
		v2.add(5);
		v2.add(89);
		v2.add(3);
		v2.add(333); // 다시 돌아가서 앞에 3개 값이 존재하고 그 다음으로 넘어가면 용량이 4이 다시 증가됨 7 + 4 = 11
		
		v2.add(3);
		v2.add(3);
		v2.add(21);
		v2.add(100); // 11 + 4 = 15 출력 
		
		int len = v2.size(); 
		System.out.println(len + "          /     " + v2.capacity()); 
		
		System.out.println(v2); //중복도 허용 
	
		System.out.println("========Iterator() method=========== ");
		Iterator it = v2.iterator();
		while( it.hasNext()) {	
			System.out.println(it.next());
		}
	
		
		System.out.println("========get() method=========== ");
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
	
	
		System.out.println("========sort() method=========== ");
		Collections.sort(v2); // 요소 순서대로 정렬
		for (int j = 0; j < v2.size(); j++) {
			System.out.println(v2.get(j));
		}
		
		System.out.println("========elementsAt() method=========== ");
		for (int j = 0; j < v2.size(); j++) { //vector 에 있는 모든 요소에 대해 반복 
			Integer num = v2.elementAt(j); // 요소 객체 알아내기 
			System.out.println(num.toString());
			// System.out.println(v2.get(num));
			
		}
	
		System.out.println("========trimToSize() method=========== ");
		v2.trimToSize(); //capacity  조정하기 
		System.out.println("length          /     capacity");
		System.out.println(v2.size() + "             /         " + v2.capacity());
		
		
	}
	
	

}



// length는 배열 (array) 의 크기, length() 는 사용되는 문자열의 길이 