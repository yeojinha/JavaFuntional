

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10872 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(factorial(Integer.valueOf(bf.readLine())));
	}
	static public int factorial(int n) {
		if(n<2) {
			return 1;
		}else
			return n*factorial(n-1);
	}
}
