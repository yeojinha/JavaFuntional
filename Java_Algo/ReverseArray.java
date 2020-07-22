package Java_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {

		static void swap(Integer []a , int idx1, int idx2) {
			int t=a[idx1]; a[idx1]=a[idx2]; a[idx2]=t;
		}
		static int sumOf(Integer[]a) {
			int sum=0;
			for(Integer i: a) {
				sum+=i;
			}
			return sum;
		}
		static void reverse (Integer []a) {
		
			System.out.println();
			for(int i=0;i<a.length/2;i++) {
				for(Integer j: a) {
					System.out.print(j+" ");
				}
				System.out.printf("\na[%d]과(와) a[%d]를 교환합니다.\n",i,a.length-i-1);
				swap(a,i,a.length-i-1);
				//0,5
				//1,4
				//2,3
			}
		}
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i+1);
		}
		
		
		System.out.println();
		Integer [] result=new Integer [list.size()];
		result=list.toArray(result);
		reverse(result);
		for(Integer i: result) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n합계: "+sumOf(result));
	
	}

}
