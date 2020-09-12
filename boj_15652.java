

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_15652 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, M;
	static int[] arr;
	static boolean[] checked;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());

		arr = new int[M];
		checked = new boolean[N + 1];
		solution(0,0);
		br.close();
		bw.flush();
		bw.close();

	}

	private static void solution(int idx, int k) throws IOException {
		if (k == M) {
			for (int i = 0; i < M; i++) {
				bw.write(String.valueOf(arr[i])+" ");
			}
			bw.newLine();
			return;
		}

		for (int i = 1; i <= N; i++) {
			if(!(idx>i)){//0,1//1,1//1,2//1,3
			arr[k] = i;//0,2//2,2//2,3
						//0,3//3,3
			solution(i,k + 1);
			}
		}
	}
}
