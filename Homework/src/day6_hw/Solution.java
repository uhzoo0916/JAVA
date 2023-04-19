package day6_hw;

class Solution {
    public int[] solution(int n, int[] numlist) {
     //step1
        int j = 0;
        for(int i=0; i<numlist.length; i++) {   
         if(numlist[i] % n == 0) {  
              j++;  }
        }
    // step2
        int[] answer = new int[j];
        int count =0;
        
        for(int i=0; i<numlist.length; i++) {  
            if(numlist[i] % n == 0) {
            answer[count] = numlist[i];
            count++;
            }
          }
        return answer;
       
    }
}