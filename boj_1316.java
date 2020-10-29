import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class boj_1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer cases = Integer.parseInt(br.readLine());
		List<String> list=new ArrayList<>();
		for(int i=0;i<cases;i++) {
			list.add(br.readLine());
		}
		System.out.println(solve(list));
	
	}
	public static int solve(List<String> list) {
		int ans=list.size();
		for(int i=0;i<list.size();i++) {
			String word=list.get(i);
			boolean []alph=new boolean[26];
			for(int idx=1;idx<word.length();idx++) {
				char prev=word.charAt(idx-1);
				char cnt=word.charAt(idx);
				if(prev!=cnt) {
					if(alph[cnt-97]) {//if ���繮�ڰ� �� ���� ���� ���� �ִٸ�
						ans--;
						break;
						/*
						 * abbca���÷�
						 * ab �������ڴ� ���� prev,cnt ���� �ٸ��� boolean�� ���ٸ�  boolean��  prev�� true;
						 * bb ������ pass
						 * bc �ٸ��� prev�� true
						 * ca prev cnt�ٸ��� boolean�� cnt�� boolean�� �ִ��� Ȯ��
						 *a�� �߰� �Ǿ��⿡ �ܾ� ������ --����
						 *
						 * */
					}
					alph[prev-97]=true;//���� ���ڸ� �߰�������/
				}
			}
		}
		return ans;
	}

}
