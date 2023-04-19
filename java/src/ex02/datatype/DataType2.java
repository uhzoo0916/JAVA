package ex02.datatype;

public class DataType2 {
	
	// 문자형 : char (2byte) 0!65,535
	// 정수형 : byte (1byte) -128 ~ -127
	//        short (2byte) -32,768 ~ 32767
	//         int  (4byte) 
	// 실수형 : double(8byte) 
	

	
	//모든 자료형은 자신의범위(크기)를 벗어나지 못한다.
	public static void main(String[] args) {	
		
		long l = 1000000000000L; //범위를 넘어간 숫자를 쓸 때 
		l = 1_000_000_000_000L;
		System.out.println(l); 
		 
		short sh = 32767;
		int num = 50000;
	
	    //작은 자료형이 큰 자료형에 대입 될 때는 자동형변환(묵시적형변환)이 된다.
		//묵시적 형 변환(자동형 형변환) : 연산 혹은 산술연산에서 c컴파일러가 자동으로 실행해주는 타입 변환 
		
		num = sh; // int(4byte) = short(2byte) int 가 short 보다 큰 메모리 공간 확보 하고 있으므로 대입 가능 
		System.out.println(sh + " : " + num);
		
//		 num=-32767;
		
		num = 32770; //Overflow: 32770 = (32767 + 1) + 2 → -32768 + 2 = -32766
		//큰 자료형을 작은 자료형에 넣으려면 반드시 명시적 형변환 해야한다 → 데이터 손실 발생 
		//명시적 형 변환: 어떤 자료형으로 선언된 변수를 다른 자료형으로 변환(형변환) 
		
		sh = (short)num; // 명시적 형 변환 
		System.out.println(sh + ": "+num);
	
	}

}

//*/ 

//한줄 주석
/*여러줄 주석 */
