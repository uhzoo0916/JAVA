package ex_If;

public class _03_elseif {

	public static void main(String[] args) {
		
		//조건문 elseif
		
		// 한라봉 에이드 +1 
		// 또는 망고 주스 있으면 +1
		// 또는 아무것도 없으면 아이스 아메 +1

		boolean hallabong = true; //false 이면 망고주스 출력 
		boolean mango = true; //위아래 둘다 false 이면 아아 출력 
		
		if (hallabong ) {	
			System.out.println("한라봉 에이드 + 1");
		} else if (mango) {	
			System.out.println("망고 주스 +1");
		} else {	
			System.out.println(" 아이스 아메리카노 +1");
		}
		
		System.out.println(" 커피 주문 완료+1");
		
		
		System.out.println("==========================================");
		//else if 는 여러번 사용 가능 
		
		boolean lemon = false;  
		boolean grape = false; 
		boolean orange = true;
		
		if (lemon ) {	
			System.out.println("레몬 에이드 + 1");
		} else if (grape) {	
			System.out.println("포도  주스 +1");
		} else if(orange) {	
			System.out.println(" 오렌지 주스 +1");
		} else {	
			System.out.println(" 아이스 아메리카노 +1");
		}  //else 없어도 똑같이 출력됨 ! 
		
		System.out.println(" 커피 주문 완료+1");
		
		
	}

}
