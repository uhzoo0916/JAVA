package day19_quiz;

public class Information {
	int height, weight;
	double bmi;
	String name, gender, result;
	
	
	//1.생성자 함수 
	public Information (String  name, int height, int weight, String gender,double bmi, String result) {	
		super();
		this.name=name;
		this.height=height ;
		this.weight = weight;
		this.gender =gender;
		this.bmi=bmi;
		this.result = result;

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


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Information [이름=" + name + ", 키=" + height+ "cm" + ", 몸무게=" + weight + ", gender=" + gender  + ", bmi="
				+ bmi + ", result=" + result + "]";
	}

}



