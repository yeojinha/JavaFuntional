package Java_Algo;

public class CardConCRev {

	//정수 x를 r 진수로 나눈 나머지를 넣는다.
	static String cardConRev(int x,int r) {
		StringBuilder sb=new StringBuilder();
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			sb.append(dchar.charAt(x%r));
			x/=r;//나누어진 값으로 바꿈.
		}while(x!=0);
		return sb.toString();
	}
	static String rCardConRev(int x,int r) {
		StringBuilder sb=new StringBuilder();
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			sb.append(dchar.charAt(x%r));
			x/=r;//나누어진 값으로 바꿈.
		}while(x!=0);
		char [] result=new char[sb.length()];
		int count=0;
		for(int i=sb.length()-1;i>=0;i--) {
			result[count++]=sb.charAt(i);
		}		
		return String.valueOf(result);
	}

	
	public static void main(String[] args) {
		String answer=cardConRev(59,16);
		System.out.println(answer);
		String rAnswer=rCardConRev(59,16);
		System.out.println(rAnswer);
		
	}

}
