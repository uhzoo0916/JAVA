package ex00.Instanceof;

class A {}

class B extends A {}

public class MainEntry {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
//		B a1 = new A();
		
		System.out.println("a instance of A : " + (a instanceof A));
		System.out.println("b instance of A : " + (b instanceof A));
		System.out.println("a instance of B : " + (a instanceof B));
		System.out.println("b instance of B : " + (b instanceof B));
	}

}
