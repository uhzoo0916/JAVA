package day19_quiz;

import java.util.*;

public class MainEntry {

	public static void main(String[] args) {
		//Step1) ArrayList 생성, Scanner 생성
		//Step2) 키, 몸무게 추가
		//Step3) 키, 몸무게 삭제 remove() 
		//Step4) 입력한 리스트 생성 Iterator(반복자) 사용 
		//Step5) 입력한 정보 수정 
		//Step6) BMI 계산 
		
		ArrayList<BMI> Bmi = new ArrayList<BMI>();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		
		while(true) {	
			System.out.println("==========================================================================================================");
			System.out.println("1. 신체 정보 입력 / 2. 신체 정보 삭제 /3. 입력한 정보 리스트 출력 /4. 신체 정보 수정/ 5. 비만도 측정 ");
			System.out.println("==========================================================================================================");
			System.out.println("실행할 번호 입력 : ");
			n =sc.nextInt();
			
			
			switch(n) {	
			case 1 : //1. 신체 정보 입력 
				System.out.println("정보를 입력 하세요.");
				
				System.out.println("이름: ");
				String name = sc.next();
				
				System.out.println("키 : ");
				int height = sc.nextInt();
				
				System.out.println("몸무게 : ");
				int kg = sc.nextInt();
				
				System.out.println("성별(F/M) : ");
				String gender = sc.next();
				
				//배열에 추가할 정보 입력 
				Bmi.add(new BMI(name, height, kg, gender));
				System.out.println();
				
				System.out.println(Bmi);
				System.out.println("신체 정보 추가 완료.");
				System.out.println("==========================================================================================================");
				System.out.println();
				break;
			
			case 2 : //2. 신체 정보 삭제 
				System.out.println("삭제할 정보의 이름을 입력하세요.");
				
				System.out.println("이름 : ");
				
				name = sc.next();
				for (int i = 0; i < Bmi.size(); i++) {
					if(name.equals(Bmi.get(i).getName())) {	
						Bmi.remove(i);
						System.out.println();
						System.out.println("삭제 완료");
					} else System.out.println("error : 다시 입력 하세요.");
					
				}
				break;
				
				
			case 3 : //3. 신체 정보 출력				
				System.out.println();
				
				Iterator iter = Bmi.iterator();
				while(iter.hasNext()) {	
					System.out.println(iter.next());
				}				
				break;
				
			
			case 4 : //4. 신체 정보 수정
				System.out.println("수정할 정보의 이름을 입력하세요.");
				name =sc.next();
							
				for (int i = 0; i < Bmi.size(); i++) {
					if(name.equals(Bmi.get(i).getName())) {	

						System.out.println("이름을 새로 입력하세요.");
						name = sc.next();
						Bmi.get(i).setName(name);


						
						System.out.println("키를 새로 입력하세요.");
						height = sc.nextInt();
						Bmi.get(i).setHeight(height);
							
						
						System.out.println("몸무게를 새로 입력하세요.");
						kg = sc.nextInt();
						Bmi.get(i).setKg(kg);
							
						
						System.out.println("성별을 새로 입력하세요.");
						gender = sc.next();
						Bmi.get(i).setGender(gender);
												
		
						System.out.println("수정 되었습니다.");
						System.out.println(Bmi);
						System.out.println();
					
					}else
					System.out.println("잘못된 정보 입니다. 다시 입력하세요");
					
					}//for문 종료 
								
			case 5 : //5. 비만도 측정 
						//bmi = kg / (height/100.0) *(height /100.0)
						height=sc.nextInt();
						kg = sc.nextInt();
						
						double bmiCheck = kg / (height/100.0) *(height /100.0);
						bmiCheck =(int)(bmiCheck*100)/100.0; // 소숫점 2자리 까지만
						
						
					for (int i = 0; i < Bmi.size(); i++) {
							
						if(bmiCheck<=18.5) {	
							System.out.println("당신의 BMI =" + bmiCheck + "판정 : 저체중");
						}
						else if((bmiCheck>18.5) &&(bmiCheck<=22.9)) {	
							System.out.println("당신의 BMI = " + bmiCheck + "판정 : 정상");
							
						}
						else if ((bmiCheck>=23.9) &&(bmiCheck<=24.9)) {	
							System.out.println("당신의 BMI = " + bmiCheck + "판정 : 과체중");
						}
						else if (bmiCheck>=25.0) {	
							System.out.println("당신의 BMI = " + bmiCheck + "판정 : 비만");
						}
					} 
						
			
					default :
						System.out.println("error : 1-5 까지의 숫자만 입력하세요.");
						System.out.println();
						System.out.println("프로그램이 종료 되었습니다.");
						System.out.println();
						break;
			
			} //switch end
		
		}
						
	}

}
