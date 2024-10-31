
public class L14_More_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		
		//this is my loop to process across all the elements in my array.
		for (int index = 0; index < arr.length; index++)
		{
			arr[index] = (int)(Math.random()*11);
		}
		
		for (int index = 0; index < arr.length; index++)
		{
			System.out.println(arr[index]);
		}
		
		
		//this won't work at all!! Arrays are fixed in size....
		//arr[4] = 55;			//is this adding a new element to the end of my array??
		
		//I NEEEEEEED to make arr an array with 5 elements.
		//so how would I create a 5th element... 
		int[] tempArray = new int[5];
		//next, copy old values... 
		//tempArray = arr;   //don't do this (yet...)
		for (int index = 0; index < arr.length; index++)
		{
			tempArray[index] = arr[index];
		}
		//add the 5th element 
		tempArray[4] = 55;	
		
		//finally, update reference
		arr = tempArray;  
		tempArray = null;  // this is a nice cleanup (but it's not necessary)
		
		//and (Really) finally, let's print out that new element. 
		System.out.println(arr[4]);
		
		
		//print out the contents with a for-each
		System.out.println("For-each");
		for(int val: arr)
		{
			System.out.println(val);
		}
		
		for(int val: arr)
		{
			//val is ACTUALLY a copy of what is stored in the array
			val = val + 1;
		}
		
		System.out.println("Second For-each...");
		for(int val: arr)
		{
			System.out.println(val);
		}
		
	}

}
