package Codility;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CyclicRotation {

	public static void main(String[] args) {
		int [] arr= {3,8,9,7,6};
		
		int []temp=solution(arr,3);
		
	}
	static public int[] solution(int[] A, int K) {
		 int[] rotatedArray = new int[A.length];

        for (int i = 0; i < A.length; i++) {
        	System.out.println((i + K) % A.length);
            rotatedArray[(i + K) % A.length] = A[i];
        }
     
        return rotatedArray;
	}
}
