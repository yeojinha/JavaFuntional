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
		for(int i=0;i<leng;i+=2) {//�迭�� ���̴� Ȧ���̴�.
			if(i==leng-1) {//������� ���� �������� ��
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
