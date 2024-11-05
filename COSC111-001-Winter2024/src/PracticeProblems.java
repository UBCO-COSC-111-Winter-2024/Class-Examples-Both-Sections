import java.util.Scanner;

public class PracticeProblems {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers will the array hold? ");
		int size = in.nextInt();
		
		int[] arr = new int[size];
		//fill the array with user input...
		for (int idx = 0 ; idx < arr.length; idx++)
		{
			if(idx == 0)
			{
				System.out.print("Enter the next number: ");
				arr[idx] = in.nextInt();
			}
			else   //check to make sure the new entry is larger than previous
			{
				int tempValue = 0;
				do {
					System.out.print("Enter the next number: ");
					tempValue = in.nextInt();
				}while (tempValue <= arr[idx-1]);
				arr[idx] = tempValue;
			}
		}
	}

}
