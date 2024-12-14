package lab4;

public class Video28 {
	public static void main(String[] args) {
		System.out.println("Run video 26");
		Student st1 = new Student();

		Student st2 = new Student("Eric", 26);
		st2.setAge(100);
		st2.setName("tannq");
		System.out.println("ten:" + st2.getName() + " tuoi: " + st2.getAge());

	}
}
