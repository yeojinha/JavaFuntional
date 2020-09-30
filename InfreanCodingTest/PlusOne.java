package InfreanCodingTest;

public class PlusOne {

	public static void main(String[] args) {
		PlusOne a = new PlusOne();
		//int  digits[]= {1,2,3};
		//int digits[]={9,9,9};
		int digits[]={9,8,9};
		//int digits[]={0,0,1};
		int[] result=a.solution(digits);
		
		for(int i: result) {
			System.out.print(i+" ");
		}

	}
	public int [] solution(int [] arr) {

		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=9) {
				arr[i]++;
				break;
			}else {
				arr[i]=0;
			}
			if(i==0) {
				int []result=new int [arr.length+1];
				result[0]=1;
				return result;
			}
		}
	
		
		return arr;
	}
}
