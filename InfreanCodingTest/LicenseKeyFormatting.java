package InfreanCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LicenseKeyFormatting {

	public static void main(String[] args) throws IOException {
		LicenseKeyFormatting a= new LicenseKeyFormatting();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int n=Integer.parseInt(br.readLine());
	
		//8F3Z-2e-9-w
		System.out.println(a.solution_2(str,n));
	}
	public String solution_2(String str,int n) {
		String newStr = str.replace("-", "");
		//System.out.println("newStr: "+newStr);
		newStr=newStr.toUpperCase();
		int leng=newStr.length();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<leng;i++) {
			sb.append(newStr.charAt(i));
		}
		for(int i=n;i<leng;i+=n) {
			sb.insert(leng-i, "-");
		}
		return sb.toString();
	}
}
