package ex03.operator;

public class Operator01 {

	public static void main(String[] args) {
		
		//비교 연산자 
		
		System.out.println(5 > 3); // 5는 3보다 크다 (참이면 true 거짓이면 false)
		System.out.println(5 >= 3); // 5는 3보다 크거나 같다. (true)
		
		System.out.println(5 >= 5); // 5는 5보다 크거나 같다 
		System.out.println(5 >= 7); // 5는 7보다 크거나 같다 (false)
		
		System.out.println("====================================");
		// 작다 <, 작거나 같다 <= 로 하면 됨 
		
		System.out.println(5 == 5); // 왼쪽 값 오른쪽 값 같은지 비교 
		System.out.println(5 == 3); //false 
		
		System.out.println(5 != 3); //!= : 같지 않다 true 
		
		System.out.println("====================================");
		
		//논리 연산자 
		boolean 김치찌개 = true;
		boolean 계란말이 = true;
		boolean 제육볶음 = true;
		
		
		System.out.println(김치찌개 || 계란말이 || 제육볶음); //하나라도 true 이면 true (괜춘한 식당)
		System.out.println(김치찌개 && 계란말이 && 제육볶음 ); // 모두 true 이면 true  ( 최고의 식당)
		
		System.out.println("====================================");
		   //and 연산 
		System.out.println((5>3) && (3>1)); //5는 3보다 크고 , 3은 1보다 크다 (true)
		
		  // or 연산 
		System.out.println((5>3) || (3>1)); // 5는 3보다 크거나, 3은 1보다 크다 (true) 
		System.out.println((5<3) || (3<1)); // 5는 3보다 크거나, 3은 1보다 크다 (false) 두 조건 다 false 일 때 false 출력  
		
		System.out.println("====================================");
		
		//논리 부정 연산자 
		System.out.println(!true); //false
		System.out.println(!false); //true
		System.out.println(!(5 == 5)); //false 
		System.out.println(!(5 == 3)); //true 
	}

}
