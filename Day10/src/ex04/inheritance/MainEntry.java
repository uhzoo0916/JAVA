package ex04.inheritance;

public class MainEntry {

	public static void main(String[] args) {
//		Shape sh = new Shape();
//		sh.show(); //0 0 이 찍힘
		
		Shape sh = new Circle();
		sh.show();
		
		sh = new Triangle(); //Triangle 로 다시 sh 를 선언 
		sh.show();
		
//		Shape c2 = new Circle(); 

		
		/*
		 * Circle c = new Circle(); // 
		 * System.out.println(c); 
		 * c.show(); 
		 * c.setW(2); //값변경
		 *  
		 * c.show();//찍어줘
		 * 
		 * 
		 * System.out.println("==============");
		 *  Triangle t = new Triangle(); 
		 *  t.show();
		 * 
		 * t.setH(20); //높이 20 
		 * t.setW(30); 
		 * t.show();
		 */
	}

}
