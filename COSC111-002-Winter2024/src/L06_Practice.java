import java.util.Scanner;

public class L06_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = in.nextInt();//read in an int
		
		
		if ( (num % 5) == 0 && (num % 2) == 0)
		{
			System.out.print("HiFive HiTwo");
		}
		else
		{
			//Check if multiple of 5
			if ((num % 5) == 0)
			{
				System.out.print("HiFive ");
			}
			// Don't use an else here!!!!!
			//check if multiple of 2
			if ((num % 2) == 0)
			{
				System.out.print("HiTwo ");
			}
		}
		
		//or much simpler
		
		
		//Check if multiple of 5
		if ((num % 5) == 0)
		{
			System.out.print("HiFive ");
		}
		// Don't use an else here!!!!!
		//check if multiple of 2
		if ((num % 2) == 0)
		{
			System.out.print("HiTwo ");
		}

	}

}
