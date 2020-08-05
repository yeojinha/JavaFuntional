package Java_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MazeCountingShortWay {
	static int N, M;
	static int[][] map;
	static boolean [][] visited;
	static Queue<Node> q = new LinkedList<>();
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int res;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		for (int i = 0; i < N; i++) {
			Arrays.fill(visited[i], false);
		}
		
		visited[0][0] = true;
		q.add(new Node(0, 0, 1));

		while (!q.isEmpty()) {
			Node cur = q.poll();//0,0 ��ǥ���� cnt�� 1;
			if (cur.x == N - 1 && cur.y == M - 1) {//���������̸� ���±����� cnt, �׸��� break;
				res = cur.cnt;
				break;
			}

			for (int i = 0; i < 4; i++) {//�������� �ݺ�
				int x_ = cur.x + dx[i];
				int y_ = cur.y + dy[i];

				if (!OutOfMap(x_, y_) || visited[x_][y_]|| map[x_][y_] == 0) {
					continue;//��ǥ out || �̹� �湮 || ��
				}
				visited[x_][y_] = true;
				q.add(new Node(x_, y_, cur.cnt + 1));//������ cnt�� +1�� ������ ����.
				//�ֺ��� 54�࿡ �ɸ��� �ʴ� ��ǥ�� ��� q�� ����.
				//
			}

		}
		System.out.println(res);
	}

	static boolean OutOfMap(int x, int y) {
		if (x >= N || y >= M || y < 0 || x < 0) {
			return false;
		}
		return true;
	}
}

class Node {
	int x;
	int y;
	int cnt;

	// boolean isVisitied=false;
	Node(int x, int y, int cnt) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
		// this.isVisitied=isVisit;
	}
}