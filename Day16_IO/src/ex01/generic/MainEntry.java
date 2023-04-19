package ex01.generic;

//generic : 타입에 대한 유연성을 보장함 
import java.util.Date;

class Point{}

//타입이 안정해졌었는데 이제 타입을 정해줌 
public class MainEntry {

	public static void main(String[] args) {
		//문자형
		GenericEx<String> t1 = new GenericEx<>();
		String[] str = {"abc", "kbs", "dirotor"};
		
		t1.set(str); t1.print();
		System.out.println("==========");
		
		//정수형 
		GenericEx<Integer> t2 = new GenericEx<>();
		Integer[] num = {1,2,3,4,5,6,7,8};
		
		t2.set(num); t2.print();
		System.out.println("==========");
		
		//Double형
		GenericEx<Double> t3 = new GenericEx<>();
		Double[] dou = {47.2,66.4,77.9};
		
		t3.set(dou); t3.print();
		System.out.println("==========");
		
		//객체 타입
		GenericEx<Object> t4 = new GenericEx<>();
		Object[] obj = {"12.34", new Date(), 47.2, "text",new Point()}; //모든 타입들 다 가능 (point 같은 클래스도 가능)
		
		t4.set(obj); t4.print();
		System.out.println("==========");
	}

}
