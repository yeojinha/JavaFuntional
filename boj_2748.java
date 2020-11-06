import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2748 {
	static long[] fibo_memo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		fibo_memo = new long[91];
	
		System.out.println(fibo_dynamicP(n));
		System.out.println(recursive_fibo(n));
	}

	static long fibo_dynamicP(int n) {
		fibo_memo[0]=0;
		fibo_memo[1]=1;
		for (int i = 2; i <= n; i++)
			fibo_memo[i] = fibo_memo[i - 1] + fibo_memo[i - 2];
		
		return fibo_memo[n];
	}
	static long recursive_fibo(int n) {//time over;
		if(n<=1) {
			return n;
		}
		return recursive_fibo(n-1)+recursive_fibo(n-2);
	}
}
