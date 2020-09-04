

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 
 * 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 */
public class boj_15649 {
	static int N;
	static int M;
	static int [] arr;
	static boolean []  check;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(stk.nextToken());
		M=Integer.parseInt(stk.nextToken());
		arr=new int[M+1];
		check=new boolean[N+1];
		Solution(0);
		
	}
	private static void Solution(int k) {
		if(k==M) {//k==M일 때인 출력
			for(int i=0;i<M;i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=1;i<=N;i++) {//N은 활용할 수 있는 숫자
			if(!check[i]) {//처음엔 전부  false;
				arr[k]=i;//k==0 -> k++  i==1 i++
				check[i]=true;//여기서 i=true;
				Solution(k+1);
				check[i]=false;
			}
		}
			
	}
	
}
