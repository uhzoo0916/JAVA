package ex02.collection_list;

public class Customer {
	
	//1. 생성자 함수 만들기 
	private String name, address, tel;
	
	public Customer (String name, String address, String tel) {	
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	//2. getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//위의 정보들을 문자열(toString 이용) 로 만들어서 return
	@Override
	public String toString() {
		return "[ 고객이름 :" + name + " 주소 : " + address + " 연락처 : " + tel + " ]";
	}
}

