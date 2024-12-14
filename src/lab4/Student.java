package lab4;

public class Student {

	// class attributes
	private String name;
	private int age;

	Student() {

	}

	// contructor defautl se duoc java dinh nghia nhu function tren la trong de co
	// the truy xuat new
	// Student()
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// class method

	public void lernJava() {
		System.out.println("Toi hoc java");
	}

	// overloading function : cho phep khai bao 2 fucntion co ten giong nhau
	// nhung khac tham so dau vao
	public void lernJava(int a) {
		System.out.println("Toi hoc java");
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
