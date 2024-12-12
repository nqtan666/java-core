package hoidanit;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Float canh;
		System.out.println("Vui long nhap canh:");
		canh = sc.nextFloat();
		System.out.println("The tich = " + Math.pow(3, canh));
	}
}
