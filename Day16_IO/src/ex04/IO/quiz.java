package ex04.IO;

/*
문제 1] 사칙 연산 프로그램 작성하기 io 객체 이용하기 
reulst > su1 = 3
		su2 = 5
		op = *
		
		3 * 5 = 15
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz {
	public static void main(String[] args) 
			
			throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("값을 입력하세요 : ");
		
		System.out.print("su1 = ");		
		int su1 = Integer.parseInt(br.readLine());		
		System.out.print("su2 = ");		
		int su2 = Integer.parseInt(br.readLine());
		
		System.out.println("연산자를 입력하세요 : ");
		System.out.print("");
		String str = br.readLine();
		
		double result = 0;
		
		
		switch(str) {	
			case  "+" :
				result = su1 + su2;
				break;
			case  "-" :
				result = su1 - su2;
				break;
			case  "*" :
				result = su1 * su2;
				break;
			case  "/" :
				result = su1 / su2;
				break;

		} System.out.println(su1 + str + su2 + "=" + result);
	}
} 
