package ex02.Abstract;

public class Circle extends Shape { //Sub class

	@Override
	public double calc(double x) {
		result = x * x * Math.PI;
		return result;
	}

	@Override
	public void show(String name) {
		calc (5.5);
		System.out.println(result + " 반지름의 " + name + "이 그려졌습니다." );

	}

}
