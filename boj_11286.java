import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class twoValues{
	int abs;
	int num;
	twoValues(int a,int b){
		this.abs=a;
		this.num=b;
	}
}
public class boj_11286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		StringBuilder sb=new StringBuilder();
		Queue<twoValues> qu=new PriorityQueue<twoValues>((i1,i2)->{
			int abs1=Math.abs(i1.num);
			int abs2=Math.abs(i2.num);
			if(abs1==abs2) return i1.num-i2.num;
			return i1.abs-i2.abs;	
		});
		twoValues temp;
		Integer n=Integer.valueOf(br.readLine());
		for(int i=0;i<n;i++) {
			stk=new StringTokenizer(br.readLine()," ");
			Integer num=Integer.valueOf(stk.nextToken());
			Integer abs=Math.abs(num);
			if(num==0) {
				if(qu.isEmpty()) {
					sb.append(num+"\n");
				}else {
					temp=qu.poll();
					sb.append(temp.num+"\n");
				}
			}else
				qu.offer(new twoValues(abs,num));
		}
	//	System.out.println("---------");
		System.out.println(sb.toString());
	}

}
