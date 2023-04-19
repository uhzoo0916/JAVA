package list;

import java.util.*;

class StackQueueEx
{
	public static void main(String[] args) 
	{
		Stack st = new Stack();
		// LinkedList는 Queue인터페이스를 구현하였다.
		Queue q = new LinkedList();	//q는 인터페이스 니까 자체적으로 객체 생성x
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0"); //offer로 데이터 넣기 
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());  //LIFO 구조 이니까 반대로 출력됨 
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //FIFO 들어간 순서 그대로 
		}
	}
}