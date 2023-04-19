package ex01.collection_set;

import java.util.HashSet;
import java.util.Iterator;


//Set : 순서 없고 중복 허용 하지 않는다 
public class MainEntry {	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size()); //키보드 중복 안됨 
		System.out.println(hs); //순서가 상관 없이 출력됨 
		
		HashSet<Integer> hs2 = new HashSet<>();
		//<>안에는 reference 자료형만 들어가야함 !! (ex : Integer)
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
		// hs2.add("string"); 
		
		HashSet hs3 = new HashSet<>(); //type 지정 안하면 정수, 문자 다 받을수 있음 
		hs3.add(100);
		hs3.add(3);
		hs3.add(1000);
		hs3.add("string"); 
		
		Iterator it = hs.iterator();
		while( it.hasNext() ) { // 다음 요소가 있따면	
			System.out.println(it.next()); //요소를 꺼내와서 출력함 
		}
		System.out.println();
		it = hs3.iterator();
		while(it.hasNext() ) {	
			System.out.println(it.next());
		}

	}

}
