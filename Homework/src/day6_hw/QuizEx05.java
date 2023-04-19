//*
package day6_hw;

import java.util.Scanner;

public class QuizEx05 {
	public static void main(String[] args) {

		int[][] a = new int[3][4];
		Scanner sc = new Scanner(System.in);

		//System.out.println("array data 2row, 3col = ");
		// input
		for (int i = 0; i < a.length; i++) { // row , 배열명.length <---- 행의길이
			for (int j = 0; j < a[i].length; j++) { // col , 배열명[행크기].length <---- 열의길이
//				System.out.print("a[" + i + "][" + j + "] = ");
//				a[i][j] = sc.nextInt();
				a[i][j] = (int)(Math.random() * 100)+1;
			} // j end
		} // i end

		for (int i = 0; i < a[0].length; i++) {
			a[2][i] = a[1][i] + a[0][i]; 
		} // for end

		// output
		for (int i = 0; i < a.length; i++) { // row
			for (int j = 0; j < a[i].length; j++) { // col
				System.out.print(a[i][j] + "\t");
			} // j end
			System.out.println();
		} // i end
	}
}
//*/

/*
package quiz;

import java.util.Scanner;

public class QuizEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][4];

		for (int i = 0; i < a.length; i++) {  // row
			for (int j = 0; j < a[i].length; j++) {  // col
				System.out.println("a[" + i + "][" + j + "] = ");

				if (i == 2) {
					a[2][j] = a[0][j] + a[1][j];
				} else
					a[i][j] = sc.nextInt();
			} // j end
		} // i end

		System.out.println();

		// output 출력 하면 됨
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
//				System.out.println("a[" + i + "][" + j + "] = ");
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
//*/