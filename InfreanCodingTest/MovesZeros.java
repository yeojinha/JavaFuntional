package InfreanCodingTest;

public class MovesZeros {

	public static void main(String[] args) {
		/*
		 * 032085��� �迭 �־����� 0�� �� �ڷ� �׸��� 0�� �ƴ� value�� ����� ���� ����
		 * 328500 ����//ù�� ° 0�� idx�� 4
		 * idx�� ����ؾ��� 
		 * 0�� �ƴϸ� 0 idx�� �ְ� ++
		 * ����� idx<arr.length�Ͽ�
		 * 0 �Ҵ�.
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
