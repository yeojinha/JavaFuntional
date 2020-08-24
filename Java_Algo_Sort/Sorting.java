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
			return arr;// 쪼개진 것이 1개 일 경우, 더이상 쪼갤 수 없음.

		int mid = arr.length / 2;
		/*
		 * 재귀로 계속 쪼개 각각 좌_우로 계쏙 쪼개 반반 1개로 만들고 그것을 비교해서 mergedArr[arr.length]에 정렬을 하여 넣음
		 * 그리고 return을 하여 합쳐진 값을 반환함. 이것이 55행 56행의 좌우로 나누어져 작동하며, 그값을 계속 좌_우로 넣음.
		 */
		int[] low_arr = MergedSort(Arrays.copyOfRange(arr, 0, mid));// 재귀
		int[] high_arr = MergedSort(Arrays.copyOfRange(arr, mid, arr.length));
		/*
		 * call by value copy이기에, 값이 변하지 않는다. 만약 copyOfRange를 사용하지 않고 그냥 = 연산자 쓰면 call
		 * by reference가 된다. //call by value로 copy 하려면 for문으로 해도 된다.
		 */
		int[] mergedArr = new int[arr.length];
		int m = 0, l = 0, h = 0;
		while (l < low_arr.length && h < high_arr.length) {
			if (low_arr[l] < high_arr[h])// 여기서 비교해서 넣음 그러나 나머지가 생길거임.
				mergedArr[m++] = low_arr[l++];
			else
				mergedArr[m++] = high_arr[h++];
		}
		while (l < low_arr.length) {// 55행의 조건의 나머지가 여기로 들어옴.
			mergedArr[m++] = low_arr[l++];
		}
		while (h < high_arr.length) {// 60 or 63행의 while 둘중하나만 작동할 것.
			mergedArr[m++] = high_arr[h++];
		}
		return mergedArr;
	}

	static void InsertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int temp = array[i]; // 삽입대상 임시 저장.
			int j = i; // index 임시저장
			// System.out.println(array[i]+" "+temp+" "+i);
			while (j > 0 && temp < array[j - 1]) { // 삽입대상이 정렬된 대상들보다 작은 경우가 있는 경우\
				/*
				 * temp를 array[i]<array[j-1]로 해두면 array[i]가 중간에 51행때문에 값이 변하고 
				 * 그렇게 while조건문 변화함.
				 * 그래서 temp로 해야한다. 
				 * System.out.println("while: "+array[i]+" "+temp+" "+i);
				 */
				array[j] = array[j - 1]; // 밀기
				j--; // 다음 비교를 위해 인덱스 이동
			}
			array[j] = temp; // 최종으로 삽입될 위치에 삽입대상 삽입
			// System.out.println((i)+"회전 select sort result : " + Arrays.toString(array));
		}
	}

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
