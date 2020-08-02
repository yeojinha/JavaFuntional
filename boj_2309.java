

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_2309 {
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int[] arr=new int [9];
		int sum=0;
		for(int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		for(int i=0;i<8;i++) {//8���� ���� j�� i+1�̴ϱ�
			for(int j=i+1;j<9;j++) {//
				if(sum-(arr[i]+arr[j])==100) {//i, i+1 ���� ���� ���� sum�� ���� 100�̸� 
					for(int m=0;m<9;m++) {//���
						if(m==i || m==j) {
							continue;
						}
						sb.append(arr[m]+"\n");
					}
					System.out.print(sb.toString());
					return;//�׸��� ������
				}
			}
		}
		
		
	}
}
