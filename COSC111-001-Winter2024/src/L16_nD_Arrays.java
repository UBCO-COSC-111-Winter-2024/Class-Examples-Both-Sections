import java.util.Arrays;

public class L16_nD_Arrays {

	public static int[] findSmallestValue(int [][] arr2)
	{
		//find the smallest index of the largest value
		int smallestRow = -1;
		int smallestCol = -1;
		int largestValue = 0;
		
		//for each row, 
			for (int r = 0; r < arr2.length; r++)
			{
				for (int c = 0; c < arr2[r].length; c++)
				{
					if (arr2[r][c] > largestValue)
					{
						largestValue = arr2[r][c];
						smallestRow = r;
						smallestCol = c;
					}
				}
			}
			// now encode the results
			//index 0 ==> row
			//index 1 ==> col
			//index 2 ==> largest Value
			int[] results = new int[3];
			results[0] = smallestRow;
			results[1] = smallestCol;
			results[2] = largestValue;
			
			return results;
			
	}
	public static int[][] makeRandomArray(int numRows, int numCols, int maxValue)
	{
		int [][] arr = new int[numRows][numCols];
		for (int r = 0; r < arr.length; r++)
		{
			for (int c = 0; c < arr[r].length; c++)
			{
				arr[r][c] = (int)(Math.random()*(maxValue+1));
						
			}
		}
		return arr;
	}

	public static void print2DArrayV2(int[][] arr) {
		for (int r = 0; r < arr.length; r ++)
		{
			for (int c = 0; c < arr[r].length; c++)
			{
				System.out.print(arr[r][c] + ", ");  //this will print off each row
			}
			System.out.println();
		}
	}

	public static void print2DArrayV1(int[][] arr) {
		for (int[] r : arr)
		{
			System.out.println(Arrays.toString(r));  //this will print off each row
		}
		
	}
	
	public static void print2DArrayV3(int[][] arr) {
		for (int r = 0; r < arr.length; r ++) {
			System.out.println(Arrays.toString(arr[r]));  //this will print off each row
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}		
		};
		
		System.out.println("The number of rows: " + arr.length);
		System.out.println("The number of cols: " + arr[3].length);
		
		int[][] arr2 = {
				{1},
				{1, 2},
				{1, 2, 3},
				{1, 2, 3, 4}		
		};
		System.out.println("For arr2:");
		System.out.println("The number of rows: " + arr2.length);
		System.out.println("The number of cols: " + arr2[0].length);
		System.out.println("The number of cols: " + arr2[1].length);
		System.out.println("The number of cols: " + arr2[2].length);
		System.out.println("The number of cols: " + arr2[3].length);
		
		//How to print out????
		System.out.println("The array....");
		//System.out.println(Arrays.toString(arr2));
		print2DArrayV3(arr2);
		
		System.out.println("Another way of printing");
		print2DArrayV2(arr2);
		
		System.out.println("Yet another way of printing");
		print2DArrayV1(arr2);
		
		
		arr2 = makeRandomArray(3, 4, 52);
		//Now, let's find the row with the largest sum
		
			
		System.out.println("The random array.....");
		print2DArrayV1(arr2);

		
		int maxRow = 0;
		int maxValue = 0;

		//for each row, 
		for (int r = 0; r < arr2.length; r++)
		{
			//add up all the values
			int rowSum=0;
			for (int c = 0; c < arr2[r].length; c++)
			{
				rowSum += arr2[r][c];
			}
			if (rowSum > maxValue)
			{
				maxValue = rowSum;		//this updates the max sum so far...
				maxRow = r; 			//this keeps track of the row where the max is
			}
		}
		
		System.out.println("The row with the largest sum is row " + maxRow + " with a sum of " + maxValue);
		
		arr2 = makeRandomArray(3, 4, 4);
		print2DArrayV1(arr2);

		int[] results = findSmallestValue(arr2);
		
	
		System.out.println("The largest value is " + results[2] + " at " + results[0] +","+results[1]);
		
	}


	
	
}
