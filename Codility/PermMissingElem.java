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
			if(i+1!=A[i]) return i+1;//�ε��� ������� �ö󰡾��ϴµ� IDX+1�� �ٸ��ٸ� IDX+1 ���ٴ� ��
		}
		return A.length+1;// 1~N+1�����ε�, N+1�� ������ ��츦 ���� �ڵ�
	}

}
