package ex01.collection_set;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet set = new TreeSet<>(); //TreeSet 도 중복 안됨
		
		int[] score= {85, 95, 50, 35, 45, 65, 10, 65, 100};
		
		for (int i = 0; i < score.length; i++) {
			//set.add(score[i]);
			set.add(new Integer(score[i])); //set type 에 넣었으니 중복된값 빼고 나옴 
			
		}
		System.out.println(set); //배열도 작은 순서 대로 자동 정렬됨
		System.out.println("50 보다 작은 값 : " + set.headSet(new Integer(50))); //headSet 이용 () 보다 작은 값 출력 
		System.out.println("50 보다 큰 값 : " + set.tailSet(new Integer(50))); // tailSet ()보다 큰 값 출력 
	}

}

//hash set 과는 다른점 : 자동 정렬됨, 숫자보다 큰 값, 작은값 출력할 수 있음.