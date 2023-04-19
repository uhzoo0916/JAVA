package exercise;

public class _01_Array {

	public static void main(String[] args) {
		
		//변수 : 하나의 자료 
		//배열 : 여러개의 자료 
		//       같은 자료형의 값 여러개를 저장하는 연속된 공간
		
			//String 변수 4개 생성
			String coffeeRoss = "아메";
			String coffeeRachel = "카페모카";
			String coffeeChandler = "라떼";
			String coffeeMonica = "카푸치노";
		
//			<배열 선언 첫 번째 방법 >
//			String[] 배열 이름 = new String[배열를 몇개의 크기로 만들것인지];
			String[] coffee = new String[4];
			
//			<두 번째 방법 >
//			String coffees[] = new String[4];
			
//			coffees[index 값] = "아메리카노"; index 값 0부터 시작 !!!
//			coffees[0] = "아메리카노"; // 0부터 시작
//			coffees[1] = "카페모카";
//			coffees[2] = "라떼";
//			coffees[3] = "카푸치노";
			
//			<세 번째 방법>
//			 String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
			 
//			 <네 번째 방법>
			 String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
			
			
			 System.out.println("========================================");
			 
			 //커피 주문 
			 System.out.println(coffees[0] + " 하나"); //아메리카노 하나
			 System.out.println(coffees[1] + " 하나"); //카페모카 하나 
			 
			 coffees[2] = "에스프레소"; //값 변경 
			 System.out.println(coffees[2] + " 하나"); //라떼 하나
			 System.out.println(coffees[3] + " 하나"); //카푸치노 하나
			 
			 System.out.println("주세요");
			 
			 //다른 자료형 ?
			 
			 int[] i = new int[3];
			 
			 i[0] = 1;
			 i[1] = 2;
			 i[2] = 3;
			 
			 double[] d = new double[] {10.0, 11.2, 13.5};
			 boolean[] b = {true, true, false};			 
			 
	}

}
