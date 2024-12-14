package lab03;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Vui long nhap a:");
		a = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
	}
}
