package Java_Algo;

public class recursiveFindingMax {

	public static void main(String[] args) {
		int []arr= {1,23,4,2,1,2,4,4,6,4,1,23,1,11,10};
		System.out.println(findMax(arr,0,arr.length-1));
		
	}
	static int findMax(int [] arr,int begin,int end) {
		if(begin==end) {
			return arr[begin];
		}else {
			return Math.max(arr[begin],findMax(arr,begin+1,end));
			//max�� �̿��Ͽ� idx[0]�� idx++�Ͽ� ���� idx[end]�� ���Ͽ� ���߿� ū ���� ��ȯ����.
			//���� ������ arr[begin]�� ��
		}
	}
}
