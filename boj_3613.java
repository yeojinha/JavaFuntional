package CodingTestUsingFunctional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_3613 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk=new StringTokenizer(bf.readLine());
		
		String word= stk.nextToken();
		StringBuilder result=new StringBuilder();
		
		boolean java=true,cpp=true;
		
		
		if(word.charAt(0) == '_' || word.charAt(word.length()-1)=='_'){
			System.out.println("Error!");return;
		}
		if(word.charAt(0) >=65 && word.charAt(0)<=90){//ù ���ڰ� �빮���̸� false;
			System.out.println("Error!");return;
		}
		
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
				cpp=false;
			}
			if(word.charAt(i)=='_'){
				java=false;
				if(word.charAt(i+1)=='_'){
					System.out.println("Error!");return;
				}
			}
		}
		if(!java&&!cpp){
			System.out.println("Error!");return;
		}
		
		
		
		if(java) {	
			for(int i=0;i<word.length();i++) {
			
				if(word.charAt(i)>=65 && word.charAt(i)<=90) {// i�� ����� �� ��,
					result.append("_").append((char)(word.charAt(i)+32));
				}else//�ܼ� �ҹ��� �� ��,
					result.append((char)word.charAt(i));
			}
		}else if(cpp){
				for(int i=0;i<word.length();i++) {			
					if(word.charAt(i)==95) {//�빮�� �϶�,
						i++;
						result.append((char)(word.charAt(i)-32));
					}else
						result.append((char)word.charAt(i));
				}
			}
		System.out.println(result);
		
	}
	
	
}
