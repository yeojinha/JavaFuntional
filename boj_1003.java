import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int cases = Integer.valueOf(br.readLine());
		for (int i = 0; i < cases; i++) {
			int n = Integer.valueOf(br.readLine());
			sb.append(dpFibo(n)+"\n");
		}
		System.out.println(sb.toString());
	}

	public static String dpFibo(int n) {
		if (n == 0) {
			return 1 + " " + 0;
		} else if (n == 1) {
			return 0 + " " + 1;
		}
		
		int[][] dp = new int[n + 1][2];// n+1 ���̽��� ���ڴ� 0,1 �� ������ ���� ���߹迭 size

		dp[0][0] = 1;// 0��° 0�� Ƚ��
		dp[0][1] = 0;// 0��° 1�� Ƚ��

		dp[1][0] = 0;// 1��° 0�� Ƚ��
		dp[1][1] = 1;// 1��° 1�� Ƚ��

		/* (n-2)+(n-1) �Ǻ���ġ ���� �̿� */

		/*
		 * [0][0],[0][1] -> 1,0 [1][0],[1][1] -> 0,1 ���� �� ���� ���߹迭��
		 * [i][0]=[i-1][0]+[i-2][0] [i][1]=[i-1][1]+[i-2][1] �̰���
		 * fibo[i]=fibo[i-2]+fibo[i-1]�� ���� Dynamic Programming ��� [2][0],[2][1] -> 1,1
		 * 
		 */
		
		for (int i = 2; i <= n; i++) {
			dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
			dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
			// System.out.println(dp[i][0]+" "+dp[i][1]);
		}
		return dp[n][0] + " " + dp[n][1];
	}

}
