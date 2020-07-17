package TopCoder;

public class main_3_4 {

	public static void main(String[] args) {
		String s="abc";
		
		if(s.equals("abc")) System.out.println("eqaul!");
		
		char b=s.charAt(1);
		System.out.println(b);//b
		System.out.println(s.substring(0,3));//abc
		s=s.substring(0,3);//abc
		System.out.println(s);//abc
		
		s="def"+s+"ghi";
		System.out.println(s.substring(0));//0 to end
		//System.out.println(s.substring(-1));// OutOfIdx
		
		
		
		
	}

}
