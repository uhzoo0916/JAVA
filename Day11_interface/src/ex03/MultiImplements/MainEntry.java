package ex03.MultiImplements;

import ex02.Interface.Shape;

public class MainEntry {

	public static void main(String[] args) {
		//1. 자기 자신 
		Multi mc = new Multi();
		mc.view();
		mc.draw();
		mc.display();
		
		System.out.println(mc.su);
		System.out.println("=============");
		
		//2. 부모로 객체 생성
		Shape s = new Multi();
		s.show("도형이야");
		s.view();
		
		System.out.println("=============");
		
		

	}

}
