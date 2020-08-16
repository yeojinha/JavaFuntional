package Codility;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int []A= {3,1,2,4,3};
	System.out.println("S1: "+solution(A));
	System.out.println("enhanced_S2: "+ehanced_solution(A));

	}
	static public int solution(int[] A) {//53% �ߺ� ������ 
		int P=1;
		int lessP=0;
		int overP=0;
		int minResult=Integer.MAX_VALUE;
		int temp=0;
		while(P<A.length) {
			for(int i=0;i<A.length;i++) {
				if(i<P) {
					//System.out.println("i<p: "+A[i]);
					lessP+=A[i];
				}else {

					//System.out.println("p<N-1: "+A[i]);
					overP+=A[i];
				}
			}
			P++;
			//System.out.println("lessP-overP: " +lessP+"-"+overP);
			temp=(int)Math.abs(lessP-overP);
			//System.out.println("TEMP: "+temp);
			lessP=overP=0;
			if(temp<minResult) {
				minResult=temp;
			}
			
		}
		return minResult;
	}
	static public int ehanced_solution(int[] A) {
		
		 int sum=0;
			for(int i: A) {
				sum+=i;
			}
			int lessP=0;
			int overP=0;
			int temp=0;
			int min=Integer.MAX_VALUE;
			for(int P=1;P<A.length;P++) {
				lessP+=A[P-1];//lessP�� ���� P�� �ö����ν� Ŀ���� 
				overP+=(sum-lessP);//lessP p-1 ���� �ö󰡼� ������ |(0���� n-2)-(n-1)| ���� �ö�
				temp=(int)Math.abs(lessP-overP);
				overP=0;
				if(min>temp) {
					min=temp;
					
				}
			}		
			return min;
	}
	
}
