package ex02.collection_list;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class MainEntry {

	public static void main(String[] args) {
		
		//Step1) ArrayList 생성, Scanner 생성
		//Step2) 고객 추가 add() 
		//Step3) 고객 삭제 remove() 
		//Step4) 고객 리스트 생성 Iterator(반복자) 사용 
		//Step5) 고객 정보 수정 Set(중복없이 값 넣기) 객체 이용 

		ArrayList<Customer> customers = new ArrayList<Customer>();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {	
			
			System.out.println("======================================================================");
			System.out.println("1. 고객 추가 / 2. 고객 삭제 / 3. 고객 리스트 출력 / 4. 고객 정보 수정 ");
			System.out.println("======================================================================");
			System.out.println("실행할 번호 입력 : ");
			n = sc.nextInt();
			
			
			
			switch(n) {	
			case 1: //<고객 추가> 
				System.out.println("추가할 고객 정보를 입력하세요.");
				
				System.out.println("이름 : ");
				String name = sc.next();
				
				System.out.println("주소 :");
				String address = sc.next();
				
				System.out.println("연락처 : ");
				String tel = sc.next();

				//배열에 추가 할 정보 입력 
				customers.add(new Customer(name, address, tel));
				System.out.println();
				
				System.out.println(customers);
				System.out.println("고객 정보 추가 완료.");
				System.out.println("======================================================================");
				System.out.println();
				break;
				
			case 2: // <고객 삭제> 
				System.out.println("삭제할 고객의 이름을 입력하세요 ");
				
				System.out.println("이름 : ");
				
				name = sc.next(); //입력한 문자열 값 name 에 저장후 반복문 실행 
				for (int i = 0; i < customers.size(); i++) { 
					if(name.equals(customers.get(i).getName())) {	
						customers.remove(i);// customers 배열에 i와 똑같은 값이 있다면 삭제
						System.out.println(); 
						System.out.println("삭제 완료 ");
					}else System.out.println("error : 다시 입력 하세요 "); // 똑같지 않을때 	
				}
				
				break;
				
				
			case 3: // 고객 리스트(반복문으로 데이터 가져오기 for문/Iterator(반복자) 이용)
				
				System.out.println();
				
//				for(Customer customer : customers)
//					System.out.println(customer);
				
				Iterator iter = customers.iterator();
				while(iter.hasNext()) {	
					System.out.println(iter.next());
				}
				
			break;
				
//					case 4: // 고객 정보 수정 이 부분이 문제 인 것 같은디 ,,, 
//				System.out.println();
//				System.out.print("수정할 고객의 이름을 입력하세요.");
//				name = sc.next(); //입력한 문자열 값 name 에 넣기 
//				
//				for (int i = 0; i < customers.size(); i++) {
//					if (name.equals(customers.get(i).getName())) {
//						
////						System.out.println("이름 : ");
////						name = sc.next();
////						
////						System.out.println("주소 :");
////						address = sc.next();
////						
////						System.out.println("연락처 : ");
////						tel = sc.next();
//				
//
//						System.out.println();
//
//						switch (n) {
//						case 1:
//							System.out.print("이름을 새로 입력하세요.");
//							name = sc.next();
//							customers.get(i).setName(name);
//							break;
//						case 2:
//							System.out.print("주소를 새로 입력하세요.");
//							address = sc.next();
//							customers.get(i).setAddress(address);
//							break;
//						case 3:
//							System.out.print("번호를 새로 입력하세요.");
//							tel = sc.next();
//							customers.get(i).setTel(tel);
//							break;
//		
//						}
//						System.out.println("수정되었습니다!");
//						System.out.println(customers);
//						System.out.println();
//
//						} else
//						System.out.println("잘못된 정보입니다.");
//						} 
//					break;
//				
				default:
					System.out.println("error : 1-4까지의 숫자만 입력 하세요");
					System.out.println();
					System.out.println("프로그램이 종료 되었습니다.");
					System.out.println();
					break;
				
			}
		}
	}

}
