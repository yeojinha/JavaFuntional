

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_12755_copy {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i = 0;
		while (N > 0) {
			i++;
			String str = String.valueOf(i);
			N -= str.length();
			if (N <= 0) {
				System.out.println(str.charAt(str.length() - 1 + N));
			}
		}
	}
}
