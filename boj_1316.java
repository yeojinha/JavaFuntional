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
					if(alph[cnt-97]) {//if 현재문자가 이 전에 나온 적이 있다면
						ans--;
						break;
						/*
						 * abbca예시로
						 * ab 전자후자는 각각 prev,cnt 서로 다르고 boolean에 없다면  boolean에  prev를 true;
						 * bb 같으니 pass
						 * bc 다르니 prev를 true
						 * ca prev cnt다르니 boolean에 cnt가 boolean에 있는지 확인
						 *a는 발견 되었기에 단어 수에서 --해줌
						 *
						 * */
					}
					alph[prev-97]=true;//이전 문자를 추가시켜줌/
				}
			}
		}
		return ans;
	}

}
