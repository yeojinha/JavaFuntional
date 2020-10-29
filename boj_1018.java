
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 10 10
WWBBWWWBBW
WBBWBWWWWB
WBWBWWBBWW
WBBBBBBBWW
WBBWWWBWWW
WBBBBBWWBB
WWBWWBWWBB
BWWBBWWWBB
BBWBBBBBWB
WWWBBBWWWB
 */
public class boj_1018 {

	static String[] white = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB",
			"BWBWBWBW" };
	static String[] black = { "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW",
			"WBWBWBWB" };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int min = Integer.MAX_VALUE;
		char[][] map = new char[N][M];
		for (int i = 0; i < N; i++) {
			String num = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = num.charAt(j);
			}
		}
		// 13-7
		for (int i = 0; i < N - 7; i++) {//
			for (int j = 0; j < M - 7; j++) {
				//int temp = Math.min(b_count(map, i, j), w_count(map, i, j));
				min=Math.min(count(map,i,j),min);
				/*if (min > temp) {
					min = temp;
				}*/

			}
		}
		System.out.println(min);

	}

	public static int count(char[][] map, int x, int y) {
		// black
		int b_cnt = 0;
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				if (map[i][j] != black[i - x].charAt(j - y)) {
					b_cnt++;
				}
			}
		}
		// white
		int w_cnt = 0;
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				if (map[i][j] != white[i - x].charAt(j - y)) {// white[i-x].charAt(j-y)// 0,0부터 시작하게
					w_cnt++;
				}
			}
		}
		return Math.min(w_cnt, b_cnt);
	}

	public static int b_count(char[][] map, int x, int y) {
		// black
		// int b_x=-1,b_y=-1;
		int b_cnt = 0;
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				if (map[i][j] != black[i - x].charAt(j - y)) {
					b_cnt++;
				}
			}
		}
		return b_cnt;
	}

	public static int w_count(char[][] map, int x, int y) {

		// white
		int w_cnt = 0;
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				if (map[i][j] != white[i - x].charAt(j - y)) {// white[i-x].charAt(j-y)// 0,0부터 시작하게
					w_cnt++;
				}
			}
		}
		return w_cnt;
	}

}
