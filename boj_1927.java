import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class boj_1927 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer n=Integer.valueOf(br.readLine());
		StringBuilder sb=new StringBuilder();
		Queue <Integer>qu=new PriorityQueue<Integer>();
		for(int i=0;i<n;i++)
		{
			int num=Integer.valueOf(br.readLine());
			if(num==0) {
				if(qu.isEmpty())
					sb.append(0+"\n");
				else
					sb.append(qu.poll()+"\n");
			}else {
				qu.add(num);
			}
		}
		
		System.out.println(sb.toString());

	}

}
