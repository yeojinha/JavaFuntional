import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1748 {
	/*
	 * 1���� N������ ���� �̾ ���� ������ ���� ���ο� �ϳ��� ���� ���� �� �ִ�.
	 * 
	 * 1234567891011121314151617181920212223...
	 * 
	 * �̷��� ������� ���ο� ���� �� �ڸ� ���ϱ�? �� ���� �ڸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		int num=10;//100�ڸ��� �Ǹ�
		int length=1;
		int count=0;//10�̻��̸� 9���� �����ؾ���.
		for(int i=1;i<=N;i++) {//1�ڸ����� 1�ڸ����� ���� 2�ڸ����� ���ڸ� ����
			
			if(i==num) {
				length++;
				num*=10;//0�ڿ� �ϳ� �� ����.
			}
			count+=length;
			//10�̸� 2�ڸ�
			//100�̵Ǹ� 3�ڸ�
			//1000�̵Ǹ� 4�ڸ�
			//10000�Ǹ� 5�ڸ�
		}
		System.out.println(count);
		//bw.write(count);
		//bw.flush();
	}

}