package ex02.datatype;

import java.util.Iterator;

public class DataType {

	public static void main(String[] args) {
		
	String str = "A"; //str 이라는 문자열 자료형을 만들면서 "A" 저장  문자열: " "를 사용 , 2byte 
	char ch = 'A'; //문자: ' ' 내부에 기재, 1byte
	char ch2 = 67; 
	char ch3 = 'b'; //ch 이라는 문자 변수에 'b 라는 값이 들어감 
	int su = 20; // su 라는 정수형 변수를 만들어서 20 이라는 값을 저장 
	String nickname = "prophet"; 
	double d =12.34; //실수값 
	
	System.out.println(ch);
	System.out.println(str);
	System.out.println((float) ch2); //형변환 (바꾸고싶은 형 ) 변수 
	System.out.println((int) ch); //ASCII 65 아스키표 ?  
	System.out.println(ch2 + ch3);
	System.out.println("nickname =" + nickname); // + 뒤에 nickname 정의한 prophet 같이 연결 ! 
	System.out.println("실수형 데이터:" + d);
	
	nickname = "유현주";
	System.out.println(nickname); //변수를 다시 지정해서 업데이트도 가능 ! 
	
	
	boolean pass = true; //따옴표 안씀 ! 
	System.out.println("이번 시험에 합격 할 수 있을까요?" + true);
	
	float f = 3.14f; //float 이용 할때는 실수값 뒤에 f를 넣어줘야함 !! double 은 그냥 
	
	//<for 문> 
	
	
	for (int i = 65; i<= 90; i++) {	
		
		System.out.println((char) i + "\t"); //A-Z까지 출력 
		
		// for (int j = 0; j < args.length; j++) {} for + ctrl+space for문 자동완성
	
	}//end for
	
	System.out.println("\n==================================================/");
	
	for (int i = 'a'; i < 'z'; i++) {
		
		System.out.println((char) i + "\t"); //a부터 z 까지 출력  "\t" : 줄바꿈 인듯 
		
	}//end for
	
	System.out.println("\n\nboolean type");
	boolean flag = true;
//	int b = flag; //error
	System.out.println(flag);
			
	}
	
	
}


