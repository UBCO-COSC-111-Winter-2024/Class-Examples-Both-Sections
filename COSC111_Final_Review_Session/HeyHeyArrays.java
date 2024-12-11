public class HeyHeyArrays {

    public static void printRow(int...arr)          //we can pass in either a comma separated list OR an array
    {                           //the actual parameter for a variable length argument is internally an array
        // for (int row = 0; row < arr.length; row++)
        // {
        //     System.out.println(arr[row].length); 
        // }
        for (int row: arr )
            System.out.println(row);
        
    }
    
    public static void printRowsV2(int[]...arr)
    {
        // for (int row = 0; row < arr.length; row++)
        // {
        //     System.out.println(arr[row].length); 
        // }
        for (int[] row: arr )
            System.out.println(row.length);
        
    }

    public static void printRows(int[][] arr)
    {
        // for (int row = 0; row < arr.length; row++)
        // {
        //     System.out.println(arr[row].length); 
        // }
        for (int[] row: arr )
            System.out.println(row.length);
        
    }
    public static void main(String[] args) {
        int[] arr;                      // This is my object ref (declaration)
        //arr = new int[5];               // this is creating an array of integers
        //arr = {1, 2, 3, 4};               // don't do this either!!

        String[] arr2;                      // This is my object ref (declaration)
        arr2 = new String[5];               // this is creating an array of String (default is null)
    

        //let's not do this.....
 /*       for (String s: arr2)                // a for-each is a read-only pattern 
        {
            s = "cat";
        }
*/ 

        for (int idx = 0; idx < arr2.length ; idx++)
            arr2[idx] = "cat";              // this will go through and initialize the Strings
    
        // int[][] twoDarr;
        // twoDarr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};   //this must be done in 1 step!!
        
        int[][] twoDarr = {{1, 2, 3}, {4, 5, 6, 7}, {7, 8, 9, 10, 11}};//this must be done in 1 step!!
        
        System.out.println(twoDarr.length);  // this prints the number of rows 

        System.out.println(twoDarr[0].length);    //this will print out the number of columns in row 0
        System.out.println(twoDarr[1].length);    //this will print out the number of columns in row 1
        System.out.println(twoDarr[2].length);    //this will print out the number of columns in row 2

        for (int row = 0; row < twoDarr.length; row++)
        {
            System.out.println(twoDarr[row].length); 
        }
        
        System.out.println("Printing rows with method...");
        printRows(twoDarr);
        System.out.println("Printing rows with variable length ...");
        //printRow(1, 3, 5);
        printRow(new int[] {1, 3, 5});
        printRowsV2(twoDarr);           //wow this is complicated!!!!!!
    }
  

}
