

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());	
		if(!solution(number))//1
			System.out.println(0);
	}
	public static boolean solution(int num) {
		int temp=0;
		int value=0;
		boolean ans=false;
		for(int i=1;i<1000000;i++) {//N���� �ݺ�
			String text=String.valueOf(i);//text�� �ٲٰ�
			temp=i;//temp�� ���� ��� ���� 
			value=i;//���� temp+ temp�� �� �ڸ����� ������ �� ������ ���
			for(int j=0;j<text.length();j++) {//text�� ���� ��ŭ �ݺ�
				temp+=Integer.valueOf(text.charAt(j))-48;//'0'==48�̴� charAt���� �ٲٸ� "1"�� 49��
				//�̰� �����ؼ� �� �ڸ� ���� ���� temp�� ����~12312313
			}
			//System.out.println();
			if(temp==num){
				ans=true;
				System.out.println(value);
				//System.out.println("value: "+value + " temp: "+temp);
				break;
			}
			else temp=0;//Ʋ���� temp�� 0���� �ʱ�ȭ
		}
		return ans;
	}

}
