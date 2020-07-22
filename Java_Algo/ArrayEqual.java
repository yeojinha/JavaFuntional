package Java_Algo;

public class ArrayEqual {

	static boolean Equals(int []a, int []b) {
		if(a.length!=b.length)
			return false;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
	static int [] copyOfArray(int []a) {
		
		int [] result=new int [a.length];
		
		for(int i=0;i<a.length;i++) {
			result[i]=a[i];
		}
		return result;
	}
	static int[] rCopy(int []a)
	{	
		int leng=a.length;
		int []reverse=new int[leng];
		int i=0;
		do {
			reverse[i++]=a[--leng];
		}while(leng>0);
		
		return reverse;
	}
	
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7};
		int []b=copyOfArray(a);
		int[] reverse=rCopy(a);
		for(int i: reverse) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Are they same? "+Equals(a,b));
		
		
	}

}
