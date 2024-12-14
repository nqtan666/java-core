package lab03;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Vui long nhap a:");
		a = sc.nextInt();
		int dem = 0;
		for (int i = 1; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				dem++;
			}
		}
		if (dem == 2) {
			System.out.println("day la so nguyen to");
		} else {
			System.out.println("not nguyen to");
			System.exit(0);
		}
	}
}
