import java.util.Scanner;

public class L08_Sentinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int value = 0;
		int sum = 0;
		
		//We need to ask the user here for the first input
		//to 'prime' the inital value for the while loop
		System.out.print("Enter an integer, 0 to quit:");
		value = in.nextInt();
	
		while (value != 0)
		{
			sum += value;
			System.out.print("Enter an integer, 0 to quit:");
			value = in.nextInt();
			
		}
		
		System.out.println("The sum is " + sum);
	}

}
