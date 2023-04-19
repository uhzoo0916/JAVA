package day6_hw;

/*문제2) 4월 한달간의 강수량을 입력 받아서 평균 구하기 
 강수량은 입력 받는 값 4월 30일까지 있으니까 1일부터 30일 강수량 입력받은 
값을 다 더해서 /30 을 한 값이 평균 
*/


import java.util.*;

public class exercise {
	public static void main(String[] args) {
		
		int su =30; //4월 30일까지 
		int sum =0; 
		
		double avg =0;
		double arr[] = new double[su];
		
		for(int i = 0; i < su; i++) {	
			System.out.println(i+1); //1 일 부터 시작이니까 
			
			arr[i] = new Scanner(System.in).nextDouble();
			sum += arr[i];
			avg = (double)sum / arr.length;
			
		}
		System.out.printf("4월 평균 강수량 : %.2f", avg);

	}
}


