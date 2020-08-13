package Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	}

}
