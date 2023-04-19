package ex_continue;

public class _01_Continue {

	public static void main(String[] args) {
		// Continue

		
		// 치킨 주문 손님 중에 노쇼 손님이 있다고 가정
		// For
		
		int max = 20; //최대 치킨 판매 수량
		int sold = 0; // 현재 치킨 판매 수량
		int noShow = 17; //대기번호 17번 손님이 노쇼
		
		for (int i = 1; i <= 50; i++) {	
			System.out.println(i + "번 손님, 주문 하신 치킨 나왔습니다.");
			
			//손님이 없다면? (noShow)
			if(i == noShow) {	
				System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
				continue; //여기까지 코드가 실행 된 후 18번 동작이 다시 위에가 실행됨 
			}
			
			sold++; //판매 처리 
			
			if (sold == max) {	
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
	
	// break 는 만나자 마자 반복문이 멈추고 continue 는 그 다음 회차로 다시 반복문이 돌아감 
		
		
		System.out.println("======================while 문 =============================");
		
		//While 문 
		int index = 1; //손님 번호 
		while(index <= 50) {	
			System.out.println(index + "번 손님, 주문 하신 치킨 나왔습니다.");
			
			//손님이 없다면? 노쇼
			
			if(index == noShow) {	
				System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어 갑니다. ");
			
			}
			
			sold++; //판매 처리 
			
			if(sold == max) {	
				System.out.println("금일 재료가 모두 소진 되었습니다.");
				break;
			} 
			index++;
		}
		System.out.println("영업을 종료 합니다 ");
	}

}
