package Codility;

public class ShortestArray {

	public static void main(String[] args) {
	int []A= {1,0,2,0,0,2};
	int []B= {1,5,4};
	System.out.println("solution: "+solution(A));
	System.out.println("solve: "+solve(A));
	}
	public static int solution(int []arr) {
		double max=0;
		int temp=0;
		int idx=0;
		int ans=0;
		for(int i=0;i<arr.length;i++)
			max+=Math.pow(2, arr[i]);	
		System.out.println((int)max);//배열의 총합 2^n
		
		while(temp<=(int)max) {
			temp=(int)Math.pow(2, idx);
			if((int)Math.pow(2,idx+1)>=(int)max) {
				break;
			}
			idx++;
		}
		System.out.println("idx: "+idx+" temp: "+temp);
		for(int i=idx;i>=0;i--) {
			if(max-(int)Math.pow(2, i)>=0) {
				System.out.println("Math.pow: "+(int)Math.pow(2, i));
				max-=(int)Math.pow(2, i);
				ans++;
			}
		}
		//System.out.println("max: "+max);
		return ans;
	}//2진법으로 바꾸고 그 1을 count하라 이 방법 쉽게 먹힘
	public static int solve(int[]arr) {
		double max=0;
		int ans=0;
		for(int i=0;i<arr.length;i++)
			max+=Math.pow(2, arr[i]);
		String binarayString=Integer.toBinaryString((int)max);
		for(int i=0;i<binarayString.length();i++) {
			if(String.valueOf(binarayString.charAt(i)).equals("1")) {
				ans++;
			}
		}
		return ans;
	}
}
