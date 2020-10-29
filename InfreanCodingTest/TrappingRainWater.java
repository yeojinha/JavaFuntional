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
			 * ���� ä���� ĭ��
			 * ���� ���� ĭ - �ش��ϴ� ����� ����
			 * ����  Math.min(2,2)-1 �̶�� ����� �׸���
			 * 2 1 2 �� �� �̹Ƿ�, 2 ������ ��� ���̿� 1¥�� ����� �ִ� ������ 2-1->1�̴�.
			 * �׷��⿡, left, right��  max����� ���ؾ��Ѵ�.
			 * �� ������ �� �ľ��ؾ�, ������ ���� �� �ִ�.
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
