

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*
 * BufferedWriter를 사용하지 않으면 시간초과가 뜬 문제임.
 * 
 * 
 */
public class boj_15651 {
	static int N,M;
	static int [] arr;
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(stk.nextToken());
		M=Integer.parseInt(stk.nextToken());
		arr=new int[N+1];
		
		solution(0);
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	private static void solution(int k) throws IOException {
		
		if(k==M) {
			for(int i=0;i<M;i++) {
				bw.write(String.valueOf(arr[i]+" "));
			}
			bw.newLine();
			return;
		}
		
		for(int i=1;i<=N;i++) {
			arr[k]=i;
			solution(k+1);
		}
		
	}
}
