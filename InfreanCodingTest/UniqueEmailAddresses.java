package InfreanCodingTest;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public static void main(String[] args) {
		//["test.email+alex@leetcode.com", "test.email@leetcode.com"]
		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		
		String [] emails_1= {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
		System.out.println(solution(emails_1));
		/*
		 * Runtime: 11 ms
		 * Memory Usage: 39.1 MB
		 */
	}
	public static int solution(String [] str) {
		int plus=0;
		int i=0;
		Set<String> set=new HashSet<String>();
		StringBuffer sb;
		for(String txt: str) {
			sb=new StringBuffer();
			inner: for(i=0;i<txt.length();i++) {
				if(txt.charAt(i)=='.' &&plus==0) {
					continue;
				}
				if(txt.charAt(i)=='+') {
					plus=1;//plus�� �߰��ϸ� append ���� �ʰ� @ ���� ������ idx ������� �����⸸ �Ѵ�.
				}
				if(txt.charAt(i)=='@') {
					break inner;//@�߰��ϸ� idx �߰������� break ���ش�.
				}
				if(plus!=1)//plus�߰� ���̴ϱ�
					sb.append(txt.charAt(i));			
			}
			String example=txt.substring(i,txt.length());
			sb.append(example);
			set.add(sb.toString());
			System.out.println(sb.toString());
			plus=0;
		}
		return set.size();
	}
	

}
