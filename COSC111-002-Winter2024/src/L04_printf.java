
public class L04_printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "boc";
		int age = 99;
		
//		System.out.printf("%s is %d years old\n", name, age);
		System.out.printf("%s is %f years old\n", name, (double)age);
		System.out.printf("%s is %5d years old\nand they like %s\n", name, age, "coffee");
		
		age = 654321;
		System.out.printf("%s is %5d years old\nand they like %s\n", name, age, "coffee");

		double newAge = 1.75;
		System.out.printf("%s is %6.1f years old\nand they like %s\n", name, newAge, "coffee");
		newAge = 12343562346523.75;
		System.out.printf("%10s is %6.1f years old\nand they like %s\n", name, newAge, "coffee");

		
		
	}

}
