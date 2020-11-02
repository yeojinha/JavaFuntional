import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class boj_11279 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer n=Integer.valueOf(br.readLine());
		StringBuilder sb=new StringBuilder();//Collections.reverseOrder()
		Queue<Integer> pq=new PriorityQueue<Integer>((a,b)->b-a);
		for(int i=0;i<n;i++)
		{
			Integer number=Integer.valueOf(br.readLine());
			pq.add(number);
			if(number==0) {
			sb.append(pq.poll()+"\n");
			}
		}
		//System.out.println("------------");
		System.out.println(sb.toString());
			
	}
}
