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
		 * �ִ����� ������ == �ּ��� ������  or �ִ��� ������ == �ּ��� ������+1
		 * �ִ����� peek ���� �׻� �ּ��� peek���� �۾ƾ� �Ѵ�.
		 * �ִ��� peek > �ּ��� peek �̶�� ���� peek�� swap ������.
		 * �ִ��� peek�� �׻� �߰� ���� ������ �� �ִ�.
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
		 * �޸��ʰ�!!!!!!!
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
