import java.util.Scanner;

public class L08_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int value = 0;
		int sum = 0;
		int count = 0;
		
		//We need to ask the user here for the first input
		//to 'prime' the inital value for the while loop
		System.out.print("Enter an integer, 0 to quit:");
		value = in.nextInt();
	
		while (value != 0)
		{
			count ++;
			sum += value;
			System.out.print("Enter an integer, 0 to quit:");
			value = in.nextInt();
			
		}
		
		if (count > 0)
			System.out.println("The average is " + (double)sum/count);
		else
			System.out.println("No values were entered");
	}

}
