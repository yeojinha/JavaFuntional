package Codility;

public class MaxCounter {
 static int max=0;
	public static void main(String[] args) {
		int []arr= {3,4,4,6,1,4,4};
		int []result=solution(5,arr);
		for(int i:result) {
			System.out.print(i+"");
		}
		System.out.println();
		int[]result_1=solution_1(5,arr);
		for(int i:result_1) {
			System.out.print(i+"");
		}
		System.out.println();
		int []result_2=solution_2(5,arr);
		for(int i:result_2) {
			System.out.print(i+"");
		}
	}
	public static int[] solution(int N, int[] A) {//77%
		//譆學曖 唳辦 O(N^2);
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
	private static int [] solution_1(int N, int[] A) {//77%
		//譆學曖 唳辦 O(N^2);
		int max=0;
		//int []arr= {3,4,4,6,1,4,4};
		int []mty=new int [N];
		for(int i:A) {
			if(i<=N) {
				mty[i-1]++;	
				max=mty[i-1];
			}
			if(i==N+1) {
				for(int j=0;j<mty.length;j++) {
					mty[j]=max;
				}
			}
		}
		return mty;
	}
	
	
	private static int [] solution_2(int N, int [] A) {//100%
		
		 int length = A.length, maxOfCounter = 0, lastUpdate = 0;
	      int applyMax = N + 1;
	      int result[] = new int[N];

	      for (int i = 0; i < length; ++i ) {
	          if(A[i] == applyMax){
	              lastUpdate = maxOfCounter;
	          } else if (A[i] <= N)  {
	              int position = A[i]-1;
	              result[position] = result[position] > lastUpdate
	                                        ? result[position] + 1 : lastUpdate + 1;
	              // updating the max for future use
	              if(maxOfCounter <=  result[position]) {
	                  maxOfCounter = result[position];
	              }
	          }
	     }
	     // updating all the values that are less than the lastUpdate to the max value
	     for (int i = 0; i < N; ++i) {
	         if(result[i] < lastUpdate) {
	             result[i] = lastUpdate;
	         }
	     }
	     return result;
	}
}
