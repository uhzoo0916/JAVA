package ex05_while;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		
		int su; //점수 
		char yn;
		Scanner sc = new Scanner(System.in);
		
		while (true) {	
			do {	
				System.out.print("점수를 입력하세요. : ");
				su = sc.nextInt();
			} while(su <0 || su > 100 );
			
			System.out.printf("당신의 점수는 %d점 입니다. %n", su);
			
			System.out.printf("계속 하시겠습니까?(y/n): ");
			yn = sc.next().charAt(0); //뮨자형 자료형 입력 받기 
			
			if(yn =='n' || yn == 'N') 	{	
					System.out.println("프로그램을 종료합니다.");
					break;
			}			
			
		} // end while

	}

}
