
public class L15_MoreArrays {
	
		public static void printArray(int[] arr)
		{
			for (int item : arr)
			{
				System.out.println(item);
			}
		}
		
		
		//Will this change the contents of the array???????
		public static void addOne(int[] arr)
		{
			for(int index = 0; index < arr.length; index++)
				arr[index]++;
		}
		
		public static int findMin(int[] arr) {
			int min = arr[0];
			if (arr.length <= 1)
				return min;
//			for (int index = 1; index < arr.length; index++)
//			{
//				if (arr[index] < min) min = arr[index];
//			}
			for (int val : arr)
			{
				if (val < min) min = val;
			}
			return min;
 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 3, 5, 7 , 9, 11};
		int[] arr2 = new int[arr1.length];
		
		//use our loop for copy
//		for (int index = 0; index < arr1.length; index++)
//		{
//			arr2[index] = arr1[index];
//		}
		//System.arraycopy(arr1, 0, arr2, 0, arr1.length);  //this should do exactly the same

		//lets copy index 2, 3, and 4 from arr1 into index 0, 1, 2 in arr2
		System.arraycopy(arr1, 2, arr2, 0, 3);  //watch out to make sure we copy the correct length!!
		//let's print this out
		System.out.println("array 1");
//		for (int item : arr2)
//		{
//			System.out.println(item);
//		}
		printArray(arr1);
		
		System.out.println("array 2");
//		{
//			System.out.println(item);
//		}
		printArray(arr2);
		System.out.println("Add 1 to arr2...");
		addOne(arr2);
		printArray(arr2);
		
		System.out.println("min val: " + findMin(arr2));

	}

}
