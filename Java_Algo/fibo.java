package Java_Algo;

public class fibo {

	public static void main(String[] args) {
		System.out.println(fibo(3));
	}
	private static int fibo(int n) {
		
		if(n<3)//2���ϴ� 1��.
			return 1;
		else {
			return fibo(n-1)+fibo(n-2);//�Ǻ���ġ�� ����
			//1 1 2 3 
			//1 2 3 4 <- idx2�������� 1�� 
			//idx 3���� ���� idx(3-1)+ idx(3-2)�� ���� idx(3)�̶�� ���� �� �� ����.
			//�̷��� ��Ģ�� �̿��� ����Լ��� ����.
		}
	}

}
