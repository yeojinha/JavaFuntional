package Java_Algo;

public class recursiveSum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sum(arr.length,arr));

	}
	static int sum(int n,int [] arr) {
		return n<=0? 0:sum(n-1,arr)+arr[n-1];
	}
}
