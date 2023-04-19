package day3_quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_UpperLower {

	public static void main(String[] args) {
		

        System.out.print("알파벳을 입력하세요: ");
        
        //문자열을 char 배열로 변환해서 alphabet 이라는 변수에 저장
        
        char[] alphabet = new Scanner(System.in).next().toCharArray(); 
        System.out.print(Arrays.toString(alphabet) + " → "); //출력 : [알파벳] -> A

        for (int i = 0; i < alphabet.length; i++) {
            
        	if (alphabet[i] >= 65 && alphabet[i] < 97) {
                alphabet[i] += 32;
                System.out.print(alphabet[i]);
            }
        	else if (alphabet[i] >= 97 && alphabet[i] < 123) {
                alphabet[i] -= 32;
                System.out.print(alphabet[i]);
            } 
        	else {
        		System.out.println("\n알파벳이 아닌 문자가 입력되어 프로그램을 종료합니다.");
        		System.exit(1);}
		
        }
	}

}

//tocharArray() : 배열을 생성해서 처리 하는 메소드.
//문자열을 한글자씩 쪼개 char 타입의 배열에 집어넣어 반환 해주는 메소드 
