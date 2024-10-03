import java.util.Scanner;
public class L07_Conditional_Opoerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 10;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a int number:");
		
		int value = in.nextInt();	
		
		System.out.println((value % 3 == 0)? value + " is a multipe of 3":value + " is not a multipe of 3");
		
		System.out.println(value + " is " + ((value % 3 == 0)?"":"not")+" a multipe of 3");
		//check if multiple of 3
//		if (value % 3 == 0)
//			System.out.println(value + " is a multipe of 3");
//		else
//			System.out.println(value + " is not a multipe of 3");
//		
		
		
	}

}
