package InfreanCodingTest;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 5, 50, 75 };
		// int[] nums = { 0, 1, 2, 3, 7 };
		int lower = 0, upper = 99;
		System.out.println(solution(nums, lower, upper));
		System.out.println(solve(nums, lower, upper));

	}

	public static List<String> solve(int[] nums, int lower, int upper) {
		List<String> result = new ArrayList<String>();
		if (nums == null || nums.length < 1) {
			return result;
		}

		// 2-1
		if (lower < nums[0]) {
			result.add(makeRange(lower, nums[0] - 1));
			// lower ==0, nums[0] == 1이라면 1만 추가해야한다.
		}
		// 2-2
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1] && nums[i] + 1 < nums[i + 1]) {
				//nums[i]과 nums[i+1]는 != 그리고 nums[i]+1로 두고 nums[i+1]보다 작다면 -> "3<5" 이야기, "3<4"일 경우 발동될 이유가 없다.
				result.add(makeRange(nums[i] + 1, nums[i + 1] - 1));
			}
		}
		// 2-3
		if (nums[nums.length - 1] < upper) {//마지막 변수가 upper보다 작다면 list에 add해주어야 함.
			result.add(makeRange(nums[nums.length - 1] + 1, upper));
		}
		return result;
	}

	public static String makeRange(int low, int high) {
		return low == high ? String.valueOf(low) : (low + "->" + high);
		// 전자의 경우 low만 추가하는데 이 같은 경우는
		/*
		 * low가 0이고 high가 1인 경우이다.
		 */
	}

	public static List<String> solution(int[] nums, int lower, int upper) {// 무식한 방법
		List<String> result = new ArrayList<String>();
		if (nums == null || nums.length < 1) {
			return result;
		}
		List<Integer> temp = new ArrayList<Integer>();
		int start = lower;
		StringBuilder str = new StringBuilder();
		for (int k = 0; k < nums.length; k++) {
			str = new StringBuilder();
			temp.clear();
			for (int i = start; i < nums[k]; i++) {// 여기 for문에서 효율성 저하
				temp.add(i);
			}

			if (temp.size() > 1) {
				str.append(temp.get(0) + "->" + temp.get(temp.size() - 1));
			} else if (temp.size() == 1) {
				str.append(temp.get(0));
			}
			if (str.length() >= 1)
				result.add(str.toString());
			if (k <= nums.length - 2)
				start = nums[k] + 1;
			else {
				if (nums[nums.length - 1] + 1 < upper)
					if (upper - (nums[nums.length - 1] + 1) > 1) {
						result.add(String.valueOf(nums[nums.length - 1] + 1) + "->" + upper);
					} /*
						 * else result.add(String.valueOf(nums[nums.length-1]+1)+"->"+upper);
						 */
			}
		}

		return result;
	}
}
