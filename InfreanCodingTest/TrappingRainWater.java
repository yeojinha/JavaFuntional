package InfreanCodingTest;

import java.util.Stack;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		System.out.println(solution(height));
	}

	public static int solution(int[] height) {
		int result = 0;
		if (height == null || height.length <= 2) {
			return result;
		}

		int[] left = new int[height.length];
		int[] right = new int[height.length];
		int max = height[0];
		left[0] = height[0];

		for (int i = 1; i < height.length; i++) {
			if (max < height[i]) {
				left[i] = height[i];
				max = height[i];
			} else {
				left[i] = max;
			}
		}
		print("left", left);
		print("height", height);
		max = height[height.length - 1];
		right[height.length - 1] = height[height.length - 1];

		for (int i = height.length - 2; i >= 0; i--) {
			if (max < height[i]) {
				right[i] = height[i];
				max = height[i];
			} else {
				right[i] = max;
			}
		}
		print("right", right);
		print("height", height);

		for (int i = 0; i < height.length; i++) {
			result += Math.min(left[i], right[i]) - height[i];
			/*
			 * 물이 채워진 칸은
			 * 가장 낮은 칸 - 해당하는 기둥의 높이
			 * 만약  Math.min(2,2)-1 이라면 기둥의 그림은
			 * 2 1 2 인 것 이므로, 2 높이의 기둥 사이에 1짜리 기둥이 있는 것으로 2-1->1이다.
			 * 그렇기에, left, right의  max기둥을 구해야한다.
			 * 이 원리를 잘 파악해야, 정답을 구할 수 있다.
			 * 
			 */
		
			System.out.printf("result: %d left[%d]:%d right[%d]:%d height[%d]:%d\n", result, i, left[i], i, right[i], i,
					height[i]);

		}

		return result;

	}

	public static void print(String txt, int[] arr) {
		System.out.print(txt + ": ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}
