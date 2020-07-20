
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1929 {

	public static boolean[] primeNumbers;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk=new StringTokenizer(bf.readLine()," ");
		Integer start=Integer.parseInt(stk.nextToken());
		Integer end=Integer.parseInt(stk.nextToken());
		StringBuilder sb=new StringBuilder();
		
		primeNumbers=new boolean [end+1];

		primeNum(primeNumbers);
		
		for(int i=start;i<=end;i++) {
			if(!primeNumbers[i]) {
				sb.append(i+"\n");
			}
		}
		System.out.print(sb);
		
			/*
				IntStream.range(start,end+1)
				.filter(i->prime(i))
				.forEach(i->System.out.println(i));
		 	*/
	}
	private static void primeNum(boolean [] primeNum) {
		primeNum[1]=true;
		for(int i=2;i<primeNum.length;i++) {
			for(int j=2;i*j<primeNum.length;j++) {
				primeNum[i*j]=true;
			}
		}
	}/*
	private static boolean prime(int n)
	{
		if(n<2) {
			return false;
		}else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}*/
}
