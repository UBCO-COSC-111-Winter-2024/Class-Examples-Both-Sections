
public class L09_mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		//int y = 0;
		
		//outer loop
		for ( ; x <= 10; x++)
		{
			//one complete row
			//don't forget to re-initialize your nested loop counter!!!!!
			for(int y = 0; y <= 10; y++)
			{
				System.out.print(x*y + " ");
			}
			System.out.println();
			
		}

	}

}
