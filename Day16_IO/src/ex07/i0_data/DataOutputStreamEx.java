package ex07.i0_data;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamEx {

	public static void main(String[] args) 
						throws Exception { //예외처리 위임 
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file); //예외발생
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true); //예외 발생
		dos.writeChar(65); //아스키 코드 --> 'A'
		
		dos.writeShort(65);
		dos.writeChar(100);
		dos.writeInt(5000);
		dos.writeLong(88888888);
		dos.writeFloat(12.34f);
		dos.writeDouble(8.8);
		dos.flush(); //buffer 비우기 : 위에 데이터 입력하고 남는 값들을 비워냄 
		
		System.out.println("test.txt 파일에  " + dos.size() + "byte save"); //워크페이스 파일 들어가면 저장되어 있음 
		dos.close();
		
	}

}
 