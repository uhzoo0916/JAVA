package day11_quiz;

public abstract class Transfer { //super class
	
	//추상 method start() / stop()
	
	public abstract void start(String name);
	public abstract void stop(String name);

	public String name(String name) {	
		return name;
	}

}
