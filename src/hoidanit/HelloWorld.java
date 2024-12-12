package hoidanit;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		System.out.printf("Vui long a:");
		a = scanner.nextInt();
		System.out.printf("Vui long b:");
		b = scanner.nextInt();
		int c = Math.max(a, b);
		System.out.println("Max = " + c);
//		Scanner scanner = new Scanner(System.in);
//		String name;
//		int age;
//		System.out.printf("Vui long nhap ten:");
//		name = scanner.nextLine();
//		System.out.printf("Vui long nhap age:");
//		age = scanner.nextInt();
//		System.out.printf("Xin chao ban: %s. Tuoi: %d", name, age);
//		scanner.close();

	}
}