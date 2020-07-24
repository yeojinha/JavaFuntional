package Java_Algo;

public class Hanoi {

	public static void main(String[] args) {
		
		move(3,1,3);
		
	}
	private static void move(int no, int x, int y) {
		if(1>no)
			move(no-1,x,6-x-y);//no-1, 1,6-(1-3)==2 // no-1,1,2 no-1번째를 1번에서 2번으로 
		System.out.printf("원반[%d]을 %d 기둥에서 %d 기둥으로 옮김\n",no,x,y);
		if(1>no)
			move(no-1,6-x-y,y);//no-1,2,3; //no-1번째를 2번에서 3번으로
		
	}

}
