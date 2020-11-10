import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class boj_2667 {

	static int n;
	static int count = 0;
	static int temp = 0;
	static int[][] grid;
	static boolean[][] visited;
	static StringBuilder sb;
	static int[][] direc = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.valueOf(br.readLine());
		grid = new int[n][n];
		sb = new StringBuilder();
		visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int j = 0; j < n; j++) {
				grid[j][i] = input.charAt(j) - '0';
			}
		}
		solution(grid);

	}

	static void solution(int[][] grid) {
		List<Integer> ans = new ArrayList<Integer>();
		if (grid == null || grid.length == 0)
			return;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (!visited[j][i] && grid[j][i] == 1) {
					temp = 0;
					dfs(grid, j, i);
					ans.add(temp);
				}
			}
		}
		System.out.println(ans.size());
		Collections.sort(ans);
		for (int idx = 0; idx < ans.size(); idx++) {
			System.out.println(ans.get(idx));
		}
		// System.out.println(sb.toString());

	}

	static void dfs(int[][] grid, int y, int x) {
		if (y < 0 || x < 0 || x >= grid.length || y >= grid[0].length)
			return;// idx 이탈
		if (grid[y][x] != 1 || visited[y][x])
			return; // 방문일 시
		visited[y][x] = true;
		temp++;
		for (int i = 0; i < direc.length; i++) {
			dfs(grid, y + direc[i][0], x + direc[i][1]);
		}

	}

}
