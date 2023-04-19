package day10_quiz;

class Solution {
    public int[] solution(int n, int m) {
 
      		//값 지정 
    		int a = Math.max(n, m);
    		int b = Math.min(n, m);
    		
    		//최대 공약수 : 유클리드 호제법 이용 gcd(a,b) =gcd(b,r) (r : a % b)
    		while(b != 0) {	
    			int r = a % b;
    			a = b;
    			b = r;
    		
    		} 
    		// 최소 공배수 = n * m / 최대 공약수 
    		return new int[] {a, n*m / a};
		
    }
}
    	
    	
    	
    

