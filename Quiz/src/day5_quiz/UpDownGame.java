package day5_quiz;

import java.util.Random;
import java.util.Scanner;


public class UpDownGame {
	public static void main(String[] args) {
		
		//1~100 중에 난수 출력 dan= 난수값
		//사용자에게 5회 입력 기회 제공
		
		Random rand = new Random(); 
		int dan = rand.nextInt(100)+1 ; //여기에+1는 왜 ,,?
		
		for(int i=0; i<=5 ; i++) {	//5번의 기회 입력 i=0 ,1, 2, 3, 4 (총 5번 )
			System.out.println("값을 입력하세요(1~100) : ");
			int userAns = new Scanner(System.in).nextInt(); //내가 입력하는 값들 
			
			if(userAns < dan) { //dan이 내가 입력한 값보다 크면 	
				System.out.println("UP"); //up 출력 
			}
			else if(userAns > dan) { // dan 이 내가 입력한 값보다 작으면 down 출력 
				System.out.println("DOWN");
			} 
			else { //userAns = dan 인경우 
				System.out.println(" 정답입니다. 게임이 종료됩니다. ");
				System.exit(0);				
			} //else 종료
		}//for 종료
		
		 System.out.println("기회 상실 ");
		 System.out.println("정답은 " + dan + "입니다.");
	}
}

//random 은 0부터 시작해서 뽑는거임 그래서 rand.nextInt(100) d은 0부터 99까지 출력이므로 +1을 해줘야함  










//up/down  

//1~100 중에 난수 출력 dan= 난수값
//사용자에게 5회 입력 기회 제공
//답이 맞았으면 탈출
//틀렸으면 기회 상실 및 답 출력하기
