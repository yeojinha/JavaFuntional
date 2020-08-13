package Codility;

public class FrogJmp {

	public static void main(String[] args) {
		
	}
	public static int Solution(int X, int Y, int D) {
		Y-=X;
		int result=Y/D;
		int remainder=Y%D;
		if(remainder>0){//나머지가 존재하면 한 번더 더해야 하므로,
			result+=1;
		}
		return result;
	}

}
