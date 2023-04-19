package ex02.Abstract;

public class Rect extends Shape {
	
	private int h = 5;

	@Override
	public double calc(double x) {
		result = x * h;
		return  result;
	}

	@Override
	public void show(String name) {
		calc(8.8);
		System.out.printf("넓이 %.2의 %s이(가) 그려졌습니다.%n", result, name);

	}

}
