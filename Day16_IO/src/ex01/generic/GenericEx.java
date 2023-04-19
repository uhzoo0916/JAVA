package ex01.generic;

public class GenericEx<T> {
	//class 만들때 이름을 GenericEx<> 를 쓰면 <T> 로 나옴
	
	T[] v; //멤버 변수 아직 타입이 결정 X
	
	public void set ( T[] v) {	//멤버함수
		this.v = v;
	}
	public void print() {	
		for(T item : v) {	
			System.out.println(item);
		}
	}

}
