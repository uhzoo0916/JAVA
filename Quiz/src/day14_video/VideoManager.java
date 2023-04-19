package day14_video;


import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.HashMap;

public class VideoManager {  // contoller
	
	HashMap<Integer, Video> videoMap = new HashMap<>();//비디오 객체가 들어올 map 생성 
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm");  //short 타입 연도 2개 넣으니까 

	// 시스템에 새 비디오 삽입.
	public void insert(String title, String cat) { //insert 메소드 생성 타이틀과 카테고리
		Video video = new Video(title, cat); //video는 default 값 없고 인자값 생성/     video 객체 생성 완료 
		videoMap.put(video.getId(), video); //ID 값, video 객체 을 리턴 받아서 넣어라 앞에 this.id 로 생성했었음 , 
	}

	// 시스템에서 비디오 제거
	public boolean delete(int id) { //id 값은 위에 getID 값을 가져옴 
		if (!videoMap.containsKey(id)) //not을 붙였으니 아이디가 없다면 false 값 리턴해줘 있다면 remove 해줘 
			return false;
		videoMap.remove(id);
		return true;
	}

	// 특정 비디오 상태를 대여로 변경
	public boolean lend(int id, String lendName) {
 		if (!videoMap.containsKey(id)) 
			return false;
		Video video = videoMap.get(id);
		if (video.isLend()) {
			return false;
		}
		video.setLend(true);
		video.setLendName(lendName);
		video.setLendDate(new Date());
		return true;
	}

	// 특정 비디오 이름과 장르를
	public boolean update(int id, String title, String category) {
		if (!videoMap.containsKey(id))
			return false;
		Video video = videoMap.get(id);
		video.setTitle(title);
		video.setCategory(category);
		return true;
	}

	// 특정 비디오를 반납처리
	public boolean receive(int id) {
		if (!videoMap.containsKey(id))
			return false;
		Video video = videoMap.get(id);
		if (!video.isLend()) {
			return false;
		}
		video.setLend(false);
		video.setLendName(null); //렌탈 안되면 null 값 으로 출력 
		video.setLendDate(null);
		return true;
	}

	public void show() {
		System.out.println(
				"[비디오 목록]------------------------------------------------------------------------------------------------");
		System.out.printf("%5.5s\t%16.16s\t%16.16s\t%8.8s\t%16.16s\t%16.16s\t\n", "ID", "제목", "카테고리", "대여중", "대여자",
				"대여일");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		for (Video video : videoMap.values()) { //확장 for 문 values() 하면 value 값만 가져옴 
			if (video.isLend()) { //lend 가 됐다면 각각의 값 넣어줌 ID, getTitile 
				System.out.printf("%5d\t%16.16s\t%16.16s\t%8.8b\t%16.16s\t%16.16s\t\n", video.getId(), video.getTitle(),
						video.getCategory(), video.isLend(), video.getLendName(),
						dateFormat.format(video.getLendDate()));
			} else {
				System.out.printf("%5d\t%16.16s\t%16.16s\t%8.8b\t%16.16s\t%16.16s\t\n", video.getId(), video.getTitle(),
						video.getCategory(), video.isLend(), "", "");
			}
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
	}
}
