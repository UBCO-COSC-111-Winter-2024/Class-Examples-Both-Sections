import java.util.Scanner;
import java.util.*;

public class TwoDarraysFromKeyboard {
    
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many rows?");
        int numRows = input.nextInt();
        System.out.println("How many cols?");
        int numCols = input.nextInt();
        
        int[][] nums = new int[numRows][numCols];
        
        // input to fill the whole 2d array
        System.out.println("Enter " + numRows*numCols + " ints");
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = input.nextInt();
            }
        }

        // iterate through the whole 2d array to see its contents
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }

        // we can display the 2dArray with a println of each row
        for (int[] row : nums) {
            System.out.println(Arrays.toString(row));
        }

        
    }

}
