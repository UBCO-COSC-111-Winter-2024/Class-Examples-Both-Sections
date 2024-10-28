import java.util.Scanner;

public class L14_AverageValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int size = in.nextInt();
		
		double[] arr = new double[size];
		
		for (int index = 0; index < size; index ++)
		{
			System.out.print("Enter element: ");
			arr[index] = in.nextDouble();
		}
		
		//now let's compute the average
		double average = 0;
		for (int index = 0; index < size; index ++)
		{
			average += arr[index];	//sums up all the values...
		}
		average = average/size;
		System.out.println("The average is: " + average);
		
		//now count the number of values ABOVE the average....
		int count = 0;
		for (int index = 0; index < size; index ++)
		{
			if (arr[index]>average) 
				count ++;
		}
		System.out.println("Number of items about the average is " + count);
	}

}
