package ex04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {

	public static void main(String[] args) { // 예외 처리를 JVM에게 위임
        int x, y, result;

        System.out.print("x, y = ");
        x = new Scanner(System.in).nextInt();
        y = new Scanner(System.in).nextInt();

        result = x / y; // 에러 발생 가능

        System.out.println(result);

	}

}
