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
	
}
