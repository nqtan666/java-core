package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> listArr = new ArrayList<>();
		double sum = 0;
		while (true) {
			System.out.println("Vui long nhap value: ");
			Double x = sc.nextDouble();
			listArr.add(x);

			System.out.println("Continue ? Y or N ?? ");
			sc.nextLine(); // Xóa dòng thừa do nextDouble()
			String input = sc.nextLine(); // Lấy giá trị nhập từ người dùng
			if (input.equalsIgnoreCase("N")) { // Kiểm tra điều kiện, không phân biệt hoa thường
				break;
			}
		}
		for (int i = 0; i < listArr.size(); i++) {
			sum += listArr.get(i);
		}
		System.out.println("list: " + listArr.toString());
		System.out.println("Tong: " + sum);
	}
}
