package chapter6;

import java.util.ArrayList;

public class bao2 {
	public static void main(String[] args) {
		Student st1 = new Student("tan1", "24124");
		Student st2 = new Student("Nguyen 1", "24124");
		Student st3 = new Student("Nguyen", "24124");
		Student st4 = new Student("tan4", "24124");
		ArrayList<Student> arr = new ArrayList<>();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyen")) {
				System.out.println(">>check arr: " + arr.get(i));
			}
		}
	}
}
