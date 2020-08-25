

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
		//hanoi(n,1,3);hanoiž ������ Ƚ����2^n-1 �̹Ƿ� 20�ʰ��̸� �׳� �Լ� ������� �ٷ� Ƚ���� ����Ͽ�, �޸� �Ƴ�
		if(n<=20 && isLower!=true) {
			hanoi(n,1,3);//20������ ��� ��µ� ���־�� �ϹǷ� ������ ��.
			isLower=true;
		}
		if(isLower==true)
			System.out.println(sb.toString());
	}
	private static void hanoi(int n,int x,int y) {
		if(n>1)
			hanoi(n-1,x,6-x-y);//n-1,1,2 1���� n-1�� Ÿ���� 2������ �̵�
				sb.append(x+" "+y+"\n");
		if(n>1)
			hanoi(n-1,6-x-y,y);//2���� n-1���� Ÿ���� 3������ �̵�
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
