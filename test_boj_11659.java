import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_boj_11659 {
	static int arrLength;
	static int[] arr;
	static int[] newArr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		arrLength = Integer.valueOf(stk.nextToken());
		int cases = Integer.valueOf(stk.nextToken());
	/*

//0 15 12 3 9 3 2 1 5 4 0 0 0 0 0 0 
//0 15 12 3 2 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
		 */
		arr = new int[arrLength];
		//int leng=(int)Math.ceil(Math.log(arrLength)/Math.log(2));
		newArr = new int[arrLength*4];
		stk = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i <arrLength; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		init(0, arrLength-1,1);//(1,1,arrLength);
		/*for(int i:newArr) {
			System.out.print(i+ " ");
		}
		//5, 3, 7, 9, 6, 4, 1, 2, 1
		System.out.println("\n----------");*/
	for (int i = 0; i < cases; i++) {
			stk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			/*실제 사용되는 idx는 -1해줘야 한다.*/
			int result=sum(1, 0, arrLength-1, a-1, b-1);
			sb.append(result+ "\n");
		}
		System.out.print(sb.toString());
	}
	static int init(int start,int end,int node) {
		if(start==end) {
			return newArr[node]=arr[start];
		}
		
		int mid=(start+end)/2;
		newArr[node]+=init(start,mid,node*2);
		newArr[node]+=init(mid+1,end,node*2+1);
		return newArr[node];
	}
	

	static int sum(int node, int start, int end, int left, int right) {
		if (start > right || end < left)
			return 0;
		//System.out.println("node: ");
		if (left<=start&&end<=right) {
			return newArr[node];
		}

		int mid = (start + end) / 2;
		return sum(node * 2, start, mid, left, right) + sum(node * 2 + 1, mid + 1, end, left, right);
	}
}
