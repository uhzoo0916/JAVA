package ex05.file;

import java.util.*;
import java.io.File;
import java.io.*;

public class FileInformation {

	public static void main(String[] args) 
					throws IOException {


		File file = null;
		byte[] fileName = new byte[100];
		
		
		
		String strName;
		System.out.println("file name = "); //상대 경로 : 
								//절대 경로 - 다른경로에 있을 때 풀 네임을 써줘야함 해당하는 파일이 있는 실제 경로르르다 써줘야함 
		
		
	   System.in.read(fileName); //예외 발생
	   strName = new String(fileName).trim(); //위에서 읽어낸 파일 이름 문자열로 변환
	   
	   file = new File(strName);
	   
	   System.out.println("절대 경로 : " + file.getAbsolutePath());
	   System.out.println("표준 경로 : " + file.getCanonicalPath());
//	   System.out.println("최종 수정일 : " + file.lastModified()); //날짜 타입이 아니라 0으로 출력됨 
	   System.out.println("최종 수정일 : " + new Date(file.lastModified()));
	   System.out.println("파일 크기 : " + file.length());
	   System.out.println("읽기 속성 : " + file.canRead());
	   System.out.println("쓰기 속성 : " + file.canWrite());
	   System.out.println("파일 경로 : " + file.getPath());
	   System.out.println("숨김 경로 : " + file.isHidden());
	}

}
