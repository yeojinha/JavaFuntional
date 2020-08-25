package Java_Algo;

public class BubbleSort_3 {
	static int exchange=0;
	static int switching=0;
	static int cycle=0;
	public static void main(String[] args) {
		int []a= {6,4,3,7,9,8};
		printing(a);
		bubbleSort(a);
		printing(a);
		System.out.printf("exchange 횟수 %d입니다.\n",exchange);
		System.out.printf("싸이클 횟수 %d입니다.\n",cycle);
		System.out.printf("교환 횟수 %d입니다.\n",switching);

	}
	static void printing(int []a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static void swap(int []a,int i,int n) {
		int temp=a[n];
		a[n]=a[i];
		a[i]=temp;
	}
	static void bubbleSort(int a[]) {
		int n=a.length;
		int k=0;
		while(k<n-1) {
			cycle++;
			int last=n-1;
			for(int j=0;j<n-1;j++) {
				switching++;
				if(a[j+1]>a[j]) {
					exchange++;
					swap(a,j+1,j);
					last=j+1;
				}
			}
			k=last;
		}
		
	}
}
