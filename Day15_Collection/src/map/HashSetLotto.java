package map;

import java.util.*;
class HashSetLotto{
	public static void main(String[] args) 	{
		Set set = new TreeSet();
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}
		List list = new LinkedList(set);	// LinkedList(Collection c) 리스트 타입의 데이터를 넣은것
		
		Collections.sort(list);		// Collections.sort(List list)
		
		System.out.println(set);
	}
}

//set 은 treeset 이고 난수를 구해서 그릇에 담았음. 중복허용x 순서 자동 정렬 
//list 를 linked 로 형 변환 sort가 안된 상태에서 진행하면 treeset 에 자체적으로 순서 자동 정렬됨 
