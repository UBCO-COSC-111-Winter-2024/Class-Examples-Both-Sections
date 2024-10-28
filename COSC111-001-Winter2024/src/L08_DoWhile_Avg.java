import java.util.Scanner;


public class L08_DoWhile_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int value;
		int sum = 0;
		int numCount=0;
		do{
			
			System.out.println("Enter a number (0 to exit):");
			value = in.nextInt();
			//only add the value and increment count if not 0
			if (value != 0)
			{
				sum += value;
				numCount++;
			}
		}while(value != 0);
		
		if (numCount != 0)
			System.out.println("Average is " + (1.0*sum/numCount));
		else
			System.out.println("You didn't enter any numbers!");
	}

}
