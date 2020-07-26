package Java_Algo;

public class recursiveFindingMax {

	public static void main(String[] args) {
		int []arr= {1,23,4,2,1,2,4,4,6,4,1,23,1,11,10};
		System.out.println(findMax(arr,0,arr.length-1));
		
	}
	static int findMax(int [] arr,int begin,int end) {
		if(begin==end) {
			return arr[begin];
		}else {
			return Math.max(arr[begin],findMax(arr,begin+1,end));
			//max를 이용하여 idx[0]과 idx++하여 끝과 idx[end]와 비교하여 그중에 큰 것을 반환받음.
			//이후 마지막 arr[begin]과 비교
		}
	}
}
