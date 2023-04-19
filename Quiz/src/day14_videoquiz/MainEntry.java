package day14_videoquiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class MainEntry {
	
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Video> videos = new HashMap<> ();
		//map 이라는 객체를 생성 intger로 아까 정의한 i를 받고 video 라는 value 값
		while(true) {	
			System.out.println("숫자 입력 ");
			System.out.println("1.video 추가 2. video 삭제 3.video 리스트 출력 4. 수정 5. 프로그램 종료");
		
			int num = sc.nextInt();
			
			switch (num) {
				case 1: { //video 추가 
					System.out.print("추가할 정보를 입력하세요");
					System.out.print("1. 제목 2. 장르 3. 대여 여부 4. 이름");
					Video video = new Video(sc.next(), sc.next(), sc.nextBoolean(), sc.next());
					Controller.addVideo(videos, video);
					break;
			}
				case 2: { //video 삭제
					System.out.println("삭제할 번호를 입력하세요");
					Integer i = new Integer(sc.nextInt());
					Controller.removeVideo(videos, i);
					break;
			}
				case 3: { //video 리스트 출력
				System.out.println("video 리스트 출력 ");
				Controller.listVideos(videos);
					break;
			}
				case 4: { //수정
				Controller.listVideos(videos);
				System.out.println("수정할 정보를 입력하세요");
				System.out.print("1. 제목 2. 장르 3. 대여 여부 4. 이름");
				Integer i = new Integer(sc.nextInt()); // 정수 정의 계속 해줘야함 
				
				Video video = new Video(sc.next(), sc.next(), sc.nextBoolean(), sc.next());
				Controller.updateVideo(videos, i, video);
				break;
			}
				case 5: { //프로그램 종료 
					System.exit(0);
					break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + num);
			}//switch 종료 
		
		
		}//while 종료 
	 
	}
}
