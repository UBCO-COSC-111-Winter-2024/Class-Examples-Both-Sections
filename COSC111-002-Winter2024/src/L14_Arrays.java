
public class L14_Arrays {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int[] arr;  //creating my object reference variable
		
		//arr = new int[4];   //initialization
		
		int[] arr = {1, 2, 3, 4, 5, 6, 123};
		//arr = {1, 2, 3, 4, 5, 6, 123}; don't do this!!1
		
		System.out.println(arr);  	//this will print out the actual object reference 
									// the "address" -> where the array contents can be found
		
		//With a size of 4, idx go from 0 -> 3
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		//System.out.println(arr[4]);		//this will generate an index out of bounds 

//		System.out.println("More efficent...");
//		for (int index = 0; index < 4; index ++)
//		{
//			System.out.println(arr[index]);
//		}
		
		System.out.println("More efficent...");
		for (int index = 0; index < arr.length; index ++)  //
		{
			System.out.println(arr[index]);
		}
		
		for (int index = 0; index < arr.length; index ++)  //
		{
			arr[index] = (int)(Math.random()*11);
		}
		
		System.out.println("Random values"
				+ "...");

		for (int index = 0; index < arr.length; index ++)  //
		{
			System.out.println(arr[index]);
		}
		
		//trying to add a 7th element.... (length is trying to become 8)
		//arr[7] = -55;				//This won't work; can't change the size of an array!!!! 
									//unless you create a whole new array!
		//if I wanted to add a 8th element...
		
		
		// arr = new int[8];    //this will create a new array of length 8 and assign
								// it to our object reference (original array is now gone....
		// arr[7] = -55;
		
		int[] newArr = new int[8];			// new array of 8 elements
		//need to copy old array into new array
		for (int index = 0; index < arr.length; index ++)  //
		{
			newArr[index] = arr[index];
		}
		newArr[7] = -55;
		
		arr = newArr;			//this **copies** the object reference of newArr to arr 
		
		//let's find the largest value
		
		int maxValue = arr[0];
		int indexOfMax = 0;
		
		for (int index = 1; index < arr.length; index ++)  //
		{
			if (arr[index] > maxValue)
			{
				maxValue = arr[index];			//value of new max
				indexOfMax = index;				//position of new max
			}
		}
		System.out.println("The max value is " + maxValue + " at index " + indexOfMax);		
	
		System.out.println("Shift to the left..");
		
		int temp = arr[0];	//this will hold the value in the 0th position (as it gets overwritten)
		for (int index = 1; index < arr.length; index ++)  
		{
			//shuffle our values one position to the left
			arr[index-1] = arr[index];
		}
		//finally, put temp into the last position
		arr[arr.length-1] = temp;		//make sure to use .length - 1 (and NOT hardcode the length)
		
		for (int index = 0; index < arr.length; index ++)  //
		{
			System.out.println(arr[index]);
		}
	}

}
