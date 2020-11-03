import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class boj_1655 {
	static BufferedReader br;
	static Integer n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.valueOf(br.readLine());
		solve();

	}

	public static void solve() {
		/*
		 * 최대힙의 사이즈 == 최소힙 사이즈  or 최대힙 사이즈 == 최소힙 사이즈+1
		 * 최대힙의 peek 값은 항상 최소힙 peek보다 작아야 한다.
		 * 최대힙 peek > 최소힙 peek 이라면 둘의 peek을 swap 해주자.
		 * 최대힙 peek은 항상 중간 값을 유지할 수 있다.
		 */
		StringBuilder sb = new StringBuilder();
		Queue<Integer> max = new PriorityQueue<Integer>((a, b) -> b - a);
		Queue<Integer> min = new PriorityQueue<Integer>();
		Integer number = 0;
		for (int i = 0; i < n; i++) {
			try {
				number = Integer.valueOf(br.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			if (max.isEmpty()) {
				max.offer(number);
			} else if (max.size() == min.size()) {
				max.offer(number);
			} else
				min.offer(number);

			if (!max.isEmpty() && !min.isEmpty() && max.peek() > min.peek()) {
				min.offer(max.poll());
				max.offer(min.poll());
			}
			sb.append(max.peek() + "\n");
		}
		System.out.println(sb.toString());
	}

	public static void solve_MemoryProblem() throws NumberFormatException, IOException {
		/*
		 * 메모리초과!!!!!!!
		 */
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);
		for (int i = 0; i < n; i++) {
			List<Integer> list = new LinkedList<>();
			Integer number = Integer.valueOf(br.readLine());
			if (queue.isEmpty()) {
				sb.append(number + "\n");
			}
			queue.offer(number);
			if (queue.size() > 1) {
				int temp = 0;
				int size = queue.size();
				int mid = size / 2;
				if (size % 2 == 0) {
					for (int cnt = 0; cnt < mid; cnt++) {
						temp = queue.poll();
						list.add(temp);
					}
					if (queue.peek() < temp) {
						temp = queue.poll();
						list.add(temp);
					}
				} else {
					for (int cnt = 0; cnt <= mid; cnt++) {
						temp = queue.poll();
						list.add(temp);
					}
				}
			}
			for (int idx = 0; idx < list.size(); idx++) {
				queue.offer(list.get(idx));
			}
		}
		System.out.println(sb.toString());
	}
}
