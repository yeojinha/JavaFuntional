package InfreanCodingTest;

public class MovesZeros {

	public static void main(String[] args) {
		/*
		 * 032085라는 배열 주어지면 0을 맨 뒤로 그리고 0이 아닌 value는 상대적 순서 유지
		 * 328500 으로//첫번 째 0의 idx는 4
		 * idx를 기억해야함 
		 * 0이 아니면 0 idx에 넣고 ++
		 * 기억한 idx<arr.length하여
		 * 0 할당.
		 */
		int [] arr= {0,3,2,0,8,5};
		int idx=0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[idx]=arr[i];
				idx++;
			}
		}
		while(idx<arr.length) {
			arr[idx++]=0;
		}
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
