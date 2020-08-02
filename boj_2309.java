
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
			if (i == 6 && sum == 100) {// 만약 기존에
				quick = true;
				for (int k = 0; k <= 6; k++) {
					quickArr[k] = arr[k];
				}
			}
		}
		Arrays.sort(arr);
		if (quick) {//// 만약 기존의 7개가 100이라면.
			Arrays.sort(quickArr);
			for (int j = 0; j <= 6; j++) {
				System.out.println(quickArr[j]);
			}
			return;//처음 6개 입력한 것이 100이라면 34행 실행할 필요가 없다.
		}
		
		for (int i = 0; i < 8; i++) {// 8까지 해줌 j가 i+1이니까
			for (int j = i + 1; j < 9; j++) {//
				if (sum - (arr[i] + arr[j]) == 100) {// i, i+1 더한 것을 기존 sum과 빼서 100이면
					for (int m = 0; m < 9; m++) {// 출력
						if (m == i || m == j) {
							continue;
						}
						sb.append(arr[m] + "\n");
					}
					System.out.print(sb.toString());
					return;// 그리고 종료함
				}
			}
		}

	}
}
