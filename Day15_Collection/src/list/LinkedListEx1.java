package list;

import java.util.*;
class  LinkedListEx1{ //중복도 없고 순서도 없다 
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		
		list.addFirst("a"); //첫번째에 추가해줘 
		list.addLast("z"); //마지막에 추가해줘 
		
		
		System.out.println(list);
		list.remove("k"); ////데이터 값으로 찾아서 삭제
		
		System.out.println(list);
		list.remove(2); //인덱스 번호로 찾아서 삭제 
		
		System.out.println(list);
		list.removeFirst(); //첫번째로 삭제 
		
		System.out.println(list);
		list.removeLast(); //마지막 삭제 
		
		System.out.println(list);
		list.set(2,"a");//교체 (index 2번을 "a" 로 교체해줘)
		
		
		System.out.println(list);
		list.set(3,list.get(1)+"change"); //3번째 위치에 1번째 데이터를 가져와서 change 붙이고 넣어줘 
		System.out.println(list);
		
		String str1 = (String)list.peek(); //넣어가 빼거나 poll() : 큐에서 데이터를 꺼내온다. 
		
		System.out.println("=====================");
		System.out.println(str1);
		System.out.println(list);
		
		
		String str2 = (String)list.poll();
		System.out.println(str2);
		System.out.println(list);
		
		
		list.offer("a");
		System.out.println(list);
		String str3 = (String)list.remove();
		System.out.println(str3);
		System.out.println(list);
	}
}
