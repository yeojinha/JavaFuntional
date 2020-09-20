package InfreanCodingTest;

import java.util.Stack;

public class DailyTemperture {

	public static void main(String[] args) {
		DailyTemperture a = new DailyTemperture();
		int[] nums = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] result_1 = a.solve_1(nums);
		for (int i : result_1) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] result_2 = a.solve_2(nums);
		for (int i : result_2) {
			System.out.print(i + " ");
		}
	}

	public int[] solve_1(int[] nums) {//978 ms 
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			inner: for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					ans[i] = j - i;
					break inner;
				}
			}
		}
		return ans;
	}

	public int[] solve_2(int[] nums) {//14ms
		Stack<Integer> stack = new Stack<>();
		// { 73, 74, 75, 71, 69, 72, 76, 73 };
		// { 0, 1, 2, 3, 4, 5, 6, 7};
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
				// result[0]=1-0;
				int idx = stack.pop();// 0, 1, 2
				result[idx] = i - idx;
				
			}
			stack.push(i);// 0 , 1 , 2 , 3 , 4,
			
		}
		return result;
	}
	
}
