package Java_Algo;

public class fibo {

	public static void main(String[] args) {
		System.out.println(fibo(3));
	}
	private static int fibo(int n) {
		
		if(n<3)//2이하는 1임.
			return 1;
		else {
			return fibo(n-1)+fibo(n-2);//피보나치를 보면
			//1 1 2 3 
			//1 2 3 4 <- idx2번까지는 1임 
			//idx 3번을 보면 idx(3-1)+ idx(3-2)의 값이 idx(3)이라는 것을 알 수 있음.
			//이러한 규칙을 이용해 재귀함수로 구함.
		}
	}

}
