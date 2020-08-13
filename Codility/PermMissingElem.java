package Codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

	public static void main(String[] args) {
		int [] A= {2,3,1,5};
		System.out.println(Solution(A));
	}
	public static int Solution(int []A) {
		Arrays.sort(A);
		for(int i=0;i<A.length;i++) {
			if(i+1!=A[i]) return i+1;//인덱스 순서대로 올라가야하는데 IDX+1과 다르다면 IDX+1 없다는 것
		}
		return A.length+1;// 1~N+1까지인데, N+1이 빠지는 경우를 위한 코드
	}

}
