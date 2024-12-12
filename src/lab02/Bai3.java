package lab02;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		System.out.println("Run bai 03");
		Scanner sc = new Scanner(System.in);
		float soDien;
		System.out.println("Moi ban nhap so dien:");
		soDien = sc.nextFloat();
		if (100 <= soDien) {
			System.out.println("so tien la: " + soDien * 1000);
		} else {
			float tien = 100 * 1000 + (soDien - 100) * 1500;
			System.out.println("so dien la: " + tien);
		}
	}
}
