import java.util.Arrays;

public class L15_ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {5 , 22 , -4, 11 , 126};
		
		//Pretty-print the array using Arrays.toString( )
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = arr1;
		
		Arrays.sort(arr1);    	//what is being pass in is an object reference
								//the sort will ACTUALLY change the order
								//of the items in the array!!
		System.out.println("The sorted array...");
		//System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));   //??? arr2 is an alias (references) the same 
													//array as arr1
		//let's find a value in the array
		int index = Arrays.binarySearch(arr1, 22);
		System.out.println("index: " + index + " value: " +arr1[index]);
		
		index = Arrays.binarySearch(arr1, 2);
		if (index < 0)
			System.out.println("Value not found! index: " + index);
		else
			System.out.println("index: " + index + " value: " +arr1[index]);
		
		//They are equal because arr1 is arr2
		System.out.println("Equal?? " + Arrays.equals(arr1, arr2));
		
		arr2 = new int[5];
		System.out.println("Equal?? " + Arrays.equals(arr1, arr2));  //T or F?

	}

}
