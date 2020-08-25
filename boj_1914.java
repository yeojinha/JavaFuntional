

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class boj_1914 {
	static StringBuilder sb=new StringBuilder();
	static boolean isLower=false;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		BigDecimal big=new BigDecimal(2);
		BigDecimal count=big.pow(n).subtract(new BigDecimal("1"));
		System.out.println(count);
		//hanoi(n,1,3);hanoi탑 움직인 횟수는2^n-1 이므로 20초과이면 그냥 함수 실행없이 바로 횟수만 출력하여, 메모리 아낌
		if(n<=20 && isLower!=true) {
			hanoi(n,1,3);//20이하인 경우 출력도 해주어야 하므로 실행을 함.
			isLower=true;
		}
		if(isLower==true)
			System.out.println(sb.toString());
	}
	private static void hanoi(int n,int x,int y) {
		if(n>1)
			hanoi(n-1,x,6-x-y);//n-1,1,2 1번의 n-1번 타워를 2번으로 이동
				sb.append(x+" "+y+"\n");
		if(n>1)
			hanoi(n-1,6-x-y,y);//2번의 n-1번의 타워를 3번으로 이동
		/*
		 * 
		 */
		
		
		/*if(n>1)
			hanoi(n-1,x,6-x-y);
			sb.append(x+" "+y+"\n");
		if(n>1)
			hanoi(n-1,6-x-y,y);
		*/
		/*if(n==1)
			System.out.println(start+" "+end);
		else	
			hanoi(n-1,start,end,mid);
			System.out.println(start+" "+end);
			hanoi(n-1,mid,start,end);*/
	}

}
