package Java_Algo;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5,6,7,5,3,2,3,4,1,111,23,4,4,533,-1,0};
		
		bubbleSort(a);
		for(Integer i: a) {
			System.out.print(i+" ");
		}
		
	}
	static void swap(int []a,int i,int j) {
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
	}
	static void bubbleSort(int []a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
	}
}
