

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer stk;
		Data [] arr=new Data[n]; 
		for(int i=0;i<n;i++) {
			stk=new StringTokenizer(br.readLine()," ");
			int w=Integer.parseInt(stk.nextToken());
			int h=Integer.parseInt(stk.nextToken());
			arr[i]=new Data(w,h);
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i].weight>arr[j].weight && arr[i].height>arr[j].height) {
					arr[j].rankUp();
				}
			}
		}
		
		for(Data r:arr) {
			System.out.print(r.rank+" ");
		}
		
	}
	static class Data{
		int weight;
		int height;
		private int rank=1;
		Data(int w,int h){
			this.weight=w;
			this.height=h;
		}
	    void rankUp(){
	    	rank++;
	    }
		
	}
}
