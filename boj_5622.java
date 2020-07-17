

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class boj_5622 {

	public static void main(String[] args) throws IOException {
		//65 ~ 90
		List<String> dials = Arrays.asList("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String txt = bf.readLine();
		int sum = 0;
		for(int i = 0; i < txt.length(); i++) {
			if(txt.charAt(i)>=65 && txt.charAt(i)<=67 )
				sum+=3;
			else if(txt.charAt(i)>=68 && txt.charAt(i)<=70)
				sum+=4;
			else if(txt.charAt(i)>=71 && txt.charAt(i)<=73)
				sum+=5;
			else if(txt.charAt(i)>=74 && txt.charAt(i)<=76)
				sum+=6;
			else if(txt.charAt(i)>=77 && txt.charAt(i)<=79)
				sum+=7;
			else if(txt.charAt(i)>=80 && txt.charAt(i)<=83)
				sum+=8;
			else if(txt.charAt(i)>=84 && txt.charAt(i)<=86)
				sum+=9;
			else if(txt.charAt(i)>=87 && txt.charAt(i)<=90)
				sum+=10;
		}
		System.out.println(sum);
	}

}
