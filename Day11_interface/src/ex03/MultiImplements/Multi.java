package ex03.MultiImplements;

import ex01.Interface.IDraw;
import ex02.Interface.Shape;

public class Multi extends Shape implements Test, IDraw {
	
	private int num ;
	public void display() {	
		System.out.println("Multiclass method !");
	}

	@Override
	public void draw() { //IDraw
		num = 88;
		System.out.println("IDraw interface" + num);
		
	}


	@Override
	public double calc(double x) { //Shape
		System.out.println("Shape abstract class");
		return 5.5;
	}

	@Override
	public void show(String name) { //Shape
		System.out.println("Shape abstract class");

	}
	
	@Override
	public void view() {
		System.out.println("Test interface");
		super.view();
	}

		
	

}
