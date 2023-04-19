package ex02.datatype;

public class String01 {

	public static void main(String[] args) {
		
		// 문자열 정의 
		String s = "I like Java and Python and C.";
		System.out.println(s);
		
		//문자열의 길이 .length()
		System.out.println(s.length()); // 공백도 같이 포함됨  29
		
		//대소문자 변환 
		System.out.println(s.toUpperCase()); //대문자로 변경 
		System.out.println(s.toLowerCase()); //소문자로 변경 
		
		System.out.println("==============================================");
		
		//문자열 사이에 어떤 값이 포함 되어 있는지 → 포함 관계
		
		System.out.println(s.contains("Java")); //Java가 포함되어 있으면 true 출력 아니면 false
		System.out.println(s.indexOf("Java")); //Java의 문자열 위치 0부터 시작하는거 주의 !! 
		System.out.println(s.indexOf("c#")); // 포함되지 않는 다면 -1을 반환함 
		
		System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치 정보 
		System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true 
		System.out.println(s.endsWith(".")); // 이 문자열로 시작하면 true 
		
		
	}

}
