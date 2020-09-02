

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
		for(int i=1;i<1000000;i++) {//N까지 반복
			String text=String.valueOf(i);//text로 바꾸고
			temp=i;//temp에 값을 계속 넣음 
			value=i;//만약 temp+ temp의 각 자릿수가 많으면 이 변수를 출력
			for(int j=0;j<text.length();j++) {//text의 길이 만큼 반복
				temp+=Integer.valueOf(text.charAt(j))-48;//'0'==48이다 charAt으로 바꾸면 "1"은 49임
				//이거 생각해서 각 자릿 수의 값을 temp에 더함~12312313
			}
			//System.out.println();
			if(temp==num){
				ans=true;
				System.out.println(value);
				//System.out.println("value: "+value + " temp: "+temp);
				break;
			}
			else temp=0;//틀리면 temp를 0으로 초기화
		}
		return ans;
	}

}
