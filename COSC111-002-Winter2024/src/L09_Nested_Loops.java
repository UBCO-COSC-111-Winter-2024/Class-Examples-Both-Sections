
public class L09_Nested_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mult
		//int x = 0, y = 0;
		for(int x = 0; x <= 10; x++)				//outer loop
		{
			for (int y = 0 ; y <= 10; y++)		//inner loop	
			{
				System.out.print(x*y + " ");
			}
			System.out.println();
			
		}

	}

}
