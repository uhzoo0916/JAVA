package ex_for;

public class _01_for {

	public static void main(String[] args) {
		
		// 반복문 for
		// 나코 매장 
		System.out.println("어서오세요. 나코 입니다.");
		//또다른 손님이 들어오면?
		System.out.println("어서오세요. 나코 입니다.");
		System.out.println("어서오세요. 나코 입니다.");
		System.out.println("어서오세요. 나코 입니다.");
		// 만약에 인사 법이 바뀌면?
		System.out.println("환영합니다. 나코 입니다.");
		System.out.println("환영합니다. 나코 입니다.");
		//매장 이름이 바뀌면 ? 
		System.out.println("환영합니다. 코나 입니다.");
		System.out.println("환영합니다. 코나 입니다.");
	
		// 복잡 복잡
		
		System.out.println("=========반복문 사용=========");
		//반복문 사용 For
		// for(선언 ; 조건 ; 증감 ) {	
		//			... 수행 명령 ... }
		
		for(int i = 0; i < 10; i++) {// i가 10보다 작은 동안 증가 시켜 가면서 반복 
			System.out.println("어서오세요. 나코 입니다." + i);
//			System.out.println("환영합니다. 나코 입니다." + i);
// 			System.out.println("어서오세요. 코나 입니다." + i);			
		}
		
	
		System.out.println("===========짝수만 출력===============");
		
		//짝수만 출력 (for 쓰고 ctrl + space)
		
		for (int i = 0; i < 10 ; i += 2) {
			System.out.println(i); //ln 빠지면 줄바꿈 안됨 
			
		}
		
		System.out.println("===========홀수만 출력===============");
		
		//홀수만 출력 
		
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("===========거꾸로 숫자 ===============");
		
		// 거꾸로 숫자 
		
		for (int i = 5; i >0 ; i-=1) {//i가 0보다 크다는것을 만족하는 동안 
			System.out.println(i); //5, 4, 3, 2, 1
		}
		
		System.out.println("==========1부터 10까지 수들의 합 ===============");
		// 1부터 10 까지의 수들의 합 
		//1 + 2 + ... + 10 = 55
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			
			sum += 1;
			System.out.println(" 현재 까지 총 합은 " + sum + "입니다. ");
		}
		
		System.out.println("1부터 10 까지의 모든 수의 총 합은 " + sum + "입니다.");
	}

}
