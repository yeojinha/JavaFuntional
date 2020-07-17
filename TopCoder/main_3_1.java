package TopCoder;

public class main_3_1 {

	public static void main(String[] args) {
		int [] arr= {11,33,44,5,1,2,3,5,66,100};		
		int max=getMaxNum(arr);
		
	}
	public static int getMaxNum(int [] array) {
		int ret=array[0];
		for(int i=1;i<array.length;i++) {
			if(ret<array[i]) ret=array[i];
		}
		return ret;
	}

}
