package ex05_while;

import java.util.Scanner;

public class DowhileTest {

	public static void main(String[] args) {
		
		int su; //점수
		char grade; //학점
		
		do {	
			System.out.print("점수를 입력하세요: ");
			su = new Scanner(System.in).nextInt();
		} while(su <0 || su > 100); 
		
		//기억 : do while 조건 무조건 한번은 실행 된다.
		//기억 : nextInt() int 입력 받을 때 
		//추가로 기억 : nextLine() char 입력을 여러개 받을 때 
		
		//Switch 예시로 변경 
		
		grade = switch ( su / 10)  {	
			    case 10, 9 ->'A';
			    case 8 -> 'B';
			    case 7 -> 'C';
			    case 6 -> 'D';
			    default -> 'F';
		};
		
		System.out.printf("당신의 점수는 %d점이며, 학점은 %c 입니다.", su, grade);
		

	}

}

