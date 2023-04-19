package day6_quiz;

import java.util.Scanner;

// 2 차원 배열

public class ScoreArrayEx2 {// 
	public static void main(String[] args) {
		
		int  SU = 4; //과목수
		int  NO = 3; //인원수
		
		Scanner sc = new Scanner(System.in);  
		
		int[][] arr = new int[NO][SU];  // 인원수, 과목수를 포함하는 정수형 array 생성 
		
		String[] name = new String[NO]; // string array 생성 
		
		double[][] avg = new double[NO][SU];  //double 
		
		char[] grade = new char[SU]; //char 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 학생 이름 : ", i+1 ); //0번부터 시작하는 거니까 i+1
			
			name[i] = sc.next();
			
			//for문과 switch 문 함께 이용 
			for (int j = 0; j < arr[i].length-1; j++) {
				switch (j) {
				case 0 :	System.out.print("국어점수 입력 : ");
					break;
				case 1 :	System.out.print("영어점수 입력 : ");
					break;
				case 2 :	System.out.print("전산점수 입력 : ");
					break;
				} // switch end
				
			
				arr[i][j] = sc.nextInt();		
				arr[i][j] += arr[i][j];  // 총점
				
				 avg[i][j] = (double) arr[i][j] / SU; //평균 
				 
				// 학점(평점) 
				switch( (int)avg[i][j] / 10) {
					case 10 :
					case  9 :  grade[i] = 'A'; break; 
					case  8 :  grade[i] = 'B'; break; 
					case  7 :  grade[i] = 'C'; break; 
					case  6 :  grade[i] = 'D'; break; 
					default : grade[i] = 'F';
				} // switch end
			} // j end
		} // i end
		
		// output
		line();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				System.out.println(name[i]+"님의 성적표 ***** ");
				System.out.println("국어 : " + arr[i][j] + " 영어 : " +  arr[i][j]  + " 전산 : " +  arr[i][j+1] );
				System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c \n", arr[i][3], avg[i][j], grade[i] );
			} // j  end
			line();
		} // i end 
	}
	
	public static void line() {
		System.out.println("-------------------------------");
	}
}


/*
	dd님의 성적표 ***** 
	국어 : 110 영어 : 110 전산 : 154
	총점 : 0 평균 : 27.5  평점(학점) : F  석차(등수) : 
*/






