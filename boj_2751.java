import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class boj_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		solution_1();
		solution_2();
		solution_3();

	}

	public static void solution_1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arr);
		for (int i = 0; i < n; i++) {
			sb.append(arr.get(i) + "\n");
			// bw.write(i+"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	public static void solution_2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Set<Integer> trSet = new TreeSet<>();

		for (int i = 0; i < n; i++) {
			trSet.add(Integer.parseInt(br.readLine()));
		}
		for (int i : trSet) {
			sb.append(i + "\n");
			// bw.write(i+"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	public static void solution_3() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (Integer.parseInt(br.readLine()));
		}
		Arrays.sort(arr);
		for (int i : arr) {
			sb.append(i + "\n");
			// bw.write(i+"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
