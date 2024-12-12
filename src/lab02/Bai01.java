package lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("Giai pt bac 1");
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhap a");
		a = sc.nextInt();
		System.out.println("Nhap b");
		b = sc.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo so nghiem");
		}
		if (a != 0 && b != 0) {
			System.out.println("Nghiem= " + -b / a);
		}

	}
}
