package ex03.IO;

public class InputStreamEx {
	public static void main(String[] args) {
		
		System.out.println("input : "); 
		
//		int su;
		
//		while (su = System.in.read()) != -1) {} : error 예외처리 안했으니까
		
		try { //내가 특정 문자를 누를때 까지 입력을 받겠다.
			int su;
			
			while((su = System.in.read()) != -1) {	//while (su != -1) 왜 -1인가 ? -1를 리턴하기 때문 !!(PPT 내용에 있음)
				
				if(su == 10 || su ==13 || su ==32) continue;
				if( su== 113 || su == 81) break; //'q'  'Q'
				
				char ch = (char)su;
				System.out.println(ch);
			}
			
		}	
		catch(Exception e) {	
			e.printStackTrace();
		}
		
	}
}
