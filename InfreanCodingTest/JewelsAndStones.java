package InfreanCodingTest;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {
		JewelsAndStones a=new JewelsAndStones();
		String J="aA"; String stone="aAABBBB";
		System.out.println(a.solution(J, stone));
	}
	public int solution(String j,String stone) {
		int cnt=0;
		Set<Character> hash=new HashSet<>();
		for(char i:j.toCharArray()) {
			hash.add(i);
		}
		
		for(char i:stone.toCharArray()) {
			if(hash.contains(i)) {
				cnt++;
			}
		}
		return cnt;
		
	}

}
