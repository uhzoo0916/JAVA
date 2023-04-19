package day11_quiz;

import java.util.Scanner;

class Rect {
	    public static void main(String[] args) {
	        
	    	Scanner sc = new Scanner(System.in);

	        int a = sc.nextInt(); // 가로 길이 

	        int b = sc.nextInt(); // 세로 길이 
	        
	       
			for (int i =0; i <b; i++) {	//세로 길이 
				for(int j = 0; j < a; j++) { //가로 길이 	
					System.out.print("*");
				} System.out.println(); //줄바꿈 

			}
	    }
}
	   

