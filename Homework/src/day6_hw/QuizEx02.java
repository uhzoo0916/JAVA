package day6_hw;

import java.util.Scanner;

// 문제2] 4월 한달간의 강수량을 입력 받아서, 평균 구하는 프로그램 작성 (단, 30일 기준)
public class QuizEx02 {
	public static void main(String[] args) {
		
		//추가)원하는 달(월)을 입력받아서 일수를 결정한다.
		
		int SU = 30, sum = 0;  // 유지보수 수월하게~
		
		double avg = 0; 
		double[] arr = new double[SU];
		System.out.println("일일 강수량 입력 하세요. ");
		
		
//		for (int i = 0; i < SU; i++) {
		for (int i = 0; i < arr.length; i++) 

		
		System.out.printf("4월 평균 강수량 : %.2f", avg);
		
	}
}
