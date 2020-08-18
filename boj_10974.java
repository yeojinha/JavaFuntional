


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10974 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sf=new StringBuffer();
		Integer N=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			sf.append(i+1);
		}
		String txt=sf.toString();
		//System.out.println("substring(0,0): "+txt.substring(0,0)); �ƹ��͵� �ȳ���
		permute(txt);
		
		

	}
	public static void permute(String txt) {
		
		if(txt==null || txt.length()==0)
		{
			return;
		}
		permute("",txt);
	}
	
	private static void permute(String prefix, String remaining) {
	
		if(remaining.length()==0) {
			for(int i=0;i<prefix.length();i++) {
				System.out.print(prefix.charAt(i)+" ");
			}
			System.out.println();
			return;
		}
		//System.out.println("remaining_length: "+remaining.length());
		//System.out.println("preifx: "+prefix);
		//�ʱ� prefix�� "", remaining�� ��ü txt;
		for(int i=0;i<remaining.length();i++) {
			permute(prefix+remaining.charAt(i),
					remaining.substring(0,i)+
					remaining.substring(i+1,remaining.length()));
			//remaining�� ���� �پ�� 0�̵ȴ�.
		}
		
		
	}
	private static void swap(int []arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	private static void Solution(int []arr,int k) {
		if(k==arr.length) {
			for(int i:arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		for(int i=k;i<arr.length;i++) {
			swap(arr,i,k);
			Solution(arr,k+1);
			swap(arr,k,i);
		}
	}

}
