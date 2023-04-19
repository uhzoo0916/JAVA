package day11_quiz;


public class MainEntry {

	public static void main(String[] args) {
		
//		Transfer[] trans = new Transfer[4];		
//		
//		trans[0] = new Subway();
//		trans[1] = new Bus();
//		trans[2] = new Bicycle();
//		trans[3] = new Plain();
//		
//		String[] name = {"Subway", "Bus", "Bicycle", "Plain"};
//				
//		for (int i = 0; i < trans.length; i++) {
//			trans[i].start(name[i]);
//			trans[i].stop(name[i]);		
//		} 		
		
		//객체 배열로 변경해 보기 
		
		Transfer[] t = new Transfer[4];
		
		Object[] name = {new Bicycle(), new Bus(), new Subway(), new Plain()};
		
		String[] str = {"자전거",  "버스", "지하철", "비행기"};
		
		for (int i = 0; i < name.length; i++) {
			t[i] = (Transfer)name[i];
					
			t[i].start(str[i]);
			t[i].stop(str[i]);
		}
		
	}

}
