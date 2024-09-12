import java.util.Scanner;   //imports the scanner class into our code

public class L03_Scanner_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Please enter a integer number!");
////		int num = in.nextInt();			//read in an integer
////		System.out.println(num);		//print it back out
//		
//		double num = in.nextDouble();			//read in an integer
//		System.out.println(num);
	
//		System.out.println("What is your age?");
//		int age = in.nextInt();
//		
//		System.out.println("What is your name?");
//		String name = in.next();
//		
//		System.out.println(name + " is " + age + " years old!");
		
		System.out.println("What is your age?");
		int age = in.nextInt();
		
		in.nextLine();		//this gets rid of the CR in the buffer
		
		System.out.println("What is your name?");
		String name = in.nextLine();
		
		System.out.println(name + " is " + age + " years old!");
	}

}
