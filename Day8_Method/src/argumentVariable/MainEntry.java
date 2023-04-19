package argumentVariable;

import java.util.Arrays;

public class MainEntry {	
	public static void main(String[] args){
		
	     System.out.println(plus(1));
	        System.out.println(plus(1, 2, 3));//1+2+3
	        System.out.println(plus(1, 2, 3, 4, 5)); //1+2+3+4+5
	        System.out.println(plus("A", "B", "C", "D"));
	    }

	    private static int plus(int... ints) {
	        return Arrays.stream(ints).sum(); //int 값들의 합을 출력하는 스트림 생성
	    }

	    private static StringBuilder plus(String... strings) { //문자열 더함
	        StringBuilder stringBuilder = new StringBuilder();
	        Arrays.stream(strings).forEach(stringBuilder::append);
	        return stringBuilder;
		
	}
}