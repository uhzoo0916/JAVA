package ex01.collection_set;

import java.util.HashSet;
import java.util.Set; 

class Person{	//extends Object {
	String name;
	int age;
	
	public Person(String name, int age) { //상속 받은 클래스 그대로 가져옴 	
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() { //문자열로 만들어 리턴 하는 메소드
		
		return "Person [name= " + name + ", age =" + age + "] \n";
	}

	@Override
	public boolean equals(Object obj) { //어떤 데이터 타입이든 다 받으려고 object 이용
		if(obj instanceof Person) {	 
			Person temp = (Person)obj; //david 값이 들어오면 temp로 형 변환
			
			return name.equals(temp.name) && age == temp.age; 
			//이름 주소와 나이 까지 같아야 동일한 애이다 동시에 만족 해야함 
			
		}
		return false;
	}

	@Override
	public int hashCode() {		
		return name.hashCode() + age; 
	}	// 아래 중복된값 David 20을 삭제해줌
	
}// Person end


public class HashSetEx2 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new Person("doyeon", 33));		
		set.add(new Person("David", 20));
		set.add(new Person("David", 20));
		set.add(new Person("David", 37));
		set.add(new Person("David", 10));
		
		set.add(new String("happy"));
		set.add(new String("happy"));
		
		System.out.println(set);

	}

}
