package Codility;

public class FrogJmp {

	public static void main(String[] args) {
		
	}
	public static int Solution(int X, int Y, int D) {
		Y-=X;
		int result=Y/D;
		int remainder=Y%D;
		if(remainder>0){//�������� �����ϸ� �� ���� ���ؾ� �ϹǷ�,
			result+=1;
		}
		return result;
	}

}
