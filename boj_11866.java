

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj_11866 {
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(stk.nextToken());
		int m=Integer.parseInt(stk.nextToken());
		LinkedList<Integer> Q = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) Q.offer(i);//add specified value;p
		
		int cnt = 0, i = 0; 
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(!Q.isEmpty()) { 
			cnt++;
			if(cnt % m == 0) { 
				sb.append(Q.remove(i--)); 
				if(!Q.isEmpty()) sb.append(", "); 
			}
			if(Q.size()-1>i)
				i++;
			else
				i=0;
		}
		sb.append(">");
		System.out.println(sb.toString());
	}	
}
