package Java_Algo;

public class NextPermutation {

	public static void main(String[] args) {
		int[]arr= {6,2,1,5,4,3,0};
		print(arr);
		next_permutation(arr);
		//print(arr);
	}
	private static void print(int [] arr) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	private static void next_permutation(int [] arr) {
		int a=arr.length-2;
		
		while(a>=0&&arr[a]>=arr[a+1]) a--;//a의 끝을 확인//a는 현재 오름차순에서 벗어난 idx이다.
		
		if(a!=-1) {
			int b=arr.length-1;
			while(arr[a]>=arr[b])b--;
			
			swap(arr,a,b);
		}
		
		int start=a+1;
		int end=arr.length-1;
		//System.out.println("----------");
		while(start<end) {
			print(arr);
			swap(arr,start++,end--);
			print(arr);
		}	
	}
	private static void swap(int []arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
