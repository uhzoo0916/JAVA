package ex03.operator;

public class Operator02 {

	public static void main(String[] args) {
		
//		<삼항 연산자> 
//		결과 = (조건) ? (참의 경우 결과 값) : (거짓의 경우 결과 값) 
		
		int x = 5; 
		int y = 3;
		int max = (x > y) ? x : y; // x가 y 보다 크다면 x 값 5를 출력 아니라면 y 값 3을 출력
		System.out.println(max); // 5
		
		int min = (x < y) ? x : y; //x 가 y 보다 작다면 x 값 출력 아니라면 y 값 3을 출력 
		System.out.println(min); // 3
		
		boolean b = (x == y) ? true : false ;
		System.out.println(b); //false 
		
		
		String s = (x != y) ? "달라요" : "같아요";
		System.out.println(s); //달라요 

			
	
	}

}
