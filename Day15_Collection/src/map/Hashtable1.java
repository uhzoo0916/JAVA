package map;

import java.util.Hashtable; // map 타입임 
import java.util.Enumeration;
class Hashtable1  {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("1","가위"); //1 : key / "가위" :value
		ht.put("2","바위");
		ht.put("3","보");
		
		if(ht.containsKey("1")) //key 값으로 데이터를 찾음 
			System.out.println("가위 포함되어 있음");
		
		if(ht.containsValue("보")) 
			System.out.println("보는 3번으로 포함되어 있음");
		
		System.out.println("총 개수는"+ht.size()+" 입니다.");
		
		ht.remove("1");
		
		Enumeration enu = ht.keys(); //key 값들만 뽑아줘 복수형이니까 열거형 이용 
		
		while(enu.hasMoreElements()){ //위에서 enu로 담아둔 value 값을 뽑을것 
			Object key = enu.nextElement();
			Object value = ht.get(key);
			System.out.println("키 = "+key+"값 "+value);
		}
	}
}