
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_2309 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[9];
		int[] quickArr = new int[7];
		int sum = 0;
		boolean quick = false;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			if (i == 6 && sum == 100) {// ���� ������
				quick = true;
				for (int k = 0; k <= 6; k++) {
					quickArr[k] = arr[k];
				}
			}
		}
		Arrays.sort(arr);
		if (quick) {//// ���� ������ 7���� 100�̶��.
			Arrays.sort(quickArr);
			for (int j = 0; j <= 6; j++) {
				System.out.println(quickArr[j]);
			}
			return;//ó�� 6�� �Է��� ���� 100�̶�� 34�� ������ �ʿ䰡 ����.
		}
		
		for (int i = 0; i < 8; i++) {// 8���� ���� j�� i+1�̴ϱ�
			for (int j = i + 1; j < 9; j++) {//
				if (sum - (arr[i] + arr[j]) == 100) {// i, i+1 ���� ���� ���� sum�� ���� 100�̸�
					for (int m = 0; m < 9; m++) {// ���
						if (m == i || m == j) {
							continue;
						}
						sb.append(arr[m] + "\n");
					}
					System.out.print(sb.toString());
					return;// �׸��� ������
				}
			}
		}

	}
}
