
public class L14_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] arr;			// this is creating my object reference (but array is not created yet)
		//arr = new int[5];  	//
		
		// arr = {1, 3, 4, 6, 3};  //Can't do this!
		
		int[] arr = {1, 3, 4, 6, 3, 9, -1, 55};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		//System.out.println(arr[5]);  //this will generated an OOB exception! (out of bounds)
		
		//much better...
		for (int index = 0; index < arr.length; index++)
		{
			System.out.println(arr[index]);
		}
		System.out.println("The value of the last index is .. " + arr[arr.length -1 ]);
	
		//what if I do this....
		System.out.println(arr);
	}

}
