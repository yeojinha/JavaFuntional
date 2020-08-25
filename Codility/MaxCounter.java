package Codility;

public class MaxCounter {
 static int max=0;
	public static void main(String[] args) {
		int []arr= {3,4,4,6,1,4,4};
		int []result=solution(5,arr);
		for(int i:result) {
			System.out.print(i+"");
		}
	}
	public static int[] solution(int N, int[] A) {
		int[] result = new int[N];
		for (int i = 0; i < A.length; i++) {
			int operation = A[i];
			if (operation <= N) {
				increase(result, operation - 1);
			} else if (operation == N + 1) {
				maxCounter(result);
			}

		}
		return result;
	}

	private static void increase(int[] A, int X) {
		int val = ++A[X];
		if (val > max) {
			max = val;
		}
	}

	private static void maxCounter(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] = max;
		}
	}

}
