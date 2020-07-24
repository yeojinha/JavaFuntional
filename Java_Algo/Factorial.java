package Java_Algo;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(gcd(22,8));
		
		
		
		
	}
	private static int factorial(int n) {
		return n>0? n*factorial(n-1):1;
	}
	private static int gcd(int x,int y) {
		System.out.printf("x: %d y:%d\n",x,y);
		return y==0? x:gcd(y,x%y);
	}

}
