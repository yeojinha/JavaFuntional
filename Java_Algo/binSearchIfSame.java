package Java_Algo;

public class binSearchIfSame {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,5,5,5,5};
		
		System.out.println(binSearch(arr,5));
	}
	private static int binSearch(int []arr,int key) {
		int pr=arr.length-1;
		int pl=0;
		do {
			int pc=(pr+pl)/2;
			if(arr[pc]==key) {
				for(int i=0;i<=pc;i++) { //0부터 pc까지 for문으로 순차적 검색
					if(arr[i]==key) {
						return i;
					}
				}
			}
			else if(arr[pc]<key) {
				pl=pc+1;
			}else
				pr=pc-1;
		}while(pl<=pr);
		return -1;
	}

}
