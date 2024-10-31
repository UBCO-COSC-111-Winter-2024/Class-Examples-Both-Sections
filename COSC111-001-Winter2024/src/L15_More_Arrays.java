
public class L15_More_Arrays {

	public static void addOne(int[] arr)
	{
		for(int index = 0; index < arr.length; index ++)
			arr[index]++;
	}
	/**
	 * Method takes in an array and creates a new array in
	 * reverse order and returns it. 
	 * @param arr1
	 */
	public static int[] reverseArray(int[] arr1){
		
		int[] arr2 = new int[arr1.length];
		
		//this variation might be more readable
		for (int index = arr1.length - 1; index >= 0 ; index --)
		{
			//arr2[secondIndex] = arr1[index];
			//secondIndex++;
			//Here we don't need a second counter! 
			arr2[arr1.length - index - 1] = arr1[index];
		}
		
		return arr2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1  = {1, 2, 3, 4, 5, 6};
		
		//do a copy using a for-loop
		int[] arr2 = new int[arr1.length];
//		for (int index = 0; index < arr1.length ; index ++)
//		{
//			arr2[index] = arr1[index];
//		}
		
		//and now with arraycopy (make sure arrays are the same size!
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		//What about this??  Will this run??? -->  Watch out of index OOB 
		//need to make sure that we can always access an allowable index!!!
//		System.arraycopy(arr1, 0, arr2, 2, arr1.length);
		
		
//		Reverse the array!!!
		//use separate counter
		//int secondIndex = 0;
//		
//		//this variation might be more readable
//		for (int index = arr1.length - 1; index >= 0 ; index --)
//		{
//			//arr2[secondIndex] = arr1[index];
//			//secondIndex++;
//			//Here we don't need a second counter! 
//			arr2[arr1.length - index - 1] = arr1[index];
//		}
		
//		//using two loop variable 
//		for (int startIndex = arr1.length - 1, endIndex = 0; startIndex >= 0 ; startIndex --, endIndex++)
//		{
//			//arr2[secondIndex] = arr1[index];
//			//secondIndex++;
//			//Here we don't need a second counter! 
//			arr2[endIndex] = arr1[startIndex];
//		}

		int[] arr3 = reverseArray(arr1);
		
		System.out.println("The copied array!!");
		for (int value : arr3)
			System.out.println(value);
		
		System.out.println("Add one!!!");
		addOne(arr3);
		for (int value : arr3)
			System.out.println(value);
	}

}
