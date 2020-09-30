package InfreanCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class MeetingRoom2 {
		static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 stk=new StringTokenizer(br.readLine());
		 int n=Integer.parseInt(stk.nextToken());
		 Interval [] list =new Interval[n];
		 for(int i=0;i<n;i++) {
			 stk=new StringTokenizer(br.readLine()," ");
			 int start=Integer.parseInt(stk.nextToken());
			 int end=Integer.parseInt(stk.nextToken());
			 //System.out.println("\n"+start+" "+end);
			 list[i]=new Interval(start,end);
		 }
		 System.out.println("=============");
		 for(int i=0;i<list.length;i++) {
			 System.out.println(list[i].start+" "+list[i].end);
		 }
		 //System.out.println(solution(list));
		 //System.out.println(solution_2(list));
		 System.out.println(solution_3(list));
	}
	public static int solution(Interval []list) {
		int max=0;
		if(list==null || list.length==0) return max;//0
		Arrays.sort(list,(i1,i2)->i1.start-i2.start);
		
		Queue<Interval> minHeap=new PriorityQueue<>(list.length,(i1,i2)->i1.end-i2.end);
		
		for(int i=0;i<list.length;i++) {
			
			while(!minHeap.isEmpty() && minHeap.peek().end<=list[i].start) {
				minHeap.poll();
			}
			minHeap.offer(list[i]);
			max=Math.max(max, minHeap.size());
		}
		
		return max;
	}
	public static int solution_2(Interval []list) {
		//System.out.println("========\n"+list[0].start+" "+list[0].end);
		if(list==null || list.length==0) return 0;//0
		//Arrays.sort(list,(i1,i2)->i1.start-i2.start);
		//int count=0;
		Queue<Interval> minHeap=new PriorityQueue<>(list.length,(i1,i2)->{
			int i=i1.end-i2.end;
			if(i==0) {
				return i1.start-i2.start;
			}else return i;
		});
		minHeap.offer(list[0]);
		for(int i=1;i<list.length;i++) {
			Interval inte=minHeap.poll();
			if(inte.end<=list[i].start) {
				inte.end=list[i].end;
				//count++;
			}else {
				minHeap.offer(list[i]);
			}
			minHeap.offer(inte);
			
		}
		//System.out.println("count: "+count);
		return minHeap.size();
	}
	public static int solution_3(Interval [] list) {
		System.out.println("========\n"+list[0].start+" "+list[0].end);
		Arrays.sort(list,(i1,i2)->{
			int i=i1.end-i2.end;
			if(i==0) {
				return i1.start-i2.start;
			}
			return i;
		});
		
		int cnt=1;
		//System.out.println("==============");
		int end=list[0].end;
		//System.out.println("0¹ø"+list[0].start+" "+list[0].end);
		for(int i=1;i<list.length;i++) {
			if(end<=list[i].start) {
				System.out.println(list[i].start+" "+list[i].end);
				end=list[i].end;
				cnt++;
			}
		}
		return cnt;
		
		
	}

}
