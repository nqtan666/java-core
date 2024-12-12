package lab02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
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
}
