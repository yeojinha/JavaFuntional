

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class boj_1018 {
	static int b_cnt = 0;
	static int w_cnt = 0;
	static int b_min = 64;
	static int w_min = 64;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());

		char[][] map = new char[N][M];
		for (int i = 0; i < N; i++) {
			String num = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = num.charAt(j);
			}
		}

		count(map, N, M);
		System.out.println(Math.min(b_min, w_min));

	}

	public static void count(char[][] map, int N, int M) {
		int[] leftUp = { 0, 8, 0, 8 };// �������� ���� 0,0 x,y��ǥ ������
		int[] rightUp = { Math.abs(N - 8), N, 0, 8 };
		int[] leftDown = { 0, 8, Math.abs(M - 8), M };
		int[] rightDown = { Math.abs(N - 8), N, Math.abs(M - 8), M };
		
		List<int[]> list = Arrays.asList(leftUp, rightUp, leftDown, rightDown);
		for (int[] arr : list) {
			for (int i = arr[0]; i < arr[1]; i++) {// 0,0 Black�϶�,
				for (int j = arr[2]; j < arr[3]; j++) {
					if (i % 2 == 0) {// ¦����
						if (j % 2 == 0) {// ¦����
							b_cnt += map[i][j] != 'B' ? 1 : 0;// ¦������ ¦������ B
						} else {// Ȧ����
							b_cnt += map[i][j] != 'W' ? 1 : 0;// ¦������ Ȧ������ W;
						}
					} else {// Ȧ����
						if (j % 2 != 1) {// Ȧ����
							b_cnt += map[i][j] != 'W' ? 1 : 0;
						} else {// ¦����
							b_cnt += map[i][j] != 'B' ? 1 : 0;
						}
					}
				}
			}
			if (b_min > b_cnt) b_min = b_cnt;
			b_cnt=0;
		}
		for (int[] arr : list) {
			for (int i = arr[0]; i < arr[1]; i++) {// 0,0 Black�϶�,
				for (int j = arr[2]; j < arr[3]; j++) {
					if (i % 2 == 0) {// ¦����
						if (j % 2 == 0) {// ¦����
							w_cnt += map[i][j] != 'W' ? 1 : 0;// ¦������ ¦������ B
						} else {// Ȧ����
							w_cnt += map[i][j] != 'B' ? 1 : 0;// ¦������ Ȧ������ W;
						}
					} else {// Ȧ����
						if (j % 2 != 1) {// Ȧ����
							w_cnt += map[i][j] != 'B' ? 1 : 0;
						} else {// ¦����
							w_cnt += map[i][j] != 'W' ? 1 : 0;
						}
					}
				}
			}
			if(w_min>w_cnt) w_min=w_cnt;
			w_cnt = 0;
		}

	}

}
