package lab02;

import java.util.Scanner;

public class Bai4 {
	public static void bai1() {
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

	public static void bai2() {
		System.out.println("Giai pt bac 1");
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Nhap a");
		a = sc.nextInt();
		System.out.println("Nhap b");
		b = sc.nextInt();
		System.out.println("Nhap c");
		c = sc.nextInt();
		if (a == 0) {
			if (b == 0)
				System.out.println("Phuong trinh vo nghiem");
			if (a == 0 && b != 0)
				System.out.println("phuong trinh vo so nghiem");
			if (a != 0 && b != 0)
				System.out.println("Nghiem= " + -b / a);
		}
		if (a != 0) {
			double del = b * b - 4 * a * c;
			if (0 < del)
				System.out.println("Phuong trinh vo nghiem");
			if (del == 0)
				System.out.println("Nghiem kep = " + -b / (2 * a));
			if (del > 0) {
				System.out.println("Nghiem x1 = " + (-b + Math.sqrt(del) / (2 * a)));
				System.out.println("Nghiem x2 = " + (-b - Math.sqrt(del) / (2 * a)));
			}
		}

	}

	public static void bai3() {
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

	public static void main(String[] args) {
		System.out.println("Run bai 04");
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println(">>LUA CHON TINH NANG<<");
		System.out.println("++-----------------------------------------++");
		System.out.println("| 1.Giai pt ba1                              |");
		System.out.println("| 2.Giai pt ba2                              |");
		System.out.println("| 3.Giai pt ba3                              |");
		System.out.println("++-----------------------------------------++");
		System.out.println("Lua chon: ");
		a = sc.nextInt();
		switch (a) {
		case 1:
			bai1();
			break;
		case 2:
			bai2();
			break;
		case 3:
			bai3();
			break;
		default:
			System.exit(0);
			break;
		}
	}
}
