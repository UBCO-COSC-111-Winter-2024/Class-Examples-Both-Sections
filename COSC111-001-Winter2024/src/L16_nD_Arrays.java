import java.util.Arrays;

public class L16_nD_Arrays {

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
		
		for (int r = 0; r < arr2.length; r ++) {
			System.out.println(Arrays.toString(arr2[r]));  //this will print off each row
		}
		
		System.out.println("Another way of printing");
		for (int r = 0; r < arr2.length; r ++)
		{
			for (int c = 0; c < arr2[r].length; c++)
			{
				System.out.print(arr2[r][c] + ", ");  //this will print off each row
			}
			System.out.println();
		}
		System.out.println("Yet another way of printing");

		for (int[] r : arr2)
		{
			System.out.println(Arrays.toString(r));  //this will print off each row
		}
		
	}

}
