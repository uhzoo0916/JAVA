package Quiz1;

import java.util.Scanner;

public class Score {

	//7명의 성적처리 배열 이용하기
	public static void main(String[] args) {
		  String name;
	      int kor, eng, com, total;
	      double everg;
	      	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("이름을 입력해 주세요 : ");      name = sc.next();
	      
	      do {
	    	  System.out.println("국어, 영어, 전산 순으로 점수를 입력해주세요 : ");
		      kor = sc.nextInt();	      eng = sc.nextInt();	      com = sc.nextInt();
			} while( (kor < 0 || kor > 101) || (eng < 0 || eng > 101) ||(com < 0 || com > 101) );
	      
	      total = kor + eng + com;
	      everg = (double)total/3;
	      
			//평점(학점) 구하는 프로그램 작성
//			if(everg >= 90) grade = 'A';
//			else if(everg >= 80) grade = 'B';
//			else if(everg >= 70) grade = 'C';
//			else if(everg >= 60) grade = 'D';
//			else  grade = 'F';
			
	       char grade = ' ';
			//switch 예시로 변경
			switch ((int)everg / 10) {  //실수형 올수 없다
				case 10: 
				case  9: grade = 'A'; break;
				case  8: grade = 'B'; break;
				case  7: grade = 'C'; break;
				case  6: grade = 'D'; break;
				default: grade = 'F'; break;
			}
	      
	      System.out.print(name + "님의 성적표***************\n" + "국어 : " + kor + ", 영어 : " 
	                     + eng + ", 전산 : " + com + "\n총점 : " + total );
	      System.out.printf(" , 평균 : %.2f , 평점(학점) : %c ", everg, grade);
	      
	      sc.close();

	}
}

/*
 문제] 이름 입력 받고, 국어,영어,전산 점수 입력 받아서 
 	  총점, 평균까지 구하는 프로그램 작성
 	  
 	  이도연님의 성적표**************
 	  국어 : 100, 영어 : 100, 전산 : 100
 	  총점 : 300, 평균 : 100.0, 평점(학점) : A
*/