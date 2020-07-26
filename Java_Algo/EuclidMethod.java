package Java_Algo;

public class EuclidMethod {

	public static void main(String[] args) {
		System.out.println("gcd: "+gcd(1071,1029));
	}
	static int gcd(int m,int n) {
		return m%n==0? n:gcd(n,m%n);
		//return n==0? n:gcd(n,m%n);
		
	}
}
