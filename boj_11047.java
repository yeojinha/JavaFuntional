

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
		int []arr=new int [N];//배열은 오름차 순으로 넣어짐
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]<=money) {//허용되는 범위의 마지막 idx를 flag에 기록
				flag=i;
			}
		}
		System.out.println(solution(arr));
	}
	private static int solution(int []arr) {
		int ans=0;
		for(int i=flag;i>=0;i--) {//arr은 오름차순으로 정렬되어있음
			ans+=money/arr[i];//나눈 몫은 횟수
			money%=arr[i];//나머지로 바꾸기
		}
		return ans;	
	}
}
