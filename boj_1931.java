

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
/*
바로 시작시간을 기준으로 정렬할 경우 
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14
을 input으로 넣으면
아래의 결과가 나오므로 문제가 생긴다.
0 6
1 4
2 13
3 5
3 8
5 7
5 9
6 10
8 11
8 12
12 14
3
*/
public class boj_1931 {
	static int cnt=1;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		List<timeTable> list=new ArrayList<>();
		int start=0;
		int end=0;
		for(int i=0;i<N;i++) {
			StringTokenizer stk=new StringTokenizer(br.readLine()," ");
			start=Integer.parseInt(stk.nextToken());
			end=Integer.parseInt(stk.nextToken());
			list.add(new timeTable(start,end));
		}
		Collections.sort(list);
		//System.out.println("-----------------------------");
		/*for(timeTable i : list) {
			System.out.println(i.start+" "+i.end);
		}*/
		start=list.get(0).start;
		end=list.get(0).end;
		list.remove(0);
		for(timeTable i: list) {
			if(end<=i.start) {
				cnt++;
				end=i.end;
				//System.out.println(start+" "+end);
			}
		}
		System.out.println(cnt);
	}
	
}
class timeTable implements Comparable<timeTable>{
	public int start;
	public int end;
	timeTable(int start, int end) {
		this.start=start;
		this.end=end;
	}
	public int compareTo(timeTable o) {
		int i=this.end-o.end;//끝나는 시간이 같다면 (i==0)
		if(i==0) i=this.start-o.start;//start를 기준으로 다시 정렬하자. 
		return i;//
	}
}
/*
 * 
4
1 1
2 2
1 1
1 2
*/
