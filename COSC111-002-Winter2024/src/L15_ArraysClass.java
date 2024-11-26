import java.util.Arrays;

public class L15_ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 12, 66, 323, -10};
		
		int[] arr2 = arr;
		
		//Print out the array (aka pretty printing)
		System.out.println(Arrays.toString(arr));	
		
		//Sort -> Remember, this will change the order of elements in the original array
		Arrays.sort(arr);
		
		//Array is now sorted
		System.out.println(Arrays.toString(arr));	
		//What about arr2
		System.out.println(Arrays.toString(arr2));	
		
		//Let's search for 5 -> if the value is found, it will return the index of the value
		int idx = Arrays.binarySearch(arr, 5);
		
		System.out.println(arr[idx]);		//hopefully this will print out 5

		//what is the value isn't there???
		idx = Arrays.binarySearch(arr, 100);
		//here, it will return a non-value index if the value isn't found. 
		System.out.println(idx);		//hopefully this will print out 5
		
		//finally, let's compare arr and arr2
		int isEqual = Arrays.compare(arr, arr2);
		
		System.out.println("Equal?? " + isEqual);
		
		//arr2 is now referencing a new array with default values 
		arr2 = new int[5];
		
		isEqual = Arrays.compare(arr, arr2);
		System.out.println("arr: " + Arrays.toString(arr));	
		System.out.println("arr2: " + Arrays.toString(arr2));	

		System.out.println("Equal?? " + isEqual);
		

		
		
		
	}

}
