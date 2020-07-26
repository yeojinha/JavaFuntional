package Java_Algo;

public class Power {

	public static void main(String[] args) {
	
		System.out.println(power(2,3));
	}
	static double power(double x, int n) {
		return n==0? 1:x*power(x,n-1);
	}
	
}
