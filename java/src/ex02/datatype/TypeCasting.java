package ex02.datatype;

public class TypeCasting {

	public static void main(String[] args) {
		//형변환 TypeCasting 
		//정수형에서 실수형으로
		//실수형에서 정수형으로 
		
		//int score = 93 + 98.3 으로 하면 error 정수형 + 소수형 data 는 error 형 변환이 필요 
		
		//int to float, double 
		int score = 93; //정수형 data 입력 
		System.out.println(score); //93
		System.out.println((float) score); // 소수형으로 형 변환 93.0
		System.out.println((double) score); // double 으로 형 변환 93.0
		
		
		//float, double to int
		float score_f = 94.3F;
		double score_d = 98.8;
		
		System.out.println((int) score_f); // 94
		System.out.println((int) score_d); // 98 

		//정수 + 실수 연산 
		score = 93 + (int)98.8; //93 + 98 = 191 값이 score 에 저장됨 
		System.out.println(score);
		
		score_d = 93 + 98.8; //error 가 뜨지 않음 93이 자동으로 double 로 변환됨 ! 
		System.out.println(score_d); // 191.8 
		
		// 변수에 형 변환된 데이터 집어 넣기 
		double convertedScoreDouble = score; //191 → 191.0
		System.out.println(convertedScoreDouble);
		
		//int - > long -> float -> double (자동 형 변환)
		
		int convertedScoreInt = (int)score_d; 
		// double -> float -> long -> int (수동 형 변환) (형) 붙여줘야함 !!!! 
		
		
		//숫자 데이터를 문자열로 변환 
		String s1 = String.valueOf(93); //93 이라는 정수를 문자열로 바꾼다.
		s1= Integer.toString(93); //위에 코드와 동일 toString 함수 이용 ! 
		System.out.println(s1);
		
		String s2 = String.valueOf(98.8);
		s2 = Double.toString(98.8);// 위 코드와 동일 
		System.out.println(s2);
		
		//문자열을 숫자로 
		
		int i = Integer.parseInt("93");
		System.out.println(i);
		
		double d = Double.parseDouble("98.8");
		System.out.println(d);
	
	}

}
