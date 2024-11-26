import java.util.Scanner;
import java.util.Arrays;

public class L16_Practice2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		//ask for size
		System.out.print("How many numbers will the array hold? ");
		int numAmount = in.nextInt();

		//create array of size
		int[] arr = new int[numAmount];

		for(int idx = 0; idx < numAmount; idx++)
		{
			System.out.print("Enter the next number: ");
			if (idx == 0)
			{
				arr[idx] = in.nextInt();
			}
			else
			{

				int value = in.nextInt();
				while (value < arr[idx-1])
				{
					System.out.print("Number is too small! Enter the valid number: ");
					value = in.nextInt();
				}
				arr[idx] = value;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
