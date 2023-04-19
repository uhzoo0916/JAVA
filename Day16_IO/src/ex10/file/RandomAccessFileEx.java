package ex10.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args)
	throws FileNotFoundException, IOException{ //
		
		
//		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");//sawon 파일 없으면 에러뜸 
		//sawon 이 없으면 r이라는 파일이 생성 
		
		for (int i = 0; i < 10; i++) { //파일안에 txt 파일이 생성되는 코드 
			raf.seek(i * 100);
			String str = "hello";
			raf.writeUTF(str);
			//raf.writeInt(i); //첫번째 위치에 0번 100번째 위치에 2번 . . file 불러옴 
		}
		
			for (int i = 0; i < 10; i++) {
				raf.seek(i * 100); //seek method 예외 발생 ! 
//				System.out.println(raf.readInt()); //console에 출력되는 코드 
				System.out.println(raf.readUTF());
			}
			System.out.println("string print success!!");
			raf.close();
	}

}
