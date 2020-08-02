

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_2493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<data> stack = new Stack();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= n; i++) {
			int num = Integer.parseInt(stk.nextToken());
			if (stack.isEmpty()) {
				sb.append(0 + " ");
				// System.out.println("first num: "+ num);
				stack.add(new data(num, i));
				continue;
			}

			while (!stack.isEmpty()) {// peek이 새로운 수보다 작으면 반복해서 비교하고 peek을 뻄
				if (stack.peek().value >= num) {
					sb.append(stack.peek().idx + " ");
					//stack.push(new data(num, i));
					break;
				} else {
					stack.pop();
				}
			}
			if (stack.isEmpty())
				sb.append(0 + " ");
			stack.push(new data(num,i));
		}
		System.out.println(sb.toString());
	}

	static class data {
		int idx;
		int value;

		data(int value, int idx) {
			this.idx = idx;
			this.value = value;
		}
	}

}
