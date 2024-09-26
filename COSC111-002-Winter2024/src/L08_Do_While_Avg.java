import java.util.Scanner;

public class L08_Do_While_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int value = 0;
		int sum = 0;
		int count = 0;
		
		//do we want zero to be included in our average??? ---> NO!!! (by vote)
		
		do
		{
		
			System.out.print("Enter an integer, 0 to quit:");
			value = in.nextInt();
			sum += value;  //add the value after the user enters it
			
			//we need to make sure that we don't incremenet the count
			//if the user enters 0
			
			//if (value != 0 ) count++;
			
			count += (value != 0) ? 1 : 0;
			//this is the same as the above statemet
			/*
			if (value != 0)
				count += 1;
			else
				count += 0;
			*/
			
			
		}while (value != 0);
		
		if (count > 0)
		System.out.println("The average is " + (double)sum/count);
	else
		System.out.println("No values were entered");
	

//		Scanner in = new Scanner(System.in);
//		int value = 0;
//		int sum = 0;
//		int count = -1;
//		
//		//do we want zero to be included in our average??? ---> NO!!! (by vote)
//		
//		do
//		{
//		
//			System.out.print("Enter an integer, 0 to quit:");
//			value = in.nextInt();
//			sum += value;  //add the value after the user enters it
//			count ++;
//			
//		}while (value != 0);
//		
//		if (count > 0)
//			System.out.println("The average is " + (double)sum/count);
//		else
//			System.out.println("No values were entered");
//		
//		//System.out.println("The average is " + (double)sum/count);
//		
	}

}
