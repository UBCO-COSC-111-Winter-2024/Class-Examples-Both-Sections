import java.util.Scanner;

public class L07_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = in.nextInt();//read in an int
		
		
		switch (num) {
		case 5:
			System.out.println("Five");
			break;
		case 10:
			System.out.println("Ten");
			//break;
		case 15:
			System.out.println("Fifteen");
			break;
		default:
			System.out.println("Other Number");
		}
	}

}
