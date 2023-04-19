package ex04.inheritance;

public class Shape { //Super class
	
	protected int w, h; //너비 높이 
	protected double result;
	
	public Shape( ) { //멤버 변수의 초기화 담당 - 생성자 함수 
//		너비 와 높이를 0 result 0 
		w = h = 0; result = 0;

	}
	public Shape(int w, int h) {	
		this.w =w;
		this.h=h;
	}

	//getter and setter 
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	
	
	public double calc() {	
		
		return  result;
	}
	
	public void show( ) {	
		System.out.println(w +", " +h); // override 자손들이 알아서 쓰길 
		//
		
	}

	
	
	
	
}
