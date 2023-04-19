package day11_quiz;

public class Bus extends Transfer {

	@Override
	public void start(String name) {
		System.out.println( name +" 출발합니다. ");

	}

	@Override
	public void stop(String name) {
		System.out.println( name +" 도착했습니다. ");
	}

}
