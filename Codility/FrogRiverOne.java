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
		 Set<Integer> marks = new HashSet<>();//set이라서 중복은 못담는다.
		    for (int i = 0; i < A.length; i++) {
		        if (A[i] <= X) {//x는 1<=X까지임. 그렇기에 X이하만 담고(중복은 안담김) SET의 사이즈 X와 같다면 RETURN I;
		            marks.add(A[i]);
		            if (marks.size() == X) {
		                return i;
		            }
		        }
		    }
		    return -1;
		
	}
}
