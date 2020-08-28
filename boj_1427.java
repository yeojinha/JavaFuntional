import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class boj_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list=new ArrayList<>();
		String text=br.readLine();
		for(int i=0;i<text.length();i++) {
			list.add(Integer.valueOf(text.charAt(i))-48);
		}
		Collections.sort(list,new comparator());
		for(Integer i: list) {
			System.out.print(i);
		}
	}
	public static class comparator implements Comparator<Integer>{
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
		
	}
}
