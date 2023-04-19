package day6_hw;

import java.util.Scanner;

// 문제3] 임의의 2차원 배열에 데이터 입력 받아서, 입력 받은 값 출력하기
public class QuizEx03 {
	public static void main(String[] args) {
		
		int[][] a = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
//		int su = sc.nextInt();
//		String str = sc.next();
//		
//		int[] arr = new int[30];
//		
//		arr[0] = sc.nextInt();
//		arr[1] = sc.nextInt();
//		...
//		arr[29] = sc.nextInt();
//		
//		for(int i=0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		System.out.println("array data 2row, 3col = ");
		//input
		for (int i = 0; i < a.length; i++) {  // row ,    배열명.length  <---- 행의길이
			for (int j = 0; j < a[i].length; j++) {  // col ,   배열명[행크기].length  <---- 열의길이
				System.out.print("a["+i+"]["+j+"] = ");
				a[i][j] = sc.nextInt();
			} // j end
		} // i end
		
		System.out.println();
		
		//output
		for (int i = 0; i < a.length; i++) {  // row
			for (int j = 0; j < a[i].length; j++) {  // col
				System.out.print(a[i][j] + "\t");
			} // j end
			System.out.println();
		} // i end
	}
}	









