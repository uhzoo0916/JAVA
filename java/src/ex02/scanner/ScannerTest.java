package ex02.scanner;

import java.util.Scanner;
//Scanner 클래스 란 화면으로 부터 입력 받는 기능을 제공하는 클래스 
//java.until.*; 패키지 안에 들어있는 모든 클래스


public class ScannerTest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); // 인스턴스 객체 생성, 메모리 할당, 생성자 함수 자동 호출 
		
		/*
		 * Scanner 클래스는 꼭 객체를 생성해야함 
		 * Systm.in : 화면에서 입력을 받을 것 
		 * Scanner 클래스는 화면 뿐만 아니라 파일로 부터 입력을 받을수 있는데 화면으로 부터 
		 * 정수형, 소수형 같은 데이터 타입을 받을것이기 때문에 System.in 을 사용하는 것임
		 */		
		
		//next() vs nextLine()
		System.out.println("String Input 1: ");
//		String s1 = sc.next() : error 발생 공백을 인식 못함 ! 
		String s1 = sc.nextLine(); // Enter 단위로 입력을 받음  
		System.out.println(s1); // 올바르게 출력됨 ! 
		
		System.out.println("==============================================================");
		
		System.out.println("Integer Double Date Input: ");
//		int num = sc.nextInt(); // 입력받은 정수를 변수 num 에 저장 
//		double su = sc.nextDouble(); 
//		System.out.printf("num = %d, su = %f", num, su);
		System.out.printf("num = %d, su = %f,", sc.nextInt(), sc.nextDouble());
		
	

	}

}