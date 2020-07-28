package Java_Algo;

public class BubbleSort_2 {
	static int exchange=0;
	static int switching=0;
	static int cycle=0;
	public static void main(String[] args) {
			int []a= {6,4,3,7,9,8};
			
			bubbleSort(a);
			for(int i:a) {
				System.out.printf("%d ",i);
			}
			System.out.println();

			System.out.printf("exchange Ƚ�� %d�Դϴ�.\n",exchange);
			System.out.printf("����Ŭ Ƚ�� %d�Դϴ�.\n",cycle);
			System.out.printf("��ȯ Ƚ�� %d�Դϴ�.\n",switching);

	}
	static void swap(int []a,int n,int k) {
		switching++;
		int temp=a[n];
		a[n]=a[k];
		a[k]=temp;
	}
	static void printing(int []a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	//����Ŭ 4
	//��ȯ 25
	static void bubbleSort(int []a) {
		int length=a.length;
		for(int i=1;i<length-1;i++) {
			exchange=0;
			cycle++;
			for(int j=0;j<length-i;j++) {
				printing(a);
				switching++;
				if(a[j]<a[j+1]) {
					swap(a,j,j+1);
					exchange++;
				}
			}
			if(exchange==0)
				break;
		}
	}

}
