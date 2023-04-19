package day6_hw;

import java.util.Scanner;

public class ScoreArray4 {
	public static void main(String[] args) {
		
		int INWON = 3;
		Scanner sc = new Scanner(System.in);
        
		//String[] message = new String[] {"no","name","kor" };
        int[] num = new int[INWON];
        int[] kor = new int[INWON];
        int[] eng = new int[INWON];
        int[] math = new int[INWON];
        int[] total = new int[INWON];
        double[] avg = new double[INWON];
        String[] name = new String[INWON];    
        char gread = ' ';  // char[] grade = new char[INWON];
        double avgall =0.0;
        int totalall =0;
        
        // input
        for(int i=0; i < INWON; i++){  //for(int i=0; i < name.length; i++){
            System.out.println("========================");
            
            System.out.print(" 번 호 입 력 : ");            num[i] = sc.nextInt();
            System.out.print(" 이 름 입 력 : ");            name[i] = sc.next();
            System.out.print(" 국 어 점 수 입 력 : ");    kor[i] =sc.nextInt();
            System.out.print(" 영 어 점 수 입 력 : ");    eng[i] =sc.nextInt();
            System.out.print(" 수 학 점 수 입 력 : ");    math[i] =sc.nextInt();
            
            // 총점/평균/학급총,평균 처리
            total[i] = kor[i] + eng[i] + math[i]; //개별 총점   
            avg[i] = (total[i] / 3.0); // 개별평균
            totalall += total[i];  //전체 총점
            avgall = (double) totalall / INWON; //전체평균
            
//            switch(((int)avg[i]) / 10) { // 실수형 X
//	            case 10:
//	            case 9:
//	                gread[i] ='A';     break;
//	            case 8:
//	                gread[i] ='B';      break;
//	            case 7:
//	                gread[i] ='C';       break;
//	            case 6:
//	                gread[i] ='D';      break;
//	            default:
//	                gread[i] = 'F';
//            } // end switch
            
        }  //end for 
        
        System.out.println("========================");
        
        // 평점 구하기
        for(int i = 0; i < INWON; i++)  {
            switch(((int)avg[i]) / 10) { // 실수형 X
	            case 10:
	            case 9:
	                gread ='A';     break;
	            case 8:
	                gread ='B';      break;
	            case 7:
	                gread ='C';       break;
	            case 6:
	                gread ='D';      break;
	            default:
	                gread = 'F';
            } // end switch 
        } // end for 
        
        // output
        for(int i = 0; i < INWON; i++)   {
            System.out.println("========================");
            System.out.printf("번 호 : " + num[i] + "\n이 름 : " + name[i] + "님의 성적표****\n총 점 : " + total[i] + "\n평 균 : %.2f" + "\n학 점 : " + gread ,avg[i] );
            System.out.println("\n========================");
        } // end for
        System.out.println("========================");
        System.out.printf(" 학 급 총 점 : " + totalall + "\n 학 급 평 점 : %.2f ", avgall);
        System.out.println("\n========================");
        
	}
}
