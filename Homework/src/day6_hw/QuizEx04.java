//*
package day6_hw;

import java.util.Scanner;

public class QuizEx04 {
	public static void main(String[] args) {

		int[][] a = { { 3, 10, 2, 8 }, { 7, 15, 5, 3 }, { 0, 0, 0, 0 } }; // 0으로 초기화

		for (int i = 0; i < a[0].length; i++) {
			a[2][i] = a[1][i] + a[0][i]; // 0으로 초기화 되어 있는 값에 3+7,10+15,2+5,8+3으로 만듬
		} // for end

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
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