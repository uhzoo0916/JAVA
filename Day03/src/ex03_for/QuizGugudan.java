package ex03_for;

public class QuizGugudan {

	public static void main(String[] args) {
		
		//이중 반복문을 이용한 구구단 만들기 
       
		for (int i = 2; i < 10; i++) { // 2 부터 9까지 곱하고 그 결과 출력 
            System.out.printf("[%d단]\t\t", i); //위에 [ ] 단 만들기 
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d * %d = %2d\t", j, i, j * i);
            }
            System.out.println();
        }

	}

}
