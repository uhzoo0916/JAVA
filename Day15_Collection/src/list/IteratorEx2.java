package list;

import java.util.*;

public class IteratorEx2 {
	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);		
		ArrayList copy2 = new ArrayList(10);		
		
		for(int i=0; i < 10; i++){
			original.add(i+""); //0부터 9까지 안에 original 데이터에 저장 
		}
		
		Iterator it = original.iterator();
		
		while(it.hasNext()){
			copy1.add(it.next()); //original 데이터에서 똑같이 꺼내옴 
		}
		System.out.println("=Original에서 copy1로 복사(copy) =");		
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		System.out.println();

		it = original.iterator(); // 이미 선언 되어있지만 재사용 
		
		while(it.hasNext()){
			copy2.add(it.next()); //orginal 값을 가지고 있는 copy2
			it.remove();
		}
		
		System.out.println("= Original에서 copy2로 이동(move) =");		
		System.out.println("original:"+original); //copy하고 remove 했으니까 없어짐 
		System.out.println("copy2:"+copy2);		
	} // main
} // class