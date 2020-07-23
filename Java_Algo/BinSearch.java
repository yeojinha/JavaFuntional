package Java_Algo;

public class BinSearch {

	static int binSearch(int []arr,int key) {
		
		//To use binSearch algo it must to be sorted beforehand;
		int start=0;
		int end=arr.length-1;
		do {
			int pc=(start+end)/2;
			if(arr[pc]==key) {
				return pc;
			}else if(arr[pc]<key) {
				start=pc+1;
			}else
				end=pc-1;
		}while(start<=end);
		
		return -1;
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binSearch(arr,14));
		System.out.println(binSearch(arr,4));

	}

}
