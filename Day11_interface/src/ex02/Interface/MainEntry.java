package ex02.Interface;

interface A { //interface = abstract method, final field 만 갖는다.
	
	int x = 90; //final static int z = 90; 이 코드와 동일 앞에 코드가 생략 된 것임 
	final int y = 777; 
	char ch = 'A';
	
	//추상 메소드: abstract 생략 가능함 → 무조건 추상 메소드임
	
	//public void show() { } : 몸체를 가질수 없으므로 에러 !
	void show(); // public abstract void show();
	public abstract void disp();
		
} // A end

interface B {	
	
	void view();
}// B end

interface C {	
	
	String name = "happy";
	
	void draw(); 

}//C end


//상속 받는 것 작성 

interface D extends B {	

	void dview();		
} // D end : 인터페이스 안에서도 상속 가능 하다 !! 



class Rect implements D {
	
    @Override
    public void view() {    // B interface

    }

    @Override
    public void dview() {   // D interface

    }

    int plus(int x, int y) {

        return x + y;
    }
}   // Rect class



//Shape class

class Circle implements C {

	@Override
	public void draw() {
		// name = "Kyle" ; //  interface 의 상수는 반드시 final 이므로 변경 불가 
		
		System.out.printf("%님 안녕하세요.", name);
	}	
	
}

class Multi extends Shape implements A, B, C {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void view() {
		// B
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		
	}
	
	
	//클래스를 먼저 상속 받은 후 인터페이스를 구현(순서)

	
}//Multi class 왜 이거 거꾸로 출력 되는지 확인 해 	
	



public class MainEntry {

	public static void main(String[] args) {
		
		//인터 페이스 생성 확인 
		// A a = new A(); : error 클래스가 아니기 때문에 객체 생성 안됨 !! 
			
	}

}
