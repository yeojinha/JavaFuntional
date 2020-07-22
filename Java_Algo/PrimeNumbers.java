package Java_Algo;

public class PrimeNumbers {
	static int cnt=0;
	static int cntWorse=0;
	public static void main(String[] args) {
		
		String a=getPrime(1000);
		System.out.println(a);
		System.out.println("cnt: "+cnt);
		String b=gerPrimeWorse(1000);
		System.out.println(b);
		System.out.println("cntWorse: "+cntWorse);
		System.out.println("Are they same? "+comparingTwoPrime(a, b));
	}
	public static boolean comparingTwoPrime(String a, String b) {
		for(int i=0;i<a.length();i++) {
			if(!a.equals(b))
				return false;
		}
		return true;
	}
	public static String gerPrimeWorse(int a) {
		StringBuilder result=new StringBuilder();
		int num=0;
		for(int n=2;n<=a;n++) {
			int i;
			for(i=2;i<n;i++) {
				cntWorse++;
				if(n%i==0)
					break;
			}
			if(n==i) {
				num++;
				result.append(n+" ");
				
			}
			if(num==10) {
			result.append("\n");
				num=0;
			}
		}
		return result.toString();
	}
	
	
	public static String getPrime(int a) {
		boolean []p=new boolean[a+1];
		p[1]=true;
		for(int i=2;i<=a;i++) {
			for(int j=2;i*j<=a;j++) {
				p[i*j]=true;
				cnt++;
			}
			
		}
		StringBuilder result=new StringBuilder();
		int count=0;
		for(int i=2;i<=a;i++) {
			if(!p[i]) {
				count++;
				result.append(i+" ");
			}
			if(count==10) {
				result.append("\n");
				count=0;
			}
			cnt++;
		}
			
		return result.toString();
	}

}
