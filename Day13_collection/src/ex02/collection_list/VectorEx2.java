package ex02.collection_list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector<>(3, 5); // 초기값3 증가용량 
		
		v.addElement("자바"); //string
		v.addElement(new Double(10.2)); //Double type ( 파라미터를 지정을 안했으니 다른 타입 데이터 넣을수 있는거임)
		v.addElement(date); // object
		
		System.out.println("================3개 객체 추가 =====================");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		//데이터 꺼내기
		for (int j = 0; j < 10; j++) { 
			v.addElement(new Integer(j)); // 0번 부터 데이터 넣기 
			
		}
		System.out.println("================10개 객체 추가 =====================");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		//3개 넣고 꽉 찼으니까 5개 추가 용량 그러면 값 4 까지 8개 또 꽉찼으니 5개 더 넣어주면 값 10까지가 용량 13이 되어서 출력됨 
		
		System.out.println("================Vector 내용 출력 =====================");
		Enumeration  enu = v.elements(); //데이터 뽑아서 변수에 담음 

		while (enu.hasMoreElements()) {	
			System.out.println(enu.nextElement() + " ");
		}
		
		System.out.println("================객체 내용 포함 확인  =====================");
		if(v.contains("자바")) System.out.println("자바 문자열 포함됨 ");
		else System.out.println("자바 미포함");
		
	
		System.out.println("10.2 객체 위치는? " + v.indexOf(new Double(10.2)));
		System.out.println("입력 시간 : " + date);
		System.out.println(v.get(v.indexOf(date))); //get 이용해서 데이터 꺼내기 
		
		//date object delete
		v.removeElementAt(v.lastIndexOf(date));
		System.out.println("***************************************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity()); //data size 가 줄어들었음
		System.out.println(v); // 날짜가 없음 
		
		
		for(i=0; i< v.size(); i++) {	
			//v.removeElementAt(i); //가만히 있는게 아니라 시스템이 앞으로 땡겨짐 
			//0 번 삭제--> 10.2가 0번이 됨 --> i=1 부터 시작 -->i=1 index 인 0번 삭제 -->앞으로 당겨짐-->i=2 시작 i=2 index 가 된 2 삭제
			
			// v.remove(i);     //index 번호를 이용해서 지우는 방법 
			
			 v.remove(10.2);    //객체 이름으로 지우는 방법 
			
			 v.remove("자바");  //객체 이름으로 지우는 방법 
			
			//v.removeAllElements(); // s 가 붙으면 복수 형태니까 싹다 지워버리기 
		}
		
		System.out.println("***************************************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity()); //data size 가 줄어들었음
		System.out.println(v); // 날짜가 없음 
		
		
		//데이터 꺼내기 (2)
		for (int j = 0; i<v.size(); i++) {
			System.out.println(v.get(i)+ ", ");			
		}
		
		System.out.println("***************************************");
		//해당하는 객체의 특정 위치 에다가 값을 넣어줘 (배열에서 2번은 3번째 위치 임을 기억 0부터 시작하니까 !)
		 v.setElementAt("java", 2 ); //3번째 위치에 java 문자열 추가 
		 
		 enu = v.elements();
		 while(enu.hasMoreElements()) {	
			 System.out.println(enu.nextElement() + ", ");
		 }
	
		 System.out.println("***************************************");
		 v.trimToSize();

		 System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		 
		 v.setSize(2);//크기를 강제로 2로 조정
		 enu = v.elements();
		 while(enu.hasMoreElements()) {	
			 System.out.println(enu.nextElement() + ", ");
		 }
		 System.out.println("\nsize : " + v.size() + ", capacity : " + v.capacity());
		
	}
	
}


