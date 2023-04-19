package exercise;

public class _03_MultiArray {

	public static void main(String[] args) {
		
		// 다차원 배열 (2차원 배열) deepToString 메소드 이용
		
		// 소규모 영화관 좌석
		// A1- A5
		// B1 - B5
		// C1 - C5
		
		String[] seatA = {"A1", "A2", "A3", "A4", "A5"};	
		String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
		String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
		
		//3 x 5 크기의 2차원 배열 (직사각형 형태)
		
		String[] [] seats = new String[][] { 
			{"A1", "A2", "A3", "A4", "A5"},
			{"B1", "B2", "B3", "B4", "B5"},
			{"C1", "C2", "C3", "C4", "C5"}	
			
	
		};
			
		// B2 에 접근 하려면?
		System.out.println(seats[1][1]);
		
		//C5 에 접근 하려면?
		System.out.println(seats[2][4]);
		
		//첫 줄에는 3칸, 둘째 줄 에는 4칸ㄴ, 셋째 줄 에는 5칸 
		
		String[][] seats2 = {	
				{"A1", "A2", "A3"},
				{"B1", "B2", "B3", "B4"},
				{"C1", "C2", "C3", "C4", "C5"}				
		};
			
		//A3 에 접근 하려면?
		System.out.println(seats2[0][2]); 
		
		//A5 도 접근 가능?
//		System.out.println(seats[0][4]); error : array의 범위를 벗어남 
		
		//3차원 배열 만들기 
//		String[][][] marray = new String [][][] {
//					}

	}
}
