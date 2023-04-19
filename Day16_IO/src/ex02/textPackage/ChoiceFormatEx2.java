package ex02.textPackage;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
	public static void main(String[] args) {
			String pattern = "50#F|60#D|70#C|80#B|90#A" ; //|를 통해 구분 50점 이하 F 60점 D ..
			
			int[] score = { 100, 95, 70, 55, 60, 70 };
			
			ChoiceFormat  form = new ChoiceFormat(pattern); //패턴에 점수를 대응시켜서 넣었음
			for(int i=0; i < score.length; i++) {
				System.out.println(score[i] + " : " + form.format(score[i]));
			}
	}
}
