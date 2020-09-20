package InfreanCodingTest;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		TwoSum a = new TwoSum();
		int[] result = a.solve(nums, target);
		for (int i : result) {
			System.out.print(i + " ");
		}
		int[] result_2 = a.solve_2(nums, target);
		for (int i : result_2) {
			System.out.print(i + " ");
		}
	}

	public int[] solve(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {//if(8 is in Map )
				int mapValue = map.get(arr[i]);//mapValue value 0
				result[0] = mapValue + 1;// value 0 + 1 = 1
				result[1] = i + 1;// 1+1 = 2 
			} else {
				map.put(target - arr[i], i);//10-2 -> put key 8 value 0
			}
		}
		return result;
	}

	public int[] solve_2(int[] arr, int target) {
		int[] result = new int[2];
		//이중포문
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (target - (arr[i] + arr[j]) == 0) {
					result[0] = i + 1;
					result[1] = j + 1;
				}
			}
		}
		return result;
	}
}
