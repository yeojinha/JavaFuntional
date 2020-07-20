

import java.io.IOException;
import java.util.Scanner;

public class boj_4948 {

	public static boolean primeNumbers[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner std=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		;
		int count=0;
		int start;
		while(true){
			count=0;
			start=std.nextInt();
			if(start==0) break;
			int end=start*2;
			primeNumbers=new boolean [end+1];
			//primeNumbers[1]=true;
			//primeNumbers[1]=true;
			for(int i=2;i<=end;i++) {
				for(int j=2;j*i<=end;j++) {
						primeNumbers[i*j]=true;
						
				}
				//System.out.println("count: "+count);
			}
			
			for(int i=start+1;i<primeNumbers.length;i++)
					if(!primeNumbers[i])count++;//������ n*2���� �Ҽ��� �ƴ� ���� ���ش�.
			
			sb.append(count+"\n");
		}
		/*
		 * 
1
10
13
100
1000
10000
100000
0
		 */
		
		System.out.print(sb);
		
		/*do {
			n=std.nextInt();
			sb.append(IntStream.range(n+1,(n*2)+1)
			.filter(i->prime(i))
			.count()).append("\n");
		}while(n!=0);
		*/
	
		
	}
	
	public static boolean prime (int n) {	
		if(n<2) {//1�̸� false;
			return false;
		}
		for(int i=2;i<n;i++) {//
			if(n%i==0) {//�� �ܷ̿� ���������� false;
				return false;
			}
		}
		return true;
	}
}
