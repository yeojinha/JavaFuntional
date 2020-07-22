package Java_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeqSearchSen {

	private static int seqSearchSen(int []num, int key) {
		int i=0;
		num[num.length-1]=key;//이게 가능하게 하려면 처음에 arr 사이즈를 +1 해주어야 한다.
		do {
			i++;
		}while(num[i]!=key);
		return i==num.length-1? -1:i+1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(bf.readLine());
		int []x=new int [size+1];
		for(int i=0;i<size;i++) {
			x[i]=Integer.parseInt(bf.readLine());
		}
		System.out.print("What number?");	
		int number=Integer.parseInt(bf.readLine());
		
		int idx=seqSearchSen(x, number);
		if(idx==-1) System.out.println("There is no number");
		else System.out.println("The number is "+idx);
		
		

	}

}
