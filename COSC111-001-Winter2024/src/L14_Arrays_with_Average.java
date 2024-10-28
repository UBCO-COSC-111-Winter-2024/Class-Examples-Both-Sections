import java.util.Scanner;

public class L14_Arrays_with_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		//ask for the size of the array
		System.out.print("Enter the number of elements: ");
		int size = in.nextInt();
		//create the array 
		double[] arr = new double[size];
		
		//ask user for the values for each index 
		for (int index = 0; index < arr.length; index++)
		{
			System.out.print("Enter element: " );
			arr[index] = in.nextDouble();
		}
		
		double sum = 0;
		for (int index = 0; index < arr.length; index++)
		{
			sum = sum + arr[index];
		}
		
		double average = sum/size;
		
		int count = 0;
		//count the number of entries that are ABOVE the average
		for (int index = 0; index < arr.length; index++)
		{
			if (arr[index] > average)
				count++;
		}
		
		
		System.out.println("The average is " + average);
		System.out.println("The numebr of item above the average is " + count);
		

	}

}
