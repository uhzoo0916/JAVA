package ex06.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) 
					throws FileNotFoundException, IOException {  //
		
		//읽기 객체 - FileInputStream
		InputStream  is = new FileInputStream("C:\\Users\\hmis3\\Desktop\\브라이덜샤워"); //상대경로
		
		//쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("copy.png");  
		
		byte[] buffer = new byte[1024*8]; //buffer의 크기 (1024*8)만큼 읽어줘 
		
		long start = System.currentTimeMillis();  //시작시간 저장
		
		while(true) {
			int inputData = is.read();  //buffer의 크기 (100)만큼 읽어줘 
			if(inputData == -1 ) break;
			os.write(buffer, 0, inputData); // 0번째 위치 부터 inputDaa 까지 읽어줘
		}
		
		long end = System.currentTimeMillis(); //끝난시간 저장
		
		System.out.println(end - start);// 복사(작업)에 걸린 시간
		
		is.close();		os.close();
		System.out.println("copy success!!!");
	}
}



/*
package ex06.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) 
					throws FileNotFoundException, IOException {  //
		
		//읽기 객체 - FileInputStream
		InputStream  is = new FileInputStream("yuna.jpeg"); //상대경로
		
		//쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("copy.png");  
		
		long start = System.currentTimeMillis();  //시작시간 저장
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1 ) break;
			os.write(inputData);
		}
		
		long end = System.currentTimeMillis(); //끝난시간 저장
		
		System.out.println(end - start);// 복사(작업)에 걸린 시간
		
		is.close();		os.close();
		System.out.println("copy success!!!");
	}
}
*/









