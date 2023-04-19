package ex_If;

public class _01_if {

	public static void main(String[] args) {
		
		//조건문 if
		
		int hour = 15; // 오전 10시 
		
		//if 문 내에서 하나의 문장을 실행할 때는 {} 생략 가능 
		if(hour < 14)
			System.out.println("아이스 아메리카노 +1");
		
//		if(조건)
//			..수행할 명령..
		
		//if 문 내에서 2개 이상의 문장 실행할 때는 {} 필수 
		
		if(hour < 14) {
			System.out.println("아이스 아메리카노 +1");
			System.out.println("샷추가");
			}
		
		System.out.println("커피 주문 완료 #1");
		
		//hour 가 15일때는 샷추가만 실행이 됨 if 사용할때 if 조건이 참일때 하나 
		//인 경우에는 그 다음줄만 출력됨 {} 을 이용해 if를 감싸줘야 함

		System.out.println("==========================================");
		
		//오후 2시 이전, 모닝 커피를 마시지 않은 경우 
		hour = 10;
		boolean morningCoffee = false; //모닝 커피 
//		if( hour < 14  && morningCoffee == false) //and
		if( hour < 14  && !morningCoffee ) {	
			System.out.println("아이스 아메리카노 + 1");
		}
		System.out.println("커피 주문 완료 #2 ");
		
		//hour 를 15 시로 바꾸면 "커피 주문 완료" 만 출력됨 
		
		System.out.println("==========================================");
		
		//오후 2시 이후이거나 모닝 커피를 마신 경우 
		
		hour = 15;
		morningCoffee = true;
		if(hour >= 14 || morningCoffee == true ) {	
			System.out.println("아이스 아메리카노 (디카페인) +1");
		} //or 연산자 이용
		System.out.println("커피 주문 완료#3 ");
		
		//만약 hour 10 이여도 or 연산자 니까 똑같이 출력 됨 !
		
	}

}
