package ex04.inheritance;

import java.util.Scanner;

public class Circle extends Shape { //Sub class 

		//생성자 부터 시작 원 그리기 
	
		public Circle() {	
			
			super(2, 3); // 반드시 첫 줄에 와야한다 
			
			Scanner sc = new Scanner(System.in);
			System.out.print("반지름 값은 =");
			
			this.w = sc.nextInt();
		}
		
		
		public double calc() {	
			
			this.result = (w * w * Math.PI); //어차피 결과는 double
			return result;
		}
		
		public void show( ) {	
			System.out.println("반지름 ="+ w + ", 원의 넓이 =" +  calc()) ;
		}
}
