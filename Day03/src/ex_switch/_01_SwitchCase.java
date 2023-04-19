package ex_switch;

public class _01_SwitchCase {

	public static void main(String[] args) {
		
		//Switch Case
		
		//석차에 따른 장학금 지급 
		// 1등 : 전액 장학금
		// 2등 : 반액 장학금
		// 3등 : 반액 장학금
		// 그 외 : 장학금 대상 아님 
		
		//If Else 문 이용 ( 여러 조건, 범위)
		
		int ranking = 2; // 등수 여기서 바꿀때 마다 다른 값 출력됨 
		if (ranking == 1) {	
			System.out.println("전액 장학금");
		} else if (ranking == 2 || ranking == 3) {	
			System.out.println("반액 장학금");
		} else {	
			System.out.println("장학금 대상 아님 ");
		}
		System.out.println("조회 완료 #1");
		
		//Switch Case 문을 이용 (명확한 케이스가 있는 경우)
		
		/*
        switch ( expression ) { 
		 * case A : ..수행할 명령 
		 * 	break; 
		 * case B : ..수행할 명령 
		 * 	break;
		 * case C : ..수행할 명령 
		 * 	break; 
		 * default : ... 수행 할 명령 
		 */
		
		ranking = 1 ;
		switch (ranking) {
			case 1 : 
				System.out.println("전액 장학금");
		  		break; 
			case 2 : 
				System.out.println("반액 장학금");
				break;
			case 3 : 
				System.out.println("반액 장학금");
				break; 
		  default : System.out.println("장학금 대상 아님");
		}
		
		System.out.println("조회 완료#2");
		
		// <case 2와 3 통합> 
		// 	case 2:
		//  case 3: .. 수행할 명령 
		//      break; 
		
		System.out.println("=======================================");
		
		
		//중고 상품의 등급에 따른 가격을 책정(1급 : 최상, 4급 : 최하)
		
		int grade = 3; //등급
		int price = 7000; //기본 가격 
		
		switch (grade) 	{	
			case 1:
				price += 1000; // price = price + 1000;
			case 2:
				price += 1000; 
			case 3:
				price += 1000;
				break;
		}	
		
		System.out.println(grade + "등급 제품의 가격 : " + price + "원");
		// 1등급 제품의 가격 : 10000원
		// 2등급 제품의 가격 : 9000원
	}

}
