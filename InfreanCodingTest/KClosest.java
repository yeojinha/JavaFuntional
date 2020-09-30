package InfreanCodingTest;

import java.util.PriorityQueue;
import java.util.Queue;

public class KClosest {
//[[1,3],[-2,2]], K = 1
	public static void main(String[] args) {
		KClosest a=new KClosest();
		int [][]points= {{1,3},{-2,2}};
		int k=1;
		int[][]result=a.solution(points, k);
		for(int[] i: result) {
			for(int j: i) {
				
			}
		}
	}
	public int [][]solution(int[][] points,int k){
		Queue<int []> qu=new PriorityQueue<int []>((a,b)->(a[0]*a[0]-a[1]*a[1])-(b[0]*b[0]-b[1]*b[1]));//제곱간의 차로 오름차
		
		int [][]result=new int [k][2];
		int idx=0;
		for(int [] i:points) {
			qu.offer(i);//오름차 순으로 정렬된 것이 들어감
		}
		while(idx<k) {
			result[idx]=qu.poll();
			idx++;
		}
		return result;
		
		
		
		
		
		
		
		

	}
}
