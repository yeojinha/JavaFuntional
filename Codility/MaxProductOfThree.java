package Codility;

import java.util.Arrays;

public class MaxProductOfThree {
	
	public static void main(String[] args) {

		// int []a= {-5, -6, -4, -7, -10};
		int[] a = { 2, 100, 3, -1000 };
		System.out.println(solution(a));
	}

	public static int solution(int[] A) {
		int ans = 0;
		int last = A.length - 1;
		int twoMin = 0;
		boolean TwoMinus = false;
		Arrays.sort(A);
		

		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0) {
				twoMin++;
			}
			if (twoMin == 2) {// 음수가 2 개면
				TwoMinus = true;
				break;
			}
		}
		int sum2 = A[last] * A[last - 1] * A[last - 2];
		if (TwoMinus) {
			int zero = Math.abs(A[0]);
			int first = Math.abs(A[1]);
			int sum1 = zero * first * A[last];
			ans = Math.max(sum1, sum2);
		} else {
			ans = sum2;
		}
		return ans;

	}
	
}
