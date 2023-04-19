package ex01.operator;

public class Operator {

	public static void main(String[] args) {
	
		//증감 연산자 ++, --
		int val;
		val = 10; 
		System.out.println(val); // 10
		
		//10에다가 1을 더해주려면 ?
//		val = val + 1; 대신 증감 연산자 이용 

//		val++; :  다른 연산 먼저 하고 val 연산 실행 
//		++val; :  val 연산 먼저 하고 다른 연산 실행
		
		System.out.println(val); // 10
		System.out.println(++val); // 11
		System.out.println(val); // 11 ( 위에 ++val 해줬으니까 !)
		
		
		val = 10;
		System.out.println(val); // 10 
		System.out.println(val++);// 10 **주의 ! val 이 먼저 실행 되니까 
		System.out.println(val); // 11 위에서 실행된 후 1이 더해진 값이 출력됨 ! 
		
		
		// 감소 연산 
		val = 10;
		System.out.println(val); // 10
		System.out.println(--val); // 9
		System.out.println(val); // 9
		
		val = 10;
		System.out.println(val); // 10
		System.out.println(val--); // 10
		System.out.println(val); // 9
		
//		<예시>
		
		//은행 대기번호 표 
		int wating = 0; // 첫손님 
		System.out.println("대기 인원: " + wating++); //대기 인원 : 0
		System.out.println("대기 인원: " + wating++); //대기 인원 : 1
		System.out.println("대기 인원: " + wating++); //대기 인원 : 2
		
		//총 대기인원이 몇명인지 확인 
		System.out.println("총 대기 인원: "+ wating); //총 대기 인원 : 3
		
		
	}

}
