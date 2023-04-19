package Quiz_TransInterface;

public class Bus implements Trans {
	
	
	public void start() {	
		System.out.println("Bus 출발 합니다. ");		
	}

	public void stop() {	
		System.out.println("Bus 도착 합니다. ");		
	}
	
}
