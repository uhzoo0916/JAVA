package ex04.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferReaderEx {

	public static void main(String[] args)  throws IOException {//readline 에러 나니까 위임 해줌 
		/*
		 * 따로 구현 하는 법 
		InputStream is = System.in;
		
		//		Reader reader = new : error 뜸 추상 클래스라 자체적으로 객체 생성 안됨 
		Reader reader = new InputStreamReader(is); //inputstream 객체 is 받아옴 
		
		BufferedReader br = new BufferedReader(reader);
		
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //위에 주석이랑 같은 코드 
		
		System.out.println("charactor input = ");
		String str = br.readLine(); // 예외 발생, 여러개의 데이터 입력 받기 
		
		System.out.println(str);
	}

}
//BufferedReader : character 단위로 입력 받는다 
//lock 이라는 필드를 가지고 있음
// 생성자 함수는 반드시 무언가를 가지고 들어와야함 : read()/ readlint() 같은 것 
//read() : int -> 단일화 된 문자만 받음 
// readline() : string ->line 단위가 text 이므로 return 하려면 string 타입으로 형 변환 해줘야함 


//readline() : 도 예외 처리 해줘야함 !! 