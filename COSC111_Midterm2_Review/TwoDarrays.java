public class TwoDarrays {
    
    public static void main(String... args) {
        
        int[] a = {1001,6,7,5,1};  // a list with 5 elements -> a.length is 5
        int[] b = {4,9,-1};     // a list with 3 elements -> ab.length = 3
        int[][] nums = {    { 1, 2, 3,  4},             // row0 (nums[0])
                            { 6, 0, 0,  5, 450, 12},     // row1 (nums[1])
                            {-5, 0,-3,100} ,             // row2 (nums[2])
                            a,
                            b
        };          // nums.length is 5

        int max = nums[0][0];
        
        // finds the maximum with for-each loop
        for (int[] row : nums) {
            for (int n : row) {
                if (n > max)
                    max = n;                
            }
        }

        // finds the maximum with conventional for-loops

        // for (int row = 0; row < nums.length; row++) {
        //     for (int col = 0; col < nums[row].length; col++) {
        //         if (nums[row][col] > max)
        //             max = nums[row][col];
        //     }
        // }

        System.out.println("The max of the 2d array is " + max);

    }

}
