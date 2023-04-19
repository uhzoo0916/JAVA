package Quiz_TransInterface;


public class MainEntry {

	public static void main(String[] args) {
		Subway s = new Subway();
		s.start();		
		s.stop();
		
		Bus b = new Bus();
		b.start();
		b.stop();
		
		Bicycle c = new Bicycle();
		c.start();
		c.stop();
		
		Plain p = new Plain();
		p.start();
		p.stop();
		
	}
}
	
