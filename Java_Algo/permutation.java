package Java_Algo;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = { 'a', 'b', 'c' };
		solution(arr, 0);
	}
	public static void swap(char[] txt, int i, int j) {
		char temp = txt[i];
		txt[i] = txt[j];
		txt[j] = temp;
	}
	public static void solution(char[] txt, int k) {
		if (k == txt.length) {
			for (char i : txt) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		/*
		 * dept 1->2-3; 진행되는 부분을 이해
		 * aa ab ac // dept 1에서의 swap
		 * bb bc / aa ac/  bb ba dept 2에서의 swap
		 */
		for (int i = k; i < txt.length; i++) {// 처음 root의 0,1,2 순으로 올라간다.
			swap(txt, i, k);
			solution(txt, k + 1);
			swap(txt, i, k); // System.out.println(" "+i+" "+k);
		}
	}

}
