package Codility;

public class CountDiv {

	public static void main(String[] args) {
	System.out.println(solution(3,12,3));

	}
	    public static int solution(int A, int B, int K) {
	        if(A%K==0) {
	            return (B/K - A/K)+1;
	        }
	        return B/K - A/K;
	    }
	//단순 for문으로 할 경우 performance 부분에서 많은 저하가 발생
}
