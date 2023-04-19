package day6_quiz;

import java.util.Arrays;

//열간 곱 구하는 퀴즈 
//[ 5 (x) 7 (=) 35]
public class MainEntry {
	
	public static void main(String[] args) {
		
		int[][] intArr2= {{1, 2, 0}, {5, 7, 0}}; //초깃값 설정 
		
		System.out.println("===================================");
		System.out.println("배열의 행 크기: " + intArr2.length);
		System.out.println("배열의 열의 크기: " + intArr2[0].length);
		
		for (int i = 0; i < intArr2.length; i++) {
			intArr2[i][2] = intArr2[i][0] * intArr2[i][1];
			
			
		}
		
	}
}
