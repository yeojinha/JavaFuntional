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
		if(word.charAt(0) >=65 && word.charAt(0)<=90){//첫 글자가 대문자이면 false;
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
			
				if(word.charAt(i)>=65 && word.charAt(i)<=90) {// i만 언더바 일 때,
					result.append("_").append((char)(word.charAt(i)+32));
				}else//단순 소문자 일 때,
					result.append((char)word.charAt(i));
			}
		}else if(cpp){
				for(int i=0;i<word.length();i++) {			
					if(word.charAt(i)==95) {//대문자 일때,
						i++;
						result.append((char)(word.charAt(i)-32));
					}else
						result.append((char)word.charAt(i));
				}
			}
		System.out.println(result);
		
	}
	
	
}
