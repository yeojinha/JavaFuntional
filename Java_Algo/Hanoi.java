package Java_Algo;

public class Hanoi {

	public static void main(String[] args) {
		
		move(3,1,3);
		
	}
	private static void move(int no, int x, int y) {
		if(1>no)
			move(no-1,x,6-x-y);//no-1, 1,6-(1-3)==2 // no-1,1,2 no-1��°�� 1������ 2������ 
		System.out.printf("����[%d]�� %d ��տ��� %d ������� �ű�\n",no,x,y);
		if(1>no)
			move(no-1,6-x-y,y);//no-1,2,3; //no-1��°�� 2������ 3������
		
	}

}
