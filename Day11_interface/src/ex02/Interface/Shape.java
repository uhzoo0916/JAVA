package ex02.Interface;

public abstract class Shape { //Super class 
	
	double result = 0;
	
	public abstract double calc(double x); // abstract method
	public abstract void show(String name);
	
	public void view( ) {	//일반 method : 블럭{}이 있냐 없냐 로 구분 !!! 
		System.out.println("Super class Shape"); //추상 클래스는 추상메소드도 가지고 일반 메소드도 가진다 
	}
}