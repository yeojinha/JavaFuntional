package Java_Algo;

public class BubbleSort {
	static int comparing=0;
	static int switching=0;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		
		int [] a= {6,4,3,7,1,9,8};
		
		bubbleSort(a);
		for(Integer i: a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(sb.toString());
		
		System.out.printf("비교를 %d회 했습니다.\n교환을 %d회 했습니다.\n",comparing,switching);
		
	}
	static void swap(int []a,int i,int j) {
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
	}

	static void bubbleSort(int []a) {
		
		int count=1;
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			sb.append("패스"+(count++)+":\n");
			for(int j=n-1;j>i;j--) {
				comparing++;
				if(a[j-1]>a[j]) {
					for(int num:a) {
						if(num==a[j])
							sb.append("+"+num);
						else
							sb.append(" "+num);
					}
					switching++;
					swap(a,j,j-1);
				}else {
					for(int num:a) {
						if(num==a[j])
							sb.append("-"+num);
						else
							sb.append(" "+num);
						
					}
				}
				sb.append("\n");
				for(int num:a) {
					sb.append(" "+num);
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
	}
}
