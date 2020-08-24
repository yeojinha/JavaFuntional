package Java_Algo_Sort;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] a = { 254, 3, 213, 64, 75, 56, 4, 324, 65, 78, 9, 5, 76, 3410, 8, 342, 76 };
		// InsertionSort(a);
		int[] arr = MergedSort(a);
		System.out.println();
		print(arr);

	}

	static void print(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	static void SelectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					swap(a, i, j);
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	static void BublleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
	}

	public static int[] MergedSort(int[] arr) {
		if (arr.length < 2)
			return arr;// �ɰ��� ���� 1�� �� ���, ���̻� �ɰ� �� ����.

		int mid = arr.length / 2;
		/*
		 * ��ͷ� ��� �ɰ� ���� ��_��� ��� �ɰ� �ݹ� 1���� ����� �װ��� ���ؼ� mergedArr[arr.length]�� ������ �Ͽ� ����
		 * �׸��� return�� �Ͽ� ������ ���� ��ȯ��. �̰��� 55�� 56���� �¿�� �������� �۵��ϸ�, �װ��� ��� ��_��� ����.
		 */
		int[] low_arr = MergedSort(Arrays.copyOfRange(arr, 0, mid));// ���
		int[] high_arr = MergedSort(Arrays.copyOfRange(arr, mid, arr.length));
		/*
		 * call by value copy�̱⿡, ���� ������ �ʴ´�. ���� copyOfRange�� ������� �ʰ� �׳� = ������ ���� call
		 * by reference�� �ȴ�. //call by value�� copy �Ϸ��� for������ �ص� �ȴ�.
		 */
		int[] mergedArr = new int[arr.length];
		int m = 0, l = 0, h = 0;
		while (l < low_arr.length && h < high_arr.length) {
			if (low_arr[l] < high_arr[h])// ���⼭ ���ؼ� ���� �׷��� �������� �������.
				mergedArr[m++] = low_arr[l++];
			else
				mergedArr[m++] = high_arr[h++];
		}
		while (l < low_arr.length) {// 55���� ������ �������� ����� ����.
			mergedArr[m++] = low_arr[l++];
		}
		while (h < high_arr.length) {// 60 or 63���� while �����ϳ��� �۵��� ��.
			mergedArr[m++] = high_arr[h++];
		}
		return mergedArr;
	}

	static void InsertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int temp = array[i]; // ���Դ�� �ӽ� ����.
			int j = i; // index �ӽ�����
			// System.out.println(array[i]+" "+temp+" "+i);
			while (j > 0 && temp < array[j - 1]) { // ���Դ���� ���ĵ� ���麸�� ���� ��찡 �ִ� ���\
				/*
				 * temp�� array[i]<array[j-1]�� �صθ� array[i]�� �߰��� 51�ට���� ���� ���ϰ� 
				 * �׷��� while���ǹ� ��ȭ��.
				 * �׷��� temp�� �ؾ��Ѵ�. 
				 * System.out.println("while: "+array[i]+" "+temp+" "+i);
				 */
				array[j] = array[j - 1]; // �б�
				j--; // ���� �񱳸� ���� �ε��� �̵�
			}
			array[j] = temp; // �������� ���Ե� ��ġ�� ���Դ�� ����
			// System.out.println((i)+"ȸ�� select sort result : " + Arrays.toString(array));
		}
	}

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
