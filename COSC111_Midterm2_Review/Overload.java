class Overload {
    // find the max of a different variety of data types

    //version #1
    // public static double findMax(double num1, double num2) {
    //     System.out.println("This is version #1");
    //     //ternary operator 
    //     return (num1 > num2) ? num1:num2;
    // }

    //version #2
    // public static int findMax(int num1, int num2) {
    //     System.out.println("This is version #2");
    //     if (num1 > num2) {
    //         return num1;
    //     } else   {
    //         return num2;
    //     } 
    // }

    //version #3
    // public static double findMax(int num1, double num2) {
    //     System.out.println("This is version #3");
    //     //ternary operator 
    //     return Math.max(num1,num2);
    // }

    // //version #4
    // public static double findMax(double num1, int num2) {
    //     System.out.println("This is version #4");
    //     //ternary operator 
    //     return (num1 > num2) ? num1:num2;
    // }

    //versiom #5
    // public static double findMax(int num1, int ... num2)  //remember!!! num2 is an object reference
    // {
    //     System.out.println("This is the variable args call (version #5)");
    //     double max = num1;
    //     for (int idx = 0 ; idx < num2.length; idx++)
    //     {
    //         if (max > num2[idx]) max = num2[idx];
    //     }
    //     return max;
    // }

    //versiom #6
    public static double findMax(double num1, int ... num2)  //remember!!! num2 is an object reference
    {
        System.out.println("This is the variable args call (version #6)");
        double max = num1;
        for (int idx = 0 ; idx < num2.length; idx++)
        {
            if (max > num2[idx]) max = num2[idx];
        }
        return max;
    }

     //versiom #7
     public static double findMax(int ... num2)  //remember!!! num2 is an object reference
     {
         System.out.println("This is the variable args call (version #7)");
         double max = num2[0];
         for (int idx = 0 ; idx < num2.length; idx++)
         {
             if (max < num2[idx]) max = num2[idx];
         }
         return max;
     }
    

    public static void main(String[] args) {
        int x = 100;
        int y = 99;
        
        //matches v2 
        //if we comment out v2, and leave only v3 and v4, the match is 
        //ambigious!!!
        System.out.println("The largest number is " + findMax(x, y, 10));
    
        // double w = 200;
        // double z = 301;
        // //matches v1
        // System.out.println("The largest number is " + findMax(w, z));

        // //x is an int
        // //z is a double
        // //matches v1 (int is implicitly widened to double)
        // System.out.println("The largest number is " + findMax(x, z));

    }

}