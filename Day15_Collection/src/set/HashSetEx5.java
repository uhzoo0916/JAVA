package set;


import java.util.*;

class HashSetEx5 {
	public static void main(String args[]) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();

		setA.add("1");		setA.add("2");
		setA.add("3");		setA.add("4");
		setA.add("5");
		System.out.println("A = "+setA);

		setB.add("4");		setB.add("5"); 
		setB.add("6");		setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);

		Iterator it = setB.iterator(); //B에있는 데이터를 꺼내서 tmp 변수에 저장한구 교집합 변수에 추가
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp)) //contains 는 setA 타입에 있는 그릇이 tmp가 그릇에 다 포함이 되어있니? 
				setKyo.add(tmp);
		}

		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) //tmp가 setB에 포함되어 있지 않은 것을 넣어줘 
				setCha.add(tmp);
		}

		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next()); 

		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());

		System.out.println("A �� B = "+setKyo);  // 교집합
		System.out.println("A �� B = "+setHab); // 합집합
		System.out.println("A - B = "+setCha); 
	}
}