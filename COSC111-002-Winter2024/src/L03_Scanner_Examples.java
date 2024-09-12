import java.util.Scanner;		//THIS IS SUPER IMPORTANT!!!!!!

public class L03_Scanner_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Enter a string:");
//		
//		//String str = in.next();  //going to read in a single token
//		String str = in.nextLine(); 
//		System.out.println(str);
//		
//		System.out.println("Enter a int:");
//		
//		int x = in.nextInt();  // x is not a good name for a var
//		
//		System.out.println(x);
//		
//		System.out.println("Enter a double:");
//		
//		double y = in.nextDouble();  // y is not a good name for a var
//		
//		System.out.println(y);

		//waiting for just enter (or really anything)
		System.out.println("Push the Enter key to continue...");
		in.nextLine();
		
		System.out.print("Enter your age: ");
		
		//bob cr
		int age = in.nextInt();  
		
		in.nextLine();  //consumes the CR that is in the input buffer

		System.out.print("What is your name??");

		String name = in.next();
		
		System.out.println(name + " is " + age + " years old!");
		
		
		
	}
}
