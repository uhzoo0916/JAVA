package ex_while;

public class _02_NestedLoop {

	public static void main(String[] args) {
		
		// 이중 반복문 
		
		
		// 별(*)로 사각형  ex03_for 에 별 만들기 예제도 있음 
		
		for (int i =0; i <3; i++) {	//세로 길이 
			for(int j = 0; j < 5; j++) { //가로 길이 	
				System.out.print("*");
			} System.out.println(); //줄바꿈 
		}
		
		System.out.println("=========별 왼쪽 삼각형 만들기 =========");
		
		for(int i = 0; i < 5; i++) /* 첫번째 세로로 다섯개*/ {	
			for (int j = 0; j < i + 1 ; j++) { // 변하는 값 i를 이용하기 !
				System.out.print("*");
			} System.out.println();
	}
		
		System.out.println("=========별 오른쪽 삼각형 만들기 =========");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i - 1 ; j++) { // 비어 있는 공간을 이용 ! 
				// args.length 4 3 2 1 이 되어야함 
				System.out.print(" "); // 앞에 비어있는 공간 까지 코드 작성 완료 
			}
			for (int k = 0; k <= i; k++) {	
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
	}

}
