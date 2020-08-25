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
	/*
	 * dept 1->2-3; ����Ǵ� �κ��� ����
	 * aa ab ac // dept 1������ swap
	 * bb bc / aa ac/  bb ba dept 2������ swap
	 */
	
	public static void solution(char[] txt, int k) {
		if (k == txt.length) {
			for (char i : txt) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int i = k; i < txt.length; i++) {// ó�� root�� 0,1,2 ������ �ö󰣴�.
			swap(txt, i, k);
			solution(txt, k + 1);
			swap(txt, i, k); // System.out.println(" "+i+" "+k);
		}
	}

}
