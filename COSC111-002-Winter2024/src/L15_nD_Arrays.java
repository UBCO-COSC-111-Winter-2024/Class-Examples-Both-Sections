import java.util.Arrays;

public class L15_nD_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = {
				{1, 2, 3, 6},
				{4, 5, 6},
				{7, 8, 9},
				{7, 8, 9}
		};
		
		///this will tell me the number of rows
		System.out.println("Number of rows? " + arr.length);  
		
		//What about the size of a column?
		System.out.println("Size of column? " + arr[0].length);  
		
		//Print out 2-D array -> nice way to use Arrays.toString for printing each row
		//outer loop
		for (int r = 0; r < arr.length;r++)
		{
			System.out.println(Arrays.toString(arr[r]));
		}
		
	
	
		//Find the row with the largest sum....
		/*
		 * 1. find the sum of a row, keep track of it 
		 * 2. compare previous to next sum of row and record if it is bigger
		 */
		
		/** Let's randomize the the values
		 * 
		 */
		
		arr = makeRandom2dArray(4, 7, 50);
		//let's print the array to see what's there....
		System.out.println("Our Random Array......");
		// this will print out the array that contains the object ref
		//System.out.println(Arrays.toString(arr));
		
		//Version #1 
		//printArrayV1(arr);
		
		//Version #2 
		//printArrayV2(arr);
		
		//Version #3
		printArrayV3(arr);
		
		
		int maxRow = 0;
		int maxSum = 0;
		int maxElement = 0;
		int rowIndex = 0;
		int colIndex = 0;
		for (int r = 0; r < arr.length;r++)   //move across the rows
		{
			//create the sum for the columns for each row
			int rowSum = 0;
			for (int c = 0; c < arr[r].length;c++)
			{
				rowSum += arr[r][c];
				
				if (arr[r][c] > maxElement)
				{
					maxElement = arr[r][c];
					rowIndex = r;
					colIndex = c;
				}
				
			}
			
			
			if (r == 0) //this is our first row
			{
				maxRow = r;
				maxSum = rowSum;
			}
			else
			{
				if (rowSum >= maxSum)
				{
					maxSum = rowSum;
					maxRow = r;
				}
			}
			
			
			
		}	
		System.out.println("The max sum is " + maxSum);
		System.out.println("for row # " + maxRow);
		System.out.println("The largest value is " + maxElement);
		System.out.println("Located at row: " + rowIndex + " col: "+colIndex);
	}

	public static void printArrayV1(int[][] arr) {
		for (int r = 0; r < arr.length;r++)   //move across the rows
		{
			//create the sum for the columns for each row
			for (int c = 0; c < arr[r].length;c++)
			{
					// [0, 100] --> 0 to 100 inclusive (this is usually what we mean)
					// vs [0, 100)  --> 0 inclusive to 100 exclusive (no including 100)
					System.out.print(arr[r][c] + ", "); 
			}
			System.out.println();
		}
	}
	
	public static void printArrayV2(int[][] arr) {
		for (int r = 0; r < arr.length;r++)   //move across the rows
		{
			System.out.println(Arrays.toString(arr[r]));
		}
	}
	
	public static void printArrayV3(int[][] arr) {
		for (int[] row : arr)  //this will be used to access the obj ref for each row
		{
			System.out.println(Arrays.toString(row));
		}
	}
	
	public static int[][] makeRandom2dArray(int row, int col, int maxValue)
	{
		int[][] arr = new int[row][col];
		
		for (int r = 0; r < arr.length;r++)   //move across the rows
		{
			//create the sum for the columns for each row
			for (int c = 0; c < arr[r].length;c++)
			{
					// [0, maxValue] --> 0 to maxValue inclusive (this is usually what we mean)
					// vs [0, 100)  --> 0 inclusive to maxValue exclusive (no including 100)
					arr[r][c] = (int)(Math.random()*(maxValue + 1));
			}
		}	
		 return arr;
	}
		
}
