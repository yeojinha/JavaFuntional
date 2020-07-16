package CodingTestUsingFunctional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_18258 {
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		Queue<String> q=new LinkedList<>();
		int tests=Integer.parseInt(bf.readLine());
		StringTokenizer stk;
		int last=0;
		for(int i=0;i<tests;i++) {
			stk=new StringTokenizer(bf.readLine()," ");
			switch(stk.nextToken()) {
			case "pop":
				if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(q.poll()+"\n"); // 제거 하며 읽기
                }
				break;
			case "push":
				last=Integer.parseInt(stk.nextToken());
				q.add(String.valueOf(last));
				break;
			case "size":
				sb.append(q.size()+"\n");
				break;
			case "front":
				if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(q.peek()+"\n"); //
                }
				break;
			case "empty":
				if (q.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n"); //
                }
				break;
			case "back":
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(last+"\n");
                }
                break;
			}
				
		}
		System.out.println(sb);
	}
	
}
