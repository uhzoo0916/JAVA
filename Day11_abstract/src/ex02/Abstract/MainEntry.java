package ex02.Abstract;

public class MainEntry {

	public static void main(String[] args) {
		
		//3. 
		Shape[] ss = new Shape[3]; // 이건 배열 !! 배열 선언 및 생성 객체 생성과는 다른 것 
		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Triangle();
		
		String[] name = {"Circle", "Rect", "Triangle"};
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
			
		}
		
		System.out.println("======================================================");
		
		//2. Shape 부모 추상 클래스를 이용해서 객체 생성 
		Shape sh = new Circle();
		sh.show("Circle");
		
		sh = new Rect();
		sh.show("사각형");
		
		sh = new Triangle();
		sh.show("Triangle");
		
		
		
		System.out.println("======================================================");
		
		
		//1. 각자의 클래스로 생성 형태 
		Circle c = new Circle();
		c.show("원");
		
		Rect r = new Rect();
		r.show("rectangle");
		
		Triangle t = new Triangle();
		t.show("삼각형");

	}

}
