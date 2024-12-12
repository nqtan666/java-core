package hoidanit;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sv;
		Float score;
		System.out.printf("Vui long ten:");
		sv = scanner.nextLine();
		System.out.printf("Vui long diem:");
		score = scanner.nextFloat();
		System.out.printf("Sinh vien: %s, diem: %d", sv, Math.round(score));
	}
}
