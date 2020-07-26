

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class boj_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bf.readLine());
		List<String> n = new ArrayList<String>();
		for (int i = 0; i < cases; i++) {
			String temp = bf.readLine();
			if (!n.contains(temp))
				n.add(temp);
		}
		Comparator<String> Ascending= new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()>o2.length()) return 1;
				else if(o1.length()==o2.length()) {
					return o1.compareTo(o2);//compareTo는 사전순으로 알아서 비교해줌.
				}
				return -1;
			}
			
		};
		
		Collections.sort(n,Ascending);
		for(String i: n) {
			System.out.println(i);
		}
	}

}
