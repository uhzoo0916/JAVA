package ex_break;

public class _01_Break {

	public static void main(String[] args) {
		
		// Break
		
		//치킨 집 에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
		
		//For 문 
		int max = 20;
		for (int i = 1; i <= 50; i++) { //i는 1부터 50명 까지 조건을 만족했을때 
			System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
			if ( i == max ) {	// i가 20마리가 되면 재료 소진 출력 
				System.out.println("금일 재료가 모두 소진되었습니다.");
				//여기 까지 작성하면 50번 손님까지도 계속 반복됨 20마리 넘어서 출력되는걸 막아야함 ! 
				break;
			}
		}
		
		System.out.println("영업을 종료합니다.");
		
		System.out.println("======================================================");
		
		//While 문
		
		int index = 1; //손님 대기 번호
		while (index <= 50) {	
			System.out.println(index + "번 손님, 주문 하신 치킨 나왔습니다.");
		if (index == max ) {	
			System.out.println("금일 재료가 모두 소진 되었습니다.");
			break;
			}
			index++;
		}
		System.out.println("영업을 종료합니다.");

			
	}

}
