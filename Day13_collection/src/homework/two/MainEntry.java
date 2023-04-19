package homework.two;

import java.util.Scanner;

public class MainEntry {  // View
	public static void main(String[] args) {
		
		//Customer에 대한 객체 생성 
		Customer c = new Customer();
		// c. 하면 생성자 함수가 안보임 ! 
		
		int select=0;
		CustomerManager	CM = new CustomerManager();
		Scanner sc = new Scanner(System.in);
		
		while(select != 4){ //4와 같지 않으면 끝낼것임 
			//member.disp();
			System.out.println("====== 회원 가입 정보 ======");
			System.out.println("11.추가   12. 삭제   13. 출력   14. 수정  0. 종료");
			System.out.print("번호 선택하세요. (11,12,13,14) : ");
			select = sc.nextInt();
			
			switch( select ){
			case 11 : //11번 추가
				CM.Cadd(); break;
			
			case 12 : //12번 삭제
				System.out.print("삭제할 번호 입력하세요(int) : ");
				CM.Cdel(sc.nextInt());
				break;
				
			case 13 ://13번 출력 
				CM.Cdisp(); break;
				
			case 14 : //14번 삭제 
				CM.Cchange(); break;
				
			case 0 : System.out.println("회원 가입을 종료합니다. ");
						System.exit(0); // 프로그램 강제 종료
			default :
				System.out.println("잘못 선택하셨습니다. 없는 번호 입니다."); break;
			} // switch end
		} // while end
		System.out.println("수고하셨습니다.");
		

	}

}

//생성자만 넣고 끝낼것인지 아니면 명시적으로 불러올건지를 확인해야함 
