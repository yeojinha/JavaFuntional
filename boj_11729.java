

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11729 {
	static StringBuilder sb=new StringBuilder();
	static int counts=0;
	public static void main(String[] args) throws IOException {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	
	int n=Integer.parseInt(bf.readLine());
		move(n,1,3);
		System.out.println(counts);
		System.out.println(sb.toString());
		
	}
	private static void move(int n,int x,int y) {
		counts++;
		if(n>1)
			move(n-1,x,6-x-y);
		sb.append(x+" "+y+"\n");
		if(n>1)
			move(n-1,6-x-y,y);
	}
}
