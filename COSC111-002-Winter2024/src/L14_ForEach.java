
public class L14_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 7};
		
		for (int item: arr)
		{
			System.out.println(item);
		}
		
		for (int item: arr)  //it is a read-only type access
		{
			item = 0;
		}
		
		for (int item: arr)
		{
			System.out.println(item);
		}
		
		int[]d = new int[0];
		
	}

}
