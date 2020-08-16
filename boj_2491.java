

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2491 {
	public static void main(String [] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer cases=Integer.parseInt(br.readLine());
		StringTokenizer stk=new StringTokenizer(br.readLine()," ");
		int [] arr=new int [cases];
		/*int i=0;
		while(stk.hasMoreTokens()){
			arr[i++]=Integer.parseInt(stk.nextToken());
		}*/
		for(int i=0;i<cases;i++) {
			arr[i]=Integer.parseInt(stk.nextToken());
		}
		int leng=cases-1;
		int i=0;
		int left=1,right=1;
		int lftMax=1; int rhtMax=1;
		while(i+1<cases) {
			
			if(arr[i]<=arr[i+1]) {
				//System.out.printf("arr[%d]:%d < arr[%d]:%d\n",i,arr[i],i+1,arr[i+1]);
				left++;
				if(lftMax<=left) {
					lftMax=left;
				}
				//System.out.println("left: "+left);
			}else{
				left=1;
			}
			if(arr[leng-1]>=arr[leng]) {
				//System.out.printf("arr[%d]:%d > arr[%d]:%d\n",leng-1,arr[leng-1],leng,arr[leng]);	
				right++;
				if(rhtMax<=right) {
					rhtMax=right;
				}
				//System.out.println("right: "+right);
			}else {
				right=1;
			}
			i++;
			leng--;
		}
		int result=rhtMax>lftMax? rhtMax:lftMax;
		System.out.println(result);
		
	}
}
