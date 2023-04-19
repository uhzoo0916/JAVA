package ex_while;

public class _02_DoWhile {

	public static void main(String[] args) {
		
		//반복문 Do While
		
		int distance = 25; // 수영장 전체거리 25m
		int move = 0; // 현재 이동 거리 0m
		
		//25m - 사람 키 
		int height = 2; // 키 2m
		
		while(move + height < distance) {	
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리 :" + move);
			move += 3; // 3m 씩 이동 
		}//move 가 24가 되어 버리면 while(조건) 조건에 거짓 ! 
		
		System.out.println("도착 했습니다.");
		System.out.println("========================반복문 #1=======================================");
		
		//키가 엄청나게 큰 사람?
		
		move = 0; 
		height = 25;
		
		while(move + height < distance) {	
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리 :" + move);
			move += 3; // 3m 씩 이동 
		}
		System.out.println("도착했습니다."); // 이미 범위를 벗어났기 때문 
		
		System.out.println("========================Do While 반복문 =======================================");
		
		/*
		 * do {
		 * 
		 * 
		 * } while (조건);
		 */
		
		
		do {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리 :" + move);
			move += 3; // 3m 씩 이동 	
			
		} while(move + height < distance);
		
		//한번은 수행이 됨 !! 위에는 수행이 안되고 바로 도착했습니다 로 나왔는데 
		
		
	}

}
