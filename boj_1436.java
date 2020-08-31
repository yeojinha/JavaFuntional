

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1436 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		Solution(N);
		Solution_2(N);
	}
	private static void Solution_2(int N) {
		int num=0;
		while(N>0) {
			num++;
			if(String.valueOf(num).contains("666")) {
				N--;
			}
		}
		System.out.println(num);
	}
	
	private static void Solution(int N) {//복잡한 방법/
		int result_count=0;
		String tmp="";
		int i=666;
		while(N!=result_count) {
		
			tmp=String.valueOf(i);
			int cnt=0;
			for(int j=0;j<tmp.length();j++) {
				int option=(Integer.valueOf(tmp.charAt(j)))-48;
				if(option==6) {
					cnt++;
					if(cnt>=3) {
						break;
					}
				}else cnt=0;
			}
			if(cnt>=3) result_count++;
			if(N==result_count) break;
			i++;
		}
		System.out.println(tmp);
	}
}
