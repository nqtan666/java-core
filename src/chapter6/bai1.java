package chapter6;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		String username, password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap user: ");
		username = sc.nextLine();
		System.out.println("Vui long nhap password: ");
		password = sc.nextLine();
		if (username.equals("hoidanit") && password.length() > 6) {
			System.out.println("Login success");
		} else {
			System.out.println("Login fail");
		}

	}
}
