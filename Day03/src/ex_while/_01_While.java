package ex_while;

public class _01_While {

	public static void main(String[] args) {
		
		// 반복문 while : 어떤 조건이 참인 동안 계속해서 수행 
		
		// 수영장에서 수영을 하는 모습
		int distance = 25; //전체 거리 25m
		int move= 0; // 현재 이동 거리 0m
		
		while( move < distance /*조건*/ ) { 	
			// 현재 이동 거리가 전체 거리 보다 작다는 조건이 참인 동안 반복 수행 
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리 :" + move);
			move += 3; // 3미터 이동
		}
		
		System.out.println("도착 하였습니다.");  // 27은 25보다 작다는 조건에 거짓 
		
		
		//무한 루프 
		
		move = 0;
		
		while( move < distance /*조건*/ ) { 	
			// 현재 이동 거리가 전체 거리 보다 작다는 조건이 참인 동안 반복 수행 
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리 :" + move);
			
			System.out.println("도착 하였습니다.");
			
		}

	}
	
}
