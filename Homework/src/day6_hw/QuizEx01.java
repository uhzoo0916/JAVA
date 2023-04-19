package day6_hw;

//문제1] int[] arr = { 1, 7, 3, 7, 99, 7, 8, 55, 7, 90, 7 }; 

// 7 index의 위치를 찾아라 


public class QuizEx01 {
	public static void main(String[] args) {
		
		
		int[] arr = { 1, 7, 3, 7, 99, 7, 8, 55, 7, 90, 7 }; 
		int seek = 7, count = 0;
		
		//해당 데이터 있는 위치(인덱스)는?
		for (int i = 0; i < arr.length; i++) {
			if( seek == arr[i] ) count++; // count = count+1; count+=1;
		
		} 
		
		
		System.out.println("{ 1, 7, 3, 7, 99, 7, 8, 55, 7, 90, 7 }에서 7의 개수 : " + count );
		System.out.println("위치(인덱스) : ");
	}
}
