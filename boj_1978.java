


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class boj_1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.valueOf(bf.readLine());
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");	
		List<Integer> list = new ArrayList<>();
		
			for(int i=0;i<cases;i++) {
				list.add(Integer.valueOf(stk.nextToken()));
			}
		System.out.println(
				list.stream()
				.filter(i->checking(i))
				.collect(Collectors.counting())
				);

	}
	public static boolean checking (int n) {
		
		if(n<2) {//1이면 false;
			return false;
		}
		for(int i=2;i<n;i++) {//
			if(n%i==0) {//나 이외로 나누어지면 false;
				return false;
			}
		}
		return true;
		
	}
/*
	static private List sosu(List<Integer> list) {
		List<Integer> sosu_list = new ArrayList<>();
		for (Integer n : list)
			if (n % n == 0 & n / 1 == n) {
				sosu_list.add(n);
			}
		return sosu_list;
	}
*/
}
