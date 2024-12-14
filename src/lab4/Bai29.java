package lab4;

public class Bai29 {
	public static void main(String[] args) {
		Product pro = new Product();
		Product pro2 = pro.nhapThongTin("Tan", 10, 11);
		pro2.xuatThongTin(pro2);
		System.out.println("AAAA:" + pro2.getTaxPrice(pro2.getPrice(), pro2.getTax()));

	}
}
