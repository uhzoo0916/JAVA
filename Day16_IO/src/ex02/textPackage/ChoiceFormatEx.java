package ex02.textPackage;

import java.text.ChoiceFormat;

public class ChoiceFormatEx { //textpackage 안에 있는 class : ChoiceFormatEx
	
	public static void main(String[] args) {
		
		double[]  limits = { 50, 60, 70, 80, 90 } ;  // 낮은 값부터 큰 값의 순서로 적어줌
		String[]  grades = { "F", "D", "C", "B", "A" }; //위에 낮은 순으로 넣었으니 grades 도 낮은순으로 넣음 
		
		int[] score = { 100, 95, 70, 55, 60, 70 }; //우리반 성적 
		
		ChoiceFormat  form = new ChoiceFormat(limits, grades); //학점에 대응되는것을 form 으로 만들었음 
		
		for(int i=0; i < score.length; i++) { //데이터가 여러개니 for 반복문 이용 switch문으로 말고 textformat 사용해서 학점 내는 프로그램 만들었음
			System.out.println(score[i] + " : " + form.format(score[i]) + "학점"); 
			//0번 100점 -> A 
			//1번 95점 -> A 
			// ....5번 70점 ->
		}
	}
}
