package lab03;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] a = { 5, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}

			}
		}
		System.out.println("check a:" + Arrays.toString(a));
	}
}
