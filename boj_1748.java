

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1748 {
	/*
	 * 1부터 N까지의 수를 이어서 쓰면 다음과 같이 새로운 하나의 수를 얻을 수 있다.
	 * 
	 * 1234567891011121314151617181920212223...
	 * 
	 * 이렇게 만들어진 새로운 수는 몇 자리 수일까? 이 수의 자릿수를 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		if(N<10) {
			bw.write(N);
		}
		int num=100;//100자리가 되면
		int length=2;
		int count=9;//10이상이면 9부터 시작해야함.
		for(int i=10;i<=N;i++) {//1자리수면 1자리수만 더함 2자리수면 두자리 더함
			
			if(i==num) {
				length++;
				num*=10;//0뒤에 하나 더 붙임.
			}
			count+=length;
			//10이면 2자리
			//100이되면 3자리
			//1000이되면 4자리
			//10000되면 5자리
		}
		//System.out.println(count);
		bw.write(count);
		bw.flush();
	}

}
