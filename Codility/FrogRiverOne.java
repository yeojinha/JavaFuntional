package Codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int X, int[] A) {
		Set<Integer> set=new HashSet<Integer>();
		int result=-1;
		
		for(int i=1;i<=X;i++) {
			set.add(i);
		}
		for(int i=0;i<A.length;i++) {
			
			if(set.contains(A[i])) {
				set.remove(A[i]);
			}
			if(set.isEmpty()) {
				result=i;
				break;
			}	
		}
		return result;
	}
	public int solution_2(int X, int[] A) {
		 Set<Integer> marks = new HashSet<>();//set�̶� �ߺ��� ����´�.
		    for (int i = 0; i < A.length; i++) {
		        if (A[i] <= X) {//x�� 1<=X������. �׷��⿡ X���ϸ� ���(�ߺ��� �ȴ��) SET�� ������ X�� ���ٸ� RETURN I;
		            marks.add(A[i]);
		            if (marks.size() == X) {
		                return i;
		            }
		        }
		    }
		    return -1;
		
	}
}
