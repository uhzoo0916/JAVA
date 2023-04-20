package day19_quiz;

public class BMI {
	private int height, kg;
	private String name, gender;
	
	
	//1.생성자 함수 
	public BMI (String  name, int height, int kg, String gender) {	
		this.name=name;
		this.height=height ;
		this.kg = kg;
		this.gender =gender;

	}
	
	//2.getter and setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "BMI [이름=" + name + ", 키=" + height +"cm" + ", 몸무게=" + kg +"kg" + ", 성별=" + gender + "]";
	}

	

	
}
