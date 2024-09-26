import java.util.Scanner;

public class L08_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int value = 0;
		int sum = 0;
		
		do
		{
			System.out.print("Enter an integer, 0 to quit:");
			value = in.nextInt();
			sum += value;  //add the value after the user enters it
			
		}while (value != 0);
		
		System.out.println("The sum is " + sum);
		

	}

}
