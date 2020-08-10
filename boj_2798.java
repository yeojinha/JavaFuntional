

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2798 {
		static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		stk=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(stk.nextToken());
		int q=Integer.parseInt(stk.nextToken());
		int [] arr=new int [n];
		stk=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(stk.nextToken());
		}
		int temp=0,result=0;
		outline : for(int i=0;i<n-2;i++) {//outline: 유용한 방법
			for(int j=i+1;j<n-1;j++) {
				for(int m=j+1;m<n;m++) {
					temp=arr[i]+arr[j]+arr[m];
					if(temp<=q) {
						//System.out.printf("temp:%d result:%d\n",temp,result);
						result=Math.max(temp, result);
					}
					if(result==q) {
						break outline;
					}
				}
			}
		}
		System.out.println(result);
	}

}
