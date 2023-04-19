package ex01.Abstract;

abstract class Shape {	//추상 클래스 이면서 superz  class
	double result = 0;
	public abstract double calc(); //추상 메소드 
	public abstract void draw();
	
	public void show() {	
		System.out.println("Super class Shape");
	}
}//Shape end

// class Circle extends Shape{} // Circle end
//:error 발생  Circle 는 위에 정의된것을 무조건 받아야함 !! 

class Circle extends Shape {	// Sub class
	double r = 5.0;
	 
	@Override
	public double calc( ) {
		result = r * r * Math.PI;
		return 0;
	}
	
	@Override
	public void draw() {
		calc(); // 이걸 출력해 줘야 원의 넓이 값이 나옴 !!! 
		System.out.println("원의 넓이 : " + result + " 인 원을 그렸습니다.");
		
	} //Circle end 
	
}

class Rect extends Shape {	
	int w =3, h=5;
	
	@Override
	public double calc( ) {
		result = w * h;
		return result;
	}
	
	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : " + result + " 인 사각형을 그렸습니다.");
	}
	
}// Rect end 



//Triangle class 구현하기 

class Triangle extends Shape {	
	
	int w =4, h=5;
	
	@Override
	public double calc( ) {
		result = w * h * 1/2 ;
		return result;
	}
	
	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + " 인 삼각형을 그렸습니다.");
	}
} // Triangle end 


public class MainEntry {
	

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Rect r = new Rect();
		r.draw();
		
//		Shape sh = new Shape(); //자체적으로 객체 생성 할 수 없다 
		
		Shape sh = new Circle(); //상속 받은 손 클래스로는 객체 생성 할 수있다. 
		
		Triangle t = new Triangle();
		t.draw();
	
	}
 }


