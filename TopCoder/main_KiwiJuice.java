package TopCoder;

public class main_KiwiJuice {

	public static void main(String[] args) {
		int [] capacities= {14,35,86,58,25,62};
		int []bottels= {6,34,27,38,9,60};
		int [] from= {1,2,4,5,3,3,1,0};
		int [] to= {0,1,2,4,2,5,3,1};
		int [] result=thePouring_enhanced(capacities,bottels,from,to);
		for(int i:result) {
			System.out.print(i+" ");
		}
		//0 14 65 35 25 35
		
	}
	public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int []toId) {
		
		/*
		 * bottles[n]�� n��° ���� ��� ��ü�� ���̸�,
		 * capacities[n]�� value�� n��° ���� �� �� �ִ� ��
		 * bollens[0]�� 5�̰� capacities[0]�� 10�̶�� 
		 * 0��°�� ũ�� 10¥�� ������ 5��ŭ�� ���� �������� ������ 5 ����ִ�.
		 * formId[0]��  0�̸� 0��°���� toid[0] 1�̸� 1������ 
		 */
		
		for(int i=0;i<fromId.length;i++) {
			
			int from=fromId[i];
			int to=toId[i];
			bottles[to]+=bottles[from];
			
			if(bottles[to]>capacities[to]) {
				bottles[from]=bottles[to]-capacities[to];
				bottles[to]-=bottles[from];

			}else {
				bottles[from]=0;
			}
		}
		return bottles;
	}
	
	
public static int[] thePouring_enhanced(int[] capacities, int[] bottles, int[] fromId, int []toId) {
		
		/*
		 * bottles[n]�� n��° ���� ��� ��ü�� ���̸�,
		 * capacities[n]�� value�� n��° ���� �� �� �ִ� ��
		 * bollens[0]�� 5�̰� capacities[0]�� 10�̶�� 
		 * 0��°�� ũ�� 10¥�� ������ 5��ŭ�� ���� �������� ������ 5 ����ִ�.
		 * formId[0]��  0�̸� 0��°���� toid[0] 1�̸� 1������ 
		 */
		
		for(int i=0;i<fromId.length;i++) {
			
			int sum=bottles[fromId[i]]+bottles[toId[i]];//from��°�� bottle ���̶� to��°�� bottle ��ħ.
			bottles[toId[i]]=Math.min(sum, capacities[toId[i]]);//sum�� to��°�� bottle �뷮 �� �ּ� �� ��ȯ
			//�̶� sum�� to��°�� �뷮���� ������ bottles to��°�� sum���� ä��� ���� 
			// ���� sum�� 15�� toId �뷮�� 10�̶�� 10�� toId��° bottle�� �� ( �� ä������)
			bottles[fromId[i]]=sum-bottles[toId[i]];
			//sum�� 15 toId��° ���� �� ���� fromId bottle�� ���� ��
			//sum�� toId�뷮�� ���ٸ� fromId bottle�� 0
			
		}
		return bottles;
	}

}
