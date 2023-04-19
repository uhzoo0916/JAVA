package ex_If;

public class _02_else {

	public static void main(String[] args) {
		
		//조건문 If Else
		int hour = 10;  //hour 15로 바꾸면 디카페인 출력 됨 
		if (hour < 14) {	// 오후 2시 이전이면 
			System.out.println("아이스 아메리카노 +1");
		} else {	// 그 외의 경우이면 
			System.out.println("아이스 아메리카노 (디카페인) + 1");
		}
		System.out.println("커피 주문 완료 #1");
		
		System.out.println("=======================================");
		
		//오후 2시 이후 이거나 모닝 커피를 마신 경우 ?
		
		hour = 15; 
		boolean moringCoffee = true;
		if (hour >= 14 || moringCoffee) {	
			System.out.println("아이스 아메리카노 (디카페인) + 1");
		} else {	//그 외 경우 
			System.out.println("아이스 아메리카노 + 1");
		}
		System.out.println("커피 주문 완료 #2 ");
		
		System.out.println("=======================================");
		
	
		
	}

}
