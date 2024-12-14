package lab03;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;

		System.out.println("Vui long nhap so luong phan tu:");
		a = sc.nextInt();
		int[] mang = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println("Vui long nhap phan tu: " + (i + 1));
			mang[i] = sc.nextInt();
		}
		System.out.println("min:" + mang[0]);
		System.out.println("min:" + mang[mang.length - 1]);
	}
}
