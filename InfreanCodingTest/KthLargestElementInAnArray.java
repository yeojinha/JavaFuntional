package InfreanCodingTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInAnArray {

	public static void main(String[] args) {
		int []nums= {3,2,3,1,2,4,5,5,6};
		int k=4;
		//int[] nums = {3,2,1,5,6,4};
		//int k =2;
		System.out.println(solve_arr(nums,k));
		System.out.println(solve_pq(nums,k));
		
	}
	public static int solve_arr(int[]arr,int k) {
		int leng=arr.length;
		Arrays.sort(arr);
		print(arr);
		return arr[leng-k];
	}
	public static int solve_pq(int []arr,int k) {
		//Queue<Integer> q=new PriorityQueue<Integer>(comp);
		Queue<Integer> q=new PriorityQueue<Integer>((a,b)->a-b);
		for(int val:arr) {
			q.offer(val);
			if(q.size()>k) {
				q.poll();
			}
		}
		return q.peek();
	}
	static Comparator<Integer> comp=new Comparator<Integer>() {
		@Override
		public int compare(Integer a,Integer b) {
			return a-b;
		}
	};
	public static void print(int [] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
