

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * �� �ٿ� �ϳ��� ������ ������ �����ϴ� ������ ����Ѵ�. 
 * �ߺ��Ǵ� ������ ���� �� ����ϸ� �ȵǸ�, �� ������ �������� �����ؼ� ����ؾ� �Ѵ�.
 * ������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.
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
		if(k==M) {//k==M�� ���� ���
			for(int i=0;i<M;i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=1;i<=N;i++) {//N�� Ȱ���� �� �ִ� ����
			if(!check[i]) {//ó���� ����  false;
				arr[k]=i;//k==0 -> k++  i==1 i++
				check[i]=true;//���⼭ i=true;
				Solution(k+1);
				check[i]=false;
			}
		}
			
	}
	
}
