package TopCoder;

import java.util.Arrays;

public class main_3_3 {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,11,2,3,66,3223,4,7,4,232,2,31};
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
