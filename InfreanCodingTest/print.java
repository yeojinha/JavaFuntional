package InfreanCodingTest;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class print {

	public static void main(String[] args) {
		int [] arr= {1,1,1,9,1,1,1,1};
		System.out.println(solution(arr,2));

	}
	 public static int solution(int[] priorities, int location) {
	        Queue<Integer> qu=new PriorityQueue<>(Collections.reverseOrder());
	        
	        for(int i=0;i<priorities.length;i++){
	            int val=priorities[i];
	            qu.offer(val);
	        }
	       
	        int answer=1;
	        while(!qu.isEmpty()){
	            for(int i=0;i<priorities.length;i++){

                    System.out.println("priorities "+priorities[i]+" == peek: "+qu.peek());
	                if(priorities[i]==qu.peek()){
	                    if(i==location)return answer;
	                    
	                   qu.poll();
	                    answer++;
	                }
	            }
	        }
	        
	        return answer;
	    }
}
