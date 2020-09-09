

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11047 {
	static int flag=0;
	static int money,N;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(stk.nextToken());
		money=Integer.parseInt(stk.nextToken());
		int []arr=new int [N];//�迭�� ������ ������ �־���
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]<=money) {//���Ǵ� ������ ������ idx�� flag�� ���
				flag=i;
			}
		}
		System.out.println(solution(arr));
	}
	private static int solution(int []arr) {
		int ans=0;
		for(int i=flag;i>=0;i--) {//arr�� ������������ ���ĵǾ�����
			ans+=money/arr[i];//���� ���� Ƚ��
			money%=arr[i];//�������� �ٲٱ�
		}
		return ans;	
	}
}
