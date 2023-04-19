package list;

import java.util.*; 
class ArrayListEx2 { 
	public static void main(String[] args) { 
		final int LIMIT = 10;	
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		int length = source.length(); //문자열(String) 길이 구함 14출력됨
		
		System.out.println(length/LIMIT + 10);
		
		
		List list = new ArrayList<String>(); //14만큼의 공간이 생김 
		
		for(int i=0; i < length; i+=LIMIT) { 
			
			if(i+LIMIT < length ) 
				list.add(source.substring(i, i+LIMIT));  //i를 10만큼씩 공백 (10개씩 끊어서 보여줘)
			else 
				list.add(source.substring(i)); 
		} 
		for(int i=0; i < list.size(); i++) { 
			System.out.println(list.get(i)); 
		} 
	} // main()
} 