package list;

import java.util.*; 

public class ArrayListLinkedListTest2 { 
      public static void main(String args[]) { 
            ArrayList al = new ArrayList(1000000); 
            LinkedList ll = new LinkedList(); 
	        add(al);
            add(ll);

            System.out.println("=접근시간테스트="); 
            System.out.println("ArrayList :"+access(al)); //순차적으로 하니까 오히려 더 빠름 
            System.out.println("LinkedList :"+access(ll)); //데이터 번지수 찾는데 시간이 걸림 
	  }

      public static void add(List list) { 
            for(int i=0; i<100000;i++) list.add(i+""); 
      } 

      public static long access(List list) { 
            long start = System.currentTimeMillis(); 
            for(int i=0; i<10000;i++) list.get(i); //데이터 꺼내오기 get

            long end = System.currentTimeMillis(); 
            return end - start; 
      } 
}