package set;


import java.util.*;
class HashSetEx3 {
	public static void main(String[] args) {
		
		//Hashset : set 의 성질을 그대로 받음 
		
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		System.out.println(set);
	}}


class Person {
	String name;
	int age;
	Person(String name, int age) { //생성자 함수 
		this.name = name;
		this.age = age; //equals 하고 hashcode 가 없으니까 David10 두번 출력됨 
	}
	
	public String toString() {
		return name +":"+ age;
	} // [abc, Dabid
}