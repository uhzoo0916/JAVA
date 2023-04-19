package ex02.datatype;

public class MainEntry {
	
	static int Num; //전역 변수는 자동으로 초기화 된다.
	static String str;
	
	public static void main(String[] args) {
		
		int y =99; //지역 변수는 사용하기 전에 반드시 초기화 해햐 한다.
		System.out.println(y);
		
		System.out.println("static value" + Num + ", " + str);
		
		int su = 30; 
		System.out.println(su); //4byte
		System.out.println(100); // 4byte
		
		long num = 20;
		System.out.println(num); //8byte
		System.out.println(1000L); //long
		
		double d = 12.34;
		System.out.println(d); 
		System.out.println(34.56); //double(디폴트)
		System.out.println(12.34f); //float은 디폴트가 아니므로 f/F를 붙여야 표현 가능 
		
		float f = 12.34f; //소수의 default 표현은 double 이므로, float를 선언 하려면 f/F 를 반드시 붙여야함 
		System.out.println(f);

	} //end main

}//class end 
