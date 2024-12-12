package hoidanit;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tax;
		System.out.println("Nhap vao tax= ");
		tax = sc.nextInt();

		if (tax <= 10) {
			System.out.println("khong dong thue");
		} else if (10 < tax && tax <= 15) {
			System.out.println("thue 10%");
		} else if (15 < tax && tax <= 30) {
			System.out.println("thue 20%");
		} else {
			System.out.println("Thue 50%");
		}
	}
}
