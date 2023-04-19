package ex03.IO;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {

	public static void main(String[] args) throws Exception {
		// 이 뒤에 , SQ  넣으면 다중으로 예외 처리 가능 trycatch 안써도 됨 !  예외 처리 위임=JVM
	
		InputStream is = System.in; //표준입력(입력그릇 하나 생성)  ( inputsteam 타입의 그릇에 담아야함)
		
	//	try { 
				
		System.out.println("단일 문자 입력 : "); //read는 돌려받는 타입이 int 형이다 
		int num = is.read()-48; //예외 발생, '0'~'9' : 48~57 (ASCII code)  read 예외 처리 하는거 주의 !! 
//		System.out.println((char)num); //문자열로 출력 
		System.out.println(num);
		
		
		is.read(); is.read();
		int num2 = is.read() - 48; //2를 넣었을때 아스키 코드값 50이 들어가고 -48이 되니까 2가 출력됨 그게 num2로 저장됨
		
		System.out.println(num + num2); 
		
	//	} catch(IOException e ) {	 //예외 처리 : try catch 로 묶기 
	//		e.printStackTrace();
	//	}
	}

}
