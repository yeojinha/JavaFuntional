package Codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int []A= {9, 3, 9, 3, 9, 7, 9};
		int ans=Solution_3(A);
		System.out.println("ans: "+ans);
	}
	static public int Solution (int []A){
		int ans=0;
		
		int leng=A.length;
		Arrays.sort(A);
		for(int i=0;i<leng;i+=2) {//배열의 길이는 홀수이다.
			if(i==leng-1) {//여기까지 오면 마지막이 답
				ans=A[i];//
				break;
			}
			
			if(A[i]!=A[i+1]) {
				ans=A[i];
				break;
			}
		}
		
		
		
		return ans;
	}static public int Solution_2(int []A){
		Set<Integer> set=new HashSet<>();
		for(int i:A) {
			if(!set.contains(i)) {
				set.add(i);
			}else
				set.remove(i);
		}
		int ans=set.iterator().next();
		return ans;
	}
	static public int Solution_3(int []A){
		int ans=0;
		
		for(int i=0;i<A.length;i++) {
			ans=ans^A[i];
			System.out.println("xor: "+ans +" binary: "+Integer.toBinaryString(ans));
		}
		return ans;
		
	}

}
