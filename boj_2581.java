
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalInt;

import java.util.stream.IntStream;

public class boj_2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		Integer start=Integer.valueOf(bf.readLine());
		Integer end=Integer.valueOf(bf.readLine());
		
		Integer sum=IntStream.range(start,end)
				.filter(i->prime(i))
				.sum();
		if(sum==0) {
			System.out.println(-1);	
		}else {
		OptionalInt result=
				IntStream.range(start,end)
				.filter(i->prime(i))
				.findFirst();
		System.out.println(result.getAsInt());
	}
		}
	private static boolean prime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
