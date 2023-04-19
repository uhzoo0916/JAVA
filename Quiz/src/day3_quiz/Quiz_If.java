package day3_quiz;

import java.util.Scanner;

public class Quiz_If {

	public static void main(String[] args) {
			//스캐너
		   Scanner scanner = new Scanner(System.in);
		   
		   //스캐너 입력할 정수 type 불러오기
	        System.out.print("점수를 입력하세요.: ");
	        int score = scanner.nextInt();

	        System.out.printf("당신의 학점은 %c입니다.", grade(score));
	    } //grade 아래에서 지정해줌

	    private static char grade(int score) {

	        if (score >= 90 && score <= 100) {
	            return 'A';
	        } 
	        else if (score >= 80 && score < 90) {
	            return 'B';
	        }
	        else if (score >= 70 && score < 80) {
	            return 'C';
	        }
	        else if (score >= 60 && score < 70) {
	            return 'D';
	        }
	        else {
	            return 'F';
	        }
		

	}

}

/*
문제1] 점수를 입력 받아서 평점(학점)을 구하는 프로그램 작성
100 ~ 90: A
*/
