

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class boj_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String word=bf.readLine();
		int count_alpha[]=new int [26];
		int alphabet=0;
		int length_word=word.length();
		int idx=0,max=0,checker=0;
		//65 ~ 90까지  소문자는 +32
		//Mississipi
		for(int i=0;i<length_word;i++)
		{
			if(word.charAt(i)>=65 && word.charAt(i)<=90) {//대문자의 경우
				idx=word.charAt(i)-'A';
				//System.out.println("1_idx: "+idx);
				count_alpha[idx]++;
			}else if(word.charAt(i)>=97 && word.charAt(i)<=122) {
				idx=word.charAt(i)-'a';
				//System.out.println("2_idx: "+idx);
				count_alpha[idx]++;
			}
		}
		
		for(int i=0;i<count_alpha.length;i++)
		{
			//System.out.printf("count_alpha[%d]: %d\n",i,count_alpha[i]);
			if(max<=count_alpha[i]) {
				
				max=count_alpha[i];
				alphabet=i+'A';
				//System.out.println("max: "+max);
			}
		}
		
		for(int i: count_alpha) {
			if(max==i) {
				checker--;
			}
		}
		
		if(checker==-1)
			System.out.println(Character.toString((char)alphabet));
		else if(checker<-1)
			System.out.println("?");
	}

}
