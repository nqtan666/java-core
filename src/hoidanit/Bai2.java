package hoidanit;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Float chieuDai, chieuRong;
		System.out.println("Vui long nhap chieu dai:");
		chieuDai = sc.nextFloat();
		System.out.println("Vui long nhap chieu rong:");
		chieuRong = sc.nextFloat();

		System.out.println("Chu vi = " + (chieuDai + chieuRong) * 2);
		System.out.println("Dien tich = " + (chieuDai * chieuRong));
		System.out.println("Canh nho nhat = " + Math.min(chieuDai, chieuRong));

	}
}
